/*
 * number : 1712
 * name : ���ͺб���
*/
package Q1712;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int f_cost = sc.nextInt(); // A : fixed cost
		int p_cost = sc.nextInt(); // B : production cost
		int cost = sc.nextInt(); // C : ��Ʈ�� ��
		
		int num = 1; // ��Ʈ�� ����
		for (; num < f_cost; num++) {
			if (cost > (long)(f_cost / num) + p_cost)
				break;
		}
		if(num==f_cost)
			System.out.println(-1);
		else
			System.out.println(num);
	}

}