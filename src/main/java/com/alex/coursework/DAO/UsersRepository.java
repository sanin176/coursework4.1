package com.alex.coursework.DAO;

import com.alex.coursework.Model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, Integer> {

}
