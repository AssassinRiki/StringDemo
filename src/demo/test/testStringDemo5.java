package demo.test;
import demo.StringDemo;
import junit.framework.TestCase;
public class testStringDemo5 extends TestCase {
	private StringDemo str;
	protected void setUp(){
		str = new StringDemo();
	}
		public void testSmallString() {
		assertEquals("ȫ�����ֵ��ַ���",str.smallString("789"),"789");
		
	}
}