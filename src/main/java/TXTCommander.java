import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * Created by ScorpionOrange on 2017/01/11.
 */
public class TXTCommander {
    String fileName = "";
    String filePath = "";
    String fileContent = "";

    public boolean createFile(String filePath, String fileName) throws Exception{
        boolean flag = false;
        File file = new File(filePath + fileName);
        try{
            if(!file.exists()){
                file.createNewFile();
                flag = true;
            }
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.flush();
            printWriter.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
}
