package br.ucsal.edtruturaDeDados20191;

public class SelectionSort {

	public static void main(String[] args) {
		
		
		int[] vetor = new int[]{7,9,0,1,5,4};
		int aux2;
		
		for (int i = 0; i < vetor.length; i++) {
			int aux = i;
			for (int j = i; j < vetor.length; j++) {
				if(vetor[j]<vetor[aux]) {
					aux=j;
				}
				
			}
			aux2=vetor[i];
			vetor[i]=vetor[aux];
			vetor[aux]=aux2;
			
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+" ");
		}
	}

}
