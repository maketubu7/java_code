package FileIoDemo;

import java.io.File;

/**
 *
 */
public class DeleteAllFile {
    public static void main(String[] args) {
        deleteall("E:\\notes2");
    }
    //删除所有整个目录
    public static void deleteall(String path){
          File file = new File(path);
//        File[] files = file.listFiles();
//        for (File f: files){
//            if(f.isDirectory()){
//                deleteall(f.getAbsolutePath());
//            }
//            else if (f.isFile()){
//                System.out.println("+1...");
//                f.delete();
//            }
//            file.delete();
//        }
        //是文件直接删除
        if (file.isFile()){
            file.delete();
            System.out.println(file.getName() + "文件已删除");
        }else{
            File[] files = file.listFiles();
            for (File f : files){
                    deleteall(f.getAbsolutePath());
            }
            file.delete();
            System.out.println(file.getName() + "文件夹已删除");
        }
    }
}
