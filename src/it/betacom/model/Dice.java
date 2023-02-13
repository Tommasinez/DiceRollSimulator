package it.betacom.model;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Dice {

	private int sides;

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public void rollDice() {
		Random random = new Random();
		Timer timer = new Timer();

		int result = random.nextInt(sides) + 1;
				
		int i = 1;
		while (i < 4) {
			timer.schedule(new TimerTask() {
				public void run() {
					System.out.print(".");
				}
			}, i * 250);			
			i++;
		}
		
		timer.schedule(new TimerTask() {
			public void run() {
				System.out.print("\n" + result);
							}
		}, 1000);
	}
}
