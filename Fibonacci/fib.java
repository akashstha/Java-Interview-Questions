
public class fib {

	public static void main(String[] args) {
		int fibo=15;
		int[]finonc=new int[fibo];
		finonc[0]=0;
		finonc[1]=1;
		for(int i=2;i<finonc.length;i++) {
			finonc[i]=finonc[i-2]+finonc[i-1];
			
		}
		for(int i=0;i<finonc.length;i++) {
			System.out.println(finonc[i]+" ");
			
		}


   }

	}

