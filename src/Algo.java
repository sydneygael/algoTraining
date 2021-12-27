import java.util.Arrays;

public class Algo {

    /*
  tab[] : le tableau dans lequel on va chercher la valeur
  fin : dernier élément
  debut : premier élément
  val : valeur à trouver
  */
    public static int binarySearch(int tab[], int debut, int fin, int val){
        if (fin >= debut){
            int mid = debut + (fin - debut)/2;
            if (tab[mid] == val){
                return mid;
            }
            if (tab[mid] > val){
                //recherche dans le sous-tableau à gauche
                return binarySearch(tab, debut, mid-1, val);
            }else{
                //recherche dans le sous-tableau à droit
                return binarySearch(tab, mid+1, fin, val);
            }
        }
        return -1;
    }

    // Function to print all the permutations of str
    static void printAllPermutationsofString(String str, String ans)
    {

        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recurvise call
            printAllPermutationsofString(ros, ans + ch);
            //Optional.ofNullable("").map(String::toLowerCase).get()
        }
    }

    public static boolean estPalindrome(String s)
    {
        //si la longueur est égale à 0 ou à 1
        //donc c'est un palindrome
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            /*
             * tester si le premier et le dernier caractère
             * sont les memes alors répéter le meme traitment
             * avec la sous-chaine avec le premier et le
             * dernier caractère jusqu'à atteindre la
             * première condition
             */
            return estPalindrome(s.substring(1, s.length()-1));

        /*
         * si la condition if est fausse, donc elle retourne
         * false
         */
        return false;
    }

     public static int closeTozero(int[] data) {
         int curr = 0;
         int near = data[0];
         Arrays.sort(data);      //  add this
         System.out.println(Arrays.toString(data));
         // find the element nearest to zero
         for ( int i=0; i < data.length; i++ ){
             System.out.println("dist from " + data[i] + " = " + Math.abs(0 -data[i]));
             curr = data[i] * data[i];
             if ( curr <= (near * near) )  {
                 near = data[i];
             }
         }
         System.out.println( near );
         return near;
     }

    public void reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
    }

    public static boolean isAnagramUsingStringMethods(String word, String anagram) {
        if (word.length() != anagram.length())
            return false;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = anagram.indexOf(c);
            // If index of any character is -1, then two strings are not anagrams
            // If index of character is not equal to -1, then remove the chacter from the
            // String
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
            } else
                return false;
        }
        return anagram.isEmpty();
    }

    public static boolean isRotation(String str, String rotation) {
        String str2 = str + str;

        if (str2.contains(rotation)) {
            return true;
        }
        return false;

    }

    public static void SubstringsOfString(String str)
    {
        System.out.println("All substring of " +  str + " are:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.println(str.substring(i,j));
            }
        }
    }

    public static void LonguestSubStringOf(String str)
    {

        String longestSub = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                String substring = str.substring(i,j);
                if(longestSub.length() < substring.length()) {
                    longestSub = substring;
                }

            }
        }

        System.out.println("Longuest substring of " +  str + " is : "+ longestSub);
    }

    private static char[] copyRemove(char[] array,int index) {
        char[] copy = new char[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                copy[j++] = array[i];
            }
        }
        return copy;
    }

    static void findBalanceOfArray(int[] array,int index) {
        int diff = 0;
        int sum_left = 0;
        int sum_right = 0;
        int end = array.length;
        int mid = index + (end - index)/2;

        sum_left = calculLeftSum(array,mid);
        sum_right = calculRightSum(array,mid);

        diff = sum_right - sum_left;

        if (diff <= 0) {
            System.out.println("banlanced at index : " + index);
        }
        else {
            findBalanceOfArray(array,mid-1);
        }
    }

    private static int calculLeftSum(int[] array, int mid) {

        int result = 0;
        for(int i = 0; i <mid; i++) {
            result+=array[i];
        }

        return result;
    }

    private static int calculRightSum(int[] array, int mid) {

        int result = 0;
        for(int j = mid ; j < array.length; j++) {
            result+=array[j];
        }

        return result;
    }

}