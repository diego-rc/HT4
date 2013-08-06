//*******************************************************************
//Autores: Diego Rosales y Gabriela Manrique
//Seccion: 20
//
//Nobmbe de Archivo: ListFactory.java
//Breve Descripcion: Fabrica de listas
//*******************************************************************

class ListFactory<E> {
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
	public Stack<E> getList(String entry) {
		// seleccion de la implementacion a utilizar:
		if (entry.equals("LS")){
			return new SinglyLinkedList<E>(); //regresa Lista Simple
		}
		else if (entry.equals("LD")){
			return new DoublyLinkedList<E>(); //regresa Lista Doblemente Encadenada
		}
		else{
			return new CircularList<E>(); //regresa Lista Circular
		}
   }
}