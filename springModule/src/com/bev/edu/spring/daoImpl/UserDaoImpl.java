package com.bev.edu.spring.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;
import com.bev.edu.spring.dao.UserDao;
import com.bev.edu.spring.entities.AttendanceInfo;
import com.bev.edu.spring.entities.UserDetail;


/*public class UserDaoImpl implements UserDao {
	private HibernateTemplate hibernateTemplate;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Transactional(readOnly = false)
	public void saveUser(User user) {
		hibernateTemplate.saveOrUpdate(user);

	}

	@Transactional(readOnly = false)
	public void deleteUser(User user) {
		hibernateTemplate.delete(user);

	}

	@SuppressWarnings("unchecked")
	public List<User> getAllUser(User user) {
		return (List<User>) hibernateTemplate.find("from "
				+ User.class.getName());
	}

	public User selectUserById(String user_id) {
		return (User) hibernateTemplate.get(User.class, user_id);
	}

}*/


public class UserDaoImpl implements UserDao
{
private EntityManager entityManager;

@PersistenceContext
public void setEntityManager(EntityManager entityManager)
{
this.entityManager = entityManager;
}

/**
* This method is used to create the user
*/
@Transactional
public void createUser(UserDetail userDetail)
{
entityManager.persist(userDetail);
}

@Transactional
public void attendMarkIn(AttendanceInfo markIn)
{
entityManager.persist(markIn);
}

/**
* This method is used to get all the user names from the table User Detail
* @return list of user names
*/
public List<String> getAllUserNames()
{
return entityManager.createQuery("Select s.user_id from UserDetail s").getResultList();
}

public UserDetail getUserDetails(String  userID)
{
	/*String nativeQuery = "Select * from user_basic_info  where user_id=?";
	Query q = entityManager.createNativeQuery(nativeQuery, UserDetail.class);
	q.setParameter(1, userID);
	q.getResultList();
	
	return q.getResultList().size();*/
	
/*	public Car getCar(Long carId) throws DataAccessException {
		36
		        return getEntityManager().find(Car.class, carId);
		37
		    }*/
	
	return entityManager.find(UserDetail.class, userID);

}

/**
* This method is used to delete an user
* @param userDetail
*/
@Transactional
public void deleteUser(UserDetail userDetail)
{
entityManager.remove(userDetail);
}
}
