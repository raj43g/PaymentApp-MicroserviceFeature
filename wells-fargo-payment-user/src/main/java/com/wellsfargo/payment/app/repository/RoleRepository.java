package com.wellsfargo.payment.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.payment.app.model.Role;

@Repository
public interface RoleRepository extends MongoRepository<Role, Integer> {

	Role findByRole(String role);

}
