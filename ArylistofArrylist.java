package Data_struct;

import java.util.*;

public class ArylistofArrylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		outer.add(a1);

		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(5);
		outer.add(a2);

		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(10);
		a3.add(20);
		a3.add(30);
		outer.add(a3);
		
		System.out.println(outer.get(2).get(0));
		System.out.println(outer.get(2));
		System.out.println(outer);

	}

}
