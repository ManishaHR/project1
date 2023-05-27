package servletcrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import servletcrud.dto.StudentDto;

public class StudentDao {

	EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
	EntityManager m= e.createEntityManager();
	EntityTransaction t=m.getTransaction();
	
	public void insert(StudentDto d)
	{
		t.begin();
		m.persist(d);
		t.commit();
		
	}
	public String delete(int id) 
	{
		StudentDto s=m.find(StudentDto.class, id);
		if(s!=null)
		{
		
		t.begin();
		m.remove(s);
		t.commit();
		return "data has removed";
		}
		else {
			return "no data found";
		}
	}
	public void update(int id,long num)
	{
		StudentDto d1=m.find(StudentDto.class, id);
		d1.setNumber(num);
		
		t.begin();
		m.merge(d1);
		t.commit();
	}
	
	public StudentDto fetch(int id)
	{
		StudentDto s=m.find(StudentDto.class, id);
		
		return s;
	}
	public List<StudentDto> fetchall()
	{
		Query q1=m.createQuery("select data from StudentDto data");
		List<StudentDto> l1=q1.getResultList();
		return l1;
	}
}
	
