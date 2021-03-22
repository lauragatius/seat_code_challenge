package com.seat.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.seat.entity.Mower;
import com.seat.entity.Plateau;

public class PlateauController {
	private List<Mower> listMowers;
	
	public void putSize(String size, Plateau p) {
		List posicions = Arrays.asList(size.split(" "));
		int sizeX = Integer.parseInt(posicions.get(0).toString());
		int sizeY = Integer.parseInt(posicions.get(1).toString());
		p.setSizeX(sizeX);
		p.setSizeY(sizeY);
		listMowers = new ArrayList<>();
	}
	
	public void positionMowerToPlateau(Plateau plateau, Mower m) {
		listMowers.add(m);
		plateau.setListMower(listMowers);
		
	}

	public List<Mower> getListMowers() {
		return listMowers;
	}

	public void setListMowers(List<Mower> listMowers) {
		this.listMowers = listMowers;
	}

}
