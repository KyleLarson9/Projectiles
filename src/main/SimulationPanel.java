package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

public class SimulationPanel extends JPanel {

	private static final long serialVersionUID = -5275150324825132510L;
	
	private Simulation simulation;
	private Dimension size;
	public MouseInputs mouseInputs;
	
	public SimulationPanel(Simulation simulation) {
		this.simulation = simulation;
		mouseInputs = new MouseInputs(this);

		setPanelSize();
		addKeyListener(new KeyboardInputs(this));
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
		this.setBackground(Color.DARK_GRAY);
	}
	
	// public methods
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		simulation.render(g2d);
	}
	
	// private methods
	
	private void setPanelSize() {
		size = new Dimension(Simulation.APP_WIDTH, Simulation.APP_HEIGHT);
		setMinimumSize(size);
		setMaximumSize(size);
		setPreferredSize(size);
	}
	
	// getters
	
	public Simulation getSimulation() {
		return simulation;
	}
	
}
