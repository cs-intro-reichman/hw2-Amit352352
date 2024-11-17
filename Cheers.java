// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String name =  args[0];
                int NumberCalls =  Integer.parseInt(args[1]);
                String FullName = "";
                
                        int nameLength = name.length(); //checks name Length and prints lines accordanly
                        for (int i = 0; i <= nameLength-1; i++){
                                char Letter = Character.toUpperCase(name.charAt(i)); 
                        if (Letter=='A' || Letter=='E' || Letter=='F'|| Letter=='H'|| Letter=='I'|| //checks first letters for an or a
                        Letter=='L'|| Letter=='M'|| Letter=='N'|| Letter=='O'|| Letter=='R'|| 
                        Letter=='S'|| Letter=='X'){
                                System.out.println("Give me an "+Letter+": "+Letter+"!");

                        }
                        else {
                                System.out.println("Give me a  "+Letter+": "+Letter+"!");
                        }
                        FullName += Letter;      
                        }

                //System.out.println(Letter); //debuger
                System.out.println("What does that spell?");
                for(int i = 1; i <= NumberCalls; i++){
                        System.out.println(FullName+"!!!");
                   }
        }
}
