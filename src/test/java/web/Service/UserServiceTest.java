package web.Service;

import org.junit.Test;
import web.Entity.User;

import static org.junit.Assert.*;
public class UserServiceTest {
UserService userService = new UserService();
    @Test
    public void add() {
        User user = new User("test", "test");
        userService.add(user);
    }
}