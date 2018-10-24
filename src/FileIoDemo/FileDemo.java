package FileIoDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\idea_workspace\\java_code_review\\datas\\test.txt");
        //创建新文件，成功返回true,已存在会创建失败，返回false
        System.out.println(file.createNewFile());
        //创建新文件，成功返回true,已存在会创建失败，返回false,多级子目录用mkdirs
        /*
        如果创建的为文件，则需要先创建文件夹
         */
        File filedir = new File("E:\\idea_workspace\\java_code_review\\datas\\test");
        System.out.println(filedir.mkdir());

        /*
        renameto 类似于剪切和重命名,如果换了路径源文件则不存在
         */

        boolean b = new File("E:\\idea_workspace\\java_code_review\\datas\\test.txt").
                renameTo(new File("E:\\idea_workspace\\java_code_review\\datas\\test\\123.jpg"));


        System.out.println(b);

        /*
            获取功能
         */
        //绝对路径
        String path = new File("datas//test//123.jpg").getAbsolutePath();
        //相对路径
        String path1 = new File("datas//test//123.jpg").getPath();

        //E:\idea_workspace\java_code_review\datas\test\123.jpg
        System.out.println(path);
        //datas\test\123.jpg
        System.out.println(path1);

        String name = new File("datas//test//123.jpg").getName();
        //123.jpg
        System.out.println(name);
        long length = new File("datas//test//123.jpg").length();
        //文件的大小  bytes为单位
        System.out.println(length);
        //最后修改时间
        long lastModified = new File("datas//test//123.jpg").lastModified();

        //list是文件的遍历,只能遍历该文件夹下面文件和文件夹的名，不能递归遍历
        String[] list = new File("E:\\notes").list();

        for (String filename :list){
            System.out.println(filename);
        }

        //
        File[] files = new File("E:\\notes").listFiles();
        int count = 0;
        for (File fi : files){
            if (fi.isDirectory()){
                String[] list1 = fi.list();

                for(String str : list1){
                    count++;
                    System.out.println(str);
                }
            }else
            {
                count++;
                System.out.println(fi.getName());
            }
        }

        System.out.println("一共有"+count+"个文件");


    }
}
