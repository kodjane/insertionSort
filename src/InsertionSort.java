
public class InsertionSort {

	public static void main(String[] args) {
		int numbers[] = { 10, 5, 3, 7, 2 };

		sort(numbers);
		printArray(numbers);
	}

	public static int[] sort(int [] A) {
		for (int i = 1; i < A.length; i++) {
			int key = A[i]; // le deuxi�me �lement constitue notre cl�
			int j = i-1; // on rep�re la position pr�c�dente
			
			while (j>= 0 && A[j] >= key){ // tant que l'indice de l'�l�ment pr�c�dent n'est pas n�gatif et tester si la cl� est inf�rieur au pr�c�dent  
				A[j+1] = A[j]; // je met l'�l�mznt sup�rieur � la place de l'indice de ka cl�
				j--; // on les compare avec tout les �l�ment de gauche jusqu'� la fin de la boucle
			}
			A[j+1] = key; // A ce niveau j est n�gatif alors on ne peut plus rentr� dans la boucle dans ce cas on met la cl� dans � la position j+1 qui dans ce cas vaut 0
		}
		return A; 
	}

	public static void printArray(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}

}
