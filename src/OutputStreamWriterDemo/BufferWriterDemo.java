package OutputStreamWriterDemo;

import java.io.*;

public class BufferWriterDemo {
    public static void main(String[] args) throws IOException {
        String inpath = "E:/idea_workspace/spark_stream/wordcount.data";
        String outpath = "E:/idea_workspace/spark_stream/data/out8.java";

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(inpath)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outpath)));
        //字符数组复制
//        int len = 0;
//        char[] chs = new char[1024];
//        while ((len = br.read(chs)) != -1){
//            bw.write(chs,0,len);
//        }
        //一行一行复制
        String line  =  null;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();
    }
}
