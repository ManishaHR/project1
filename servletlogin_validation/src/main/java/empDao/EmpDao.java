package empDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import empDto.EmpDto;

public class EmpDao {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();

public String signUp(EmpDto e)
{
	et.begin();
	em.persist(e);
	et.commit();
	
	return "the data has successfully";
}

public EmpDto login(String mail)
{
  EmpDto e=em.find(EmpDto.class, mail);
  
  return e;
}
}
