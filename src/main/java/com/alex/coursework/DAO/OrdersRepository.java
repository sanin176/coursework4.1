package com.alex.coursework.DAO;

import com.alex.coursework.Model.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Orders, Integer> {

}
