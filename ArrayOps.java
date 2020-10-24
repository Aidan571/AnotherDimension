public class ArrayOps{
  public static int sum(int[] arr){
    if(arr.length == 0){
      return 0;
    }
    int result = 0;
    for(int i = 0; i < arr.length; i++){
      result += arr[i];
    }
    return result;
  }
  public static int largest(int[] arr){
    int large = 0;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] > large){
        large = arr[i];
      }
    }
    return large;
  }
  public static int[] sumRows(int[][] matrix){
    int hold = matrix.length;
    int[] result;
    result = new int[hold];
    for(int i = 0; i < matrix.length; i++){
      result[i] = sum(matrix[i]);
    }
    return result;
  }
  public static int[] largestInRows(int[][] matrix){
    int[] result = new int[matrix.length];
    for(int i = 0; i < matrix.length; i++){
      result[i] = largest(matrix[i]);
    }
    return result;
  }
  public static int sum(int[][] arr){
    int result = 0;
    for(int i = 0; i < arr.length; i++){
      result += sum(arr[i]);
    }
    return result;
  }
  public static int[] sumCols(int[][] matrix){
    int[] result = new int[matrix[0].length];
    int holder;
    for(int i = 0; i < matrix[0].length; i++){
      holder = 0;
      for(int j = 0; j < matrix.length; j++){
        holder += matrix[j][i];
      }
      result[i] = holder;
    }
    return result;
  }
  public static boolean isRowMagic(int[][] matrix){
    for(int i = 1; i < matrix.length; i++){
      if(sum(matrix[i]) != sum(matrix[i - 1])){
        return false;
      }
    }
    return true;
  }
  public static boolean isColMagic(int[][] matrix){
    int[] holder = sumCols(matrix);
    for(int i = 1; i < matrix[0].length; i++){
      if(holder[i] != holder[i - 1]){
        return false;
      }
    }
    return true;
  }
  public static boolean isLocationMagic(int[][] matrix, int row, int col){
    int[] colHolder = sumCols(matrix);
    int[] rowHolder = sumRows(matrix);
    if(rowHolder[row] != colHolder[col]){
      return false;
    }
    return true;
  }
}
