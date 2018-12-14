package org.me.oops;

/**
 * 
 * What is encapsulation? - Data Hiding
 * 
 * Data hiding is controlled access to internal data via public methods. You are
 * hiding data if the outside user does not know how many variables are in your
 * class but still get the desired result from your class via public methods.
 * 
 * Here, We define a private data member and give its access to everybody else
 * via a public method.
 * 
 * Is the item price hidden?
 * 
 * 
 * class StoreItem { public int itemPrice; }
 * 
 * Everybody can access the item price, since it is public now. So what is the
 * difference in the above two code examples?
 * 
 * This is not data hiding,
 * 
 * see {#Process}, correct impl. of data encapsulation.
 * 
 * @author kekannag
 *
 */
public class StoreItem {
	private int itemId;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
}
