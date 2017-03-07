package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Register extends JFrame implements ActionListener,FocusListener{

	private static final long serialVersionUID = 1L;
	private JLabel jl_haveto;
    private JLabel jl_nothaveto;
    private JTextField tf_name;
    private JTextField tf_pass;
    private JTextField tf_pass_again;
	private JLabel jl_name;
	private JLabel jl_pass;
	private JLabel jl_pass_again;
	private JLabel jl_role;
	private JComboBox<String> jcb_role;
    private JButton jbu_yes;
    private JButton jbu_no;
    
    public Register(){
        // ----------�������Ե�����----------
        setLayout(null);
        setTitle("ע��");// ���ڱ���
        setSize(370,350);// ���ڴ�С
        setBackground(Color.gray);//���ñ�����ɫ
        setLocationRelativeTo(null);// ���ھ�����Ļ����
//        setDefaultCloseOperation(EXIT_ON_CLOSE);// ����رմ��ں��˳�jvm�����
        getContentPane().setLayout(new BorderLayout(10, 10));// �߽粼��,ˮƽ���10,��ֱ���10
        setResizable(false);//����ʹ���û����ܸı䴰�ڴ�С
        
        // �˵��������ʼ��
//        initMenu();
 
        // ��Ҫ���ĳ�ʼ��
        initPanel();
    }
    
    private void initPanel() {
    	
        JPanel jp = new JPanel();
        jp.setLayout(null);
        
        jl_haveto = new JLabel("  *   ������    ----------");
        jl_haveto.setBounds(30,30,200,30);
        
//        jl_haveto.setPreferredSize(new Dimension(200, 30));
        
        jl_name = new JLabel("��         �� �� ");
        jl_name.setBounds(50,80,100,25);
        
        tf_name = new JTextField(30);
        tf_name.setBounds(120,80,150,25);
        tf_name.addFocusListener(this);// ��ӽ�����Ӧ
        
        jl_pass = new JLabel("��         �� �� ");
        jl_pass.setBounds(50, 120, 100, 25);
        
        tf_pass = new JTextField();
        tf_pass.setBounds(120, 120, 150, 25);
        tf_pass.addActionListener(this);
        
        jl_pass_again = new JLabel("ȷ������ �� ");
        jl_pass_again.setBounds(50, 160, 100, 25);
        
        tf_pass_again = new JTextField();
        tf_pass_again.setBounds(120, 160, 150, 25);
        tf_pass_again.addActionListener(this);
        
        jl_role = new JLabel("��         ɫ �� ");
        jl_role.setBounds(50, 200, 100, 25);
        
        jcb_role = new JComboBox<String>();
        jcb_role.addItem("��ͨ�û�");
        jcb_role.addItem("����Ա");
        jcb_role.setBounds(120, 200, 150, 25);
        
        jl_nothaveto = new JLabel("  *  ѡ����     ----------");
        jl_nothaveto.setBounds(30,260,200,30);
        
        jbu_yes = new JButton("ע��");
        jbu_yes.setBounds(60,260,80,25);
        jbu_yes.addActionListener(this);// ��Ӷ�����Ӧ     ��½��ť
        jbu_yes.addFocusListener(this);// ��ӽ�����Ӧ        ��½��ť
        
        jbu_no = new JButton("ȡ��");
        jbu_no.setBounds(200,260,80,25);
        jbu_no.addActionListener(this);// ��Ӷ�����Ӧ	ע�ᰴť
        jbu_no.addFocusListener(this);// ��ӽ�����Ӧ	ע�ᰴť

        jp.add(jl_name);
        jp.add(tf_name);
        jp.add(jl_haveto);
//        jp.add(jl_nothaveto);
        jp.add(jbu_yes);
        jp.add(jbu_no);
        jp.add(jl_pass);
        jp.add(jl_pass_again);
        jp.add(tf_pass);
        jp.add(tf_pass_again);
        jp.add(jl_role);
        jp.add(jcb_role);
        
        getContentPane().add(jp, BorderLayout.CENTER);
 
    }
    
    // ������Ӧ����
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();//�������������ֲ�ͬ�Ĳ���
        if (cmd.equals("ȡ��")) {
//            System.exit(0);
        	dispose();
        }
        if (cmd.equals("ע��")) {
        	
            JOptionPane.showMessageDialog(this, "ע��ɹ���");
        }
    }
 
    // ������Ӧ����
    public void focusGained(FocusEvent e) {//��ý���

    }
 
    public void focusLost(FocusEvent e) {//ʧȥ����

    }
    
    
	
}
