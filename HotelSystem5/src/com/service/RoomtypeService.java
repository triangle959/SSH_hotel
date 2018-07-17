package com.service;

import java.util.List;

import com.entity.Roomtype;

public interface RoomtypeService {

	public void addRoomtype(Roomtype roomtype);
	
	public void updateRoomtype(Roomtype roomtype);
	
	public void delRoomtype(int id);
	
	public Roomtype findById(Roomtype roomtype);
	
	public List<Roomtype> listRoomtypes();
}
