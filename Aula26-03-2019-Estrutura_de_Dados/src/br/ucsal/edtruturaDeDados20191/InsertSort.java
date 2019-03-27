package br.ucsal.edtruturaDeDados20191;
/***@author Tiago Oliveira de Carvalho
 * @version 1.0
 */

public class InsertSort {

	public static void main(String[] args) {
		
		int[] vetor = new int[]{7,9,0,1,5,4};
		int at, px;
		
		for (int i = 1; i < vetor.length; i++) {
			at = vetor[i];
			px=i-1;
			while (px>=0 && at<vetor[px]) {
				vetor[px+1] = vetor[px];
				px--;
				
			}
			vetor[px+1] = at;
			
			
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+" ");
		}
		

	}

}
