import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class EWindow extends JFrame implements ItemListener{
    JButton start,next;
    JRadioButton checkbox[];    //显示单词选项
    JTextField showEnglishSentance,showScore;//显示英语句子和得分
    int score=0;
    ButtonGroup group;
    ReadProblem readProblem; //负责读取题目
    java.io.File file;
    EWindow(){
        readProblem = new ReadProblem();
        file = new java.io.File("English.txt");
        readProblem.setProblemFile(file);
        setTitle("英语单词学习");
        setLayout(new FlowLayout());
        showScore=new JTextField(10);
        showEnglishSentance = new JTextField(28);
        start=new JButton("重新练习");
        checkbox=new JRadioButton[4];
        group = new ButtonGroup();
        for(int i=0;i<=3;i++) {
            checkbox[i]=new JRadioButton("",false);
            group.add(checkbox[i]);
            checkbox[i].addItemListener(this);
        }
        start.addActionListener((e)->{
            score=0;
            readProblem.setProblemFile(file);
        });
        next=new JButton("下一题目");
        next.addActionListener((e)->{
            readProblem.readAnProbpem();
            if(readProblem.englishSentence==null){
                showScore.setText("练习完毕");
                return;
            }
            showEnglishSentance.setText(readProblem.englishSentence);
            checkbox[0].setText(readProblem.word1);
            checkbox[1].setText(readProblem.word2);
            checkbox[2].setText(readProblem.word3);
            checkbox[3].setText(readProblem.word4);

        });
        add(new JLabel("题目"));
        add(showEnglishSentance);
        add(new JLabel("得分:"));
        add(showScore);
        add(new JLabel("选择:"));
        for(int i=0;i<=3;i++) {
            add(checkbox[i]);
        }
        add(next);
        add(start);
        setBounds(20,100,660,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void itemStateChanged(ItemEvent e){
        JRadioButton check =(JRadioButton)e.getSource();
        if(check.isSelected()){
            group.clearSelection();
            String s= check.getText().trim();
            if(s.equals(readProblem.answer)){
                score ++;
                showScore.setText(""+score);
            }
        }
    }
    public static void main(String args[]){
        EWindow w=new EWindow();
        w.validate();
    }
}
