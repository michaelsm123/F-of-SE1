package abstractions;
public class Main {
       private static int a[]={1,2,3,3,2,3};

       public static void main(String[] args) {
               /* Part 1 */
		IntSet set=new IntSet();
		for (int i=0; i<a.length;++i)
		{
			set.insert(a[i]);
			System.out.println(set);
		}
		System.out.println("In the end, set contains "+set.size()+" elements.");

               /* Part 2 */
		System.out.println("In the array a, the following integers are duplicated:");
		IntSet dupSet=new IntSet();
		IntSet printed = new IntSet();
		for (int i=0; i<a.length;++i)
		{

			if (dupSet.contains(a[i])){
				if(!printed.contains(a[i])) {
					System.out.print(a[i]+" ");
					printed.insert(a[i]);
				}
            }
				dupSet.insert(a[i]);
		}
	        System.out.println();
	}
}


/*When the keyword "static" is removed it causes many errors throughtout the code due to the fact
 * it is not longer static and the variable could constantly be changing thoughout the code*/


/*
 main
 import IntSet
 Part 1 & Part 2
 static & array
 System.out.print and println
 */
