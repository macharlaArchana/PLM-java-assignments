package assignments;
public class fibbonacci {
    public static void main (String [] args)
    {
        int num = 10;
        int firstnum = 1, secondnum = 1, thirdnum;
        System.out.println(firstnum);
        System.out.println(secondnum);
        for (int i=3; i<=num; i++) 
        {
            thirdnum=firstnum+secondnum;
            System.out.println(thirdnum);
            firstnum = secondnum;
            secondnum=thirdnum;

        }
    }
}
