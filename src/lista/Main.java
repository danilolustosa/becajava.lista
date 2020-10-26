package lista;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class Main {

	public static void main(String[] args) {
		
		
		
		Cliente cliente = new Cliente();		
		cliente.Nome = "Maria";
		cliente.Idade = 14;
		
		Cliente cliente2 = new Cliente();		
		cliente2.Nome = "José";
		cliente2.Idade = 40;
		
		
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		listaCliente.add(cliente);
		listaCliente.add(cliente2);
		
		int tamanho = listaCliente.size();		
		
		for(int i = 0; i < tamanho; i++){
			System.out.println("Cliente: " + listaCliente.get(i).Nome + " ---- Idade: " + listaCliente.get(i).Idade);	
		}
		
		
		
		

		//CONCEITO DE LISTA
//		int[] numeros = new int[5];		
//		
//		numeros[1] = 20;		
//		numeros[3] = 54;
//		numeros[0] = 10;		
//		numeros[2] = 3;		
//		numeros[4] = 1;		
//		
//		System.out.println(numeros[2]);
//		System.out.println(numeros[3]);
//		System.out.println(numeros[1]);

		
		
		
		//CONCEITO PILHA		
//		int[] numeros = new int[5];		
//		int tamanho = numeros.length;
//		
//		numeros[0] = 10;
//		numeros[1] = 20;
//		numeros[2] = 3;
//		numeros[3] = 54;
//		numeros[4] = 1;
//		
//		for(int i = tamanho - 1; i >= 0; i--) {
//			System.out.println(numeros[i]);	
//		}
		
		
		
		
		//CONCEITO DE FILA		
//		int tamanhoDoArray = 5;
//		int[] numeros = new int[tamanhoDoArray];
//		int tamanho = numeros.length;
//		
//		numeros[0] = 10;
//		numeros[1] = 20;
//		numeros[2] = 3;
//		numeros[3] = 54;
//		numeros[4] = 1;
//		
//		for(int i = 0; i < tamanho; i++) {			
//			System.out.println(numeros[i]);			
//		}
		 
		


	}

}
