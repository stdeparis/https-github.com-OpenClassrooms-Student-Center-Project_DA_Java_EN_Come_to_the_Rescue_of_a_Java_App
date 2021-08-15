package com.test;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.nio.charset.*;


public class Main {
	private static int headCount = 0;
	private static int rashCount = 0;		
	private static int pupilCount = 0;		
	private static BufferedReader reader;
	private static BufferedReader BufferedReader;
	
	public static void main(String args[]) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("c:/Users/teres/symptoms.txt"));
		String line = reader.readLine();
		int i = 0;	
		// counts headaches
		while (line != null) {
			 i++;
			System.out.println("symptom from file: " + line);
			if (line.equals("headache") ) {
				headCount++;
				System.out.println("number of headaches: " + headCount);
			
			}
			else if (line.equals("rash")) {
				rashCount++;
				System.out.println("number of rush: " + rashCount);
				
				
			}
			else if(line.equals("constricted pupils")) {
				pupilCount++;
				System.out.println("number of pupils: " + pupilCount);
				
			}else if(line.equals("dialated pupils")) {
				pupilCount++;
				System.out.println("number of pupils: " + pupilCount);
			}
			
		
			 
			line = reader.readLine();
		System.out.println("another symptom");// get another symptom
	
		
	
		 

	FileWriter writer = new FileWriter("result.txt");
	writer.write("headache: " + headCount + "\n");
	writer.write("rash: " + rashCount + "\n");
	writer.write("dialated pupils: " + pupilCount + "\n");
	writer.close();
	}}
	

		
		
	
	private static Exception BufferedReader(FileReader fileReader) {
		// TODO Auto-generated method stub
		return null;
	}
	

	public static BufferedReader getBufferedReader() {
		return BufferedReader;
	}

	public static void setBufferedReader(BufferedReader bufferedReader) {
		BufferedReader = bufferedReader;
	}

	public static BufferedReader getReader() {
		return reader;
	}

	public static void setReader(BufferedReader reader) {
		Main.reader = reader;
	}
}
	
