package Config;

/**
 * ģ��˵���� ����
 * 
 */
public class AppConstants {
	// jdbc
	public static final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/stumangemant?useUnicode=true&amp;characterEncodeing=UTF-8&useSSL=false";
	public static final String JDBC_USERNAME = "root";
	public static final String JDBC_PASSWORD = "000000";
	public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	//ѧ�ţ��������Ա�Ժϵ��רҵ���༶�����ᣬ���䣬�绰
	// student field
	public static final String STUDENT_NAME = "����";
	public static final String STUDENT_SNO = "ѧ��";
	public static final String STUDENT_SEX = "�Ա�";
	public static final String STUDENT_DEPARTMETN = "Ժϵ";
	public static final String STUDENT_DEPART="רҵ";
	public static final String STUDENT_CLASS="�༶";
	public static final String STUDENT_HOMETOWN = "����";
	public static final String STUDENT_EMAIL = "�����ʼ�";
	public static final String STUDENT_TEL = "�绰";
	public static final String STUDENT_MARK = "ѧ��";

	// login view
	public static final String LOGIN_TITLE = "��¼����";
	public static final String LOGIN_USERNAME = "�û���";
	public static final String LOGIN_PASSWORD = "����";
	public static final String LOGIN = "��¼";
	public static final String RESET = "����";

	// main view
	public static final String MAINVIEW_TITLE = "ѧ����Ϣ����ϵͳ";
	
	public static final String MAINVIEW_PAGENUM_JLABEL_DI = "�� ";
	public static final String MAINVIEW_PAGENUM_JLABEL_YE = "/99 ҳ";
	public static final String MAINVIEW_FIND_JLABEL = "��ѯ���";
	public static final String MAINVIEW_FIRST = "��ҳ";
	public static final String MAINVIEW_LAST = "ĩҳ";
	public static final String MAINVIEW_PRE = "��һҳ";
	public static final String MAINVIEW_NEXT = "��һҳ";
	public static final String PARAM_FIND_CONDITION = "";
	public static final String PARAM_FIND = "����";
	public static final String PARAM_ADD = "����";
	public static final String PARAM_DELETE = "ɾ��";
	public static final String PARAM_UPDATE = "����";
	
	//score view
	    public static final String SCOREVIEW_TITLE = "ѧ���ɼ���Ϣ";
		public static final String STUDENT_CSNO = "ѧ��";
		public static final String STUDENT_CNAME = "����";
		public static final String STUDENT_JAVA = "Java�������";
		public static final String STUDENT_CHINESE= "����";
		public static final String STUDENT_ENGLISH = "����";
		public static final String STUDENT_MATH="��ѧ";
		public static final String STUDENT_MySQL="���ݿ�";
		public static final String STUDENT_C= "C���Գ������";
		

	// add view
	public static final String ADDVIEW_TITLE = "����ѧ����Ϣ";
	public static final String ADDVIEW_ADDBUTTON = "����";
	public static final String EXITBUTTON = "�˳�";

	// delete view
	public static final String DELETEVIEW_TITLE = "ɾ��ѧ����Ϣ";
	public static final String DELETEVIEW_DELETEBUTTON = "ɾ��";

	// update view
	public static final String UPDATEVIEW_TITLE = "����ѧ����Ϣ";
	public static final String UPDATEVIEW_UPDATEBUTTON = "����";

}