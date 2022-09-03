package SearchingAlgorithms.LinearSearch;

public class Q2_SearchInString {
    public static void main(String[] args) {

        String s = "Nimit";
        char target = 'i';

        System.out.println(searchInString(s,target));
        System.out.println(searchInString2(s,target));
    }

    static boolean searchInString(String s, char target) {
        if(s == null){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    static boolean searchInString2(String s, char target) {
        if(s == null){
            return false;
        }
        for (int letter : s.toCharArray()) {
            if(letter == target){
                return true;
            }
        }
        return false;
    }
}
