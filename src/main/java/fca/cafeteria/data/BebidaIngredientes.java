package fca.cafeteria.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "tbebidaingrediente")
public class BebidaIngredientes {
    @Id
    @Column(name = "idbebidaingrediente")
    private int idBebidaIngredientes;

    @Column(name = "idbebida")
    private int idBebida;

    @Column(name = "idingrediente")
    private int idIngrediente;

    @Column(name = "cantidad")
    private int cantidad;

    public int getIdBebidaIngredientes() {
        return idBebidaIngredientes;
    }

    public void setIdBebidaIngredientes(int idBebidaIngredientes) {
        this.idBebidaIngredientes = idBebidaIngredientes;
    }

    public int getIdBebida() {
        return idBebida;
    }

    public void setIdBebida(int idBebida) {
        this.idBebida = idBebida;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
