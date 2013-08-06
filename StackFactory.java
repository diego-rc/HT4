//*******************************************************************
//Autores: Diego Rosales y Gabriela Manrique
//Seccion: 20
//
//Nobmbe de Archivo: StackFactory.java
//Breve Descripcion: Fabrica de Vectores
//*******************************************************************

class StackFactory<E> {
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
	public Stack<E> getStack(String entry) {
		// seleccion de la implementacion a utilizar:
		if (entry.equals("AL")){
			return new StackArrayList<E>(); //regresa ArrayList
		}
		else if (entry.equals("V")){
			return new StackVector<E>(); //regresa Vector
		}
		else{
			return new StackList<E>(entry); //regresa Lista
		}
   }
}