package javabasics;

import java.util.*;  
class JBArraylist{  
   public static void main(String args[]){  
      ArrayList<String> alist=new ArrayList<String>();  
      alist.add("1");
      alist.add("2");
      alist.add("3");
      alist.add("4");
      alist.add("5");
      alist.add("6");
  
      //displaying elements
      System.out.println(alist);
  
      //Adding "Steve" at the fourth position
      alist.add(3, "Four");
  
      //displaying elements
      System.out.println(alist);
   }  
}
