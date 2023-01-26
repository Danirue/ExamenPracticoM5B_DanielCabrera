package com.ExamenPracticoM5B.controller;

import com.ExamenPracticoM5B.model.Empleado;
import com.ExamenPracticoM5B.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empleado")
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;


    @GetMapping("/lista_empleados")
    public List<Empleado> index(){
        return empleadoService.findByAll();
    }

    @GetMapping("/buscar_empleados/{id}")
    public Empleado show(@PathVariable Integer id) {
        return empleadoService.findById(id);
    }

    @PostMapping("/save_empleados")
    @ResponseStatus(HttpStatus.CREATED)
    public Empleado create(@RequestBody Empleado empleado) {
        return empleadoService.save(empleado);

    }

    @PutMapping("/empleadoeditar/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void update(@RequestBody Empleado empleado,   @PathVariable Integer id) {
        Empleado empleadoNew = empleadoService.findById(id);
        empleadoNew.setNombre(empleado.getNombre());
        empleadoNew.setApellido(empleado.getApellido());
        empleadoNew.setDireccion(empleado.getDireccion());
        empleadoNew.setTelefono(empleado.getTelefono());
        empleadoNew.setFecha_nacimiento(empleado.getFecha_nacimiento());
        empleadoNew.setObservacion(empleado.getObservacion());
        empleadoNew.setDias_trabajo(empleado.getDias_trabajo());
        empleadoNew.setSueldo(empleado.getSueldo());
        empleadoService.save(empleadoNew);

    }
    @DeleteMapping("/eliminar_empleados/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
        empleadoService.delete(id);
    }



}
