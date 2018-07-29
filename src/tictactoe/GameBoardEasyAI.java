package tictactoe;

import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class GameBoardEasyAI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	static GameBoardEasyAI frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new GameBoardEasyAI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private static int countTurns=0;
	private static boolean turnOfX=true;
	private static boolean turnOfY=false;
	private static String val1="",val2="",val3="",val4="",val5="",val6="",val7="",val8="",val9="";
	private static boolean row1=false,row2=false,row3=false;
	private static boolean col1=false,col2=false,col3=false;
	private static boolean di1=false,di2=false;
	private static ArrayList<Integer> emptycells=new ArrayList<Integer>();
	boolean win=false;
	Random generator=new Random();
	JLabel lb9 = new JLabel("");
	JLabel lb8 = new JLabel("");
	JLabel lb7 = new JLabel("");
	JLabel lb6 = new JLabel("");
	JLabel lb5 = new JLabel("");
	JLabel lb4 = new JLabel("");
	JLabel lb3 = new JLabel("");
	JLabel lb2 = new JLabel("");
	JLabel lb1 = new JLabel("");
	JLabel winLabel = new JLabel("");

	JPanel panel_1 = new JPanel();
	
	JPanel panel_2 = new JPanel();
	
	JPanel panel_3 = new JPanel();
	
	JPanel panel_4 = new JPanel();
	
	JPanel panel_5 = new JPanel();
	
	JPanel panel_6 = new JPanel();
	
	JPanel panel_7 = new JPanel();
	
	JPanel panel_8 = new JPanel();
	/**
	 * Create the frame.
	 */
	public void initEmptyValues() {
		emptycells.add(0,1);
		emptycells.add(1,2);
		emptycells.add(2,3);
		emptycells.add(3,4);
		emptycells.add(4,5);
		emptycells.add(5,6);
		emptycells.add(6,7);
		emptycells.add(7,8);
		emptycells.add(8,9);
	}
	public void initValues() {
		 /*lb9 = new JLabel("");
		 lb8 = new JLabel("");
		 lb7 = new JLabel("");
		 lb6 = new JLabel("");
		 lb5 = new JLabel("");
		 lb4 = new JLabel("");
		 lb3 = new JLabel("");
		 lb2 = new JLabel("");
		 lb1 = new JLabel("");
		 winLabel = new JLabel("");
		 panel_1 = new JPanel();
		 panel_2 = new JPanel();
		 panel_3 = new JPanel();
		 panel_4 = new JPanel();
		 panel_5 = new JPanel();
		 panel_6 = new JPanel();
		 panel_7 = new JPanel();
		 panel_8 = new JPanel();*/
		 countTurns=0;
		 turnOfX=true;
		 turnOfY=false;
		 val1="";val2="";val3="";val4="";val5="";val6="";val7="";val8="";val9="";
		 //initEmptyValues();
	}
	public void compTurn() {
		System.out.println("Turns Done:"+countTurns );
		if(countTurns>=5) {
			System.out.println("First is Called");
			win=checkWinner();
		}
		turnOfY=false;
		turnOfX=true;
		countTurns+=1;
		int creatingindex=0;
		int index;
		emptycells=new ArrayList<Integer>();
		if(countTurns<9) {
		if(lb1.getText().isEmpty()==true) {
			emptycells.add(creatingindex,1);
			creatingindex+=1;
		}
	    if(lb2.getText().isEmpty()==true) {
	    	emptycells.add(creatingindex,2);
			creatingindex+=1;
		}
	    if(lb3.getText().isEmpty()==true) {
	    	emptycells.add(creatingindex,3);
			creatingindex+=1;
		}
	    if(lb4.getText().isEmpty()==true) {
	    	emptycells.add(creatingindex,4);
			creatingindex+=1;
		}
		if(lb5.getText().isEmpty()==true) {
			emptycells.add(creatingindex,5);
			creatingindex+=1;
		}
		if(lb6.getText().isEmpty()==true) {
			emptycells.add(creatingindex,6);
			creatingindex+=1;
		}
		if(lb7.getText().isEmpty()==true) {
			emptycells.add(creatingindex,7);
			creatingindex+=1;
		}
		if(lb8.getText().isEmpty()==true) {
			emptycells.add(creatingindex,8);
			creatingindex+=1;
		}
		if(lb9.getText().isEmpty()==true) {
			emptycells.add(creatingindex,9);
			creatingindex+=1;
		}
		}
		System.out.println(emptycells);
		int move;
		if(countTurns<9) {
		move=emptycells.get(generator.nextInt(emptycells.size()));
		
		//Collections.shuffle(emptycells);
		System.out.println("Move Predicted: "+move);
		System.out.println("Block "+move+" : O");
		
		switch(move) {
		case 1:
			lb1.setText("O");
			val1=lb1.getText();
			break;
		case 2:
			lb2.setText("O");
			val2=lb2.getText();
			break;
		case 3:
			lb3.setText("O");
			val3=lb3.getText();
			break;
		case 4:
			lb4.setText("O");
			val4=lb4.getText();
			break;
		case 5:
			lb5.setText("O");
			val5=lb5.getText();
			break;
		case 6:
			lb6.setText("O");
			val6=lb6.getText();
			break;
		case 7:
			lb7.setText("O");
			val7=lb7.getText();
			break;
		case 8:
			lb8.setText("O");
			val8=lb8.getText();
			break;
		case 9:
			lb9.setText("O");
			val9=lb9.getText();
			break;
		}
		index=emptycells.indexOf(move);
		emptycells.remove(index);
		System.out.println(emptycells);
		System.out.println("Turns Done "+countTurns);
		}
		if(countTurns>=5) {
			System.out.println("Second is called");
			win=checkWinner();
			System.out.println(win);
		}
		
	}
	public GameBoardEasyAI() {
		setResizable(false);
		//initEmptyValues();
		System.out.print("New Game Started\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Tic tac Toe");
		setBounds(100, 100, 388, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		
		
		
		
		JPanel panel_9 = new JPanel();
		
		winLabel.setFont(new Font("Lucida Bright", Font.BOLD, 18));
		winLabel.setForeground(Color.GREEN);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				frame=new GameBoardEasyAI();
				initValues();
				frame.setVisible(true);
			}
		});
		
		JButton button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(1);
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(137)
							.addComponent(winLabel, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addComponent(winLabel, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(button, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		lb9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(lb9.isEnabled()==true&&(lb9.getText().isEmpty()||lb9.getText()==null)){
				if(turnOfX) {
					lb9.setText("X");
					turnOfX=false;
					turnOfY=true;
					val9=lb9.getText();
					System.out.println("Block 9 : "+val9);
					countTurns+=1;
					if(countTurns>=5) {
						win=checkWinner();
					}
					if(win==false) {
					compTurn();
					}
				}
				
				
			}
			}
		});
		lb9.setForeground(Color.RED);
		lb9.setFont(new Font("SansSerif", Font.BOLD, 95));
		GroupLayout gl_panel_9 = new GroupLayout(panel_9);
		gl_panel_9.setHorizontalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addGap(20)
					.addComponent(lb9, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_9.setVerticalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addContainerGap()
					.addComponent(lb9, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		panel_9.setLayout(gl_panel_9);
		
		lb8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(lb8.isEnabled()==true&&(lb8.getText().isEmpty()||lb8.getText()==null)) {
				if(turnOfX) {
					lb8.setText("X");
					turnOfX=false;
					turnOfY=true;
					val8=lb8.getText();
					System.out.println("Block 8 : "+val8);
					countTurns+=1;
					if(countTurns>=5) {
						win=checkWinner();
					}
					if(win==false) {
					compTurn();
					}
				}
			
				
			}
			}
		});
		lb8.setForeground(Color.RED);
		lb8.setFont(new Font("SansSerif", Font.BOLD, 95));
		GroupLayout gl_panel_8 = new GroupLayout(panel_8);
		gl_panel_8.setHorizontalGroup(
			gl_panel_8.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addContainerGap(22, Short.MAX_VALUE)
					.addComponent(lb8, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_8.setVerticalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addContainerGap()
					.addComponent(lb8, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		panel_8.setLayout(gl_panel_8);
		
		lb7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(lb7.isEnabled()==true&&(lb7.getText().isEmpty()||lb7.getText()==null)) {
				if(turnOfX) {
					lb7.setText("X");
					turnOfX=false;
					turnOfY=true;
					val7=lb7.getText();
					System.out.println("Block 7 : "+val7);
					countTurns+=1;
					if(countTurns>=5) {
						win=checkWinner();
					}
					if(win==false) {
					compTurn();
					}
				}
			
			
			}
			}
		});
		lb7.setForeground(Color.RED);
		lb7.setFont(new Font("SansSerif", Font.BOLD, 95));
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addContainerGap(22, Short.MAX_VALUE)
					.addComponent(lb7, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addContainerGap()
					.addComponent(lb7, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		panel_7.setLayout(gl_panel_7);
		
		lb6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(lb6.isEnabled()==true&&(lb6.getText().isEmpty()||lb6.getText()==null)) {
				if(turnOfX) {
					lb6.setText("X");
					turnOfX=false;
					turnOfY=true;
					val6=lb6.getText();
					System.out.println("Block 6 : "+val6);
					countTurns+=1;
					if(countTurns>=5) {
						win=checkWinner();
					}
					if(win==false) {
					compTurn();
					}
				}
			
			
			}
			}
		});
		lb6.setForeground(Color.RED);
		lb6.setFont(new Font("SansSerif", Font.BOLD, 95));
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addGap(20)
					.addComponent(lb6, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addComponent(lb6, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		panel_6.setLayout(gl_panel_6);
		
		lb5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(lb5.isEnabled()==true&&(lb5.getText().isEmpty()||lb5.getText()==null)) {
				if(turnOfX) {
					lb5.setText("X");
					turnOfX=false;
					turnOfY=true;
					val5=lb5.getText();
					System.out.println("Block 5 : "+val5);
					countTurns+=1;
					if(countTurns>=5) {
						win=checkWinner();
					}
					if(win==false) {
					compTurn();
					}
				}
		
				
			}
			}
		});
		lb5.setForeground(Color.RED);
		lb5.setFont(new Font("SansSerif", Font.BOLD, 95));
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap(22, Short.MAX_VALUE)
					.addComponent(lb5, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(lb5, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		panel_5.setLayout(gl_panel_5);
		
		lb4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(lb4.isEnabled()==true&&(lb4.getText().isEmpty()||lb4.getText()==null)) {
				if(turnOfX) {
					lb4.setText("X");
					turnOfX=false;
					turnOfY=true;
					val4=lb4.getText();
					System.out.println("Block 4 : "+val4);
					countTurns+=1;
					if(countTurns>=5) {
						win=checkWinner();
					}
					if(win==false) {
					compTurn();
					}
				}
			
				
			}
			}
		});
		lb4.setForeground(Color.RED);
		lb4.setFont(new Font("SansSerif", Font.BOLD, 95));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(20)
					.addComponent(lb4, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(lb4, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		
		lb3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(lb3.isEnabled()==true&&(lb3.getText().isEmpty()||lb3.getText()==null)) {
				if(turnOfX) {
					lb3.setText("X");
					turnOfX=false;
					turnOfY=true;
					val3=lb3.getText();
					System.out.println("Block 3 : "+val3);
					countTurns+=1;
					if(countTurns>=5) {
						win=checkWinner();
					}
					if(win==false) {
					compTurn();
					}
				}
		
				
			}
			}
		});
		lb3.setForeground(Color.RED);
		lb3.setFont(new Font("SansSerif", Font.BOLD, 95));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(20)
					.addComponent(lb3, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lb3, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		
		lb2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(lb2.isEnabled()==true&&(lb2.getText().isEmpty()||lb2.getText()==null)) {
				if(turnOfX) {
					lb2.setText("X");
					turnOfX=false;
					turnOfY=true;
					val2=lb2.getText();
					System.out.println("Block 2 : "+val2);
					countTurns+=1;
					if(countTurns>=5) {
						win=checkWinner();
					}
					if(win==false) {
					compTurn();
					}
				}
		
				
			}
			}
		});
		lb2.setForeground(Color.RED);
		lb2.setFont(new Font("SansSerif", Font.BOLD, 95));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(20)
					.addComponent(lb2, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lb2, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		lb1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(lb1.isEnabled()==true&&(lb1.getText().isEmpty()||lb1.getText()==null)) {
				if(turnOfX) {
					lb1.setText("X");
					turnOfX=false;
					turnOfY=true;
					val1=lb1.getText();
					System.out.println("Block 1 : "+val1);
					countTurns+=1;
					if(countTurns>=5) {
						win=checkWinner();
					}
					if(win==false) {
					compTurn();
					}

				}
			
				
			}
			}
		});
		lb1.setFont(new Font("SansSerif", Font.BOLD, 95));
		lb1.setForeground(Color.RED);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(21, Short.MAX_VALUE)
					.addComponent(lb1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lb1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
	public boolean checkWinner() {
		String winner=null;
		boolean win=false;
			/*
			 * Checking for Horizontal Winning Cases*/
			if(val1.equals(val2)&& val2.equals(val3)&&(val1!=""&&val2!=""&&val3!="")) {
				winner=val1;
				System.out.println("Row1 is true");
				Winner(winner);
				win=true;
			}
			else if(val4.equals(val5)&&val5.equals(val6)&&(val4!=""&&val5!=""&&val6!="")) {
				winner=val4;
				System.out.println("Row2 is true");
				Winner(winner);
				win=true;
			}
			else if (val7.equals(val8)&&val8.equals(val9)&&(val7!=""&&val8!=""&&val9!="")) {
				winner=val7;
				System.out.println("Row3 is true");
				Winner(winner);
				win=true;
			}
			/*
			 * Checking for vertical Winning Cases*/
			else if(val1.equals(val4)&&val4.equals(val7)&&(val1!=""&&val4!=""&&val7!="")) {
				winner=val1;
				System.out.println("Col1 is true");
				Winner(winner);
				win=true;
			}
			else if(val2.equals(val5)&&val5.equals(val8)&&(val2!=""&&val5!=""&&val8!="")) {
				winner=val2;
				System.out.println("Col2 is true");
				Winner(winner);
				win=true;
			}
			else if(val3.equals(val6)&&val6.equals(val9)&&(val3!=""&&val6!=""&&val9!="")) {
				winner=val3;
				System.out.println("Col3 is true");
				Winner(winner);
				win=true;
			}
			/*
			 * Checking for diagonal winner*/
			else if((val1.equals(val5)&&val5.equals(val9))||(val3.equals(val5)&&val5.equals(val7))&&val5!="") {
				winner=val5;
				System.out.println("Di is true");
				Winner(winner);
				win=true;
			}
			else if(countTurns==9) {
				Winner(winner);
				win=false;
			}
			return win;
			
		
	}
	public void Winner(String winner) {
		if(winner==null) {
			winLabel.setText("Game Draw!");
		}
		else {
			if(winner.equals("X")) {
				winner="You";
			}
			else if(winner.equals("O")) {
				winner="Comp";
			}
			winLabel.setText("  "+winner+" won!");
		}
		disableBoard();
	}
	public void disableBoard() {
		lb1.setEnabled(false);
		lb2.setEnabled(false);
		lb3.setEnabled(false);
		lb4.setEnabled(false);
		lb5.setEnabled(false);
		lb6.setEnabled(false);
		lb7.setEnabled(false);
		lb8.setEnabled(false);
		lb9.setEnabled(false);
	}
}
