public class SearchStringsInRange {
    public static void main(String[] args) {
        String name = "Michael";
        char targetCharacter = 'c';
        int start=0;
        int end =4;
        boolean result =  search(name,targetCharacter, start, end);
        System.out.println(result);
    }
    private static boolean search(String name, char targetCharacter, int start, int end) {
        if(name == null){
            return false;
        }
        for(int index=start; index <=end; index++){
            char character = name.charAt(index);
            if(character==targetCharacter){
                return true;
            }
        }
        return false;
    }
}
