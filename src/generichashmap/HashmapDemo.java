/*
 * HashMap is a a data structure which can be used to store key-value pairs.
 *  If we know the key we can retrieve object on constant time.
 * */
package generichashmap;

import java.util.*;
public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * The declaration and the instantiation of a generic Map is only different 
		 * to other type of collection such as List and Set is that we to define two types. 
		 * One type for the key and the other type for the value.
		 * */
		HashMap<Integer, String> employee = new HashMap<Integer, String>();

		Integer empcode1 = 1;
        Integer empcode2 = 2;
        Integer empcode3 = 3;
        String empName1 = "Harshada Chavan";
        String empName2 = "Anand Jadhav";
        String empName3 = "Jayesh Sonawane";
        
        //pushing the values in Map
        employee.put(empcode1,empName1);
        employee.put(empcode2,empName2);
        employee.put(empcode3,empName3);

        for (Integer Key : employee.keySet()){
        	//get values by keys
            String name = employee.get(Key);    
            System.out.println("empname : "+name);
            
        }
	}

}
