package com.dao;

import java.util.List;

import com.entity.Roomtype;

public interface RoomtypeDao {

	public void addRoomtype(Roomtype roomtype);
	
	public void updateRoomtype(Roomtype roomtype);
	
	public void delRoomtype(int id);
	
	public Roomtype findById(Roomtype roomtype);
	
	public Roomtype findByRoomname(Roomtype roomtype);
	
	public List<Roomtype> listRoomtypes();
	
	public int getCount();
}
