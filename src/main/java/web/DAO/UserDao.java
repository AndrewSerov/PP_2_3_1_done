package web.DAO;

import org.springframework.stereotype.Repository;
import web.Entity.User;

import javax.persistence.EntityManager;
import java.util.List;


public interface UserDao {
    public void add(User user);

    public List<User> getAllPeople();

}
