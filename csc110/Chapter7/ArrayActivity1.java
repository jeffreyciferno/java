package Chapter7;

public class ArrayActivity1 {
	
	
	public static void main(String[] args)
    {
	double[]myExams = new double [4]; {
	myExams[0] = 92.3;
	myExams[1] = 82.0;
	myExams[2] = 98.4;
	myExams[3] = 91.0;
	
	System.out.println(myExams[1]);
	
	double sum = 0.0;
	for (int x = 0; x < myExams.length; x++)
	{ 
		System.out.println("[" + x + "]:" + myExams[x]);	
	sum =sum + myExams[x];
	
	}
	System.out.println("The sum is " + sum);
	
	System.out.println("The max is: " + findMax(myExams));
	
	
	
	}
	
	
	}

	public static double findMax(double[] myExams) {
		// TODO Auto-generated method stub
		double max = myExams[0];
		for( int x=0; x < myExams.length; x++)
		{
			if (myExams[x] > max)
				max = myExams[x];
		}
		
		
		return max;
	}
	public static void printInOrder(double[] myExams)
	{
		for(double value : myExams)
		{
			System.out.println(value + " | ");
		}
			
	}
	
}
