package HW4;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp ="";
		Scanner sc= new Scanner(System.in);
		System.out.println("�o�O�i�H���A��{��!�A�i�H�ݧڤ@�ǰ��D");
			while(true) {
				System.out.print("�A���G");
				temp=sc.nextLine();
				temp=temp.replace("��?","!");
				temp=temp.replace("�A�|","�ڷ|");	
				temp=temp.replace("�ण��","��");
				temp=temp.replace("�A��","�گ�");	
				System.out.print("�ڻ��G"+temp);
			
				if(temp.equals("0")) {
					System.out.println("���}��ѵ{��");
					break;
				}	
				
			}
	}

}
