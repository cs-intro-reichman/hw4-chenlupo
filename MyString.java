public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String lowerCase = "";
        for(int i = 0; i < str.length(); i++){
            
            if(str.charAt(i) > 60){

                lowerCase+=str.charAt(i);

            }
            if(str.charAt(i) < 60){

                lowerCase+=(char)(str.charAt(i)+10);
            }
        }
        return lowerCase;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {

        if(str1.length() < str2.length()){
            return false;
        }
        int index = 0;
       int count= 0;
       

       for (int i = 0; i < str1.length(); i++){
        if(str2.charAt(0) == str1.charAt(i)){
             index = i;
              break;
        }
    }
        for (int j = 0; j < str2.length(); j++){
          if(str2.charAt(j) == str1.charAt(j+index)){
            count++;
          }
       }
       if(count == str2.length()){
        return true;
       }
        return false;
    }
}
