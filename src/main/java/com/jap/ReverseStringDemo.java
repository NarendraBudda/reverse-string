package com.jap;

public class ReverseStringDemo {
    public static void main(String[] args) {
        String String="narendra";
        String reverseString=new String("");
        ReverseStringDemo reverseStringDemo=new ReverseStringDemo();
           reverseString=reverseStringDemo.getReverseString(String);
          System.out.println("The Reverse String "+reverseString);




    }
//Write the logic to reverse the String  inside the below method and return the reverse String.
public String getReverseString(String string){
        String reverse="";
        for(int i=string.length()-1;i>=0;i--){
                  reverse=reverse+string.charAt(i);
    }
        return reverse;
    }
}
