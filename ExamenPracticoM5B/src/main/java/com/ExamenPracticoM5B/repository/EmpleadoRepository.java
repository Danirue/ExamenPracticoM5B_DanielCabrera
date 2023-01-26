package com.ExamenPracticoM5B.repository;

import com.ExamenPracticoM5B.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository  extends JpaRepository<Empleado, Integer>{

}
