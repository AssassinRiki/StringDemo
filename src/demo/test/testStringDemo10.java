package demo.test;
import demo.StringDemo;
import junit.framework.TestCase;
public class testStringDemo10 extends TestCase {
	private StringDemo str;
	protected void setUp(){
		str = new StringDemo();
	}
		public void testSmallString() {
		assertEquals("含有空格的处理",str.smallString("A B"),"a b");
		
	}
}