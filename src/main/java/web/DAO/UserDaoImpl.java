package web.DAO;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.Entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {


    @PersistenceContext
    private EntityManager entityManager;



    @Override
    @Transactional
    public List<User> getAllPeople() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public User getById(int id) {
        Query query = entityManager.createQuery("from User where id = :p");
        query.setParameter("p", id);
        return (User) query.getSingleResult();
    }

    @Override
    public void updateUser(int id, User user) {
        User user1 = getById(id);
        user1.setName(user.getName());
        user1.setLastName(user.getLastName());
    }

    @Override
    public void deleteUser(int id) {
        User user = getById(id);
        entityManager.remove(user);
    }
}
