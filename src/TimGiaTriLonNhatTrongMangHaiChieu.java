public class TimGiaTriLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        int[][] array = {
                {4,10,6},
                {1,2,3},
                {7,8,9},
        };
        int max = 0;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column<array[row].length; column++) {
                if (max<array[row][column]){
                    max = array[row][column];
                }
            }
        }System.out.println("Phần tử lớn nhất trong mảng "+max);
    }
}
