package demo.test;
import demo.StringDemo;
import junit.framework.TestCase;
public class testStringDemo6 extends TestCase {
	private StringDemo str;
	protected void setUp(){
		str = new StringDemo();
	}
		public void testSmallString() {
		assertEquals("含有特殊字符的处理",str.smallString("，A"),"，a");
		
	}
}