package com.example.designpattern.a_mostUsed.chainOfResponsibility;


public interface DispenseChain {
	void setNextChain(DispenseChain nextChain);
	void dispense(Currency cur);
}

