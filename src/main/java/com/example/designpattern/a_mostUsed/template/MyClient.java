package com.example.designpattern.a_mostUsed.template;


public class MyClient {
	
	public static void main(String[] args) {
		HouseTemplate houseType = new WoodenHouse();
		houseType.buildHouse();
		/* -------------------------------------- */
		houseType = new GlassHouse();
		houseType.buildHouse();
	}
}
