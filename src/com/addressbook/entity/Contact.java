package com.addressbook.entity;

/**
 * @author rajnish
 *
 */
public class Contact {

	/**
	 * Details of a person that should be added in address book
	 */
	public String firstName;
	public String lastName;
	public String city;
	public String state;
	public String pincode;
	public String mobileNo;
	public String email;
	
	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + ", mobileNo=" + mobileNo + ", email=" + email + "]";
	}
	
	
	
	
	
	
}
