package com.service;

import java.util.List;

import com.entity.Room;

public interface RoomService {

	public void addRoom(Room room);
	
	public void updateRoom(Room room);
	
	public void delRoom(String roomcode);
	
	public List<Room> listRooms();
	
	public int getCount();
}
