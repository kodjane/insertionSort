
public class InsertionSort {

	public static void main(String[] args) {
		int numbers[] = { 10, 5, 3, 7, 2 };

		sort(numbers);
		printArray(numbers);
	}

	public static int[] sort(int [] A) {
		for (int i = 1; i < A.length; i++) {
			int key = A[i]; // le deuxième élement constitue notre clé
			int j = i-1; // on repère la position précédente
			
			while (j>= 0 && A[j] >= key){ // tant que l'indice de l'élément précédent n'est pas négatif et tester si la clé est inférieur au précédent  
				A[j+1] = A[j]; // je met l'élémznt supérieur à la place de l'indice de ka clé
				j--; // on les compare avec tout les élément de gauche jusqu'à la fin de la boucle
			}
			A[j+1] = key; // A ce niveau j est négatif alors on ne peut plus rentré dans la boucle dans ce cas on met la clé dans à la position j+1 qui dans ce cas vaut 0
		}
		return A; 
	}

	public static void printArray(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}

}
