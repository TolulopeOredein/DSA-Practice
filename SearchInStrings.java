public class SearchInStrings {
    public static void main(String[] args) {
        boolean result;
        String name = "Tolulope";
        char targetCharacter = 'm';
        result = search(name, targetCharacter);
        System.out.println(result);
    }
    private static Boolean search(String name, char targetCharacter) {
        if(name == null){
            return false;
        }
        for(int index=0; index < name.length(); index++){
            char character = name.charAt(index);
            if(character==targetCharacter){
                return true;
            }
        }
        return false;
    }
}
