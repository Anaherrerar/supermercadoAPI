package com.supermercado.producto.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "producto")
@Data
public class Producto {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    @Column(nullable = false, unique = true, length = 10)
    private int numeroPro;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 10)
    private String descripProducto;

    @Column(nullable = false,length = 50)
    private double valorProducto;

    @Column(nullable = false, length = 10)
    private String fechavencProducto;
<<<<<<< HEAD

    public Object getCodigoPro() {
    }

    public void setCodigoPro(Object codigoPro) {
    }

    public Object getTipoProducto() {
    }

    public Object getCantidad() {
    }

    public void setTipoProducto(Object tipoProducto) {
    }

    public void setCantidad(Object cantidad) {
    }
=======
>>>>>>> origin/main
}

