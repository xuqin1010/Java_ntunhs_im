package hw3;

import java.util.Scanner;

public class hw3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("�п�J�}�C�j�p�G");
		
		int idx=0;
		int num=sc.nextInt();
		int arr[] = new int[100];
		System.out.println("�п�J�����G");
		
		for (int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		
		idx= num-1;
		
		while(idx>=0) {
			System.out.printf("arr[%d]:%d\n",idx,arr[idx]);
			idx--;
		}
	}

}
