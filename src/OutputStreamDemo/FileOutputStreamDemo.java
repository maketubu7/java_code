package OutputStreamDemo;

import java.io.*;

/**
 * fileinputstream  + copypicture
 */

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //输出流会如果不存在会创建一个
//        FileOutputStream fos = new FileOutputStream("datas//fileoutputstream.txt",true);
//        fos.write("\r\n我要学好java".getBytes());
//        fos.close();

//        FileInputStream fis = new FileInputStream("datas//fileoutputstream.txt");
//        byte[] bys = new byte[1024];
//        int flag = -1;
//        while ((flag = fis.read(bys)) != -1){
//            for (byte b : bys){
//                //中文打印会乱码
//                System.out.print((char) b);
//            }
//        }
        String s1 = "E:\\idea_workspace\\java_code_review\\datas\\" +
                "我的幸福和爱情皆来自于你.jpg";
        String s2 = "E:\\idea_workspace\\java_code_review\\datas\\" +
                "我的幸福和爱情皆来自于你4.jpg";
        long start = System.currentTimeMillis();
        copypicture(s1,s2);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    //copypicture(inpath,outpath)
    public static void copypicture(String s1,String s2) throws IOException {
        File file1 = new File(s1);
        File file2 = new File(s2);

        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);
        int count = 0;
        byte[] bys = new byte[1024];

        while (fis.read(bys) != -1){
            fos.write(bys);
            count++;
        }

        fis.close();
        fos.close();
        System.out.println("循环了" + count + "次");
    }

}
