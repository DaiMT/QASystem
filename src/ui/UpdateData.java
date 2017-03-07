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
		setTitle("数据更新");// 窗口标题
		setSize(300, 250);// 窗口大小
		setBackground(Color.gray);//设置背景颜色
		setLocationRelativeTo(null);// 窗口居于屏幕中央
//		setDefaultCloseOperation(EXIT_ON_CLOSE);// 点击关闭窗口后退出jvm虚拟机
		getContentPane().setLayout(new BorderLayout(10, 10));// 边界布局,水平间距10,垂直间距10
		setResizable(false);//设置使得用户不能改变窗口大小
		
		// 主要面板的初始化
		initPanel();
	}
	

	private void initPanel() {
		// TODO Auto-generated method stub
		
		JPanel jp = new JPanel();
		
		jl_dbName = new JLabel("数据源类型 ：");
		jl_dbName.setBounds(30, 40, 90, 25);
		jcb_dbName = new JComboBox<>();
		jcb_dbName.addItem("逐笔数据");
		jcb_dbName.addItem("分笔数据");
		jcb_dbName.addItem("分钟数据");
		jcb_dbName.addItem("日频数据");
		jcb_dbName.setBounds(110, 40, 150, 25);
		jcb_dbName.addActionListener(this);
		
		jl_file = new JLabel("文件    位置 ：");
		jl_file.setBounds(30, 75, 90, 25);
//		jf_chooser = new JFileChooser();
//		//过滤掉文件类型
//		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
//		jf_chooser.setFileFilter(filter);
//		jf_chooser.setBounds(110, 75, 150, 50);
//		jf_chooser.addActionListener(this);
		
		jl_type = new JLabel("存储    方式 ：");
		jl_type.setBounds(30, 110, 90, 25);
		jcb_type = new JComboBox<>();
		jcb_type.addItem("直接存储(明文存储)");
		jcb_type.addItem("流文件存储(proto序列化)");
		jcb_type.setBounds(110, 110, 150, 25);
		jcb_type.addActionListener(this);
		
		jbu_yes = new JButton("上  传");
		jbu_yes.setBounds(50, 180, 90, 25);
		jbu_yes.addActionListener(this);
		
		jbu_no = new JButton("取  消");
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
