import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import datastructures.NodeGeneric;

public class DoubleLinkenList<E> extends LinkedList<E> {
	
	NodeGeneric<E> first;
	NodeGeneric<E> last;
	int size = 0;
	
	public DoubleLinkenList() {
		this.first = null;
		this.last = null;
	}
	//Retorna el primer elemento de la lista
	@Override
	public E getFirst() {
		return this.first.getData();
	}
	
	//Retorna el ultimo elemento de la lista
	@Override
	public E getLast() {
		return this.last.getData();
	}
	//Elimina el primer elemento de la lista y retorna su valor ;
	@Override
	public E removeFirst() {
		E first;
		first = this.first.getData();
		this.first = this.first.nextNode;
		size--;
		return first;
	}
	//Elimina el ultimo elemento de la lista y retorna su valor
	@Override
	public E removeLast() {
		E last;
		last = this.last.getData();
		this.last = this.last.previousNode;
		size--;
		return last;
	}

	@Override
	public void addFirst(E e) {
		NodeGeneric<E> node = new NodeGeneric<E>();
		node.setData(e);
		node.nextNode = this.first;
		if(first != null)
			this.first.previousNode = node;
		size++;
		this.first = node;
	}

	@Override
	public void addLast(E e) {
		NodeGeneric<E> node = new NodeGeneric<E>();
		node.setData(e);
		node.previousNode = this.last;
		this.last.nextNode = node;
		size++;
		this.last = node;
	}

	@Override
	public boolean contains(Object o) {
		
		return true;
	}
	//Tamaño de la lista
	@Override
	public int size() {
		return this.size;
	}
	//Quizas un elemento no puede estar repetido, comprobar
	@Override
	public boolean add(E e) {
		
		if(this.first == null) {
			NodeGeneric<E> node = new NodeGeneric<E>();
			node.setData(e);
			this.first = node;
			this.last = node;
			size++;
		}
		else {
			NodeGeneric<E> node = new NodeGeneric<E>();
			node.setData(e);
			node.previousNode = this.last;
			this.last.nextNode = node;
			size++;
			this.last = node;
		}
		return true;
	}

	@Override
	public boolean remove(Object o) {
		
		return super.remove(o);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		
		return super.addAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		
		return super.addAll(index, c);
	}

	@Override
	public void clear() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}
	//Retorna el valor del nodo del indice dado
	@Override
	public E get(int index) {
		if(index<0 || index>=size)
			throw new IndexOutOfBoundsException("Los subindices de la lista deben estar en el rango de 0-"+this.size);
		NodeGeneric<E> iterador = this.first;
		for(int i = 0; i< index ; i++) {
			iterador = iterador.getNextNode();
		}
		return iterador.getData();
	}

	@Override
	public E set(int index, E element) {
		
		return super.set(index, element);
	}

	@Override
	public void add(int index, E element) {
		
		super.add(index, element);
	}

	@Override
	public E remove(int index) {
		
		return super.remove(index);
	} 
	//Devuelve el indice de la primera aparicion de un elemento 
	@Override
	public int indexOf(Object o) {
		NodeGeneric<E> node = this.first;
		for(int i = 0 ; i < size() ; i++) {
			if(node.getData().equals(o))
				return i;
			node = node.nextNode;
		}
		return -1;
	}

	@Override
	public int lastIndexOf(Object o) {
		
		return super.lastIndexOf(o);
	}

	@Override
	public E peek() {
	
		return super.peek();
	}

	@Override
	public E element() {
		
		return super.element();
	}

	@Override
	public E poll() {
		
		return super.poll();
	}

	@Override
	public E remove() {
		
		return super.remove();
	}

	@Override
	public boolean offer(E e) {
		
		return super.offer(e);
	}

	@Override
	public boolean offerFirst(E e) {
		
		return super.offerFirst(e);
	}

	@Override
	public boolean offerLast(E e) {
		
		return super.offerLast(e);
	}

	@Override
	public E peekFirst() {
		
		return super.peekFirst();
	}

	@Override
	public E peekLast() {
		
		return super.peekLast();
	}

	@Override
	public E pollFirst() {
		
		return super.pollFirst();
	}

	@Override
	public E pollLast() {
		
		return super.pollLast();
	}

	@Override
	public void push(E e) {
		
		super.push(e);
	}

	@Override
	public E pop() {
		
		return super.pop();
	}

	@Override
	public boolean removeFirstOccurrence(Object o) {
		
		return super.removeFirstOccurrence(o);
	}

	@Override
	public boolean removeLastOccurrence(Object o) {
		
		return super.removeLastOccurrence(o);
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		
		return super.listIterator(index);
	}

	@Override
	public Iterator<E> descendingIterator() {
		
		return super.descendingIterator();
	}

	@Override
	public Object clone() {
		
		return super.clone();
	}

	@Override
	public Object[] toArray() {
		
		return super.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		
		return super.toArray(a);
	}

	@Override
	public Spliterator<E> spliterator() {
		
		return super.spliterator();
	}
	//Retorna true si la lista esa vacia
	@Override
	public boolean isEmpty() {

		return this.first == null;
	}
	
	//Imprime los datos de la lista
	@Override
	public String toString() {
		String cadena = "";
		NodeGeneric<E> iterator = this.first;
		for(int i = 0 ; i < size() ; i++) {
			cadena = cadena + "[" + iterator.getData()+"] ";
			iterator = iterator.nextNode;
		}
		return cadena;
	}
}
