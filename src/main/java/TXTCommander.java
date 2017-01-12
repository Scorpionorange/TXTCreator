import java.io.File;

/**
 * Created by ScorpionOrange on 2017/01/11.
 */
public class TXTCommander {
    String fileName = "";
    String filePath = "";
    String fileContent = "";

    public boolean createFile(String filePath, String fileName) throws Exception{
        boolean flag = false;
        File file = new File(filePath + "\\" + fileName);
        try{
            if(!file.exists()){
                file.createNewFile();
                flag = true;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
}
