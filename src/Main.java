public class Main {

    // Driver code
    public static void main(String[] args)
    {
        //Algo.closeTozero();

        Algo.LonguestSubStringOf("abcdemoderneancien");
        System.out.println("palindrome : "+ Algo.estPalindrome("ici"));

        int [] tab = new int[]  {1,2,7,5,3,4};

        Algo.findBalanceOfArray(tab,0);
    }


/*    public static void main(String args[]){
        int tab[] = {1, 2, 3, 4, 5, 6, 7};
        int val = 7;
        int l = tab.length-1;
        int res = binarySearch(tab,0,l,val);
        if (res != -1)
            System.out.println("L'élément se trouve à l'index: " + res);
        else
            System.out.println("L'élément n'existe pas!");
    }*/
}
