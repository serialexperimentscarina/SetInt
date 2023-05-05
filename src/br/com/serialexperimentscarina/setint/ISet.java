package br.com.serialexperimentscarina.setint;

public interface ISet {
	
	public boolean isEmpty();
	public int size();
	public void addFirst(int dado) throws Exception;
	public void addLast(int dado) throws Exception;
	public void add(int dado, int pos) throws Exception;
	public void removeFirst() throws Exception;
	public void removeLast() throws Exception;
	public void remove(int pos) throws Exception;
	public int get(int pos) throws Exception;

}
