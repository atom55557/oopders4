package githubDeneme;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n= {32,27,64,18,95,14,90,70,60,37};
        int[] temp=new int[10];
		for(int counter=0;counter<n.length;counter++) {			
			System.out.printf(" "+n[counter]);
			
		}
		System.out.println("");
		//tersten
		for(int i=n.length-1;i>=0;i--) {
			
			System.out.printf(" "+n[i]);
			
		}  
        //swap operasyonu.
		for(int i=0;i<=n.length/2;i++) {
			temp[i]=n[n.length-i-1];
			n[n.length-i-1]=n[i];
			n[i]=temp[i];
			
			
		}
		System.out.println("");
		for(int counter=0;counter<n.length;counter++) {			
			System.out.printf(" "+n[counter]);
			
		}
		
	}

}
