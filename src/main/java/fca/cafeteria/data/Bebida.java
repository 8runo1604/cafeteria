package fca.cafeteria.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "tbebida")

public class Bebida {
    @Id
    @Column(name = "idBebida")
    private int idBebida;
    @Column(name = "idTipoBebida")
    private int idTipoBebida;
    private String nombre;
    private String descripcion;

}
