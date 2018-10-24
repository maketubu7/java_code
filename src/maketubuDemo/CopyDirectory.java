package maketubuDemo;

import java.io.*;
import java.io.File;

public class CopyDirectory {
    public static void main(String[] args) {
        String inpath = "E:\\idea_workspace\\java_code_review\\datas\\copyDirectory";
        File infile = new File(inpath);
        String outpath = "E:\\idea_workspace\\java_code_review\\datas\\copyDirectory_bak";
        File outfile = new File(outpath);

        copy(infile, outfile);

    }

    public static void copyfile(File file) {
        File[] files = file.listFiles();
        boolean mkdir = new File(file.getAbsolutePath() + "_bak").mkdir();

        for (File f : files) {
            if (f.isFile()) {
                BufferedInputStream bis = null;
                BufferedOutputStream bos = null;
                try {
                    bis = new BufferedInputStream(new FileInputStream(f));
                    String newdir = file.getAbsolutePath() + "_bak";
                    File newfile = new File(newdir + "\\" + f.getName());
                    bos = new BufferedOutputStream
                            (new FileOutputStream(newfile));
                    int len = 0;
                    byte[] bys = new byte[1024];

                    while ((len = bis.read(bys)) != -1) {
                        bos.write(bys, 0, len);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        bis.close();
                        bos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }


    }

    public static void copy(File f, File file) {
        if (!file.exists()) // 如果文件夹不存在
            file.mkdir(); // 建立新的文件夹
        File[] fs = f.listFiles();
        for (int i = 0; i < fs.length; i++) {
            if (fs[i].isFile()) { // 如果是文件类型就复制文件
                try {
                    FileInputStream fis = new FileInputStream(fs[i]);
                    FileOutputStream out = new FileOutputStream(new File(file
                            .getPath()
                            + File.separator + fs[i].getName()));

                    int count = fis.available();
                    byte[] data = new byte[count];
                    if ((fis.read(data)) != -1) {
                        out.write(data); // 复制文件内容
                    }
                    out.close(); // 关闭输出流
                    fis.close(); // 关闭输入流
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (fs[i].isDirectory()) { // 如果是文件夹类型
                File des = new File(file.getPath() + File.separator
                        + fs[i].getName());
                des.mkdir(); // 在目标文件夹中创建相同的文件夹
                copy(fs[i], des); // 递归调用方法本身
            }
        }


    }
}
