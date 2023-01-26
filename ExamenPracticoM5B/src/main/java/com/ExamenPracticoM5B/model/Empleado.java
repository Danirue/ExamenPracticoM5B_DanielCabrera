package com.ExamenPracticoM5B.model;


import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.jetbrains.annotations.NotNull;



import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "empleados")
@XmlRootElement

public class Empleado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer id_empleado;

    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Apellido")
    private String apellido;

    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Nombre")
    private String nombre;

    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Telefono")
    private Integer telefono;

    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Direccion")
    private String direccion;

    @Column(name = "Fecha de Nacimiento")
    private Date fecha_nacimiento;

    @Column(name = "Observacion")
    private String observacion;

    @Column(name = "Dias de Trabajo")
    private Integer dias_trabajo;

    @Column(name = "Sueldo")
    private Double sueldo;

    public Integer getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(Integer id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getDias_trabajo() {
        return dias_trabajo;
    }

    public void setDias_trabajo(Integer dias_trabajo) {
        this.dias_trabajo = dias_trabajo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
