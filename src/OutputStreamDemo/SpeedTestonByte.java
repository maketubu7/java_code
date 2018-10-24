package OutputStreamDemo;

import java.io.*;

public class SpeedTestonByte {
    public static void main(String[] args) {
        File file = new File("datas\\sb.MOV");

        long start = System.currentTimeMillis();

//        onebyte(file);    //不想等
//        nbyte(file);     //1014ms
//        onebufferbyte(file);   //4164ms
        nbufferbyte(file);       //459ms

        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
    public static void onebufferbyte(File file){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(file));
            bos = new BufferedOutputStream(new FileOutputStream(new
                    File("datas\\sb3.MOV")));
            int  len = 0;
            while((len = bis.read()) != -1){
                bos.write(len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bis.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void  nbufferbyte(File file){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(file));
            bos = new BufferedOutputStream(new FileOutputStream(new
                    File("datas\\sb4.MOV")));
            byte[] bys = new byte[1024];
            int  len = 0;
            while((len = bis.read(bys)) != -1){
                bos.write(bys,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bis.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void nbyte(File file){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {

            fis = new FileInputStream(file);
            fos = new FileOutputStream("datas\\sb2.MOV");
            int len = 0;
            byte[] bys = new byte[1024];

            while ((len = fis.read(bys)) != -1){
                fos.write(bys,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public static void onebyte(File file){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(file);
            fos = new FileOutputStream("datas\\sb1.MOV");
            int len = 0;
            byte[] bys = new byte[1024];

            while ((len = fis.read()) != -1){
                fos.write(len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
