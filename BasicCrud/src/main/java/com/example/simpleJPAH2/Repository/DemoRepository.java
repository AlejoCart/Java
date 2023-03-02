package com.example.simpleJPAH2.Repository;

import com.example.simpleJPAH2.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository <T> extends JpaRepository<Cliente,Long> {

    public void save();

    public T findClientById(Long id);
}
