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

public class AdminPage1 extends JFrame implements ActionListener,FocusListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AdminPage1(){
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
        
        JMenu jm101 =new JMenu(" * ���ݿ���� ");
        JMenuItem addDB = new JMenuItem(" ** ������ݿ� ");
        addDB.addActionListener(this);
        JMenuItem deleteDB = new JMenuItem(" ** ɾ�����ݿ� ");
        deleteDB.addActionListener(this);
        JMenuItem setDB = new JMenuItem(" ** �������ݿ� ");
        setDB.addActionListener(this);
        jm101.add(addDB);
        jm101.add(deleteDB);
        jm101.add(setDB);
        jm1.add(jm101);
        
        JMenu jm102 = new JMenu(" * �û����� ");
        JMenuItem deleteUser = new JMenuItem(" ** ɾ���û� ");
        deleteUser.addActionListener(this);
        JMenuItem updateUser = new JMenuItem(" ** �޸��û� ");
        updateUser.addActionListener(this);
        JMenuItem searchUser = new JMenuItem(" ** ��ѯ�û� ");
        searchUser.addActionListener(this);
        jm102.add(deleteUser);
        jm102.add(updateUser);
        jm102.add(searchUser);
        jm1.add(jm102);
        
        JMenuItem jmi103 = new JMenuItem(" * �޸����� ");
        jmi103.addActionListener(this);
        JMenuItem jmi104 = new JMenuItem(" * ע�� ");
        jmi104.addActionListener(this);
        JMenuItem jmi105 = new JMenuItem(" * �˳� ");
        jmi105.addActionListener(this);
        jm1.add(jmi103);
        jm1.add(jmi104);
        jm1.add(jmi105);
        
        JMenu jm2 = new JMenu("��������");
        
        JMenuItem jmi201 = new JMenuItem(" * ���ݷ��� ");
        jmi201.addActionListener(this);
        JMenuItem jmi202 = new JMenuItem(" * ���ݸ��� ");
        jmi202.addActionListener(this);
        JMenuItem jmi203 = new JMenuItem(" * ����ɾ�� ");
        jmi203.addActionListener(this);
        JMenuItem jmi204 = new JMenuItem(" * ���ݵ��� ");
        jmi204.addActionListener(this);
        
//        JMenu jm201 = new JMenu(" * ���ݷ��� ");
//        JMenuItem searchHFTD = new JMenuItem(" ** ����������� ");
//        searchHFTD.addActionListener(this);
//        JMenuItem searchPMDB = new JMenuItem(" ** ������������ ");
//        searchPMDB.addActionListener(this);
//        JMenuItem searchTKDB = new JMenuItem(" ** �����ֱ����� ");
//        searchTKDB.addActionListener(this);
//        JMenuItem searchPDDB = new JMenuItem(" ** ������Ƶ���� ");
//        searchPDDB.addActionListener(this);
//        
//        jm201.add(searchHFTD);
//        jm201.add(searchPMDB);
//        jm201.add(searchPDDB);
//        jm201.add(searchTKDB);
        
//        JMenu jm202 = new JMenu(" * ���ݸ��� ");
//        JMenuItem updateHFTD = new JMenuItem(" ** �ϴ�������� ");
//        updateHFTD.addActionListener(this);
//        JMenuItem updatePMDB = new JMenuItem(" ** �ϴ��������� ");
//        updatePMDB.addActionListener(this);
//        JMenuItem updateTKDB = new JMenuItem(" ** �ϴ��ֱ����� ");
//        updateTKDB.addActionListener(this);
//        JMenuItem updatePDDB = new JMenuItem(" ** �ϴ���Ƶ���� ");
//        updatePDDB.addActionListener(this);
        
//        jm202.add(updateHFTD);
//        jm202.add(updatePMDB);
//        jm202.add(updatePDDB);
//        jm202.add(updateTKDB);
        
//        JMenu jm203 = new JMenu(" * ����ɾ�� ");
//        JMenuItem deleteHFTD = new JMenuItem(" ** ɾ��������� ");
//        deleteHFTD.addActionListener(this);
//        JMenuItem deletePMDB = new JMenuItem(" ** ɾ���������� ");
//        deletePMDB.addActionListener(this);
//        JMenuItem deleteTKDB = new JMenuItem(" ** ɾ���ֱ����� ");
//        deleteTKDB.addActionListener(this);
//        JMenuItem deletePDDB = new JMenuItem(" ** ɾ����Ƶ���� ");
//        deletePDDB.addActionListener(this);
        
//        jm203.add(deleteHFTD);
//        jm203.add(deletePMDB);
//        jm203.add(deletePDDB);
//        jm203.add(deleteTKDB);
//        
//        JMenu jm204 = new JMenu(" * ���ݵ��� ");
//        JMenuItem getHFTD = new JMenuItem(" ** ɾ��������� ");
//        getHFTD.addActionListener(this);
//        JMenuItem getPMDB = new JMenuItem(" ** ɾ���������� ");
//        getPMDB.addActionListener(this);
//        JMenuItem getTKDB = new JMenuItem(" ** ɾ���ֱ����� ");
//        getTKDB.addActionListener(this);
//        JMenuItem getPDDB = new JMenuItem(" ** ɾ����Ƶ���� ");
//        getPDDB.addActionListener(this);
        
//        jm204.add(getHFTD);
//        jm204.add(getPMDB);
//        jm204.add(getPDDB);
//        jm204.add(getTKDB);
        
//        jm2.add(jm201);
//        jm2.add(jm202);
//        jm2.add(jm203);
//        jm2.add(jm204);
        
        jm2.add(jmi201);
        jm2.add(jmi202);
        jm2.add(jmi203);
        jm2.add(jmi204);
        
        
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

	@Override//��ý��㴦��
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override//ʧȥ���㴦��
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override//������Ӧ����
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String cmd = e.getActionCommand();//�������������ֲ�ͬ�Ĳ���
        
        if(cmd.equals(" ** ������ݿ� ")){
//        	String[] args = {"navicat.exe","D:\\MySQL Datafiles\\Navicat Premium"}
//        	Runtime.getRuntime().exec(args);
        }
        
        if(cmd.equals(" ** ������ݿ� ")){
        	
        }

        if(cmd.equals(" ** ɾ�����ݿ� ")){
        	
        }
        
        if(cmd.equals(" ** �������ݿ� ")){
        	
        }
        
        if(cmd.equals(" ** ��ѯ�û� ")){
        	
        }
        
        if(cmd.equals(" ** �޸��û� ")){
        	
        }
        
        if(cmd.equals(" ** ɾ���û� ")){
        	
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
        
        if(cmd.equals(" * ���ݷ��� ")){
        	new AnalyseDate().setVisible(true);
        }
        
        if(cmd.equals(" * ���ݸ��� ")){
        	new UpdateData().setVisible(true);
        }
        
        if(cmd.equals(" * ����ɾ�� ")){
        	
        }
        
        if(cmd.equals(" * ���ݵ��� ")){
        	
        }
        
        
        


        
        
        
        
        
	}
	
}
