package com.seat;

import static java.lang.System.in;

import java.util.Scanner;

import com.seat.controller.MowerController;
import com.seat.controller.PlateauController;
import com.seat.entity.Mower;
import com.seat.entity.Plateau;

public class Main {

	public static void main(String[] args) {
		Mower m = new Mower();
		Plateau p = new Plateau();
		try {
			MowerController mowerController = new MowerController();
			PlateauController plateauController = new PlateauController();
			Scanner plateauSizeScanner = new Scanner(in);
			String plateauSize = plateauSizeScanner.nextLine();
			plateauController.putSize(plateauSize, p);

			Scanner firstReading = new Scanner(in);
			Scanner secondReading = new Scanner(in);

			String position = firstReading.nextLine();
			String directions = secondReading.nextLine();

			MowerController.proccessPosition(position, m);
			mowerController.proccessDirections(directions, m);
			
			plateauController.positionMowerToPlateau(p, m);

			mowerController.printPosition(m);
			

		} catch (Exception e) {
			System.out.println("Introduce correct commands.");
		}
	}

}
