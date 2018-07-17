package com.service.impl;

import java.util.List;

import com.dao.RoomtypeDao;
import com.entity.Roomtype;
import com.service.RoomtypeService;

public class RoomtypeServiceImpl implements RoomtypeService{

	private RoomtypeDao roomtypeDao;
	
	public RoomtypeDao getRoomtypeDao() {
		return roomtypeDao;
	}

	public void setRoomtypeDao(RoomtypeDao roomtypedao) {
		this.roomtypeDao = roomtypedao;
	}

	@Override
	public void addRoomtype(Roomtype roomtype) {
		// TODO Auto-generated method stub
		this.roomtypeDao.addRoomtype(roomtype);
	}

	@Override
	public void updateRoomtype(Roomtype roomtype) {
		// TODO Auto-generated method stub
		this.roomtypeDao.updateRoomtype(roomtype);
	}

	@Override
	public void delRoomtype(int id) {
		// TODO Auto-generated method stub
		this.roomtypeDao.delRoomtype(id);
	}

	@Override
	public Roomtype findById(Roomtype roomtype) {
		// TODO Auto-generated method stub
		return this.roomtypeDao.findById(roomtype);
	}

	@Override
	public List<Roomtype> listRoomtypes() {
		// TODO Auto-generated method stub
		System.out.println("aaa");
		return this.roomtypeDao.listRoomtypes();
	}

}
