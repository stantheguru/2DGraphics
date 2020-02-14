
package ku_main_gate;

import java.awt.*;

/**
 *
 * @author Sir Stanley
 */

import java.applet.Applet;
public class ku_main_gate extends Applet{
    @Override
    public void init(){
        setSize(1200,600);
        setBackground(Color.lightGray);
        setForeground(Color.WHITE);
        
        
    }
    
    @Override
    public void paint(Graphics g){
        Graphics2D g2d=(Graphics2D) g.create();
        
        
        Color brown =new Color(165, 42,42);
        
       
        
        //Name
        
        Font fName=new Font("Times New Roman",Font.BOLD, 18);
        g.setColor(Color.white);
        g.setFont(fName);
        g.drawString("MATUKU STANLEY N", 10,20);
        g.drawString("J17/4970/2015", 10,40);
        
        
        
        //Base 
        g.setColor(brown);
        g.fill3DRect(50, 460, 100, 30, true);
        g.fill3DRect(300, 460, 50, 30, true);
        g.fill3DRect(550, 460, 50, 30, true);
        g.fill3DRect(800, 460, 50, 30, true);
        g.fill3DRect(1050, 460, 100, 30, true);
        
        
  
       //Polygon      
        g.setColor(Color.WHITE);
        int xpoints[]={550,600,620,500};
        int ypoints[]={460,460,50,90};
        int sides=4;
        g.fillPolygon(xpoints,ypoints,sides);
        
        
        
        
        g.fillRect(50, 300, 30, 160);
        g.fillRect(120, 300, 30, 160);
        
        
        
        
        //left horizonatl rectangle
        int xpoint[] = {20,180,170,30 };
        int ypoint[] = {270, 270, 290, 290};
        g.fillPolygon (xpoint, ypoint, 4);
        
        
        
        g.fillRect(30, 280, 140, 30);
        
        
        
        g.fillRect(80, 220, 40, 50);
        
        g.fillRect(310, 220 , 30, 240);
        
        
        g.fillRect(810, 220 , 30, 240);
        
        g.fillRect(1050, 300, 30, 160);
        g.fillRect(1120, 300, 30, 160);
        
        
        
        //right horizonatl rectangle
        int points_x[] = {1020,1180,1170,1030 };
        int points_y[] = {270, 270, 290, 290};
        g.fillPolygon (points_x, points_y, 4);
        
        g.fillRect(1030, 280, 140, 30);
        g.fillRect(1080, 220, 40, 50);
        
        
        //long upper rectangle
        g.fillRect(20, 205, 1160, 15);
        
        
          
         //Left small upper pillars
        g.fillRect(30, 138, 10, 67);
        g.fillRect(50, 180, 10, 25);
         
        g.fillRect(400, 138, 10, 67);
         
         
         
         
         //Right small upper pillars
      
        g.fillRect(730, 138, 10, 67);
        g.fillRect(1140, 180, 10, 25);
        g.fillRect(1160, 138, 10, 67);
          
          //KENYATTA UNIVERSITY
          
        g.fillRect(400, 220,340 , 35);
        g.setColor(Color.BLUE);
        g.fillRect(410, 210,320 , 40);
        g.setColor(Color.WHITE);
          
        Font f=new Font("Arial Black",Font.BOLD,18);
        g.setFont(f);
        g.drawString("KENYATTA    UNIVERSITY", 430, 235);
      
        
                    

         
        //Left Arc
        
        
        
        g.setColor(new Color(51,171,240));
        g.fillRect(60, 180, 340, 25);
        g.fillRect(40, 138, 360, 42);
       
        g.setColor(Color.lightGray);
        g.fillArc(20, 30,400, 150 ,-20, -140);
          
        g.setColor(new Color(51,171,240));
        g.fillRect(740, 180, 400, 25);
        g.fillRect(740, 138, 420, 42);
                
          
        //right Arc
        g.setColor(Color.lightGray);
        g.fillArc(728, 35,445, 150 ,-20, -140);
          
          //Left Text
        Font font1=new Font("Arial Black",Font.PLAIN, 18);
        g.setColor(Color.white);
        g.setFont(font1);
        g.drawString("Transforming Higher Education...", 60, 200);
          
        //Right Text
        
        g.drawString("...Enhancing Lives", 870, 200);
          
          
        //Metal bars 1
        g.setColor(Color.BLUE);
          
        g.fillRect(150, 399, 5, 61);
        g.fillRect(160, 398, 3, 62);
        
        g.fillRect(170, 397, 3, 63);
        g.fillRect(180, 395, 3, 65);
        g.fillRect(190, 393, 3, 67);
         
        g.fillRect(200, 391, 3, 69);
        g.fillRect(210, 388, 3, 72);
        g.fillRect(220, 385, 3, 75);
        
 
        g.fillRect(230, 382, 3, 78);
        g.fillRect(240, 378, 3, 82);
        g.fillRect(250, 374, 3, 86);
         
        g.fillRect(260, 370, 3, 90);
        g.fillRect(270, 365, 3, 95);
        g.fillRect(280, 360, 3, 100);
        g.fillRect(290, 355, 3, 105);
        g.fillRect(300, 350, 3, 110);
         
        //Middle right bars
        g.fillRect(600, 399, 5, 61);
        g.fillRect(610, 398, 3, 62);
        g.fillRect(620, 397, 3, 63);
        
        g.fillRect(630, 396, 3, 64);
        g.fillRect(640, 395, 3, 65);
        g.fillRect(650, 394, 3, 66);
         
        g.fillRect(660, 393, 3, 67);
        g.fillRect(670, 391, 3, 69);
        g.fillRect(680, 389, 3, 71);
        g.fillRect(690, 387, 3, 73);
         
        g.fillRect(700, 385, 3, 75);
        g.fillRect(710, 382, 3, 78);
        g.fillRect(720, 379, 3, 81);
        g.fillRect(730, 376, 3, 84);
        g.fillRect(740, 373, 3, 87);
          
     
        g.fillRect(750, 370, 3, 90);
        g.fillRect(760, 366, 3, 94);
        g.fillRect(770, 362, 3, 98);
        g.fillRect(780, 358, 3, 102);
        g.fillRect(790, 354, 3, 106);
        g.fillRect(800, 350, 3, 110);
          
          
        //Right small bars
        g.fillRect(1050, 400, 5, 60);
        g.fillRect(1040, 399, 3, 61);
          
        g.fillRect(1030, 398, 3, 62);
        g.fillRect(1020, 397, 3, 63);
        
        g.fillRect(1010, 396, 3, 64);
        g.fillRect(1000, 395, 3, 65);
        g.fillRect(990, 394, 3, 66);
         
        g.fillRect(980, 393, 3, 67);
        g.fillRect(970, 391, 3, 69);
        g.fillRect(960, 389, 3, 71);
        g.fillRect(950, 387, 3, 73);
         
        g.fillRect(940, 385, 3, 75);
        g.fillRect(930, 382, 3, 78);
        g.fillRect(920, 379, 3, 81);
        g.fillRect(910, 376, 3, 84);
        g.fillRect(900, 373, 3, 87);
          
        g.fillRect(890, 370, 3, 90);
        g.fillRect(880, 366, 3, 94);
        g.fillRect(870, 362, 3, 98);          
        
        g.fillRect(860, 358, 3, 102);
        g.fillRect(850, 354, 3, 106);
        g.fillRect(840, 350, 3, 110);
            
            
        //left middle bars
        g.fillRect(540, 400, 5, 60);
          
        g.fillRect(530, 398, 3, 62);
        g.fillRect(520, 397, 3, 63);
        
        g.fillRect(510, 396, 3, 64);
        g.fillRect(500, 395, 3, 65);
        g.fillRect(490, 394, 3, 66);
         
        g.fillRect(480, 393, 3, 67);
        g.fillRect(470, 391, 3, 69);
        g.fillRect(460, 389, 3, 71);
        g.fillRect(450, 387, 3, 73);
         
        g.fillRect(440, 385, 3, 75);
        g.fillRect(430, 382, 3, 78);
        g.fillRect(420, 379, 3, 81);
        g.fillRect(410, 376, 3, 84);
        g.fillRect(400, 373, 3, 87);
          
        g.fillRect(390, 370, 3, 90);
        g.fillRect(380, 366, 3, 94);
        g.fillRect(370, 362, 3, 98);
        g.fillRect(360, 358, 3, 102);
        g.fillRect(350, 354, 3, 106);
        g.fillRect(340, 350, 3, 110);
            
            
            
            
            
        //RoundRect Above Motto
        g.setColor(Color.lightGray);
        g.fillRoundRect(490,120,30,20,10,10);
        g.fillRoundRect(600,120,30,20,10,10);
            
            
        //Welcome
        g.setColor(Color.WHITE);
        g.fillRoundRect(517, 280, 100, 50, 20, 10);
            
        Font f2=new Font("Arial Black",Font.BOLD,15);
        g.setFont(f2);
        g.setColor(Color.BLUE);
        g.drawString("WELCOME", 520, 315);
        g.drawString("ELIMU", 530, 160);
        g.drawString(" NI", 540, 180);
        g.drawString("NGUVU", 530, 200);
        
        
        
        
        
        
         //Left inner arc
      
        BasicStroke bstroke=new BasicStroke(15.0f);
        g2d.setColor(Color.WHITE);
        g2d.setStroke(bstroke);
        g2d.setColor (Color.WHITE);
        g2d.drawArc(74, 226,405, 185 ,54, 100);
          
          
        // right inner arc
        g2d.drawArc(655, 225,470, 185 ,25, 105);
             
             
        //LINE
        BasicStroke wide=new BasicStroke(8.0f);
        g2d.setColor(new Color(51,171,240));
        g2d.setStroke(wide);
        g2d.drawLine(620,50, 500,90);
        
        
        //Roads
        g.setColor(Color.BLACK);
      int x3[] = {150,300,280,130 };
     int y3[] = { 490, 490, 590, 590};
     g.fillPolygon (x3, y3, 4);
     
     int x4[] = {350,550,530,330};
     int y4[] = { 490, 490, 590, 590};
     g.fillPolygon (x4, y4, 4);
     
     int x5[] = {600,800,820,620 };
     int y5[] = { 490, 490, 590, 590};
     g.fillPolygon (x5, y5, 4);
     
     int x6[] = {850,1050,1070,870 };
     int y6[] = { 490, 490, 590, 590};
     g.fillPolygon (x6, y6, 4);
     
        
        
        
  
        
    }
    
}



