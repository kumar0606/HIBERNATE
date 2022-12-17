package com.hibernate.DAO;

import java.util.List;

import com.hibernate.model.students;

public interface StudentDAO {
 Integer save( students student);
 void update(students student);
 void delete(Integer sid);
 students findbyid(Integer sid);
 List<students> findall();
}
