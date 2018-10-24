package OutputStreamDemo;

import java.io.*;

public class BufferedInputStreamDemo {

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();
        copypicture();
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
    private static void copypicture() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new
                File("datas\\我的幸福和爱情皆来自于你.jpg")));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new
                File("datas\\我的幸福和爱情皆来自于你5.jpg")));

        int len = 0;
        byte[] bys = new byte[1024];
        while((len = bis.read(bys)) != -1){
            bos.write(bys,0,len);
        }

        bis.close();
        bos.close();
    }
}
