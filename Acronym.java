import java.util.Scanner;

public class Acronym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine();

        String acronym = createAcronym(phrase);
        System.out.println(acronym);
    }
    public static String createAcronym(String phrase){
        String acronym="";
        if(phrase.charAt(0)>='a' && phrase.charAt(0)<='z'){
            acronym+=(char)(phrase.charAt(0)-' ');
        }
        else{
            acronym+=phrase.charAt(0);
        }
        for(int i=1;i<phrase.length();i++){
            if(phrase.charAt(i)==' ' || phrase.charAt(i)=='-'){
                if(phrase.charAt(i+1)>='a' && phrase.charAt(i+1)<='z'){
                    acronym+=(char)(phrase.charAt(i+1)-' ');
                }
                else{
                    acronym+=phrase.charAt(i+1);
                }
            }


        }
        return acronym;
    }
}
