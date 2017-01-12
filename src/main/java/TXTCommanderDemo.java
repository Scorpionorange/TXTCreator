/**
 * Created by ScorpionOrange on 2017/01/11.
 */
public class TXTCommanderDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("Testing");
        /*
        String path = "C:\\迅雷下载";
        String name = "1.txt";
        File file = new File(path + "\\" + name);
        file.createNewFile();
        */
        System.out.println(new TXTCommander().createFile("C:\\迅雷下载", "Test.txt"));
    }
}
