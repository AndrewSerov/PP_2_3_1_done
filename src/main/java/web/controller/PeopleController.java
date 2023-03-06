package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.DAO.UserDao;
import web.Entity.User;

import java.util.List;

@Controller
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private UserDao userDao;
    @GetMapping
    public String getAllPeople(Model model) {
        List<User> list = userDao.getAllPeople();
        model.addAttribute("allPeople", list);
        return "allPeople";
    }
@GetMapping("/{id}")
    public String getUserById (@PathVariable("id") int id, Model model) {
        return null;
}

}
