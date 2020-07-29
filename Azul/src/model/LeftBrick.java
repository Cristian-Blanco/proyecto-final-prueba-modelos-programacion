package model;

import java.awt.Color;

import javax.swing.JLabel;

public class LeftBrick extends JLabel{
	private String title;
	private Color colour;
	public LeftBrick() {
		super();
		setOpaque(true);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LeftBrick copy() {
		LeftBrick brick = new LeftBrick();
		brick.setTitle(this.getTitle());
		brick.setColour(this.getColour());
		return brick;
	}
	public Color getColour() {
		return colour;
	}
	public void setColour(Color colour) {
		this.colour = colour;
	}
	public void doBackgroundColor() {
		setBackground(this.getColour());
	}
	

}
