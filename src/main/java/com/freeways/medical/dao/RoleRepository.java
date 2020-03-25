package com.freeways.medical.dao;

import java.util.Optional;
import com.freeways.medical.model.Role;
import com.freeways.medical.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}