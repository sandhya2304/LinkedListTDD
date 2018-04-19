package testing;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import pack.LinkedList;

public class LinkedListTest
{
	
	private  LinkedList<String> list;
	
	@Before
	public void setUp()
	{
		list=new LinkedList<>();
	}
	
	@Test
	public void testLinkedListEmptySize()
	{
		LinkedList list=new LinkedList();
		Assert.assertEquals(0,list.size());
				
	}
	
	@Test
	public void testLinkedListSizeOneElement()
	{
		
		list.add("a");
		
		Assert.assertEquals(1,list.size());
		
	}
	@Test
	public void testGet_OneElement()
	{
		givenAListWithOneElement("a");  //given when then Given-When-Then or GWT is a semi-structured way to write down test cases
		String result= list.get(0);
		
		Assert.assertEquals("a",result);
		
	}

	private void givenAListWithOneElement(String string)
	{
		list.add(string);
		
	}
	

}
