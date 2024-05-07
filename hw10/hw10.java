package hw10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class hw10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File filecheck = new File("grades.csv");
		Map<String, Integer> grades = new HashMap<>();
		
		if(filecheck.exists()) loadFromFile(grades,"grades.csv");
		else
			try {
				filecheck.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		int sum = 0;
		String line;
		boolean isLoop=true;
		
		
		
		while(isLoop) {
			line = input("�п�J���O��ܤU�C�\�� 0.�s�W 1.�d�� 2.�ק� 3. �R�� 4.��ܩҦ� 99. �����G");
				String name;
				int grade;
				switch(line) {
					case "99":
						isLoop=false;
						saveToFile(grades,"grades.csv");
						break;
					case "0":
						name= input("�п�J�ǥͩm�W:");
						grade =Integer.parseInt(input("�п�J�ǥͦ��Z:"));
						grades.putIfAbsent(name, grade);
						break;
					case "1":
						name= input("�п�J�ǥͩm�W:");
						System.out.println("�ǥͩm�W�G"+ name+" ���Z�G"+grades.get(name));
						
						break;
					case "2":
						name = input("�п�J�ǥͩm�W�G");
						grade = Integer.parseInt(input("�п�J�ǥͭק令�Z:"));
						grades.put(name,grade);
						System.out.println("�ǥͩm�W�G"+ name+" �ק�ᦨ�Z�G"+grades.get(name));
						break;
					case "3":
						name= input("�п�J�ǥͩm�W:");
						grades.remove(name);
						System.out.println("�ǥͩm�W�G"+ name+"�w�R��");			
						break;
					case "4":
						System.out.println("�ǥͦ��Z�C��:");
						for (Map.Entry<String, Integer> entry : grades.entrySet()) {
						System.out.println(entry.getKey() + ": " + entry.getValue());
						}
						break;
				}
			
		}
	}
	
static void loadFromFile(Map<String, Integer>grades,String filename) {
	try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
		String line;
		while((line = reader.readLine()) !=null){
			String[] parts = line.split(",");
			String name = parts[0];
			int grade = Integer.parseInt(parts[1]);
			grades.put(name, grade);
		}
	} catch (IOException e) {
		System.out.println("Ū���ɮ׮ɵo�Ϳ��~�G" + e.getMessage());
	}
}

static void saveToFile(Map<String, Integer>grades,String filename) {
	try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
		for (Map.Entry<String, Integer>entry: grades.entrySet()) {
			writer.write(entry.getKey() + ","+entry.getValue());
			writer.newLine();
		}
	} catch (IOException e) {
		System.out.println("�g�J�ɮ׮ɵo�Ϳ��~�G" + e.getMessage());
	}
}
    static String input(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        return line;
		

	}

}
