package ninja;

public class Matrix {

	    private int rows;
	    private int columns;
	    private int[][] data;

	    public Matrix(int rows, int columns) {
	        this.rows = rows;
	        this.columns = columns;
	        data = new int[rows][columns];
	    }

	    public int getRows() {
	        return rows;
	    }

	    public void setRows(int rows) {
	        this.rows = rows;
	    }

	    public int getColumns() {
	        return columns;
	    }

	    public void setColumns(int columns) {
	        this.columns = columns;
	    }

	    public void setItem(int row, int colum, int value) {
	        if (row <= this.rows && colum <= this.columns * this.rows) {
	            data[row - 1][colum - 1] = value;
	        } else {
	            System.out.println("Impossible d'ajouter la valeur à la position donnée! ");
	        }
	    }

	    /*2 matrices sont additionnables si elles ont le meme nombre de ligne et de colonne (meme dimension)
	    Source: https://www.alloprof.qc.ca/fr/eleves/bv/mathematiques/les-operations-sur-les-matrices-m1467*/
	   
	    public static Matrix add(Matrix matrix1, Matrix matrix2) {
	        Matrix matrix3 = null;
	        if (matrix1.columns == matrix2.columns && matrix1.rows == matrix2.rows) {
	            matrix3 = new Matrix(matrix1.rows, matrix1.columns);
	            System.out.println("ici le Résultat de l'addition ");
	            for (int i = 0; i < matrix1.rows; i++) {
	                for (int j = 0; j < matrix1.columns; j++) {
	                    matrix3.data[i][j] = matrix1.data[i][j] + matrix2.data[i][j];
	                    System.out.print(matrix3.data[i][j] + " ");
	                }
	                System.out.println();
	            }
	        } else {
	            System.out.println("Les matrices ne peuvent être additionnées! ");
	        }
	        return matrix3;
	    }

	    /*2 matrices sont multipliables si le nombre de colonnes de la matrice 1 = nombre de ligne de la matrice 2
	    Source: https://www.alloprof.qc.ca/fr/eleves/bv/mathematiques/les-operations-sur-les-matrices-m1467*/
	    public static Matrix multiply(Matrix matrix1, Matrix matrix2) {

	    	//Le produit de 2 matrices donne une 3e matrice
	        Matrix matrix3 = null; 
	        if (matrix1.columns == matrix2.rows) {
	            System.out.println(" ici le Résultat du produit ");

	            matrix3 = new Matrix(matrix1.rows, matrix2.columns);

	            for (int i = 0; i < matrix1.rows; i++) {
	                for (int j = 0; j < matrix1.columns; j++) {
	                    matrix3.data[i][j] = 0;
	                    for (int k = 0; k < matrix1.columns; k++) {
	                        matrix3.data[i][j] += matrix1.data[i][k] * matrix2.data[k][j];
	                    }
	                    System.out.print(matrix3.data[i][j] + " ");
	                }
	                System.out.println();
	            }
	        } else {
	            System.out.println("Le produit de ces 2 matrices est impossible car le nombre de colonne " +
	                    "de la 1ere est different du nombre de ligne de la 2nde");
	        }
	        return matrix3;
	    }
	}


