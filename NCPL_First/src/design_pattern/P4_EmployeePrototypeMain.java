package design_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P4_EmployeePrototypeMain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter employee Id");
		int id = Integer.parseInt(br.readLine());
		
		System.out.println("Enter employee name: ");
		String name = br.readLine();
		
		System.out.println("enter employee salary: ");
		double sal = Double.parseDouble(br.readLine());
		
		P4_EmployeeRecord er = new P4_EmployeeRecord(id, name, sal);
		
		er.showRecord();
		P4_EmployeeRecord er1 = (P4_EmployeeRecord) er.getClone();
		er1.showRecord();
		
	}

}
