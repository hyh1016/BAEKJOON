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

		if(cost <= p_cost)
			System.out.println(-1);
		else
			System.out.println(f_cost/(cost-p_cost)+1);
		
		sc.close();
	}

}
