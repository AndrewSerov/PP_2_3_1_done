package web.DAO;

import org.springframework.stereotype.Repository;
import web.Entity.User;

import javax.persistence.EntityManager;
import java.util.List;


public interface UserDao {


    List<User> getAllPeople();

    void saveUser(User user);

    User getById(int id);

    void updateUser(int id, User user);

    void deleteUser(int id);
}
