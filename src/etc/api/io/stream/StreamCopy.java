//package etc.api.io.stream;
//
//import com.sun.source.tree.WhileLoopTree;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//
//public class StreamCopy {
//    public static void main(String[] args) {
//        try(
//                FileOutputStream fos = new FileOutputStream("C:/my/cet.jpg");
//                FileInputStream fis = new FileInputStream("C:/my/copy.jpg"){
//
//
//                }
//        ) {
//            int data =0;
//            while (data != -1){
//                data =fis.read();
//                fos.write(data);
//            }
//
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//
//
//
//    }
//
//}
