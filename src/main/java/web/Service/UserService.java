package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.DAO.UserDao;
import web.DAO.UserDaoImpl;
import web.Entity.User;

@Service
public class UserService {

@Autowired
   private UserDao userDao;

    @Transactional
    public void add(User user) {
        userDao.add(user);
    }


}
