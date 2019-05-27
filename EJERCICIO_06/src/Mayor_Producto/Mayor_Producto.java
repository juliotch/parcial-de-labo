package Mayor_Producto;

public class Mayor_Producto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={2,3,4,0,1,4,1,50,8,7,12,5};
		int[] B={0,0,0,0};
		
		int producto=0;
		int maximo=0;
		
		for(int i=0;i<A.length-3;i++) {
			producto = A[i]*A[i+1]*A[i+2]*A[i+3];
			if(producto>=maximo) {
				maximo=producto;
				B[0]=A[i];
				B[1]=A[i+1];
				B[2]=A[i+2];
				B[3]=A[i+3];
				
			}
			
		}
		
		System.out.println(B[0]+" "+B[1]+" "+B[2]+" "+B[3]);

	}

}
