package com.sunbeam;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Apttech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1=new Vector();
		
//		Vector<Integer> v1=new Vector<Integer>(); 
		v1.add(17);
		v1.add(23);
		v1.add(11);
		
//		v1.add("Rehan"); It gives compile error
		v1.add(10);
		v1.add(45);
		v1.add(57);
		
		System.out.print(v1);
		System.out.println();
		// Enumeration
		
		Enumeration e1=v1.elements();
		
		while(e1.hasMoreElements()) {
			int k=(int) e1.nextElement(); // 17 int  <---- 17 object
			System.out.println("Cursor data = "+k);
		}
		
		// Iterator 
		ArrayList a1=new ArrayList (v1);
		ArrayList a2=new ArrayList (v1);
		 Iterator i1=a1.iterator();
		 
		 while(i1.hasNext()) {
			 int k=(int) i1.next();
			 if(k==11)  
				 i1.remove();
		 }
		 System.out.println("Iterator cursor");
		 System.out.print(a1+" ");
		 System.out.println();
		 System.out.println("List Iterator cursor");
		 ListIterator l1=a2.listIterator();
		 while(l1.hasNext()) {
			 int k=(int) l1.next();
			 if(k==23)
				  l1.add(24);
			 if(k==11)
				 l1.remove();
			 if(k==45)
				 l1.set(455);
			 
		 }
		 System.out.println(a2+" ");
		 System.out.println("Reverse");
		while(l1.hasPrevious()) {
			int k=(int) l1.previous();
			System.out.print(k+" ");
		}
	}

}
