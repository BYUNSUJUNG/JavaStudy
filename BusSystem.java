

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.awt.*;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.*;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.*;
import javax.swing.JTextPane;

public class BusSystem extends JFrame {
	
	/*
	 * 여러 버튼중 한 버튼을 클릭하면 전체 버튼에 불이 들어온다
	 * 특정 장소에 도착하면 문이 열리면서 모든 버튼의 불이 꺼진다
	 * 버튼을 클릭하지 않으면 문이 열리지 않는다 */
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BusSystem frame = new BusSystem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BusSystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel BusSystemPanel = new JPanel();
		BusSystemPanel.setBackground(Color.DARK_GRAY);
		
		JLabel busSystem = new JLabel("BusSystem");
		busSystem.setForeground(Color.WHITE);
		busSystem.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		BusSystemPanel.add(busSystem);
		
		JLabel doorText = new JLabel("닫힘");
		doorText.setFont(new Font("휴먼엑스포", Font.BOLD, 60));
		
		JPanel ButtonPanel = new JPanel();
		ButtonPanel.setBackground(Color.YELLOW);
		ButtonPanel.setForeground(Color.BLACK);
		
		JButton getOffButton1 = new JButton("get off");
		JButton getOffButton2 = new JButton("get off");
		JButton getOffButton3 = new JButton("get off");
		JButton getOffButton4 = new JButton("get off");
	
		
		getOffButton1.setForeground(Color.BLACK);
		getOffButton1.setBackground(new Color(255, 255, 255));
		getOffButton1.setFont(new Font("휴먼모음T", Font.BOLD, 20));
		getOffButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getOffButton1.setBackground(new Color(255, 0, 0));
				getOffButton2.setBackground(new Color(255, 0, 0));
				getOffButton3.setBackground(new Color(255, 0, 0));
				getOffButton4.setBackground(new Color(255, 0, 0));
				doorText.setText("열림");
			}
		});
		
		getOffButton2.setBackground(new Color(255, 255, 255));
		getOffButton2.setFont(new Font("휴먼모음T", Font.BOLD, 20));
		getOffButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getOffButton1.setBackground(new Color(255, 0, 0));
				getOffButton2.setBackground(new Color(255, 0, 0));
				getOffButton3.setBackground(new Color(255, 0, 0));
				getOffButton4.setBackground(new Color(255, 0, 0));
				doorText.setText("열림");
			}
		});

		
		getOffButton3.setBackground(new Color(255, 255, 255));
		getOffButton3.setFont(new Font("휴먼모음T", Font.BOLD, 20));
		getOffButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getOffButton1.setBackground(new Color(255, 0, 0));
				getOffButton2.setBackground(new Color(255, 0, 0));
				getOffButton3.setBackground(new Color(255, 0, 0));
				getOffButton4.setBackground(new Color(255, 0, 0));
				doorText.setText("열림");
			}
		});
		getOffButton4.setBackground(new Color(255, 255, 255));
		getOffButton4.setFont(new Font("휴먼모음T", Font.BOLD, 20));
		getOffButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getOffButton1.setBackground(new Color(255, 0, 0));
				getOffButton2.setBackground(new Color(255, 0, 0));
				getOffButton3.setBackground(new Color(255, 0, 0));
				getOffButton4.setBackground(new Color(255, 0, 0));
				doorText.setText("열림");
			}
		});
	
		GroupLayout gl_ButtonPanel = new GroupLayout(ButtonPanel);
		gl_ButtonPanel.setHorizontalGroup(
			gl_ButtonPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_ButtonPanel.createSequentialGroup()
					.addContainerGap(39, Short.MAX_VALUE)
					.addGroup(gl_ButtonPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(getOffButton4)
						.addComponent(getOffButton3)
						.addComponent(getOffButton2)
						.addComponent(getOffButton1))
					.addGap(31))
		);
		gl_ButtonPanel.setVerticalGroup(
			gl_ButtonPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_ButtonPanel.createSequentialGroup()
					.addContainerGap(11, Short.MAX_VALUE)
					.addComponent(getOffButton1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(getOffButton2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(getOffButton3)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(getOffButton4)
					.addGap(24))
		);
		ButtonPanel.setLayout(gl_ButtonPanel);
		
		JPanel StationPanel = new JPanel();
		StationPanel.setBackground(Color.ORANGE);
		
		JPanel ClosePanel = new JPanel();
		ClosePanel.setBackground(new Color(250, 250, 210));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(BusSystemPanel, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(ClosePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(StationPanel, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(ButtonPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(0))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(BusSystemPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(StationPanel, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ClosePanel, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
						.addComponent(ButtonPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(16))
		);
		
		JLabel station = new JLabel("Station");
		station.setBackground(new Color(255, 255, 255));
		station.setFont(new Font("휴먼엑스포", Font.BOLD, 32));
		station.setForeground(Color.BLACK);
		
		JLabel number = new JLabel("1");
		number.setBackground(Color.WHITE);
		number.setFont(new Font("휴먼엑스포", Font.BOLD, 32));
		number.setForeground(Color.BLACK);
		GroupLayout gl_StationPanel = new GroupLayout(StationPanel);
		gl_StationPanel.setHorizontalGroup(
			gl_StationPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_StationPanel.createSequentialGroup()
					.addContainerGap(28, Short.MAX_VALUE)
					.addComponent(number, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(station)
					.addGap(22))
		);
		gl_StationPanel.setVerticalGroup(
			gl_StationPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_StationPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_StationPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(number)
						.addComponent(station))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		StationPanel.setLayout(gl_StationPanel);
		
		JButton NexbButton = new JButton("next");
		NexbButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getOffButton1.setBackground(new Color(255, 255, 255));
				getOffButton2.setBackground(new Color(255, 255, 255));
				getOffButton3.setBackground(new Color(255, 255, 255));
				getOffButton4.setBackground(new Color(255, 255, 255));
				doorText.setText("닫힘");
			}
		});
		NexbButton.setFont(new Font("휴먼엑스포", Font.BOLD, 18));
		NexbButton.setBackground(new Color(255, 255, 255));
		NexbButton.setForeground(new Color(0, 0, 0));

		GroupLayout gl_ClosePanel = new GroupLayout(ClosePanel);
		gl_ClosePanel.setHorizontalGroup(
			gl_ClosePanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_ClosePanel.createSequentialGroup()
					.addContainerGap(57, Short.MAX_VALUE)
					.addGroup(gl_ClosePanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ClosePanel.createSequentialGroup()
							.addComponent(doorText, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
							.addGap(46))
						.addGroup(Alignment.TRAILING, gl_ClosePanel.createSequentialGroup()
							.addComponent(NexbButton)
							.addContainerGap())))
		);
		gl_ClosePanel.setVerticalGroup(
			gl_ClosePanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_ClosePanel.createSequentialGroup()
					.addContainerGap(22, Short.MAX_VALUE)
					.addComponent(doorText, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(NexbButton)
					.addContainerGap())
		);
		ClosePanel.setLayout(gl_ClosePanel);
		contentPane.setLayout(gl_contentPane);
	}
}
