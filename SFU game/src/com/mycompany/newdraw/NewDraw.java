package com.mycompany.newdraw;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class NewDraw extends JPanel implements KeyListener {
    static BufferedImage image1;
    long imageDisplayTime = 0;
    boolean showImage = false;
    static final int BALL_WIDTH = 10;
    static int Width = 1200;
    static int Height = 620;
    static int LeftX = 40;
    static int RightX = Width + LeftX;
    static int TopY = 70;
    static int BottomY = Height + TopY;
    static int bally = 590;
    static int ballx = 850;
    int point = 0;
    boolean onPinkShape = false;
    boolean onYellowShape = false;
    boolean onBlueShape = false;
    boolean onPinkShap = false;
    boolean onYellowSh = false;
    boolean onBlueS = false;
    boolean onPi = false;
    boolean oYello = false;
    boolean onl = false;
    boolean onPinkSh = false;
    boolean onYellowShe = false;
    boolean onBlueape = false;
    boolean onPiShape = false;
    boolean onYeowShape = false;
    boolean onBlShape = false;
    boolean onBlueRect1 = false;
    boolean onBlueRect2 = false;
    boolean onBlueRect3 = false;
    boolean onBlueRect4 = false;
    boolean onBlueRect5 = false;
    boolean onBlueRect6 = false;
    boolean onBlueRect7 = false;
    int lives = 3;


    int[] transportX = {80, 180, 180, 80};
    int[] transportY = {120, 120, 180, 180};

    int[] libraryX = {220, 370, 370, 220};
    int[] libraryY = {100, 100, 200, 200};

    int[] parkadeX = {420, 600, 600, 420};
    int[] parkadeY = {80, 80, 220, 220};

    int[] diamondX = {80, 220, 220, 80};
    int[] diamondY = {220, 220, 300, 300};

    int[] studentX = {260, 390, 390, 260};
    int[] studentY = {240, 240, 310, 310};

    int[] shermanX = {430, 540, 540, 430};
    int[] shermanY = {260, 260, 320, 320};

    int[] scienceX = {580, 740, 740, 580};
    int[] scienceY = {100, 100, 190, 190};

    int[] southScienceX = {780, 920, 920, 780};
    int[] southScienceY = {110, 110, 200, 200};

    int[] univDriveX = {70, 250, 250, 70};
    int[] univDriveY = {330, 330, 430, 430};

    int[] northParkingX = {280, 400, 400, 280};
    int[] northParkingY = {350, 350, 420, 420};

    int[] arisRoadX = {430, 530, 530, 430};
    int[] arisRoadY = {360, 360, 440, 440};

    int[] gradX = {560, 700, 700, 560};
    int[] gradY = {340, 340, 440, 440};

    int[] blussonX = {740, 900, 900, 740};
    int[] blussonY = {350, 350, 430, 430};

    int[] transitX = {80, 200, 200, 80};
    int[] transitY = {470, 470, 540, 540};

    int[] strandX = {240, 380, 380, 240};
    int[] strandY = {480, 480, 540, 540};

    int[] trotterX = {410, 520, 520, 410};
    int[] trotterY = {490, 490, 550, 550};

    int[] strandAnnexX = {550, 680, 680, 550};
    int[] strandAnnexY = {485, 485, 545, 545};

    int[] mathX = {710, 830, 830, 710};
    int[] mathY = {480, 480, 550, 550};

    int[] appliedSciX = {860, 1000, 1000, 860};
    int[] appliedSciY = {490, 490, 550, 550};

    int[] pimsX = {80, 240, 240, 80};
    int[] pimsY = {580, 580, 650, 650};

    int[] techComplexX = {270, 450, 450, 270};
    int[] techComplexY = {590, 590, 660, 660};

    int[] classroomBlockX = {480, 630, 630, 480};
    int[] classroomBlockY = {600, 600, 670, 670};

    @Override
    public void keyTyped(KeyEvent e) {
    }

    private void displayPictures() {
        if (onPinkShape || onYellowSh || onBlueRect3 || onPi || onYellowShe) {
            lives--;
            try {
                image1 = ImageIO.read(new File("image/loseLife.jpg"));
            } catch (IOException ex) {
                System.out.println("Lose life image not found");
            }
            showImage = true;
            imageDisplayTime = System.currentTimeMillis();
            return;
        }

        if (onYellowShape || onBlueShape || onPinkShap || onBlueS || oYello) {
            try {
                image1 = ImageIO.read(new File("image/ronaldo.jpg"));
            } catch (IOException ex) {
                System.out.println("Ronaldo image not found");
            }
            point = point + 10;
            showImage = true;
            imageDisplayTime = System.currentTimeMillis();
        }
        else if (onl || onPinkSh || onBlueape || onPiShape || onYeowShape ||
                onBlueRect1 || onBlueRect2 || onBlueRect4 || onBlueRect5 || onBlueRect6 || onBlueRect7) {
            try {
                image1 = ImageIO.read(new File("image/messi.jpg"));
            } catch (IOException ex) {
                System.out.println("Messi image not found");
            }
            point = point + 10;
            showImage = true;
            imageDisplayTime = System.currentTimeMillis();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int speed = 10;
        if (e.getKeyCode() == KeyEvent.VK_UP && bally - speed >= TopY) {
            bally -= speed;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN && bally + BALL_WIDTH + speed <= BottomY) {
            bally += speed;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT && ballx + BALL_WIDTH + speed <= RightX) {
            ballx += speed;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT && ballx - speed >= LeftX) {
            ballx -= speed;
        }


        onPinkShape = isBallOnShape(transportX, transportY, 4);
        onYellowShape = isBallOnShape(libraryX, libraryY, 4);
        onBlueShape = isBallOnShape(parkadeX, parkadeY, 4);
        onPinkShap = isBallOnShape(diamondX, diamondY, 4);
        onYellowSh = isBallOnShape(studentX, studentY, 4);
        onBlueS = isBallOnShape(shermanX, shermanY, 4);
        onPi = isBallOnShape(scienceX, scienceY, 4);
        oYello = isBallOnShape(southScienceX, southScienceY, 4);
        onl = isBallOnShape(univDriveX, univDriveY, 4);
        onPinkSh = isBallOnShape(northParkingX, northParkingY, 4);
        onYellowShe = isBallOnShape(arisRoadX, arisRoadY, 4);
        onBlueape = isBallOnShape(gradX, gradY, 4);
        onPiShape = isBallOnShape(blussonX, blussonY, 4);
        onYeowShape = isBallOnShape(transitX, transitY, 4);
        onBlShape = isBallOnShape(strandX, strandY, 4);
        onBlueRect1 = isBallOnShape(trotterX, trotterY, 4);
        onBlueRect2 = isBallOnShape(strandAnnexX, strandAnnexY, 4);
        onBlueRect3 = isBallOnShape(mathX, mathY, 4);
        onBlueRect4 = isBallOnShape(appliedSciX, appliedSciY, 4);
        onBlueRect5 = isBallOnShape(pimsX, pimsY, 4);
        onBlueRect6 = isBallOnShape(techComplexX, techComplexY, 4);
        onBlueRect7 = isBallOnShape(classroomBlockX, classroomBlockY, 4);

        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            displayPictures();
        }

        if (ballx < LeftX) {
            ballx = LeftX;
        }
        if (ballx + BALL_WIDTH > RightX) {
            ballx = RightX - BALL_WIDTH;
        }
        if (bally < TopY) {
            bally = TopY;
        }
        if (bally + BALL_WIDTH > BottomY) {
            bally = BottomY - BALL_WIDTH;
        }
    }

    private boolean isBallOnShape(int[] xPoints, int[] yPoints, int nPoints) {
        int insideS = 0;
        for (int i = 0; i < nPoints; i++) {
            int x1 = xPoints[i];
            int y1 = yPoints[i];
            int x2 = xPoints[(i + 1) % nPoints];
            int y2 = yPoints[(i + 1) % nPoints];
            if (((y1 <= bally + BALL_WIDTH / 2 && bally + BALL_WIDTH / 2 < y2) || (y2 <= bally + BALL_WIDTH / 2 && bally + BALL_WIDTH / 2 < y1)) &&
                    (ballx + BALL_WIDTH / 2 < (x2 - x1) * (bally + BALL_WIDTH / 2 - y1) / (y2 - y1) + x1)) {
                insideS++;
            }
        }
        return insideS % 2 == 1;
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;


        Color grassGreen = new Color(140, 200, 140);
        Color pathColor = new Color(180, 160, 120);
        Color buildingColor = new Color(200, 180, 160);
        Color libraryColor = new Color(180, 200, 220);
        Color scienceColor = new Color(220, 200, 180);
        Color adminColor = new Color(200, 220, 200);

        g.setColor(grassGreen);
        g.fillRect(LeftX, TopY, Width, Height);


        g.setColor(pathColor);
        g2d.setStroke(new BasicStroke(25));

        g2d.drawArc(200, 150, 400, 300, 0, 180);
        g2d.drawLine(200, 300, 200, 500);
        g2d.drawArc(200, 400, 400, 300, 180, 180);
        g2d.drawLine(600, 300, 600, 500);


        g2d.drawLine(400, 150, 400, 700);
        g2d.drawLine(200, 450, 800, 450);




        int[] transportHexX = {80, 130, 180, 180, 130, 80};
        int[] transportHexY = {150, 120, 150, 180, 210, 180};
        g.setColor(new Color(200, 150, 150));
        g.fillPolygon(transportHexX, transportHexY, 6);


        g.setColor(libraryColor);
        g.fillRect(220, 100, 150, 100);

        g.setColor(Color.DARK_GRAY);
        g.fillRect(240, 80, 110, 20); // Roof decoration
        for (int i = 0; i < 6; i++) {
            g.fillRect(235 + i * 25, 100, 5, 100); // Columns
        }


        g.setColor(new Color(150, 150, 170));
        g.fillRect(420, 80, 180, 140);

        g.setColor(Color.DARK_GRAY);
        for (int i = 0; i < 4; i++) {
            g.drawLine(420, 80 + i * 35, 600, 80 + i * 35);
        }

        g.setColor(Color.YELLOW);
        g.fillRect(500, 80, 40, 20);


        g.setColor(new Color(180, 160, 200));
        g.fillOval(80, 220, 140, 80);


        int[] studentBuildingX = {260, 320, 390, 330};
        int[] studentBuildingY = {240, 200, 240, 310};
        g.setColor(adminColor);
        g.fillPolygon(studentBuildingX, studentBuildingY, 4);


        g.setColor(new Color(220, 200, 180));
        g.fillRect(430, 260, 110, 60);

        int[] schoolRoofX = {430, 485, 540};
        int[] schoolRoofY = {260, 230, 260};
        g.setColor(new Color(150, 100, 100));
        g.fillPolygon(schoolRoofX, schoolRoofY, 3);


        g.setColor(scienceColor);
        g.fillRect(580, 100, 80, 90);  // Left wing
        g.fillRect(660, 100, 80, 90);  // Right wing
        g.fillRect(620, 130, 80, 60);  // Connecting bridge


        g.setColor(new Color(180, 220, 240, 200));
        g.fillRect(780, 110, 140, 90);
        g.setColor(Color.BLUE);
        for (int i = 0; i < 7; i++) {
            g.drawLine(780, 110 + i * 15, 920, 110 + i * 15); // Horizontal lines
            g.drawLine(780 + i * 20, 110, 780 + i * 20, 200); // Vertical lines
        }


        g.setColor(new Color(100, 100, 120));
        g.fillRect(70, 330, 180, 100);
        g.setColor(Color.YELLOW);
        g.drawLine(70, 380, 250, 380); // Center line


        g.setColor(new Color(80, 80, 80));
        g.fillRect(280, 350, 120, 70);
        g.setColor(Color.WHITE);
        for (int i = 0; i < 4; i++) {
            g.drawRect(290 + i * 25, 360, 15, 50); // Parking spaces
        }


        g.setColor(new Color(100, 100, 120));
        g.fillArc(430, 360, 100, 80, 0, 180);


        g.setColor(new Color(160, 180, 200));
        g.fillRoundRect(560, 340, 140, 100, 20, 20);


        g.setColor(new Color(220, 210, 190));
        g.fillRect(740, 350, 160, 80);

        g.setColor(new Color(180, 180, 200));
        g.fillOval(770, 320, 100, 60);


        g.setColor(new Color(120, 120, 140));
        g.fillOval(80, 470, 120, 70);
        g.setColor(Color.YELLOW);
        g.drawOval(95, 485, 90, 40); // Inner circle


        g.setColor(buildingColor);
        g.fillRect(240, 480, 140, 60);

        g.setColor(new Color(200, 230, 255));
        for (int i = 0; i < 5; i++) {
            g.fillRect(250 + i * 25, 490, 15, 40);
        }


        g.setColor(new Color(100, 100, 120));
        g.fillOval(410, 490, 110, 60);
        g.setColor(new Color(150, 150, 170));
        g.fillOval(425, 470, 80, 40); // Dome


        g.setColor(new Color(180, 170, 160));
        g.fillRect(550, 485, 130, 60);
        // Connecting corridor
        g.fillRect(520, 505, 30, 20);


        int[] mathBuildingX = {710, 770, 830, 770};
        int[] mathBuildingY = {550, 480, 550, 620};
        g.setColor(new Color(160, 180, 220));
        g.fillPolygon(mathBuildingX, mathBuildingY, 4);


        g.setColor(new Color(170, 190, 210));
        g.fillRect(860, 490, 140, 60);

        g.setColor(Color.CYAN);
        for (int i = 0; i < 6; i++) {
            g.fillRect(870 + i * 20, 500, 10, 40);
        }


        g.setColor(new Color(200, 180, 200));
        g.fillRect(80, 580, 160, 70);

        g.setColor(Color.RED);
        g.fillOval(140, 600, 20, 20);
        g.setColor(Color.WHITE);
        g.drawString("Σ", 145, 613);


        g.setColor(new Color(180, 200, 180));
        g.fillRect(270, 590, 180, 70);

        g.setColor(Color.GREEN);
        g.fillPolygon(new int[]{320, 340, 360, 340}, new int[]{620, 600, 620, 640}, 4);


        g.fillRect(480, 600, 150, 70);

        g.setColor(new Color(200, 230, 255));
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                g.fillRect(490 + i * 22, 610 + j * 25, 15, 20);
            }
        }


        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 11));

        g.drawString("Transport", 95, 165);
        g.drawString("Library", 255, 150);
        g.drawString("Parkade", 465, 150);
        g.drawString("Auditorium", 95, 260);
        g.drawString("Student Bldg", 265, 280);
        g.drawString("Sherman Elem", 435, 290);
        g.drawString("Science", 600, 150);
        g.drawString("S Sciences", 805, 160);
        g.drawString("Univ Drive", 105, 380);
        g.drawString("N Parking", 300, 390);
        g.drawString("Aris Rd", 455, 400);
        g.drawString("Grad Bldg", 585, 390);
        g.drawString("Blusson", 790, 390);
        g.drawString("Transit", 115, 505);
        g.drawString("Strand Hall", 255, 515);
        g.drawString("Observatory", 425, 525);
        g.drawString("Strand Annex", 565, 525);
        g.drawString("MATH", 755, 525);
        g.drawString("Applied Sci", 885, 525);
        g.drawString("PIMS", 135, 625);
        g.drawString("Tech Complex", 300, 625);
        g.drawString("Classrooms", 505, 640);


        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Points: " + point, 50, 50);
        g.drawString("Lives: " + lives, 200, 50);


        g.setColor(Color.RED);
        g.fillOval(ballx, bally, BALL_WIDTH, BALL_WIDTH);


        if (showImage && image1 != null) {
            g.drawImage(image1, 300, 70, 400, 400, this);
        }

        if (showImage && System.currentTimeMillis() - imageDisplayTime > 2000) {
            showImage = false;
            image1 = null;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        NewDraw expo = new NewDraw();
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(1300, 800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.addKeyListener(expo);
        f.add(expo);

        while (expo.point < 50 && expo.lives > 0) {
            f.repaint();
        }
        f.dispose();
        if (expo.lives == 0) {
            System.out.println("Game Over! You lost all lives.");
        } else {
            System.out.println("Your total point is " + expo.point + " YOU WIN!");
        }
    }
}