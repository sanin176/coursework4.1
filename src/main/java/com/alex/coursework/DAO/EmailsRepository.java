package com.alex.coursework.DAO;

import com.alex.coursework.Model.Email;
import org.springframework.data.repository.CrudRepository;

public interface EmailsRepository extends CrudRepository<Email, Integer> {

}
