package test;

import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class Test {
	/**
	* 初始化，封装应用
	*/
	private static XStream xstream = new XStream(new StaxDriver() {
	        public HierarchicalStreamWriter createWriter(Writer out) {
	                return new PrettyPrintWriter(out) {
	                public void startNode(String name, Class clazz) {
	                super.startNode(name);
	        }
	        protected void writeText(QuickWriter writer, String text) {
	            /**自定义格式化**/
	            writer.write(text);
	        }
	        };
	        }
	    });
	    /**
	    * 测试类
	    * @param args
	    */
	    public static void main(String[] args) {
	        User user = new User();
	        user.setId("id");
	        user.setName("name");
	        List<String> array = new ArrayList<>(3);
	        array.add("x");
	        array.add("y");
	        array.add("z");
	        user.setArray(array);
	        user.setUrl("url");
	        xstream.alias("xml", user.getClass());
	        xstream.autodetectAnnotations(true);
	        System.out.println(xstream.toXML(user));
	    }
}
