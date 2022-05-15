public class Eng_For_While_9_reverse_differentways {
    public static void main(String[] args) {
    /*
    Write a java program to reverse the number which user entered.
    Input :1238
    Output :Reverse Of The Number: 8321
    */
       //1.way
            String str= "1238";
            String pool="";
            char ch;
            for (int i=0; i<str.length(); i++)
            {
                ch= str.charAt(i);
                pool= ch+pool;
            }
            System.out.println("Reverse Of The Number: "+ pool);
       //2.way
        System.out.print("Reverse of the Number: ");
        String str1= "1238";
        String pool1 = "";
        for (int i = str1.length() - 1; i > -1; i--) {
            pool1 += str1.substring(i, i + 1);
            System.out.print("" + str1.substring(i, i + 1));
        }
        System.out.println();
        //3.way
        String str2= "1238";
        String pool2="";
        for (int i=str2.length()-1; i>-1; i--)
        {
            pool2+= str2.charAt(i);
        }
        System.out.println("Reverse Of The Number: "+ pool2);
        }
    }





