//todo DO NOT use default package
public class TurnArray2 {

    public int[][] array;
    int[][]arrayTurned ;

    TurnArray2(int[][] arrayIn) {
        array = arrayIn;
    }
    //todo why?
    TurnArray2() {
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


