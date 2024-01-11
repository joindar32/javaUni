package lab4;

import java.io.*;

public class FileCopy {

    public static void copyFile(String inputFileName, String outputFileName)
            throws IOException {
        FileInputStream fin = null;
        FileOutputStream fos = null;

        try {
            fin= new FileInputStream(inputFileName);
            fos = new FileOutputStream(outputFileName);

            byte[] buffer = new byte[1024];
            int count;

            while ((count = fin.read(buffer)) != -1) {
                fos.write(buffer, 0, count);
            }
            System.out.println("Содержимое файла " + inputFileName
                    + " успешно скопировано в новый файл " + outputFileName + ".");
        } catch (FileNotFoundException e) {
            System.out.println("В папке проекта нет файла, содержимое которого надо скопировать.");
        } finally {
            close(fin);
            close(fos);
        }
    }
    public static void close(Closeable stream) {
        try {
            if (stream != null) {
                stream.close();
            }
            else{
                throw new IOException("Ошибка при закрытии файла");
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws IOException {
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        copyFile(inputFileName, outputFileName);
    }
}
