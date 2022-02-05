public class main {

    public static void main(String[] args){

        String message = "how are you doing today";
        int offset = 12;

        CaesarsCipher caesarsCipher = new CaesarsCipher();
        String cipherMessage = caesarsCipher.cipher(message, offset);

        System.out.println("Message: " + message);
        System.out.println("Offset: " + offset);
        System.out.println("Cipher Message: " + cipherMessage);


    }
}
