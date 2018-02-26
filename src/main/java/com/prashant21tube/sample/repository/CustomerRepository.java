/**
 * 
 */
package com.prashant21tube.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prashant21tube.sample.model.Customer;

/**
 * @author lenovo
 *
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
