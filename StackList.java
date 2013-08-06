//*******************************************************************
//Autores: Diego Rosales y Gabriela Manrique
//Seccion: 20
//
//Nobmbe de Archivo: StackVector.java
//Breve Descripcion: implementa un Sack utilizando la clase Vector
//*******************************************************************


public class StackList<E> implements Stack<E>{
	
	protected List<E> data;
	
	public StackList(String entry){
		ListFactory<E> lFactory= new ListFactory<E>();
		data = lFactory.getList(entry);
	}
	
	public void push(E item){
		data.addLast(item);
	}
	
	public E pop(){
		return data.removeLast();
	}
	
	public E peek(){
		return data.get();
	}
	
	public boolean empty(){
		return data.isEmpty();
	}
	
	public int size(){
		return data.size();
	}
	
}