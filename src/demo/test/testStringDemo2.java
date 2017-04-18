package demo.test;
import demo.StringDemo;
import junit.framework.TestCase;
public class testStringDemo2 extends TestCase {
	private StringDemo str;
	protected void setUp(){
		str = new StringDemo();
	}
		public void testSmallString() {
		assertEquals("×Ö·û´®È«ÊÇ´óÐ´",str.smallString("SFB"),"sfb");
		
	}
}