package com.ExamenPracticoM5B.service;

import com.ExamenPracticoM5B.model.Empleado;

import java.util.List;

public interface EmpleadoService {
    public Empleado create(Empleado e);

    public Empleado findById(Integer id);

    public List<Empleado> findByAll();

    public void delete(Integer id);


    Empleado save(Empleado empleadoNew);
}
