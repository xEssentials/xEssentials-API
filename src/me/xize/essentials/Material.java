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

/**
 * <p>an extensible Material Enum which allows developers to include their own version of the enum</p>
 * <p>this will fix compatibility between Materials between old minecraft versions from the bukkit period to the new versions of minecraft.</p>
 *  
 */
public class Material {

	public static Material DIRT = new Material((short)3, (short)0, "dirt", true, false, false, false, false, true);
	
	//TODO: test the current system against old and new, perhaps a new implementation needs to be added.
	
	private final short dataid;
	private final short subdata;
	private final String name;
	private final boolean isSolid;
	private final boolean hasGravity;
	private final boolean isTransparant;
	private final boolean isFluid;
	private final boolean isBurnable;
	private final boolean canBeExploded;
	
	private Material(short dataid, short subdata, String name, boolean isSolid, boolean hasGravity, boolean isTransparant, boolean isFluid, boolean isBurnable, boolean canBeExploded) {
		this.dataid = dataid;
		this.subdata = subdata;
		this.name = name;
		this.isSolid = isSolid;
		this.hasGravity = hasGravity;
		this.isTransparant = isTransparant;
		this.isFluid = isFluid;
		this.isBurnable = isBurnable;
		this.canBeExploded = canBeExploded;
	}
	
	/**
	 * <p>returns the name of the material</p>
	 * 
	 * @return String
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * <p>returns the short data value of the material</p>
	 * 
	 * @return short
	 */
	public short getDataId() {
		return this.dataid;
	}
	
	/**
	 * <p>returns the short sub data value of the material</p>
	 * 
	 * @return short
	 */
	public short getSubData() {
		return this.subdata;
	}
	
	/**
	 * <p>returns the byte value of the material, this is for compatibility with older versions of minecraft</p>
	 *
	 * @return byte
	 */
	public byte getDataId_alpha() {
		return getByteFromShort(this.dataid);
	}
	
	/**
	 * <p>returns the sub byte value of the material, this is for compatibility with older versions of minecraft</p>
	 *
	 * @return byte
	 */
	public byte getSubData_alpha() {
		return getByteFromShort(this.subdata);
	}
	
	/**
	 * <p>returns true if the block is solid, otherwise false</p>
	 * 
	 * @return boolean
	 */
	public boolean isSolid() {
		return this.isSolid;
	}
	
	/**
	 * <p>returns true if the block has gravity, otherwise false</p>
	 * 
	 * @return boolean
	 */
	public boolean hasGravity() {
		return this.hasGravity;
	}
	
	/**
	 * <p>returns true if the block is transparant, otherwise false</p>
	 * 
	 * @return boolean
	 */
	public boolean isTransparant() {
		return this.isTransparant;
	}
	
	/**
	 * <p>returns true if the material is fuel, otherwise false</p>
	 * 
	 * @return boolean
	 */
	public boolean isFluid() {
		return this.isFluid;
	}
	
	/**
	 * <p>returns true if the material is burnable, otherwise false</p>
	 * 
	 * @return boolean
	 */
	public boolean isBurnable() {
		return this.isBurnable;
	}
	
	/**
	 * <p>returns true if the material can be exploded, otherwise false</p>
	 * 
	 * @return boolean
	 */
	public boolean canBeExploded() {
		return this.canBeExploded;
	}
	
	private byte getByteFromShort(short shortdata) {
		return (byte)(shortdata >> 8);
	}
	
}