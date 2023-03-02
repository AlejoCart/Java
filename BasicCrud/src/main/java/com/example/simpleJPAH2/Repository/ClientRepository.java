package com.example.simpleJPAH2.Repository;

import com.example.simpleJPAH2.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Cliente,Long>{

}
