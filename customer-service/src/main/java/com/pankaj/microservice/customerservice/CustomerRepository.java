package com.pankaj.microservice.customerservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends JpaRepository<CustomerBean,Integer>
{

}
