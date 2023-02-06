package ninja;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Exercice1
        Matrix matrix1 = new Matrix(2, 3); //2 lignes et 3 colonnes
        matrix1.setItem(1, 1, 6);
        matrix1.setItem(1, 2, 5);
        matrix1.setItem(1, 3, 4);
        matrix1.setItem(2, 1, 4);
        matrix1.setItem(2, 2, 3);
        matrix1.setItem(2, 3, 5);

        Matrix matrix2 = new Matrix(2, 3); //2 lignes et 3 colonnes
        matrix2.setItem(1, 1, 3);
        matrix2.setItem(1, 2, 4);
        matrix2.setItem(1, 3, 2);
        matrix2.setItem(2, 1, 4);
        matrix2.setItem(2, 2, 4);
        matrix2.setItem(2, 3, 3);

        Matrix.add(matrix1, matrix2);

        Matrix matrix3 = new Matrix(3, 2);
        matrix3.setItem(1, 1, 1);
        matrix3.setItem(1, 2, 2);
        matrix3.setItem(2, 1, 0);
        matrix3.setItem(2, 2, 4);
        matrix3.setItem(3, 1, 3);
        matrix3.setItem(3, 2, -1);

        Matrix matrix4 = new Matrix(2, 2);
        matrix4.setItem(1, 1, 2);
        matrix4.setItem(1, 2, 0);
        matrix4.setItem(2, 1, 1);
        matrix4.setItem(2, 2, -3);

        Matrix.multiply(matrix3, matrix4);

	}

}
