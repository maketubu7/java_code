package FileIoDemo;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

public class FileSerachAll {
    public static void main(String[] args) {
        /*
            列出文件夹下需要的文件,以文件名后缀进行过滤
         */
        String path = "E:\\idea_workspace";
//		System.out.println(dir);
        List<File> list = new ArrayList<File>();

//		searchjava(dir,jalist);
        list = filelist(path,".java");

        for(File file : list){
            System.out.println(file.getName());
        }

    }

    //文件过滤器方法,解耦出来
    private static void searchjava(File dir, List<File> reslist, FileFilter filter) {
        File[] files = dir.listFiles();
        for(File file:files){
            if(file.isDirectory()){
                searchjava(file,reslist,filter);
            }
            else if(filter.accept(file)){
                reslist.add(file);
            }
        }
    }
    /*
        filelist(filepath,endbysuffix) for example ".txt" ".java"
     */

    private static List<File> filelist(String path,String suffix){
        File file = new File(path);
        FileFilter filter = new Filterbysuffix(suffix);
        List<File> list = new ArrayList<File>();

        searchjava(file, list, filter);

        return list;
    }



}
