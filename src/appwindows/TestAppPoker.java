package appwindows;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class TestAppPoker extends DeckOfCards {

	private JFrame frame;
	private JPanel panelYou;
	private JPanel panelPc;
	private JLabel[] label_;
	private int[] tp;
	private JLabel LabelTotal;
	protected int result;
	protected int resultpc;
	private int count;
	PointScore add = new PointScore();
	private JButton btnYou;
	private JButton btnNewGame;

	/**
	 * Launch the application.
	 */

	public TestAppPoker() {
		frame = new JFrame("Game: Twenty one " + PointScore.score(PointScore.youscore, PointScore.pcscore));
		frame.getContentPane().setBackground(new Color(0, 51, 0));
		//frame.setBounds(0, 0, 700, 415);
		frame.setSize(715, 465);
		//frame.setResizable(false);
		// frame.setBounds(null);
		frame.setLocationRelativeTo(null); // Позиционирование по центру экрана
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		LabelTotal = new JLabel();
		LabelTotal.setText("TEXT");
		LabelTotal.setHorizontalAlignment(SwingConstants.CENTER);
		LabelTotal.setForeground(Color.RED);
		LabelTotal.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 35));
		// LabelTotal.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		// // Сглаживание шрифтов и графики

		

//  VAR DUMP
//		String[][] _tmpdeck = testDeck(shufflingTheDeck(fullDeck()));
// 		for (int i = 0; i < m; i++) {
// 			for (int j = 0; j < n; j++) {
//				System.out.print("tmpdeck["+i+"]["+j+"] = ["+ _tmpdeck[i][j]+"] "); //  i + " = [" + tmpdeck[i][j] + "]");
//			}
//			System.out.println();
//		}
 	

		// Иницианализация массива label_ с изображениями карт
		String[][] tmpdeck = testDeck(shufflingTheDeck(fullDeck()));
		label_ = new JLabel[20];
		ImageIcon[] icon_ = new ImageIcon[label_.length];
		tp = new int[label_.length];
		for (int k = 0; k < label_.length; k++) {
			for (int i = 0; i < k + 1; i++) {
				for (int j = 0; j < k + 1; j++) {
					for (int j2 = 0; j2 < n; j2++) {
						if (j2 == 0) {
							icon_[i] = new ImageIcon(getClass().getResource(tmpdeck[j][j2]));
						} else {
							tp[k] = Integer.parseInt(tmpdeck[j][j2]);
						}
					}
				}
				label_[k] = new JLabel(icon_[i]);
				label_[k].setVisible(false);
				frame.getContentPane().add(label_[k]);
			}
		}
		
		panelYou = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panelYou.getLayout();
		flowLayout_1.setAlignOnBaseline(true);
		flowLayout_1.setVgap(0);
		panelYou.setBorder(null);
		panelYou.setBackground(new Color(0, 51, 0));
		
		panelPc = new JPanel();
		panelPc.setBorder(null);
		panelPc.setBackground(new Color(0, 51, 0));
		
		JButton btnPc = new JButton("PC");
		btnPc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do {	
					testHodPc();
				} while (resultpc < 19);
			}
		});
		
		btnYou = new JButton("YOU");
		btnYou.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				testHod();
			}
		});
		
		btnNewGame = new JButton("START");
		btnNewGame.setVisible(false);
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				newGame();
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(258)
							.addComponent(btnNewGame, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
							.addGap(259))
						.addComponent(panelPc, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
						.addComponent(panelYou, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE))
					.addGap(10))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnYou, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addGap(59)
					.addComponent(LabelTotal, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
					.addGap(60)
					.addComponent(btnPc, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(panelYou, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(panelPc, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(LabelTotal, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(btnNewGame, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(17))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnPc, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnYou, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
							.addGap(46))))
		);
		FlowLayout fl_panelPc = new FlowLayout(FlowLayout.CENTER, 5, 0);
		fl_panelPc.setAlignOnBaseline(true);
		panelPc.setLayout(fl_panelPc);
		frame.getContentPane().setLayout(groupLayout);
	}

	public static void newGame() {
		TestAppPoker window = new TestAppPoker();
		window.frame.setVisible(true);
	}

	public void testHod() {

		for (int i = count; i < 1 + count; i++) {
			result += tp[i];
			panelYou.add(label_[i]);
			label_[i].setVisible(true);
		}
		count++;
		LabelTotal.setText(winScoreYou(result));
	}

	public void testHodPc() {    	
		for (int i = count; i < count + 1; i++) {
			resultpc += tp[i];
			panelPc.add(label_[i]);
			label_[i].setVisible(true);
			//TimeUnit.SECONDS.sleep(1);

	}
		count++;
		btnNewGame.setVisible(true);
		LabelTotal.setText(winScorePc(resultpc));  

        	 	
	}

	public static String winScoreYou(int points) {

		if (points > 21) {
			PointScore.youscore = points;
			return "You lost! Score: " + String.valueOf(points);
		} else if (points == 21) {
			PointScore.youscore = points;
			return "You Win! Score: " + String.valueOf(points);
		}
		PointScore.youscore = points;
		return "Score: " + String.valueOf(points);
	}

	public static String winScorePc(int points) {

		if (points > 21) {
			PointScore.pcscore = points;
			return "PC lost! Score: " + String.valueOf(points);
		} else if (points == 21) {
			PointScore.pcscore = points;
			return "PC Win! Score: " + String.valueOf(points);
		}

		PointScore.pcscore = points;
		return "Score: " + String.valueOf(points);
	}
	
//	public static void main(String[] args) {
//		try {
//			newGame();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
}

