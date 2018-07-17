package com.service.impl;

import java.util.List;

import com.dao.RoomDao;
import com.entity.Room;
import com.service.RoomService;

public class RoomServiceImpl implements RoomService{

	private RoomDao roomDao;
	
	public RoomDao getRoomDao() {
		return roomDao;
	}

	public void setRoomDao(RoomDao roomDao) {
		this.roomDao = roomDao;
	}

	@Override
	public void addRoom(Room room) {
		// TODO Auto-generated method stub
		this.roomDao.addRoom(room);
	}

	@Override
	public void updateRoom(Room room) {
		// TODO Auto-generated method stub
		this.roomDao.updateRoom(room);
	}

	@Override
	public void delRoom(String roomcode) {
		// TODO Auto-generated method stub
		this.roomDao.delRoom(roomcode);
	}

	@Override
	public List<Room> listRooms() {
		// TODO Auto-generated method stub
		return this.roomDao.ListRooms();
	}
	
	public int getCount(){
		return this.roomDao.getCount();
	}

}
