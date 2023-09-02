package com.oil.ecommerceoilapp.repository;

import com.oil.ecommerceoilapp.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository  extends JpaRepository<Address, Integer> {
}
