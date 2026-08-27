package Day_2_Linear_Search_Algorithm;

public class searchInString {

    public static void main(String[] args) {
        
        String name = "Sufyan Ijaz";
        char target = 'u';
        Boolean search = search(name, target);
        Boolean search2 = search2(name, target);

        System.out.print("Search : " + search);
        System.out.println("\nSearch2: " + search2);

    }

    static Boolean search(String str, char target) {

        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static Boolean search2(String str, char target) {

        if (str.length()  == 0) {
            return false;
        }

        for (char ch  : str.toCharArray()) {
            if (target == ch) {
                return true;
            }
        }
        return false;
    }
    
}
