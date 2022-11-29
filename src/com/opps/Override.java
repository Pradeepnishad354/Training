package com.opps;

class Override1 {

	String name;
	String address;
	String pincode;

	public void m1() {

		System.out.println("this is m1");

	}

	public void m2() {

		System.out.println("this is m2 method");
		System.out.println(name + " " + address + "pincode");
	}
}

public class Override extends Override1 {

	public static void main(String[] args) {

		Override o = new Override();
		o.m1();
		o.m2();

		o.name = "pradeep";
		o.address = "varanasi";
		o.pincode = "222109";

	}

}
