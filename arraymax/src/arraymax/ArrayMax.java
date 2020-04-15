package arraymax;

public class ArrayMax {
    private static int[][] array = { 
    	{1, 5, 27, 34}, 
    	{4, 28, 16, 45, 50}, 
    	{679, 45, 23, 4} 
    };
    
    private static int max_;
    
	public static void main(String[] args) {
		for (int[] i: array) {
			for (int j: i) {
				if ( j > max_ ) {
					max_ = j;
				}
			}
		}
		System.out.println(max_);
	}

}
