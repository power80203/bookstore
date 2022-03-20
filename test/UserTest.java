import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import com.bookstore.dao.UserDAO;
import com.bookstore.entity.Users;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Users user1 = new Users();
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager e = entityManagerFactory.createEntityManager();
		
		user1.setEmail("123");
		user1.setFullName("Michl Jordan");
		user1.setPassword("a213");
		
		
		e.getTransaction().begin();
		e.persist(user1);
		
		e.getTransaction().commit();
		
		e.close();
		
		entityManagerFactory.close();
		
		System.out.println(user1.getFullName() + "  has been inserted to db");
		
		

	}
	
//	@Test
//	public void testGetUsersFound() {
//		
//		UserDAO userDAO = new UserDAO(null);
//		
//		Integer userid = 1;
//		Users user = userDAO.find(null, userid );
//		
//	}

}
