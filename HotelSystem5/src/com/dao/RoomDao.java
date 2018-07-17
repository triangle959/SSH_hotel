package com.dao;

import java.util.List;

import com.entity.Room;

public interface RoomDao {
	
	public void addRoom(Room room);
	
	public void updateRoom(Room room);
	
	public void delRoom(String roomcode);
	
	public Room findByRoomcode(Room room);
	
	public Room findByRoomname(Room room);
	
	public List<Room> ListRooms();
	
	public int getCount();
	

}
