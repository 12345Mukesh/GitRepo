package Sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.primitives.Ints;

public class Test5 {

	public static void main(String[] args) 
	{
	
		/*
		 * For checking list whether even or odd is present we need to store in array then only it will work
		 */
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		al.add(15);
		al.add(20);
		al.add(35);
		al.add(40);
		al.add(55);
		Integer[] n = al.toArray(new Integer[0]);
		
		System.out.println(Arrays.toString(n));
		for (int i = 0; i < n.length; i++) {
			if (n[i] % 2 == 0) {
				System.out.println(n[i] + " is Even number");
				list.add(n[i]);
			}
		}

		System.out.println(list);
		
		
		
		
		
		/*
		 * Reversing array and adding to another array
		 */

		String[] arr = { "qwertyuiop", "asdfgh", "words", "upper", "lower", "side", "right", "left", "top", "bottom" };
		String[] rev = new String[arr.length];
		int a = 0;
		for (int i = arr.length - 1; i >= 0; i--)

		{
			rev[a] = arr[i];          
			System.out.println("reverese of a" + " " + rev[a]);
			System.out.println(a);
			a = a + 1;
		}

		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(rev[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
		System.out.println(Arrays.toString(rev));
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
