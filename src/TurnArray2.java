//todo DO NOT use default package
public class TurnArray2 {

    public int[][] array;
    int[][]arrayTurned ;

    TurnArray_2(int[][] arrayIn) {
        array = arrayIn;
    }
    //todo why?
    TurnArray_2() {
        array =new int [0][0];
    }

    public void turnRightOnePosition() throws ArrayIndexOutOfBoundsException {
        //todo why creating new array? use initial one and just swap elements
        arrayTurned = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < arrayTurned[i].length; j++) {
                arrayTurned[i][j] = array[(array.length - 1) - j][i];
            }
        }
             array=arrayTurned;
    }
    public void turnLeftOnePosition() throws ArrayIndexOutOfBoundsException {
        //todo why creating new array? use initial one and just swap elements
        arrayTurned = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < arrayTurned[i].length; j++) {
                arrayTurned[i][j] = array[j][(array.length - 1) - i];
            }
        }
        array=arrayTurned;
    }

    public void turnTwice() throws ArrayIndexOutOfBoundsException {
//todo why creating new array? use initial one and just swap elements
        arrayTurned = new int[array.length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < arrayTurned[i].length; j++) {
                arrayTurned[i][j] = array[(array.length - 1) - i][(array.length - 1) - j];
            }
        }
        array=arrayTurned;
    }
}
//todo CamelCase starting from capital letter
class  go{
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5,6 }};


        try {
            //todo avoid underscores in names
            TurnArray_2 g = new TurnArray_2(array);//Создаем обьект класа и сразу передаем параметры
            g.turnLeftOnePosition();//Вызываем его метод
            int[][] arrayNEW = g.array;

            for (int i = 0; i < arrayNEW.length; i++) {
                for (int j = 0; j < arrayNEW[i].length; j++) {
                    System.out.print(arrayNEW[i][j] + "\t ");
                }
                System.out.println();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Пока вертит только симетричные масивы");

        }
    }
}

