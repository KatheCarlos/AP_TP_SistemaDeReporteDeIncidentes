package com.Hibernete.vista;


import com.Hibernate.controller.ClienteController;

public class ClienteVista {

	public static void main(String[] args) {
		ClienteController clienteCont = new ClienteController();
//		CREAR
//		clienteCont.crearCliente("Leo", "45851658854");
//		clienteCont.CrearCliente("Matias", "46582311852");
		
//		LISTA DE CLIENTES
		clienteCont.listadoClientes();
		
//		ELIMINAR
//		clienteCont.EliminarCliente(1);
//		clienteCont.ListadoClinte();

//		LEER CLIENTE
//		clienteCont.verCliente(1);
//		
//		AGREGAR SERVCIO
//		clienteCont.agregarServicio(1, "pintureria");
//		
	}

}
