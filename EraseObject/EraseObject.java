
/**
 * Write a description of class EraseObject here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EraseObject
{
    // instance variables - replace the example below with your own
    
    public static void Erase(){
        
        String[][] array = new String [20][20];
        for(int row = 0; row < array.length; row++){
            for(int col=0; col< array[0].length; col++){
                array[row][col] = "-";
            }
        }
        int spaceIndex  = 0;
        String x_co = "";
        String y_co = "";
        String board    = Digital.readString();
        board = Digital.readString();
        while (board != null)
        {
            spaceIndex = board.indexOf(" ");
            x_co = board.substring(0, spaceIndex);
            y_co = board.substring(spaceIndex+1);

            int x = Integer.parseInt(x_co);
            int y = Integer.parseInt(y_co);

            array[x-1][y-1] = "@";
            board = Digital.readString();
        }
        System.out.println("");
        for(int row = 0; row < array.length; row++){
            for(int col=0; col< array[0].length; col++){
                System.out.print(array[row][col]);
            }
            System.out.println("");
        }
        System.out.println("");
        String[][] erasedArr = new String [20][20]; 
        erasedArr= erase.erase(16,14,array);
        for(int row = 0; row < erasedArr.length; row++){
            for(int col=0; col< erasedArr[0].length; col++){
                System.out.print(erasedArr[row][col]);
            }
            System.out.println("");
        }
        System.out.println("");
        String[][] erasedArr2 = new String [20][20];
        erasedArr2= erase.erase(5,13,erasedArr);
        for(int row = 0; row < erasedArr2.length; row++){
            for(int col=0; col< erasedArr2[0].length; col++){
                System.out.print(erasedArr2[row][col]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
