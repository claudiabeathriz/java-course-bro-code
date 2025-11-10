public class MultidimensionalArrays {
    public static void main(String []args){

        //2d arrays or multidimensional arrays = an array where each element is an array
        //                                      useful for storing a matrix of data

        String[] fruits = {"apple", "orange", "banana"};
        String [] vegetables = {"potato", "onion", "carrot"};
        String [] meats = {"chicken", "pork", "beef", "fish"};

        String [][] groceries = {fruits, vegetables,
                                {"chicken", "pork", "beef", "fish"}};

        groceries [0][2] = "pineapple";

        for(String [] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
