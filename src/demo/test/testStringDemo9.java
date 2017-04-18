package demo.test;
import demo.StringDemo;
import junit.framework.TestCase;
public class testStringDemo9 extends TestCase {
	private StringDemo str;
	protected void setUp(){
		str = new StringDemo();
	}
		public void testSmallString() {
		assertEquals("edit",str.smallString("editA"),"edita");
		
	}
}
