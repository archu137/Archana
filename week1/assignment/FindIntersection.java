package week1.assignment;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {3,2,11,4,6,7,0,1,5};
int b[]= {1,2,8,4,9,7};

//Traversing through values of Array1
for(int i=0;i<a.length;i++)
//Traversing through values of Array2
	for(int j=0;j<b.length;j++)
//Comparing values from array1 and array2
		if(a[i]==b[j])
//Printing matched values
			System.out.print(a[i]+" ");
	}
}
