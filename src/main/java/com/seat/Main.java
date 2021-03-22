package com.seat;

import static java.lang.System.in;

import java.util.Scanner;

import com.seat.controller.MowerController;
import com.seat.entity.Mower;

public class Main {
	
	public static void main (String[]args) {
		Mower m = new Mower();
		try{
			MowerController mowerController = new MowerController();
			int count = 0;
			while(count<2) {
				count = count+1;
				Scanner firstReading = new Scanner(in);
				Scanner secondReading  = new Scanner(in);
				
				String position = firstReading.nextLine();
				String directions = secondReading.nextLine();
				
				MowerController.proccessPosition(position, m);
				mowerController.proccessDirections(directions, m);
				
				mowerController.printPosition(m);
			}
			
		}catch (Exception e) {
			System.out.println("Introduce correct commands.");
		}
	}

}
