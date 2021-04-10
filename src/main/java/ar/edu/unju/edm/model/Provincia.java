package ar.edu.unju.edm.model;

import org.springframework.stereotype.Controller;

@Controller
public class Provincia {
	private int codigo;
	private String nombre;
public Provincia() {
	
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}

}
