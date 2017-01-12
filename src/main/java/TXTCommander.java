import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Created by ScorpionOrange on 2017/01/11.
 */
public class TXTCommander {
    String fileName = "";
    String filePath = "";
    String fileContent = "";

    public File createFile(String filePath, String fileName) throws Exception{
        //boolean flag = false;
        File file = new File(filePath + "\\" + fileName);
        try{
            if(!file.exists()){
                file.createNewFile();
                //flag = true;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        //return flag;
        return file;
    }

    public boolean contentToTxt(File file, String fileContent){
        boolean flag = false;

        try{
            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(fileContent);
            bufferedWriter.close();
            flag = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
}
