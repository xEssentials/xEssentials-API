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
public class ItemStack {
	
	private Material mat;
	private int amount;
	
	public ItemStack(Material mat, int amount) {
		this.mat = mat;
		this.amount = amount;
	}
	
	public ItemStack(ItemStack item) {
		this.mat = item.mat;
		this.amount = item.amount;
	}
	
	/**
	 * <p>get the amount of items from the current ItemStack</p>
	 * 
	 * @return int
	 */
	public int getAmount() {
		return amount;
	}
	
	/**
	 * <p>sets the amount of the current ItemStack</p>
	 * 
	 * @param amount
	 */
	public void setAmount(int amount) {
		if(amount > 64) {
			throw new IllegalArgumentException("ItemStacks cannot be more than per 64!");
		}
		this.amount = amount;
	}
	
	/**
	 * <p>returns the type of the current ItemStack</p>
	 * 
	 * @return Material
	 */
	public Material getType() {
		return this.mat;
	}
	
	/**
	 * <p>sets the type of the current ItemStack</p>
	 * 
	 * @param mat - the material
	 */
	public void setType(Material mat) {
		this.mat = mat;
	}
	
	
}
