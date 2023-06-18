package com.project.controller;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args){
		List ls = new ArrayList<String>();
		ls.add("one");
		ls.add("two");
		ls.add("three");
		
		List ls1 = new ArrayList<String>();
		ls1.add("two");
		
		System.out.println(ls);
		
		ls.removeAll(ls1);
		
		System.out.println(ls);
	}
}
