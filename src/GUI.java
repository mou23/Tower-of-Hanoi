import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;

public class GUI {
	JFrame frame;
	JPanel panel;
	JPanel panel2;
	JPanel panel3;
	JButton btnNewButton1;
	JButton btnNewButton2;
	JButton btnNewButton3;
	JButton btnNewButton4;
	JButton btnNewButton5;
	JButton btnNewButton6;
	
	Button ob;
	
	public GUI(){
		frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 475, 300);;
		frame.setLayout(null);
		ob=new Button();
		panel = new JPanel();
		panel.setBounds(0, 0, 140, 180);
		panel2=new JPanel();
		panel2.setBounds(156, 0, 140, 180);
		panel3=new JPanel();
		panel3.setBounds(315, 0, 140, 180);
		frame.add(panel);
		frame.add(panel2);
		frame.add(panel3);
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
		
		btnNewButton1 = new JButton("1>>2");
		frame.add(btnNewButton1);
		btnNewButton1.setBounds(10, 190, 89, 23); //setBounds(70, 266, 89, 23);
		
		
		btnNewButton2 = new JButton("3<<1");
		btnNewButton2.setBounds(10, 224, 89, 23); //(70, 300, 89, 23);
		frame.add(btnNewButton2);
		
		btnNewButton3 = new JButton("2>>3");
		btnNewButton3.setBounds(156, 190, 89, 23); //setBounds(218, 266, 89, 23);
		frame.add(btnNewButton3);
		
		btnNewButton4 = new JButton("1<<2");
		btnNewButton4.setBounds(156, 224, 89, 23); //setBounds(218, 300, 89, 23);
		frame.add(btnNewButton4);
		
		btnNewButton5 = new JButton("3>>1");
		btnNewButton5.setBounds(315, 190, 89, 23); //setBounds(403, 266, 89, 23);
		frame.add(btnNewButton5);
		
		btnNewButton6 = new JButton("2<<3");
		btnNewButton6.setBounds(315, 224, 89, 23); //setBounds(403, 300, 89, 23);
		frame.add(btnNewButton6);
	}
	
	public void draw(){
		panel.removeAll();
		panel2.removeAll();
		panel3.removeAll();
		for(int i=0;i<ob.al1.size();i++){
			//System.out.println(ob.al1.size());
			JButton jb=new JButton(Integer.toString(ob.al1.get(i)));
			panel.add(jb);
		}
		for(int i=0;i<ob.al2.size();i++){
			//System.out.println(ob.al2.size());
			JButton jb=new JButton(Integer.toString(ob.al2.get(i)));
			panel2.add(jb);
		}
		for(int i=0;i<ob.al3.size();i++){
			//System.out.println(ob.al3.size());
			JButton jb=new JButton(Integer.toString(ob.al3.get(i)));
			panel3.add(jb);
		}
		panel.repaint();
		panel.revalidate();
		panel2.repaint();
		panel2.revalidate();
		panel3.repaint();
		panel3.revalidate();
	}
	
	public void initialize(){
		draw();
		
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((ob.al2.isEmpty() && !ob.al1.isEmpty()) || (!ob.al2.isEmpty() && !ob.al1.isEmpty() && ob.al1.get(0)<ob.al2.get(0))){
					if(ob.al2.isEmpty()) ob.al2.add(ob.al1.remove(0));
					else ob.al2.add(0, ob.al1.remove(0));
					draw();
				}
						
				else{
					JOptionPane.showMessageDialog(null, "Not Possible");
				}				
			}
		});
		
		
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((ob.al3.isEmpty() && !ob.al1.isEmpty()) || (!ob.al3.isEmpty() && !ob.al1.isEmpty() && ob.al1.get(0)<ob.al3.get(0))){
					if(ob.al3.isEmpty()) ob.al3.add(ob.al1.remove(0));
					else ob.al3.add(0,ob.al1.remove(0));
					draw();
				}
				else
					JOptionPane.showMessageDialog(null, "Not Possible");
			}
		});
		
				
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((ob.al3.isEmpty() && !ob.al2.isEmpty()) || (!ob.al3.isEmpty() && !ob.al2.isEmpty() && ob.al2.get(0)<ob.al3.get(0))){
					if(ob.al3.isEmpty()) ob.al3.add(ob.al2.remove(0));
					else ob.al3.add(0,ob.al2.remove(0));
					draw();
				}
				
				else
					JOptionPane.showMessageDialog(null, "Not Possible");
			}
		});

		
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((ob.al1.isEmpty() && !ob.al2.isEmpty()) || (!ob.al1.isEmpty() && !ob.al2.isEmpty() && ob.al2.get(0)<ob.al1.get(0))){
					if(ob.al1.isEmpty()) ob.al1.add(ob.al2.remove(0));
					else ob.al1.add(0,ob.al2.remove(0));
					draw();
				}
				
				else
					JOptionPane.showMessageDialog(null, "Not Possible");
			}
		});
		
		
		
		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((ob.al1.isEmpty() && !ob.al3.isEmpty())||(!ob.al1.isEmpty() && !ob.al3.isEmpty() && ob.al3.get(0)<ob.al1.get(0))){
					if(ob.al1.isEmpty()) ob.al1.add(ob.al3.remove(0));
					else ob.al1.add(0,ob.al3.remove(0));
					draw();
				}
				else
					JOptionPane.showMessageDialog(null, "Not Possible");
			}
		});
		
		
		
		btnNewButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((ob.al2.isEmpty() && !ob.al3.isEmpty()) || (!ob.al2.isEmpty() && !ob.al3.isEmpty() && ob.al3.get(0)<ob.al2.get(0))){
					if(ob.al2.isEmpty()) ob.al2.add(ob.al3.remove(0));
					else ob.al2.add(0,ob.al3.remove(0));
					draw();
				}
				else
					JOptionPane.showMessageDialog(null, "Not Possible");
			}
		});	
	}
}
