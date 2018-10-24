package OutputStreamWriterDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriterDemo {
    public static void main(String[] args) throws IOException {
        String path = "E:\\idea_workspace\\java_code_review\\datas\\1.java";
        //使用哪种方法编码，就要使用哪种方法解码，不然会出现乱码
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(path),"utf-8");
//        osw.write("邪不压正");
//        osw.close();
        //读取单个字符
        InputStreamReader isr = new InputStreamReader(new FileInputStream(path));
        int len = 0;
//        while((len = isr.read()) != -1){
//            System.out.print((char)len);
//        }
//        isr.close();
        //读取一个字符组
        char[] chs = new char[1024];
        while ((len = isr.read(chs)) != -1){
            System.out.print(chs);
        }




    }

}
