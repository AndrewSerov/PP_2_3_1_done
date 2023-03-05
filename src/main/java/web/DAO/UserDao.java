package web.DAO;

import org.springframework.stereotype.Repository;
import web.Entity.User;

import javax.persistence.EntityManager;


public interface UserDao {
    public void add(User user);

}
