package hw02;

import java.util.Scanner;

public class hw02 {
	static String fever;
	static String cough;
	static String Lazy;
	static String highbool;
	static String dry;
	static String sweats;

	public static void main(String[] args) {	
		Scanner scanner= new Scanner (System.in);
		System.out.println("�w��ϥ������t�ΡA�Ш̧Ǧ^���U�C���D");
		System.out.println("========================");
		System.out.print("�аݧA�̪�O�_�o�N?�G");
		fever = scanner.next();
		
		
		if (fever.toLowerCase().equals("y")) {
			System.out.println("�аݱz�̪�O�_�y�¡H:");
			cough = scanner.next();
			
			if (cough.toLowerCase().equals("y")) {
				System.out.print("�аݱz�̪�O�_�h��?:");
				Lazy = scanner.next();
				if(Lazy.toLowerCase().equals("y")){
					System.out.print("����/�p�j�A�i��o�P�_!!");
				} 
				else {
					System.out.print("����/�p�j�A�i��o��L�t��!!");
				}			
			} else {
				System.out.print("�аݱz�̪�O�_������?");
				highbool = scanner.next();
				
				if(highbool.toLowerCase().equals("y")) {
					System.out.print("�аݱz�̪�O�_�f��?");
					dry = scanner.next();
					
					if(dry.toLowerCase().equals("y")) {
						System.out.print("����/�p�j�A�i��o�x�f!!");
					} else {
						System.out.print("��L�t��");
					}
				} else {
					System.out.print("�аݱz�̪�O�_�s��?");
					sweats = scanner.next();
					if(dry.toLowerCase().equals("y")) {
						System.out.print("����/�p�j�A�i��o�x�f!!");
					}else{
						System.out.print("��L�t��");
					}
				}
			}
			
		}

	}

}
