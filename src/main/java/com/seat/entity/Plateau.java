package com.seat.entity;

import java.util.List;

public class Plateau {

	private List<Mower> listMower;
	private int sizeX;
	private int sizeY;

	
	public int getSizeX() {
		return sizeX;
	}

	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}

	public int getSizeY() {
		return sizeY;
	}

	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}

	public List<Mower> getListMower() {
		return listMower;
	}

	public void setListMower(List<Mower> listMower) {
		this.listMower = listMower;
	}


}
