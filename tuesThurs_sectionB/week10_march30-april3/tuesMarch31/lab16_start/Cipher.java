//int key field
//constructor
//encrypt method (takes message, returns ciphertext)
//decrypt method (takes ciphertext, returns message)

public class Cipher {
    private int key;

    public Cipher(int k) {
        key = k;
    }

    public String encrypt(String msg) {
        StringBuilder build = new StringBuilder();

        //loop through msg
            char letter = msg.charAt(i);

            //is letter uppercase?
            if (letter >= 'A' && letter <= 'Z') {}
                letter += key;

                //is letter now greater than 'Z'?
                    //wrap around
                    letter -= 26;

            }

            //now do the lowercase case

            //append letter onto StringBuilder

        
        return build.toString();
    }
}