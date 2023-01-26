package com.ExamenPracticoM5B.service;

import com.ExamenPracticoM5B.model.Empleado;
import com.ExamenPracticoM5B.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.persistence.EntityManager;
import java.util.List;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

    @Autowired
    EmpleadoRepository empleadoRepository;

    @Override
    public Empleado create(Empleado e) {
        return empleadoRepository.save(e);
    }

    @Override
    public Empleado findById(Integer id) {
        return empleadoRepository.findById(id).orElse(new Empleado());
    }

    @Override
    public List<Empleado> findByAll() {
        return empleadoRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        empleadoRepository.deleteById(id);

    }

    @Override
    public Empleado save(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

}
