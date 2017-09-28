/*PROG2
 * 
 * Elev: Cedric Fridgren
 * 
 * 
 * 
 */

//Nödvändiga import paketer
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

// Nod klassen
public class NodPlanKontor extends JFrame {

	JButton angeKnapp, visaKnapp;
	HashMap<String, Position> mapMap = new HashMap<>();
	DefaultListModel<String> listData = new DefaultListModel<>(); // En tom
																	// lista
																	// från
																	// början
	JList<String> nameList = new JList<>(listData);
	Map map = new Map();
	Position position;

	public NodPlanKontor() {

		super("Nod kontors plan 3");

		JPanel west = new JPanel();
		west.setLayout(new BoxLayout(west, BoxLayout.Y_AXIS));
		add(west, BorderLayout.WEST);
		nameList.setVisibleRowCount(10);
		nameList.setFixedCellWidth(80);
		west.add(new JScrollPane(nameList));

		add(map, BorderLayout.CENTER);

		JPanel south = new JPanel();
		add(south, BorderLayout.SOUTH);
		angeKnapp = new JButton("Ange");
		visaKnapp = new JButton("Visa");
		south.add(angeKnapp);
		south.add(visaKnapp);
		visaKnapp.addActionListener(new KnappLyssTwo());
		angeKnapp.addActionListener(new KnappLyssOne());

		setVisible(true);
		setSize(900, 622);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	// Main metod
	public static void main(String[] args) {
		new NodPlanKontor();
	}

	// Map klassen
	public class Map extends JPanel {

		private ImageIcon picture = new ImageIcon("NodPlan3.png");
		private int x, y;
		private boolean show;

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(picture.getImage(), 0, 0, this);
			if (show) {
				g.setColor(Color.RED);
				g.fillOval(x - 10, y - 10, 15, 15);
			}
		}

		public void setXY(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public void setShow(boolean s) {
			show = s;
			repaint();

		}
	}

	// KnappLyssnare 1
	public class KnappLyssOne implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {

			String name = JOptionPane.showInputDialog(null, "Namn:");
			listData.addElement(name);
			boolean show = true;

			map.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					if (e.getButton() == MouseEvent.BUTTON1) {
						int x = e.getX();
						int y = e.getY();
						position = new Position(x, y);
						map.setXY(x, y);
						map.setShow(show);
						mapMap.put(name, position);
						map.removeMouseListener(this);
					}
				}
			});

		}

	}// slut på knappLyssnare 1

	// KnappLyssnare 2
	public class KnappLyssTwo implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {

			String name = nameList.getSelectedValue();
			boolean show = true;

			if (mapMap.containsKey(name)) {
				position = mapMap.get(name);
				map.setXY(position.getX(), position.getY());
				map.setShow(show);
			} else {
				JOptionPane.showMessageDialog(null, "Det blev fel!");
			}
		}
	} // slut på knappLyssnare 2

	// Klass Position är till för att paketera x och y koordinater
	public class Position {

		private int x;
		private int y;

		public Position(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

	}
} // Position
