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
	
	private void givenAListContaining(String...elements )
	{
		for(String s:elements)
		{
			list.add(s);
		}
	}

	
	
	@Test
	public void testGet_OneElement()
	{
		givenAListContaining("a");  //given when then Given-When-Then or GWT is a semi-structured way to write down test cases
		String result= list.get(0);
		
		Assert.assertEquals("a",result);
		
	}
	
	@Test
	public void testSize_addSecondElement()
	{
		givenAListContaining("a");
		list.add("b");
		
		Assert.assertEquals(2,list.size());
		
	}
	
	@Test
	public void testget_FirstElementFromTwoElementList()
	{
		givenAListContaining("a","b");
		String result = list.get(0);
		
		Assert.assertEquals("a",result);
	}
	
	
	@Test
	public void testget_SecondElementFromTwoElementList()
	{
		givenAListContaining("a","b");
		String result = list.get(1);
		
		Assert.assertEquals("b",result);
	}
	
	@Test
	public void testRemove_FirstElementFromTwoElementList_elemntWasTheFirst()
	{
		givenAListContaining("a","b");
		String result = list.remove(0);
		
		Assert.assertEquals("a",result);
	}
	
	@Test
	public void testRemove_FirstElementFromTwoElementList_sizeIsOne()
	{ 
		givenAListContaining("a","b");   //given when then GWT
		whenTheFirstElementIsRemoved();
		
		Assert.assertEquals(1,list.size());
	}
	
	private void whenTheFirstElementIsRemoved() {
		list.remove(0);
		
	}

	@Test
	public void testRemove_FirstElementFromTwoElementList_elemntWasTheSecond()
	{
		givenAListContaining("a","b");
		String result = list.remove(0);
		
		Assert.assertEquals("a",result);
	}
	
}
