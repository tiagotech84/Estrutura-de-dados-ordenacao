package br.ucsal.edtruturaDeDados20191;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] vetor = new int[]{7,9,0,1,5,4};
		int aux = vetor[0];
		for (int i = 0; i < vetor.length; i++) {
			
			for (int j = 0; j < vetor.length-1; j++) {
				
				if(vetor[j]>vetor[j+1]) {
					aux = vetor[j];
					vetor[j]=vetor[j+1];
					vetor[j+1]=aux;
					
				}
				
			}
			
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+" ");
		}
	}

}