import java.io.*;
public class ReadProblem {
    String englishSentence ; //存放英语需要填空的英语句子
    String word1,word2,word3,word4;//存放四个选择
    String answer;                 //存放答案
    FileReader in;
    BufferedReader inBuffer;
    public void setProblemFile(File f){
        try{
            in=new FileReader(f);
            inBuffer=new BufferedReader(in);
        }
        catch(FileNotFoundException exp){
            englishSentence =null;
        }
    }
    public void readAnProbpem(){
        String lineMess = null;
        try{
            lineMess = inBuffer.readLine();
            if(lineMess ==null||lineMess.startsWith("endend")){
                englishSentence =null;
                return;
            }
            lineMess =lineMess.trim();
            String []a=lineMess.split("[#]+");
            englishSentence = a[0];
            word1 = a[1];
            word2 = a[2];
            word3 = a[3];
            word4 = a[4];
            answer = a[5];
        }
        catch(IOException exp){
            englishSentence =null;
        }
    }
}
