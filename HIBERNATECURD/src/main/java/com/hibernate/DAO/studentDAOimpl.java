package com.hibernate.DAO;

import java.util.List;

import org.hibernate.Session;

import com.hibernate.model.students;
import com.hibernate.util.Sessionutil;

public class studentDAOimpl implements StudentDAO {

	@Override
	public Integer save(students student) {
		Session session=Sessionutil.getSession();
		Integer studentpk=(Integer) session.save(student);
		session.beginTransaction().commit();
		session.close();
		return studentpk;
	}

	@Override
	public void update(students student) {
		Session session=Sessionutil.getSession();
		session.update(student);
		session.beginTransaction().commit();
		session.close();
		
	}

	@Override
	public void delete(Integer sid) {
		Session session=Sessionutil.getSession();
		students students=new students();
		students.setSid(sid);
		session.delete(students);
		session.beginTransaction().commit();
		session.close();
		
	}

	@Override
	public students findbyid(Integer sid) {
		
		return (students) Sessionutil.getSession().get(students.class, sid);
	}

	@Override
	public List<students> findall() {
		// TODO Auto-generated method stub
		return Sessionutil.getSession().createQuery("from students").list();
	}

}
