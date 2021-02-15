package com.company;

public class Main {

    public static void main(String[] args) {
	String[] arr = new String[]{"gdfgfgsdf", "gsdfgsdfgfdgs","gsdfgd","fsdggdfgsdfgdsfgdsfgdsg"};
	String longestStr="";
	for (String i:arr){
	    if (i.length()>longestStr.length()) longestStr=i;
    }
        System.out.println("Самая длинная строка " + longestStr);
    }
}
