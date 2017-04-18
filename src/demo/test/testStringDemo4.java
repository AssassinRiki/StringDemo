package demo.test;
import demo.StringDemo;
import junit.framework.TestCase;
public class testStringDemo4 extends TestCase {
	private StringDemo str;
	protected void setUp(){
		str = new StringDemo();
	}
		public void testSmallString() {
		assertEquals("º¬ÓÐÊý×ÖµÄ×Ö·û´®",str.smallString("A2D"),"a2d");
		
	}
}