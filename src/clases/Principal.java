package clases;

import java.io.*;

//Creadores: -Eduardo Barrientos Díaz
//           -

public class Principal {
	private static ListaEventos eventos=new ListaEventos();
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Connectar conexion=new Connectar();
		eventos.readListaEventos(conexion);
	}

}
