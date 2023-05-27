package empdao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import empdto.empDto;

public class empDao {
EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
EntityManager m=e.createEntityManager();
EntityTransaction t=m.getTransaction();

public String insert(empDto e1)
{
	t.begin();
	m.persist(e1);
	t.commit();
	return "DATA INSERTED";
	
}
}
