import java.io.File;

/**
 * Created by ScorpionOrange on 2017/01/11.
 */
public class TXTCommanderDemo {
    public static void main(String[] args) throws Exception {

        //System.out.println(new TXTCommander().createFile("C:\\迅雷下载", "Test.txt"));
        TXTCommander txtCommander = new TXTCommander();
        File file = txtCommander.createFile("C:\\迅雷下载", "Test.txt");
        boolean flag = file.exists();
        if(flag){
            System.out.println("创建TXT文件成功！");
        }

        flag = txtCommander.contentToTxt(file, "Now is loading!!! Let's start game!");
        if(flag){
            System.out.println("更新TXT文件内容成功！");
        }
    }
}
