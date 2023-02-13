package it.betacom.controller;

import it.betacom.model.Dice;

public class Controller {
	
	public static void main(String[] args) {
		
		Dice dice = new Dice();
		dice.setSides(6);
		int sidesNum = dice.getSides();
		
		System.out.println("Numero di facce del dado: " + sidesNum);
		dice.rollDice();
	}	
}
