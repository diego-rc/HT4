//*******************************************************************
//Autores: Diego Rosales y Gabriela Manrique
//Seccion: 20
//
//Nobmbe de Archivo: PostfixProcessing.java
//Breve Descripcion: realiza operaciones Postfix guardadas en un
//documento de Texto llamada datos.txt
//*******************************************************************

import java.util.Scanner;
import java.io.File;
import java.lang.Integer;
import java.io.FileNotFoundException;

public class PostfixProcessing{
	
	public static void main(String args[]){
		
		//Inicializando el Scanner para leer el archivo
		Scanner scan = new Scanner(System.in);
		Scanner keyIn = new Scanner(System.in);
		try{
			scan = new Scanner(new File("datos.txt"));
			//System.out.println("**--");
		}
		catch(FileNotFoundException e){
			//Si el archivo no existe se lanza la excepcion
			e.printStackTrace();
		}
		//inicializando el Stack
		
		StackFactory<String> sFactory = new StackFactory<String>();
		// Solicitar la implementacion deseada del Stack:
		//  AL: implementacion con ArrayList
		//  V:  implementacion con Vector
		//  LS: implementacion con Lista Simplemente Encadenada
		//  LD: implementacion con Lista Doblemente Encadenad
		//  LC: implementacion con Lista Circular
		System.out.println("Ingrese el texto en mayusculas para la implementacion deseada");
		System.out.println("AL: implementacion con ArrayList");
		System.out.println("V:  implementacion con Vector");
		System.out.println("LS: implementacion con Lista Simplemente Encadenada");
		System.out.println("LD: implementacion con Lista Doblemente Encadenad");
		System.out.println("LC: implementacion con Lista Circular");
		String entry = keyIn.next();
		Stack<String> myStack = sFactory.getStack(entry);
		int x=0;
		//Mientras aun haya lineas en el archivo
		while (scan.hasNextLine()){
			String car= scan.next();
			
			//Si es un operando se hacen dos pop y se pushea el resultado
			//de la respectiva operacion
			switch (car){
				case "+":
					myStack.push(Integer.toString(Integer.parseInt(myStack.pop())+Integer.parseInt(myStack.pop())));
					break;
				case "-":
					int temp1 = Integer.parseInt(myStack.pop());
					myStack.push(Integer.toString(Integer.parseInt(myStack.pop())-temp1));
					break;
				case "*":
					myStack.push(Integer.toString(Integer.parseInt(myStack.pop())*Integer.parseInt(myStack.pop())));
					break;
				case "/":
					int temp =Integer.parseInt(myStack.pop());
					myStack.push(Integer.toString(Integer.parseInt(myStack.pop())/temp));
					break;
				case"\n":
					System.out.println(myStack.peek());
					break;
				//Si se lee un dígito solo se pushea en el stack
				case "0":
				case "1":
				case "2":
				case "3":
				case "4":
				case "5":
				case "6":
				case "7":
				case "8":
				case "9":
					myStack.push(car);
				default:
					break;
			}
			
			
		}
		//Se imprimen los contenidos de Stack
		while (!myStack.empty()){
			System.out.println(myStack.pop());
		}
		
	}
	
}