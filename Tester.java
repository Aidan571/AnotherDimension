public class Tester{
  public static String arrToString(int[] arr){
  String result = "{";
  if(arr.length == 0){
      return "{}";
    }
  for(int i = 0; i < arr.length; i++){
    if(i == arr.length-1){
      result = result + arr[i] + "}";
    }
    else
    result = result + arr[i] + ", ";
  }
  return result;
  }
  public static String arrayDeepToString(int[][] arr){
  String result = "{";
  for(int i = 0; i < arr.length; i++){
      result = result + arrToString(arr[i]) + ", ";
  }
  return result + "}";
  }
  public static void main(String[]args){
    int[] a = {1,2,3,4,5};
    System.out.println(ArrayOps.sum(a));
    System.out.println(ArrayOps.largest(a));
    int[][] b = {{1,0,12,-1}, {7,-2,2,1}, {-5,-2,2,-9}};
    int[] c = {1,3,5};
    System.out.println(arrToString(ArrayOps.sumRows(b)));
    System.out.println(arrToString(ArrayOps.largestInRows(b)));
    System.out.println(ArrayOps.sum(c));
    System.out.println(ArrayOps.sum(b));
    System.out.println(arrToString(ArrayOps.sumCols(b)));
    int[][] d = {{1,2,3,4},{2,3,4,1},{3,4,1,2}};
    int[][] e = {{1,1,1},{2,2,2},{3,3,3}};
    int[][] f = {{2,2,2},{2,2,2}};
    System.out.println(ArrayOps.isRowMagic(d));
    System.out.println(ArrayOps.isRowMagic(e));
    System.out.println(ArrayOps.isRowMagic(f));
    System.out.println(ArrayOps.isColMagic(d));
    System.out.println(ArrayOps.isColMagic(e));
    System.out.println(ArrayOps.isColMagic(f));
    int[][] g = {{2,4,2},{2,2,2}};
    System.out.println(ArrayOps.isLocationMagic(g,0,1));
    System.out.println(ArrayOps.isLocationMagic(g,1,1));
  }
}
