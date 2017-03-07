package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class UpdateData extends JFrame implements ActionListener,FocusListener{

	private JLabel jl_dbName;
	private JComboBox<String> jcb_dbName;
	private JLabel jl_file;
	private JFileChooser jf_chooser;
	private JLabel jl_type;
	private JComboBox<String> jcb_type;
	private JButton jbu_yes;
	private JButton jbu_no;
	
	public UpdateData() {
		
		// TODO Auto-generated constructor stub
		setLayout(null);
		setTitle("���ݸ���");// ���ڱ���
		setSize(300, 250);// ���ڴ�С
		setBackground(Color.gray);//���ñ�����ɫ
		setLocationRelativeTo(null);// ���ھ�����Ļ����
//		setDefaultCloseOperation(EXIT_ON_CLOSE);// ����رմ��ں��˳�jvm�����
		getContentPane().setLayout(new BorderLayout(10, 10));// �߽粼��,ˮƽ���10,��ֱ���10
		setResizable(false);//����ʹ���û����ܸı䴰�ڴ�С
		
		// ��Ҫ���ĳ�ʼ��
		initPanel();
	}
	

	private void initPanel() {
		// TODO Auto-generated method stub
		
		JPanel jp = new JPanel();
		
		jl_dbName = new JLabel("����Դ���� ��");
		jl_dbName.setBounds(30, 40, 90, 25);
		jcb_dbName = new JComboBox<>();
		jcb_dbName.addItem("�������");
		jcb_dbName.addItem("�ֱ�����");
		jcb_dbName.addItem("��������");
		jcb_dbName.addItem("��Ƶ����");
		jcb_dbName.setBounds(110, 40, 150, 25);
		jcb_dbName.addActionListener(this);
		
		jl_file = new JLabel("�ļ�    λ�� ��");
		jl_file.setBounds(30, 75, 90, 25);
//		jf_chooser = new JFileChooser();
//		//���˵��ļ�����
//		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
//		jf_chooser.setFileFilter(filter);
//		jf_chooser.setBounds(110, 75, 150, 50);
//		jf_chooser.addActionListener(this);
		
		jl_type = new JLabel("�洢    ��ʽ ��");
		jl_type.setBounds(30, 110, 90, 25);
		jcb_type = new JComboBox<>();
		jcb_type.addItem("ֱ�Ӵ洢(���Ĵ洢)");
		jcb_type.addItem("���ļ��洢(proto���л�)");
		jcb_type.setBounds(110, 110, 150, 25);
		jcb_type.addActionListener(this);
		
		jbu_yes = new JButton("��  ��");
		jbu_yes.setBounds(50, 180, 90, 25);
		jbu_yes.addActionListener(this);
		
		jbu_no = new JButton("ȡ  ��");
		jbu_no.setBounds(150, 180, 90, 25);
		jbu_no.addActionListener(this);
		
		jp.add(jl_dbName);
		jp.add(jl_file);
		jp.add(jl_type);
		jp.add(jcb_dbName);
//		jp.add(jf_chooser);
		jp.add(jcb_type);
		jp.add(jbu_yes);
		jp.add(jbu_no);
		
		jp.setLayout(null);
        jp.setBounds(0,0,100,100);
        getContentPane().add(jp, BorderLayout.CENTER);
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
		
	}

	
	
}
