package com.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.dao.RoomDao;
import com.entity.Room;

public class RoomDaoImpl implements RoomDao {
	
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void addRoom(Room room) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(room);
	}

	@Override
	public void updateRoom(Room room) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(room);
	}

	@Override
	public void delRoom(String roomcode) {
		// TODO Auto-generated method stub
		Room room = this.hibernateTemplate.get(Room.class, roomcode);
		this.hibernateTemplate.delete(room);
	}

	@Override
	public Room findByRoomcode(Room room) {
		// TODO Auto-generated method stub
		String hql = "from Room as r where r.roomcode="+room.getRoomcode();
		List list = this.hibernateTemplate.find(hql);
		Room room2 = (Room)list.get(0);
		return room2;
	}

	@Override
	public Room findByRoomname(Room room) {
		// TODO Auto-generated method stub
		String hql = "from Room as r where r.roomname="+room.getRoomname();
		List list = this.hibernateTemplate.find(hql);
		Room room3 = (Room)list.get(0);
		return room3;
	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Room> ListRooms() {
		// TODO Auto-generated method stub
		String hql = "from Room";
		Session session = this.hibernateTemplate.getSessionFactory().openSession();
		List<Room> rooms = session.createQuery(hql).list();
		return rooms;
	}

	@Override//传参roomname?
	public int getCount() {
		// TODO Auto-generated method stub
		String hql = "select count(*) from Room ";
		List list = this.hibernateTemplate.find(hql);
        int count = ((Long) list.get(0)).intValue();
		return count;
	}

	
}
