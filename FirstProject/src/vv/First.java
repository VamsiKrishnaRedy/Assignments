package vv;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class First {

	    public static void main(String[] args) {
	 LinkedList<String> l1=new LinkedList<>();
	 l1.add("Vamsi");
	 l1.add("Krish");
	 l1.add("reddy");
	 l1.add("Sanju");
	 l1.add("Sai");
	 Iterator<String> itr= l1.iterator();
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }
	 
}
}

