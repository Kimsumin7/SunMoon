

public class ColorChoices
{
    public static void main(String[] args){
        int[][] choices = {
            {9},
            {7,5},
            {4,5,6},
            {3,41,4,5}
        };
        
        int nPeople = 0;
        for(int row=0; row<choices.length; row++){
            for(int col=0; col<choices[row].length; col++){
                nPeople += choices[row][col];
            }
        }
        
        System.out.printf("%d people gave their opinion. \n", nPeople);
    }
}
