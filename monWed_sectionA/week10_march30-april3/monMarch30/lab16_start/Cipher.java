//int key field
//constructor
//encrypt method (takes message, returns ciphertext)
//decrypt method (takes ciphertext, returns message)

public class Cipher {
    private int key;

    public Cipher(int k) {
        key = k;
    }

    public String encrypt(String str) {
        StringBuilder build = new StringBuilder();

        //loop through str
            char letter = str.charAt(i);

            //is this character uppercase?
            if (letter >= 'A' && letter <= 'z') {
                letter+=key;

                if (letter > 'Z') {
                    letter-=26;
                }
            }

            //same thing for lowercase

            build.append(letter);

        return build.toString();
    }

    //decrypt will be similar
}