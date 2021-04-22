package usmp.computo.tiendacomputo.domain;


import javax.persistence.Entity;
import javax.persistence.GenerationType;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;

@Entity
public class Employee{

  
	@GeneratedValue (strategy = GenerationType.IDENTITY)

	@Id
	private Integer id;

    private String Producto;
    private Double Precio;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getProducto() {
        return this.Producto;
    }

    public void setProducto(String producto) {
        this.Producto = producto;
    }

    public Double getPrecio() {
        return this.Precio;
    }

    public void setPrecio(Double precio) {
        this.Precio = precio;
  
    }

}