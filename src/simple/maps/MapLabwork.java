/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.maps;

import common.Employee;
import common.EmployeeByLastName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author andre_000
 */
public class MapLabwork {
//1.Using the Employee class from GenericsAndMaps.common, create the necessary
//equals(), hashCode(), toString()
    
    // DONE
    
    
    
    
//2. Next, create and initialize four Employee objects, but this time make sure at least
//two have the same social security number. Now add them to a HashMap. What
//key will you use? How will you retrieve individual items? Use put(key, value) to
//add items; use get(key) to retrieve items. Demonstrate a solution. How will you
//loop through the keys or values? Demonstrate this too.
 public static void main(String[] args) {
        Employee e1 = new Employee(7,"Doe", "John", "333-33-3333");
        Employee e2 = new Employee(3, "Smith", "Sally", "111-11-1111");
        Employee e3 = new Employee(2, "Evans", "Bob", "222-22-2222");
        Employee e4 = new Employee(4, "Mallay", "Fred", "333-33-3333");

        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        Map map = new HashMap();
        
        for(Employee e : empList){
            map.put(e.getEmpID(), e);
        }

        for(Employee e : empList){
            System.out.println(map.get(e.getEmpID()));
        }

        Map testmap = new HashMap();
        
        for(int i=0 ; i < 100 ; i++){
            testmap.put(i,i);
            
 }
         Set<Integer> keys1 = testmap.keySet();
            
            for(Integer key : keys1){
                System.out.println(testmap.get(key));
            }


//3. Store the same four Employee objects in a TreeMap. Demonstrate that sorting
//works. First, make sure you override compareTo() from the Comparable interface.
//Now try using a Comparator from the GenericsAndMaps project (remember
//you’ll need a utility class).

    Map<Integer,Employee> map2 = new TreeMap<>(map);
    Set<Integer> keys = map2.keySet();
    
    for(int key : keys){
        System.out.println(map2.get(key));  
    }



//4. Store the same four Employee objects in a TreeSet. Demonstrate that sorting
//works AND that duplicates are removed by looping through the set using an
//iterator. Use both the natural ordering and an alternative ordering.
    
     Set<Employee> set = new TreeSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        
        Employee emp = null;

        Iterator<Employee> i = set.iterator();
        
        while( i.hasNext() ) {
            emp = i.next();
            System.out.println(emp);
        }
        
        List<Employee> list = new ArrayList<>(set);
        
        Collections.sort(list, new EmployeeByLastName());
        
        for(Employee emp1 : list) {
            System.out.println(emp1);
        }
    
    
    
}
}