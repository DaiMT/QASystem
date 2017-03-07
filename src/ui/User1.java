package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class User1 extends JFrame implements ActionListener,FocusListener{

	public User1(){
        // ----------�������Ե�����----------
//    	FlowLayout layout = new FlowLayout();
        setLayout(null);
        setTitle("����ϵͳ");// ���ڱ���
        setSize(600, 100);// ���ڴ�С
        setBackground(Color.gray);//���ñ�����ɫ
        setLocationRelativeTo(null);// ���ھ�����Ļ����
        setDefaultCloseOperation(EXIT_ON_CLOSE);// ����رմ��ں��˳�jvm�����
        getContentPane().setLayout(new BorderLayout(10, 10));// �߽粼��,ˮƽ���10,��ֱ���10
        setResizable(false);//����ʹ���û����ܸı䴰�ڴ�С
        
        // �˵��������ʼ��
        initMenu();
 
        // ��Ҫ���ĳ�ʼ��
        initPanel();
    }
	
	//��Ҫ���ĳ�ʼ������
	private void initPanel() {
		// TODO Auto-generated method stub
		JPanel jp = new JPanel();
        jp.setLayout(null);
        jp.setBounds(0,0,100,100);
        getContentPane().add(jp, BorderLayout.CENTER);
	}

	//�˵�����ʼ��������
	private void initMenu() {
		
        JMenuBar jmb = new JMenuBar();
        
        JMenu jm1 = new JMenu("ϵͳ");
        
        JMenuItem jmi102 = new JMenuItem(" * ע�� ");
        jmi102.addActionListener(this);
        JMenuItem jmi103 = new JMenuItem(" * �޸����� ");
        jmi103.addActionListener(this);
        JMenuItem jmi104 = new JMenuItem(" * ע�� ");
        jmi104.addActionListener(this);
        JMenuItem jmi105 = new JMenuItem(" * �˳� ");
        jmi105.addActionListener(this);
        jm1.add(jmi102);
        jm1.add(jmi103);
        jm1.add(jmi104);
        jm1.add(jmi105);
        
        JMenu jm2 = new JMenu("��������");
        
        JMenu jm201 = new JMenu(" * ���ݷ��� ");
        JMenuItem searchHFTD = new JMenuItem(" ** ������� ");
        searchHFTD.addActionListener(this);
        JMenuItem searchPMDB = new JMenuItem(" ** �������� ");
        searchPMDB.addActionListener(this);
        JMenuItem searchTKDB = new JMenuItem(" ** �ֱ����� ");
        searchTKDB.addActionListener(this);
        JMenuItem searchPDDB = new JMenuItem(" ** ��Ƶ���� ");
        searchPDDB.addActionListener(this);
        
        jm201.add(searchHFTD);
        jm201.add(searchPMDB);
        jm201.add(searchPDDB);
        jm201.add(searchTKDB);
        
        jm2.add(jm201);
        
        JMenu jm3 = new JMenu("����");
        JMenuItem help = new JMenuItem(" * ���� ");
        help.addActionListener(this);
        JMenuItem illustration = new JMenuItem(" * ˵�� ");
        illustration.addActionListener(this);
        
        jm3.add(help);
        jm3.add(illustration);
        
        jmb.add(jm1);
        jmb.add(jm2);
        jmb.add(jm3);
        setJMenuBar(jmb);//���ò˵���   
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String cmd = e.getActionCommand();
		
		if(cmd.equals(" * ע�� ")){
			new Register().setVisible(true);
		}
		
        if(cmd.equals(" * �޸����� ")){
        	new ChangePassord().setVisible(true);
        }
        
        if(cmd.equals(" * ע�� ")){
        	int m = JOptionPane.showConfirmDialog(null," ȷ��ע�����˺ţ� ","ɾ��",JOptionPane.YES_NO_OPTION);
        	if(m==0){
        		dispose();
        		new Login().setVisible(true);
        	}
        }
        
        if(cmd.equals(" * �˳� ")){
        	System.exit(0);
        }
        
        if(cmd.equals(" ** ������� ")){
        	new AnalyseDate("�������").setVisible(true);
        }
        
        if(cmd.equals(" ** �������� ")){
        	new AnalyseDate("��������").setVisible(true);
        }
        
        if(cmd.equals(" ** �ֱ����� ")){
        	new AnalyseDate("�ֱ�����").setVisible(true);
        }
        
        if(cmd.equals(" ** ��Ƶ���� ")){
        	new AnalyseDate("��Ƶ����").setVisible(true);
        }
		
	}
	
	
	
	
	
	
}
