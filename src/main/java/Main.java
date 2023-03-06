import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import web.Entity.User;
import web.Service.UserService;

public class Main {

    public static void main(String[] args) {

UserService userService = new UserService();
        User user = new User("test", "test");

        userService.add(user);
    }
}