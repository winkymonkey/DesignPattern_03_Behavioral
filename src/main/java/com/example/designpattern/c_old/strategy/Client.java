package com.example.designpattern.c_old.strategy;


public class Client {
	public static void main(String args[]) {
		Context ctx = new Context(new QuickSort());
		ctx.sortFromContext();
	}
}
