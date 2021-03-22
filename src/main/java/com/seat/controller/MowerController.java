package com.seat.controller;

import com.seat.entity.Mower;

public class MowerController {
	
	public static final String NORTH = "N";
	public static final String SOUTH = "S";
	public static final String EAST = "E";
	public static final String WEST = "W";
	
	/**
	 * Method responsible to process the position of the mower
	 * @param position
	 * @param m
	 */
	public static void proccessPosition(String position, Mower m) {
		int x = Integer.parseInt(position.substring(0, 1));
		int y = Integer.parseInt(position.substring(2, 3));
		String orientation = position.substring(4);
		
		m.setX(x);
		m.setY(y);
		m.setOrientation(orientation);
	}


	/**
	 * Method responsible to process the direction of the mower
	 * @param direction
	 * @param m
	 * @throws Exception
	 */
	public static void proccessDirections(String direction, Mower m) throws Exception {
		for(char letter: direction.toCharArray()) {
			switch (letter) {
			case 'L':
				turnLeft(m);
			break;
			case 'R':
				turnRight(m);
				break;
			case 'M':
				move(m);
				break;
			default:
				throw new Exception("Introduce Correct letters. It must be 'L', 'R' or 'M' .");
			}
		}
	}
	
	/**
	 * Method responsible to move the mower to the left
	 * @param m
	 */
	public static void turnLeft(Mower m) {
		switch (m.getOrientation()) {
		case NORTH:
			m.setOrientation(WEST);
			break;
		case SOUTH:
			m.setOrientation(EAST);
			break;
		case WEST:
			m.setOrientation(SOUTH);
			break;
		case EAST:
			m.setOrientation(NORTH);
			break;
		default:
			break;
		}
	}

	/**
	 * Method responsible to move the mower to the right
	 * @param m
	 */
	public static void turnRight(Mower m) {
		switch (m.getOrientation()) {
		case NORTH:
			m.setOrientation(EAST);
			break;
		case SOUTH:
			m.setOrientation(WEST);
			break;
		case EAST:
			m.setOrientation(SOUTH);
			break;
		case WEST:
			m.setOrientation(NORTH);
			break;
		default:
			break;
		}
	}

	/**
	 * Method that moves the mower to the proper direction
	 * @param m
	 */
	public static void move(Mower m) {
		switch (m.getOrientation()) {
		case NORTH:
			m.setY(m.getY()+1);
			break;
		case SOUTH:
			m.setY(m.getY()-1);
			break;
		case EAST:
			m.setX(m.getX()+1);
			break;
		case WEST:
			m.setX(m.getX()-1);
			break;
		default:
			break;
		}
	}
	
	/**
	 * Method that prints the result
	 * @param m
	 */
	public static void printPosition(Mower m) {
		System.out.println(m.getX() + " " + m.getY()+ " "  + m.getOrientation());
	}
}
