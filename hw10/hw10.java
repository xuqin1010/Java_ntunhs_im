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
			line = input("請輸入指令選擇下列功能 0.新增 1.查詢 2.修改 3. 刪除 4.顯示所有 99. 結束：");
				String name;
				int grade;
				switch(line) {
					case "99":
						isLoop=false;
						saveToFile(grades,"grades.csv");
						break;
					case "0":
						name= input("請輸入學生姓名:");
						grade =Integer.parseInt(input("請輸入學生成績:"));
						grades.putIfAbsent(name, grade);
						break;
					case "1":
						name= input("請輸入學生姓名:");
						System.out.println("學生姓名："+ name+" 成績："+grades.get(name));
						
						break;
					case "2":
						name = input("請輸入學生姓名：");
						grade = Integer.parseInt(input("請輸入學生修改成績:"));
						grades.put(name,grade);
						System.out.println("學生姓名："+ name+" 修改後成績："+grades.get(name));
						break;
					case "3":
						name= input("請輸入學生姓名:");
						grades.remove(name);
						System.out.println("學生姓名："+ name+"已刪除");			
						break;
					case "4":
						System.out.println("學生成績列表:");
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
		System.out.println("讀取檔案時發生錯誤：" + e.getMessage());
	}
}

static void saveToFile(Map<String, Integer>grades,String filename) {
	try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
		for (Map.Entry<String, Integer>entry: grades.entrySet()) {
			writer.write(entry.getKey() + ","+entry.getValue());
			writer.newLine();
		}
	} catch (IOException e) {
		System.out.println("寫入檔案時發生錯誤：" + e.getMessage());
	}
}
    static String input(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        return line;
		

	}

}
