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

public class AnalyseDate extends JFrame implements ActionListener,FocusListener{

	private JLabel jl_source;
	private JComboBox<String> jcb_source;
	private JLabel jl_code;
	private JComboBox<String> jcb_code;
	private JLabel jl_startTime;
	private JLabel jl_endTime;
	private JLabel jl_shape;
	private JTextField jtf_st;
	private JTextField jtf_et;
	private JComboBox<String> jcb_shape;
	private JButton jbu_yes;
	private JButton jbu_no;
	private JLabel jl_calc;
	private JComboBox<String> jcb_calc;
	
	public AnalyseDate() {
		// TODO Auto-generated constructor stub
		setLayout(null);
        setTitle("分析数据");// 窗口标题
        setSize(370, 500);// 窗口大小
        setBackground(Color.gray);//设置背景颜色
        setLocationRelativeTo(null);// 窗口居于屏幕中央
//        setDefaultCloseOperation(EXIT_ON_CLOSE);// 点击关闭窗口后退出jvm虚拟机
        getContentPane().setLayout(new BorderLayout(10, 10));// 边界布局,水平间距10,垂直间距10
        setResizable(false);//设置使得用户不能改变窗口大小
        
        // 主要面板的初始化
        initPanel("逐笔数据");
	}
	
	
	
	public AnalyseDate(String source){
		setLayout(null);
        setTitle("分析数据");// 窗口标题
        setSize(370, 500);// 窗口大小
        setBackground(Color.gray);//设置背景颜色
        setLocationRelativeTo(null);// 窗口居于屏幕中央
//        setDefaultCloseOperation(EXIT_ON_CLOSE);// 点击关闭窗口后退出jvm虚拟机
        getContentPane().setLayout(new BorderLayout(10, 10));// 边界布局,水平间距10,垂直间距10
 
        // 主要面板的初始化
        initPanel(source);
	}

	//面板初始化
	private void initPanel(String source) {
		// TODO Auto-generated method stub
		JPanel jp = new JPanel();
        jp.setLayout(null);
        
        jl_source = new JLabel("数据选择 ：");
        jl_source.setBounds(30, 50, 100, 25);
        jcb_source = new JComboBox<>();
        jcb_source.setBounds(110, 50, 150, 25);
        jcb_source.addItem("逐笔数据");
        jcb_source.addItem("分钟数据");
        jcb_source.addItem("分笔数据");
        jcb_source.addItem("分笔数据");
        jcb_source.setSelectedItem(source);
        
		jl_code = new JLabel("股票代码 ： ");
		jl_code.setBounds(30, 100, 100, 20);
		
//		jtf_code = new JTextField();
//		jtf_code.setBounds(130, 50, 150, 20);
//		jtf_code.addFocusListener(this);
		jcb_code = new JComboBox<String>();
		jcb_code.setBounds(110, 100, 150, 20);
		//设置下拉框可以手动输入
		jcb_code.setEditable(true);
//		ConnectMongo toHFTD2 = new ConnectMongo("127.0.0.1",27017,"HFTD2");
//		MongoIterable<String> codes = toHFTD2.getMongodb().listCollectionNames();
//		for(String s:codes){
//			jcb_code.addItem(s);
//		}
//		toHFTD2.Mongoclose();
		
		jl_startTime = new JLabel("起始时间 ： ");
		jl_startTime.setBounds(30, 150, 100, 20);
		
		// 定义起始时间日历控件面板类  
		jtf_st = new JTextField();
		jtf_st.setBounds(110, 150, 150, 20);
        CalendarPanel start = new CalendarPanel(jtf_st, "yyyy-MM-dd");  
        start.initCalendarPanel();  
        JLabel jl_st = new JLabel("日历面板");  
        start.add(jl_st);
		
		jl_endTime = new JLabel("终止时间 ： ");
		jl_endTime.setBounds(30, 200, 100, 20);
		
		// 定义终止时间日历控件面板类  
		jtf_et = new JTextField();
		jtf_et.setBounds(110, 200, 150, 20);
		CalendarPanel end = new CalendarPanel(jtf_et, "yyyy-MM-dd");  
		end.initCalendarPanel();  
	    JLabel jl_et = new JLabel("日历面板");  
	    end.add(jl_et);
		
	    jl_calc = new JLabel("计算指标 ：  ");
	    jl_calc.setBounds(30, 250, 100, 20);
	    
	    jcb_calc = new JComboBox<String>();
	    jcb_calc.setBounds(110, 250, 150, 20);
	    jcb_calc.setEditable(true);//可手动输入
	    jcb_calc.addItem(" 总成交量 ");
	    jcb_calc.addItem(" 总成交额 ");
	    jcb_calc.addItem(" ETC ");
	    jcb_calc.addActionListener(this);
	    
	    
		jl_shape = new JLabel("图形选择 ： ");
		jl_shape.setBounds(30, 300, 100, 20);
		
		jcb_shape = new JComboBox<String>();
		jcb_shape.setBounds(110, 300, 150, 20);
		jcb_shape.setEditable(true);//可手动输入
		jcb_shape.addItem(" 饼    图  ");
		jcb_shape.addItem(" 直方图  ");
		jcb_shape.addItem(" 折线图  ");
		jcb_shape.addFocusListener(this);
		jcb_shape.addActionListener(this);
		
		jbu_yes = new JButton("确定");
		jbu_yes.setBounds(30, 370, 90, 20);
		jbu_yes.addActionListener(this);
		
		jbu_no = new JButton("取消");
		jbu_no.setBounds(180, 370, 90, 20);
		jbu_no.addActionListener(this);
		
		jp.add(jl_source);
		jp.add(jcb_source);
		jp.add(jl_code); 
		jp.add(jl_startTime);
		jp.add(jl_endTime);
		jp.add(jl_shape);
//		jp.add(jtf_code);
		jp.add(jcb_code);
		jp.add(jcb_shape);
		jp.add(jbu_no);
		jp.add(jbu_yes);
		getContentPane().add(start);
		jp.add(jtf_st);
		getContentPane().add(end);
		jp.add(jtf_et);
		jp.add(jl_calc);
		jp.add(jcb_calc);
		
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
	
		String cmd = e.getActionCommand();//根据命令来区分不同的操作
		
		if(cmd.equals("确定")){
			String start = jtf_st.getText();
			String[] s1 = start.split("-");
			StringBuffer sbu = new StringBuffer();
			sbu.append(s1[0]);
			sbu.append(s1[1]);
			sbu.append(s1[2]);
			start = sbu.toString();
			
			String end = jtf_et.getText();
			String[] s2 = end.split("-");
			StringBuffer sbu2 = new StringBuffer();
			sbu2.append(s2[0]);
			sbu2.append(s2[1]);
			sbu2.append(s2[2]);
			end = sbu2.toString();
			
			System.out.println(start+"---"+end);
			
			if(Integer.parseInt(end)<Integer.parseInt(start)){
				JOptionPane.showMessageDialog(this, "  截止时间无效 ！  ");
			}else if(jcb_code.getSelectedItem()==null){
				JOptionPane.showMessageDialog(this, "  请选择一只股票 ！  ");
			}else {
				
			}
		}
		
		if(cmd.equals("取消")){
			dispose();
		}
	}
	
	
}
