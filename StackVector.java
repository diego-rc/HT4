//*******************************************************************
//Autores: Diego Rosales y Bernardo Fuentes
//Seccion: 20
//
//Nobmbe de Archivo: StackVector.java
//Breve Descripcion: implementa un Sack utilizando la clase Vector
//*******************************************************************

import java.util.Vector;

public class StackVector<E> implements Stack<E>{
	
	protected Vector<E> data;
	
	public StackVector(){
		data = new Vector<E>(0);
	}
	
	public void push(E item){
		data.add(item);
	}
	
	public E pop(){
		return data.remove(data.size()-1);
	}
	
	public E peek(){
		return data.get(data.size()-1);
	}
	
	public boolean empty(){
		if (data.isEmpty()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public int size(){
		return data.size();
	}
	
}