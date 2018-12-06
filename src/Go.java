class  Go{
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5,6 }};


        try {

            TurnArray2 g = new TurnArray2(array);//Создаем обьект класа и сразу передаем параметры
            g.turnLeftOnePosition();//Вызываем его метод
            int[][] arrayNEW = g.getArray();

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