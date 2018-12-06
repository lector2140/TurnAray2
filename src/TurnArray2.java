
public class TurnArray2 {

   private int[][] array;
    int[][]arrayTurned ;

    TurnArray2(int[][] arrayIn) {
         array = arrayIn;
        arrayTurned = new int[array.length][array.length];
    }
    //todo why? Ответ- если в параметры обьекта не вставят масив то код выдаст ошибку без этой части
   TurnArray2() {
       array =new int [0][0];
       arrayTurned = new int[array.length][array.length];
   }
   //Добавил что бы онраничить доступ к переменой...инкапсуляция все такое.ВОПРОС надо ли?Или просто вернуть переменой
    //public и не парится?
   public int[][]  getArray(){
        return array;
    }
    public void turnRightOnePosition() throws ArrayIndexOutOfBoundsException {
//todo БЕЗ ПРОМЕЖУТОЧНОГО МАСИВА!!!Мозгом потек пока слепил первый поаорот
        for (int i = 0; i < array.length/2; i++) {
            for (int j = 0; j < array[i].length/2; j++) {
                int stk = array[i][j];
                array[i][j] = array[array.length -1- j][i];
                int stk1 = array[j][array.length-1-i];
                array[j][array.length - 1-i] = stk;
                array[array.length-1-j][i] = array[array.length -1-i][array.length -1- j];
                array[array.length - 1-i][array.length - 1-j] = stk1;
            }
        }

    }
    public void turnLeftOnePosition() throws ArrayIndexOutOfBoundsException {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < arrayTurned[i].length; j++) {
                arrayTurned[i][j] = array[j][(array.length - 1) - i];
            }
        }
        array=arrayTurned;
    }

    public void turnTwice() throws ArrayIndexOutOfBoundsException {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < arrayTurned[i].length; j++) {
                arrayTurned[i][j] = array[(array.length - 1) - i][(array.length - 1) - j];
            }
        }
        array=arrayTurned;
    }
}


