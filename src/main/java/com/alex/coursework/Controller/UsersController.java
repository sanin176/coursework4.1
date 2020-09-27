package com.alex.coursework.Controller;

import com.alex.coursework.DAO.UsersRepository;
import com.alex.coursework.Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class UsersController {
    @Autowired
    private UsersRepository usersRepository;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void addCity(@RequestBody Users user) {
        user.setCreatedAt(LocalDate.now());
        user.setUpdatedAt(LocalDate.now());
        usersRepository.save(user);
    }
}
