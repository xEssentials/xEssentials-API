/*
Copyright (C) 2016 xEssentials

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package me.xize.essentials;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * <p>an extensible Inventory Enum which allows developers to include their own version of the enum</p>
 * <p>this will fix compatibility between new inventories between minecraft versions from the bukkit period to the new versions of minecraft.</p>
 *  
 */
public class InventoryType {
	
	private final static Set<InventoryType> data = new HashSet<InventoryType>();
	
	/*
		WARNING: do not add more enums to the current enum, these enums are ment to be legacy.
		enderchests, hoppers, came later to minecraft we want this to be atleast compatible before the redstone update!. 
		for this reason you can extend this enum to add your own InventoryTypes.
	*/
	public static InventoryType CRAFTING = new InventoryType("crafting");
	public static InventoryType PLAYER_INVENTORY = new InventoryType("player_inventory");
	public static InventoryType FURNACE = new InventoryType("furnace");
	public static InventoryType DISPENSER = new InventoryType("dispenser");
	public static InventoryType CHEST = new InventoryType("chest");
	public static InventoryType DOUBLE_CHEST = new InventoryType("double_chest");
	
	private final String name;
	
	private InventoryType(String name) {
		this.name = name;
		data.add(this);
	}
	
	/**
	 * <p>returns the name of the enum</p>
	 * 
	 * @return String
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * <p>returns the InventoryType by name</p>
	 * 
	 * @param name - the name to search for
	 * @return InventoryType
	 * @throws IllegalArgumentException when no value is found
	 */
	public static InventoryType valueOf(String name) {
		for(InventoryType type : data) {
			if(type.getName().toLowerCase().startsWith(name.toLowerCase())) {
				return type;
			}
		}
		throw new IllegalArgumentException("cannot find value of "+name+" into InventoryType!");
	}
	
	/**
	 * <p>returns all the Inventory types</p>
	 * 
	 * @return InventoryType[]
	 */
	public static InventoryType[] values() {
		InventoryType[] types = new InventoryType[data.size()];
		Iterator<InventoryType> it = data.iterator();
		int index = 0;
		while(it.hasNext()) {
			types[index] = it.next();
			index++;
		}
		return types;
	}
	
}
