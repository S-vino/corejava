package javatest1;

import static org.junit.Assert.assertArrayEquals;

public class CheckString {

	String obj1="Junit";
	String obj2="Junit";
	int a[]= {1,2,3};
	int b[]= {1,2,3};
	String s=null;
	String s1="EduBridge";
	@Test
	public void chkStrin() {
	//assertEquals(obj1,obj2);
	//assertSame(obj2, obj1);
	assertArrayEquals(a, b);
	assertNull(s);
	assertNotNull(s1);
	}

}
