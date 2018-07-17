package com.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.dao.RoomtypeDao;
import com.entity.Roomtype;

public class RoomtypeDaoImpl implements RoomtypeDao {

	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernatetemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernatetemplate) {
		this.hibernateTemplate = hibernatetemplate;
	}

	@Override
	public void addRoomtype(Roomtype roomtype) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(roomtype);
	}

	@Override
	public void updateRoomtype(Roomtype roomtype) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(roomtype);
	}

	@Override
	public void delRoomtype(int id) {
		// TODO Auto-generated method stub
		Roomtype roomtype = this.hibernateTemplate.get(Roomtype.class, id);
		this.hibernateTemplate.delete(roomtype);
	}

	@Override
	public Roomtype findById(Roomtype roomtype) {
		// TODO Auto-generated method stub
		String hql = "from Roomtype r where r.roomId=" + roomtype.getRoomId();
		List list = this.hibernateTemplate.find(hql);
		Roomtype roomtype2 = (Roomtype) list.get(0);
		return roomtype2;
	
	}

	@Override
	public Roomtype findByRoomname(Roomtype roomtype) {
		// TODO Auto-generated method stub
		String hql = "from Roomtype r where r.roomname=" + roomtype.getRoomname();
		List list = this.hibernateTemplate.find(hql);
		Roomtype roomtype3 = (Roomtype) list.get(0);
		return roomtype3;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Roomtype> listRoomtypes() {
		// TODO Auto-generated method stub
		String hql = "from Roomtype";
		Session session = this.hibernateTemplate.getSessionFactory().openSession();
		List<Roomtype> roomtypes = session.createQuery(hql).list();
		return roomtypes;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		String hql = "select count(*) from Roomtype";
		List list = this.hibernateTemplate.find(hql);
        int count = ((Long) list.get(0)).intValue();
		return count;
	}

}
