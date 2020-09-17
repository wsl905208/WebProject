import org.apache.log4j.Logger;
import org.apache.log4j.jmx.AbstractDynamicMBean;

import javax.management.*;
import java.util.List;

/**
 * @author wsl
 * @create 2020-09-17 10:43
 */
public class ArrayList extends AbstractDynamicMBean {
    protected Logger getLogger() {
        return null;
    }

    public static void test01(){
        System.out.println("还不错");
    }

    public static void main(String[] args) {
        test01();
        System.out.println();
        for (String arg : args) {
            
        }
        List list = new java.util.ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        for (Object o : list) {
            System.out.println(o);
        }

        int[] arr = new int[3];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        arr[2] = 33;
        arr[2] = 33;
        arr[2] = 33;
        arr[2] = 33;
        for (int i : arr) {
            System.out.println(i);
        }
        if (arr == null) {

        }
        if (arr == null) {
            if (arr != null) {

            }
        }
    }

    public Object getAttribute(String attribute) throws AttributeNotFoundException, MBeanException, ReflectionException {
        return null;
    }

    public void setAttribute(Attribute attribute) throws AttributeNotFoundException, InvalidAttributeValueException, MBeanException, ReflectionException {

    }

    public Object invoke(String actionName, Object[] params, String[] signature) throws MBeanException, ReflectionException {
        return null;
    }

    public MBeanInfo getMBeanInfo() {
        return null;
    }
}
