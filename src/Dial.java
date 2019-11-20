import javax.swing.*;   
import javax.swing.text.MaskFormatter; 
import java.awt.event.*; 
import java.net.*;
import java.awt.*;
import java.io.File;
import javax.sound.sampled.AudioInputStream; 
import javax.sound.sampled.AudioSystem; 
import javax.sound.sampled.Clip; 
import javax.sound.sampled.LineUnavailableException; 
import javax.sound.sampled.UnsupportedAudioFileException; 
import java.util.Timer;
import java.util.TimerTask;

class Answer extends JFrame implements ActionListener {
	
	public static String a[]=new String[100];
	public static int i=0,b1=0,ab=0;
    public static JButton jb1,jc1;
    Icon imgicon,imgicon1,imgicon2,imgicon3;
    URL url,url1,url2,url3;
    public static JLabel ta1,tc1,td1,td2,td4,td5,td8;
    public static JTextField tb1,te1;
    Answer(){  
    	try {
    	jb1=new JButton("DisConnect");
    	jb1.setBounds(200,120,150,30); 
    	jb1.addActionListener(this);
    	jc1=new JButton("Answer");
    	jc1.setBounds(55,120,150,30); 
    	jc1.addActionListener(this);
    	ta1=new JLabel("State Machine");    
        ta1.setBounds(125,1,100,50); 
        tc1=new JLabel("");    
        tc1.setBounds(125,35,100,50); 
        td1=new JLabel("Status");    
        td1.setBounds(125,170,140,20);  
        te1=new JTextField();
        te1.setBounds(100,200,180,20);
        tb1=new JTextField();
        tb1.setBounds(100,80,150,20);
        url = this.getClass().getResource("8Tzrxxgpc.gif");
        url1 = this.getClass().getResource("zcXod6Boi.gif");
        url2 = this.getClass().getResource("6ipokbA4T.png");
        url3 = this.getClass().getResource("Call-disconnect-icon.png");
        imgicon=new ImageIcon(new ImageIcon(url).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        imgicon1=new ImageIcon(new ImageIcon(url1).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        imgicon2=new ImageIcon(new ImageIcon(url2).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        imgicon3=new ImageIcon(new ImageIcon(url3).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        td2=new JLabel(imgicon);
        td2.setBounds(90,250,50,50);
        td4=new JLabel(imgicon1);
        td4.setBounds(150,250,50,50);
        td5=new JLabel(imgicon2);
        td5.setBounds(210,250,50,50);
        td8=new JLabel(imgicon3);
        td8.setBounds(270,250,50,50);
        add(td2);
        add(td4);
        add(td5);
        add(td8);
        td2.setVisible(false);
        td5.setVisible(false);
        td8.setVisible(false);
        add(jb1);
        add(jc1);
        add(ta1);
        add(tb1);
        add(tc1);
        add(td1);
        add(te1);
        }
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	
    }  
    
	public void actionPerformed(ActionEvent e) 
    {    
		if(e.getSource()==jc1)
	    {
			if(b1==1)
			{
				Dial.a1=1;
				Dial.b2=1;
				Dial.clip.stop(); 
	            Dial.clip.close();
	            try {
	                Dial.audioInputStream =  
	                        AudioSystem.getAudioInputStream(new File("Telephone Ring-SoundBible.com-770479245.wav").getAbsoluteFile()); 
	                }
	                catch(Exception e5)
	                {
	                	System.out.println(e5);
	                }
	    	te1.setText("Call Established");
	    	Dial.te.setText("Call Established");
	    	tc1.setText("Ongoing Call");
	    	td4.setVisible(false);
	    	Dial.td3.setVisible(false);
	        td2.setVisible(false);
	        Dial.td7.setVisible(true);
	        Dial.td6.setVisible(false);
	        td5.setVisible(true);
	        td8.setVisible(false);
			}
	    }
    if(e.getSource()==jb1)
    {
    	
    	if(b1==1)
    	{	
    		Dial.a1=1;
    		if(ab==0)
    		{
    			Dial.b2=0;
    		}
    		else
    		{	
    			Dial.b2=1;
    		}
    		Dial.clip.stop(); 
            Dial.clip.close(); 
            try {
                Dial.audioInputStream =  
                        AudioSystem.getAudioInputStream(new File("Telephone Ring-SoundBible.com-770479245.wav").getAbsoluteFile()); 
                }
                catch(Exception e4)
                {
                	System.out.println(e4);
                }
    	String b=tb1.getText();
    	for(int j=0;j<i;j++)
    	{
 
    		if(b.equals(a[j]))
    		{
    			a[j]="/";
    		}
    	}

    	te1.setText("Call Terminated");
    	Dial.te.setText("Call Terminated");
    	Dial.td3.setVisible(false);
        td2.setVisible(false);
        td4.setVisible(false);
        td5.setVisible(false);
        td8.setVisible(true);
        Dial.td6.setVisible(true);
        Dial.td7.setVisible(false);
    	tc1.setText("");
    	b1=0;
    	}
    }
    }    
}
public class Dial extends JFrame implements ActionListener{ 
	public static Timer timer;
	Long currentFrame; 
	public static int a1=0,b2=0,c2=0;
	int loop=0;
    public static Clip clip; 
    public static AudioInputStream audioInputStream; 
    JButton jb,jc;
    public static JLabel ta,tc,td,td3,td6,td7;
    public static JFormattedTextField tb;
    public static JTextField te;
    MaskFormatter  numFormatter;
    Icon imgicon,imgicon1,imgicon2;
    URL url,url1,url2;
    Dial(){  
    	try {
    	jb=new JButton("Connect");
    	jc=new JButton("DisConnect");
    	jb.setBounds(50,120,150,30); 
    	jc.setBounds(200,120,150,30);
    	jb.addActionListener(this);
    	jc.addActionListener(this);
    	ta=new JLabel("State Machine");    
        ta.setBounds(125,1,100,50); 
        tc=new JLabel("Enter Number");    
        tc.setBounds(125,35,100,50); 
        td=new JLabel("Status");    
        td.setBounds(125,170,140,20);
        te=new JTextField();
        te.setBounds(100,200,180,20);
        te.setText("Idle....");  
        numFormatter  = new MaskFormatter("##"); 
        tb = new JFormattedTextField(numFormatter);
        tb.setBounds(100,80,150,20);
        url = this.getClass().getResource("8Tzrxxgpc.gif");
        url1 = this.getClass().getResource("zcXod6Boi.gif");
        url2 = this.getClass().getResource("6ipokbA4T.png");
        imgicon=new ImageIcon(new ImageIcon(url).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        imgicon1=new ImageIcon(new ImageIcon(url1).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        imgicon2=new ImageIcon(new ImageIcon(url2).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        td3=new JLabel(imgicon);    
        td3.setBounds(90,250,50,50);
        td6=new JLabel(imgicon1);    
        td6.setBounds(150,250,50,50);
        td7=new JLabel(imgicon2);    
        td7.setBounds(210,250,50,50);
        td3.setVisible(false);
        td7.setVisible(false);
        audioInputStream =  
                AudioSystem.getAudioInputStream(new File("Telephone Ring-SoundBible.com-770479245.wav").getAbsoluteFile()); 
          
        // create clip reference 
        clip = AudioSystem.getClip(); 
          
        // open audioInputStream to the clip 
        add(td3);
        add(td6);
        add(td7);
        add(jb);
        add(jc);
        add(ta);
        add(tb);
        add(tc);
        add(td);
        add(te);
        }
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	
    }  
    class CrunchifyReminder extends TimerTask {
    	int loop = 10;
    	public void run() {
    		if (loop > 0) {
    			if(b2==1)
    			{
    				timer.cancel();
    				b2=0;
    				Answer.ab=0;
    			}
    			else {
    			System.out.println(loop);
    			te.setText("Ringing....."+loop+"s remaining");
    			--loop;
    			Answer.ab=1;
    			}
    		} else {
    			if(a1==0)
    			{
    			jc.doClick();
    			System.out.println("\nThat's it.. Done..!");
    			}
    			b2=0;
    			timer.cancel();
    			Answer.ab=0;
    		}
    	}
    }
	public void actionPerformed(ActionEvent e) 
    {   
    if(e.getSource()==jb)
    {
    	if(!(tb.getText().equals("")) && Answer.ab==0)
    	{
    		a1=0;
		int d=0;
    	for(int k=0;k<Answer.i;k++)
    	{
    		if(Answer.a[k].equals(tb.getText()))
    		{
    			d=1;
    			break;
    		}
    	}
    	if(d==0)
    	{
    		try {
        Answer.a[Answer.i++]=tb.getText();
    		}
    		catch(Exception e1)
    		{
    			System.out.println(e1);
    		}
       // te.setText("Ringing.....");
        Answer.tc1.setText("Ringing....");
        Answer.te1.setText("Ringing....");
        td3.setVisible(true);
        Answer.td2.setVisible(true);
        td6.setVisible(false);
        td7.setVisible(false);
        Answer.td4.setVisible(false);
        Answer.td5.setVisible(false);
        Answer.tb1.setText(tb.getText());
        Answer.td8.setVisible(false);
        Answer.b1=1;
        try {
        clip.open(audioInputStream); 
        
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        clip.start();
        synchronized(this){
        timer = new Timer();
        timer.schedule(new CrunchifyReminder(), 0,1 * 1000); 
        }
        }
        catch(Exception e2)
        {
        	System.out.println(e2);
        }
    	}
    	else if(d==1)
    	{
    		te.setText("Caller Busy");
    	}
    	}
    }
    if(e.getSource()==jc)
    {
    	if(!(tb.getText().equals("")))
    	{
    		a1=1;
    		if(Answer.ab==0)
    		{
    			b2=0;
    		}
    		else
    		{	
    			b2=1;
    		}
    		clip.stop(); 
            clip.close(); 
            try {
            audioInputStream =  
                    AudioSystem.getAudioInputStream(new File("Telephone Ring-SoundBible.com-770479245.wav").getAbsoluteFile()); 
            }
            catch(Exception e4)
            {
            	System.out.println(e4);
            }
            String b=tb.getText();
    	for(int j=0;j<Answer.i;j++)
    	{
    		if(b.equals(Answer.a[j]))
    		{
    			Answer.a[j]="/";
    		}
    	}
    	te.setText("Call Terminated");
    	Answer.te1.setText("Call Terminated");
    	Answer.tc1.setText("Call Terminated");
    	td3.setVisible(false);
        Answer.td2.setVisible(false);
        Answer.td4.setVisible(false);
        Answer.td5.setVisible(false);
        Answer.td8.setVisible(true);
        td6.setVisible(true);
        td7.setVisible(false);
    	Answer.b1=0;
    	}
    }
    }    
	public static void main(String args[])
	{
		try {
		Dial fl1=new Dial();
		Answer fl=new Answer();
		fl1.setSize(400,400);    
        fl1.setLayout(null);    
        fl1.setVisible(true);    
        fl1.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        fl.setSize(400,400);    
        fl.setLayout(null);    
        fl.setVisible(true);    
        fl.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

