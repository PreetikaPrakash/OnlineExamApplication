import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OnlineExam extends Frame implements ActionListener {
    JLabel jl1,jl2;
    JRadioButton rb[]= new JRadioButton[5];
    ButtonGroup bg;
    JButton jb = new JButton("NEXT");
    JButton jb3 = new JButton();//extra
    static int question_count = 0;
    int points = 0;
    OnlineExam(){

        // Only 1 label - which will be updated in every window
            jl1 = new JLabel("JAVA MCQ ONLINE EXAMINATION");
            jl1.setBounds(150,50,500,50);

            jl2 = new JLabel();
            jl2.setBounds(500,300,250,100); // extra

        // 4 RADIO BUTTONS
            bg = new ButtonGroup();
            for(int i=0;i<rb.length;i++){
                rb[i] = new JRadioButton(); // assigning to each radio button
                rb[i].setText("Option " + (i+1));
                add(rb[i]);
                bg.add(rb[i]);
            }
            rb[0].setBounds(150,130,200,20);
            rb[1].setBounds(150,180,200,20);
            rb[2].setBounds(150,230,200,20);
            rb[3].setBounds(150,280,200,20);
            //rb[4].setBounds(150,330,100,20); // extra

        // NEXT BUTTON
            jb.setBounds(250,350,90,70);
            jb.setForeground(Color.RED);

            jb3.setBounds(0,0,30,30);
            jb3.setForeground(Color.blue);

        // SETTING THE LAYOUT OF WINDOW
            add(jb);add(jb3);
            setVisible(true);
            setSize(700,500);
            setLocation(400,200);
            setBackground(Color.lightGray);
            add(jl1);add(jl2);
            jb.addActionListener(this);
    }


    public static void main(String[] args) {
        new OnlineExam();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //CHECK WHICH RADIO BUTTON IS CLICKED -> IF SELECTED RADIO BUTTON CLICKED IS TRUE THEN POINTS++ ELSE NO POINTS
            if(question_count==0){
                System.out.println(question_count);

                System.out.println("0ques");
                System.out.println(question_count);
            }

            else if(question_count==1){
                jl1.setText("Q" + question_count + ": char is of how many bytes?");
                rb[0].setText("4 bytes");rb[1].setText("1 byte");rb[2].setText("2 bytes");rb[3].setText("8 bytes");
                    if(rb[1].isSelected()){
                        System.out.println(question_count);
                        System.out.println("op 2 sel");
                        points++;
                        System.out.println(points);
                        System.out.println(question_count);
                    }
                question_count=2;

            }
            else if(question_count==2){
                jl1.setText("Q" + question_count + ": Which component is used to compile, debug and execute the java programs?");
                rb[0].setText("JRE");rb[1].setText("JIT");rb[2].setText("JDK");rb[3].setText("JVM");
                    if(rb[2].isSelected()){
                        System.out.println("opp");
                        points++;
                        System.out.println(points);
                    }
                question_count=3;
            }
            else if(question_count==3){
                jl1.setText("Q" + question_count + ": Which environment variable is used to set the java path?");
                rb[0].setText("MAVEN_Path");rb[1].setText("JavaPATH");rb[2].setText("JAVA");rb[3].setText("JAVA_HOME");
                    if(rb[3].isSelected()){points++;}
            }
            else if(question_count==4){
                jl1.setText("Q" + question_count + ": Which of the following is not an OOPS concept in Java?");
                rb[0].setText("Polymorphism");rb[1].setText("Inheritance");rb[2].setText("Compilation");rb[3].setText("Encapsulation");
                    if(rb[2].isSelected()){points++;
                        System.out.println(points);}
            }
            else if(question_count==5){
                jb.setText("RESULT");
                jb.setForeground(Color.GREEN);
                jb.setBounds(250,400,190,80);

                jl1.setText("Q" + question_count + ": Which exception is thrown when java is out of memory?");
                rb[0].setText("MemoryError");rb[1].setText("OutOfMemoryError");rb[2].setText("MemoryOutOfBoundsException");rb[3].setText("MemoryFullException");
                    if(rb[1].isSelected()){points++;}

            }
            else if(question_count==6){
                String message ="You scored " + points + " points\n";
                String finalResult="";
                if(points>2){finalResult += "Passed";}else{finalResult +="Failed";}

                // display result on new screen with points
                JOptionPane.showMessageDialog(this,message +"\n" +finalResult);
                System.out.println("hello");
            }
            else{}



    }
}
