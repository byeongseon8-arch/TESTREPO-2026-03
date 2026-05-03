package dynamic_beat_11;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;

public class Game extends Thread {

	private Image noteBasicImage = new ImageIcon(Main.class.getResource("/images/noteBasic.png")).getImage();

	private Image noteRouteImage = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();

	private Image judgementLineImage = new ImageIcon(Main.class.getResource("/images/judgementLine.png")).getImage();

	private Image gameInfoImage = new ImageIcon(Main.class.getResource("/images/gameInfo.png")).getImage();

	private Image noteRouteLineImage = new ImageIcon(Main.class.getResource("/images/noteRouteLine.png")).getImage();

	private Image noteRouteSImage = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	private Image noteRouteDImage = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	private Image noteRouteFImage = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	private Image noteRouteSpace1Image = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	private Image noteRouteSpace2Image = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	private Image noteRouteJImage = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	private Image noteRouteKImage = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	private Image noteRouteLImage = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();


	public void screenDraw(Graphics2D g) {
		g.drawImage(noteRouteSImage, 478, 30, null);
		g.drawImage(noteRouteDImage, 582, 30, null);
		g.drawImage(noteRouteFImage, 686, 30, null);
		g.drawImage(noteRouteSpace1Image, 790, 30, null);
		g.drawImage(noteRouteSpace2Image, 890, 30, null);
		g.drawImage(noteRouteJImage, 994, 30, null);
		g.drawImage(noteRouteKImage, 1098, 30, null);
		g.drawImage(noteRouteLImage, 1202, 30, null);

		g.drawImage(noteRouteLineImage, 474, 30, null);
		g.drawImage(noteRouteLineImage, 578, 30, null);
		g.drawImage(noteRouteLineImage, 682, 30, null);
		g.drawImage(noteRouteLineImage, 786, 30, null);
		g.drawImage(noteRouteLineImage, 990, 30, null);
		g.drawImage(noteRouteLineImage, 1094, 30, null);
		g.drawImage(noteRouteLineImage, 1198, 30, null);
		g.drawImage(noteRouteLineImage, 1302, 30, null);

		g.drawImage(gameInfoImage, 0, 1020, null);
		g.drawImage(judgementLineImage, 0, 960, null);

		g.drawImage(noteBasicImage, 478, 120, null);
		g.drawImage(noteBasicImage, 582, 580, null);
		g.drawImage(noteBasicImage, 686, 500, null);
		g.drawImage(noteBasicImage, 790, 340, null);
		g.drawImage(noteBasicImage, 890, 340, null);
		g.drawImage(noteBasicImage, 994, 325, null);
		g.drawImage(noteBasicImage, 1098, 305, null);
		g.drawImage(noteBasicImage, 1202, 970, null);
		g.setColor(Color.white);
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setFont(new Font("Arial", Font.BOLD, 30));
		g.drawString("ElliniaWhenTheMorningComes", 20, 1065);
		g.drawString("Easy", 1820, 1060);

		g.setColor(Color.DARK_GRAY);
		g.drawString("S", 520, 1000);
		g.drawString("D", 622, 1000);
		g.drawString("F", 726, 1000);
		g.drawString("Space Bar", 820, 1000);
		g.drawString("J", 1034, 1000);
		g.drawString("K", 1138, 1000);
		g.drawString("L", 1245, 1000);
		g.setColor(Color.LIGHT_GRAY);
		g.setFont(new Font("Elephant", Font.BOLD, 30));
		g.drawString("0000000", 810, 1065);
	}

	public void pressS() {
		noteRouteSImage = new ImageIcon(Main.class.getResource("/images/noteRoutePressed.png")).getImage();
		new Music("drum1.mp3", false).start();
	}
	
	public void releaseS() {
		noteRouteSImage = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
		
	}
	
	public void pressD() {
		noteRouteDImage = new ImageIcon(Main.class.getResource("/images/noteRoutePressed.png")).getImage();
		new Music("drum1.mp3", false).start();
	}
	
	public void releaseD() {
		noteRouteDImage = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	}
	public void pressF() {
		noteRouteFImage = new ImageIcon(Main.class.getResource("/images/noteRoutePressed.png")).getImage();
		new Music("drum1.mp3", false).start();
	}
	
	public void releaseF() {
		noteRouteFImage = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	}
	public void pressSpace() {
		noteRouteSpace1Image = new ImageIcon(Main.class.getResource("/images/noteRoutePressed.png")).getImage();
		noteRouteSpace2Image = new ImageIcon(Main.class.getResource("/images/noteRoutePressed.png")).getImage();
		new Music("drum1.mp3", false).start();
	}
	
	public void releaseSpace() {
		noteRouteSpace1Image = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
		noteRouteSpace2Image = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	}
	public void pressJ() {
		noteRouteJImage = new ImageIcon(Main.class.getResource("/images/noteRoutePressed.png")).getImage();
		new Music("drum1.mp3", false).start();
	}
	
	public void releaseJ() {
		noteRouteJImage = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	}
	public void pressK() {
		noteRouteKImage = new ImageIcon(Main.class.getResource("/images/noteRoutePressed.png")).getImage();
		new Music("drum1.mp3", false).start();
	}
	
	public void releaseK() {
		noteRouteKImage = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	}
	public void pressL() {
		noteRouteLImage = new ImageIcon(Main.class.getResource("/images/noteRoutePressed.png")).getImage();
		new Music("drum1.mp3", false).start();
	}
	
	public void releaseL() {
		noteRouteLImage = new ImageIcon(Main.class.getResource("/images/noteRoute.png")).getImage();
	}
	
	
}
