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

public interface Inventory {
	
	/**
	 * <p>returns the name of the Inventory</p>
	 * 
	 * @return String
	 */
	public String getName();
	
	/**
	 * <p>returns the type of the Inventory</p>
	 * 
	 * @return InventoryType
	 * @see InventoryType
	 */
	public InventoryType getType();
	
	/**
	 * <p>returns the size of the Inventory</p>
	 *
	 * @return int
	 */
	public int getSize();
	
	/**
	 * <p>returns all the ItemStack's inside the Inventory</p>
	 * 
	 * @return ItemStack[]
	 * @see ItemStack
	 */
	public ItemStack[] getContents();
	
	/**
	 * <p>sets all the ItemStack's inside the Inventory</p>
	 * 
	 * @param items
	 * @see ItemStack
	 */
	public void setContents(ItemStack[] items);
	
	/**
	 * <p>add the ItemStack into the Inventory</p>
	 * 
	 * @param item - the ItemStack
	 * @see ItemStack
	 */
	public void addItem(ItemStack item);
	
	/**
	 * <p>adds the ItemStack on a specified slot</p>
	 * 
	 * @param item - the ItemStack
	 * @param slot - the slot
	 * @see ItemStack
	 */
	public void addItem(ItemStack item, int slot);
	
	/**
	 * <p>returns the ItemStack which is currently selected (clicked on)</p>
	 * @return ItemStack
	 * @see ItemStack
	 */
	public ItemStack getSelected();
	
	/**
	 * <p>returns the ItemStack where the mouse hovers over, null when no ItemStack is found</p>
	 * 
	 * @return ItemStack
	 * @see ItemStack
	 */
	public ItemStack getCursor();
	
	public ItemStack getItemInHand();
	
	public void closeInventory();
	
	public Entity getHolder();
	
	public boolean hasHolder();
	
	public Entity[] getViewers();
	
	public boolean hasViewers();

}
