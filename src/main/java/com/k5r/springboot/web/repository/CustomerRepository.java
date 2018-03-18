package com.k5r.springboot.web.repository;

import org.springframework.data.jpa.repository.*;
import com.k5r.springboot.web.model.*;
public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
