public class BirthMonth{
    public static void main(String[] args){
        int N = 10;
        if( N < 1 || N > 12)
            System.out.println("You entered an incorrect month value: " + N);
        else
            System.out.println("Your birth month is: " + N);
    }
}