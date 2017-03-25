package model;

/**
 * @author gothmog on 26.03.2017.
 */
public class XORClass {
    public static byte[] encrypt(String text, String keyWord){
        byte[] arr = text.getBytes();
        byte[] keyarr = keyWord.getBytes();
        byte[] result = new byte[arr.length];
        for(int i = 0; i< arr.length; i++) {
            result[i] = (byte) (arr[i] ^ keyarr[i % keyarr.length]);
        }

        return result;
    }

    public static String decrypt(byte[] text, String keyWord) {
        byte[] result  = new byte[text.length];
        byte[] keyarr = keyWord.getBytes();
        for(int i = 0; i < text.length;i++) {
            result[i] = (byte) (text[i] ^ keyarr[i% keyarr.length]);
        }
        return new String(result);
    }
}
