package pack;

public class LinkedList<T> 
{
	
	private int size =0;
	private Node first;

	public int size() 
	{
		return size;
	}

	public void add(T value) 
	{
		size++;
		first=new Node(value);
	}
	
	
	public T get(int index)
	{	
		return first.value;
	}
	

	private class Node
	{
		private final T value;
		
		public Node(T value)
		{
			this.value=value;
		}
	}


	

}
