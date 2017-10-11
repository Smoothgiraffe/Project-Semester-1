import java.util.Scanner;

public class Project1{
	public static void main(String[] args){
    char[][] pentP = {{'p','p'},{'p','p'},{'p',0}}; //3x3 nxm
		char[][] pentX = {{0,'x',0},{'x','x','x'},{0,'x',0}}; //3x3 mxm
		char[][] pentF = {{0,'f','f'},{'f','f',0},{0,'f',0}};
		char[][] pentV = {{'v',0,0},{'v',0,0},{'v','v','v'}};
		char[][] pentW = {{'w',0,0},{'w','w',0},{0,'w','w'}};
		char[][] pentY = {{0,'y'},{'y','y'},{0,'y'},{0,'y'}};
		char[][] pentI = {{'i'},{'i'},{'i'},{'i'},{'i'}};
		char[][] pentT = {{'t','t','t'},{0,'t',0},{0,'t',0}};
		char[][] pentZ = {{'z','z',0},{0,'z',0},{0,'z','z'}};
		char[][] pentU = {{'u',0,'u'},{'u','u','u'}};
		char[][] pentN = {{'n','n',0,0},{0,'n','n','n'}};
char[][] pentL = {{0,0,0,'l'},{'l','l','l','l'}};
		char[] pentArray ={pentP, pentX, pentF, pentV, pentW, pentY, pentI, pentT, pentZ, pentU, pentN, pentL};

		Scanner input = new Scanner(System.in);
		System.out.println("Type the length of the grid.");
		int lengthGrid = input.nextInt();
		System.out.println("Type the width of the grid.");
		int widthGrid = input.nextInt();

		int area = lengthGrid * widthGrid;
		char[][] grid = new char[lengthGrid][widthGrid];


		if(area%5 != 0){
			System.out.println("Not possible.");
		}
		if else(area > 60){
			System.out.println("Definetely not possible!");
		}
		if else(grid[1][5] || grid[5][1]){ //????? or grid.length == 5 && grid[0].length == 1
			System.out.println("True."); //show??
		}

		for(int i=0; i<lengthGrid; i++){
			for(int j =0; j<widthGrid; j++){
				rotateMatrix(pentArray);
				flipMatrix(pentArray);
			}
		}
	}

  public static char[][] rotateMatrix(char[][] a){
    int n = a.length;
    int m = a[0].length;
    char[][] tempMatrix = a[m][n];
    for(int i=0; i<m; i++){
      for(int j=0; j<n; j++){
        tempMatrix[i][j] = a[j][i];
      }
    }
    rotatedMatrix[][]=flipMatrix(tempMatrix);
    return rotatedMatrix;
  }

  //flipping
  public static char[][] flipMatrix(char[][] a){
    int n = a.length;
    int m = a[0].length;
    char[][] flipMatrix = a[m][n]; //do we need a temp matrix/value??
    for(int i=0; i<m; i++){
      for(int j=0; j<n; j++){
        flipMatrix[i][j] = a[i][a[0].length-1-j];
      }
    }
    return flipMatrix;
  }
}
