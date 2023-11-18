import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 122 };
		
		//Print out the element that is divisible by 2
		//2, 4, 6, 8, 10, 122

		for(int i=0; i<arr2.length; i++)
		{
			if (arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
				break;
			}
			else
			{
				System.out.println(arr2[i] + " is not multiple of 2");
			}
		}
		
		//create object of the class - object.method
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("sheety");
		a.add("academy");
		a.add("selenium");
		System.out.println(a.get(3));
		
		for(int i = 0; i < a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("***********");
		for(String val: a)
		{
			System.out.println(val);
		}
		
		//item is present in ArrayList
		System.out.println(a.contains("selenium"));
		
		String[] name = {"rahul", "shetty", "selenium" };
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("selenium"));
	}

}
