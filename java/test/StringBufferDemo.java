
public class StringBufferDemo{
	public static void main(String[] args){
		
		//������StringBuffer����ʱ��ϵͳΪ���������ڴ���Զ���չ������������������
		
		//Ĭ�Ϲ�������ϵͳ�Զ�������������ϵͳ����Ĭ����16
		StringBuffer sb1 = new StringBuffer();
		System.out.println("StringBuffer sb1�ĳ�ʼ����:" + sb1.capacity());	//16
		System.out.println("StringBuffer sb1�ĳ�ʼ����:" + sb1.length());	//0
		
		
		// new StringBuffer(int x) x����StringBuffer������
		StringBuffer sb2 = new StringBuffer(100);		
		System.out.println("StringBuffer sb2�ĳ�ʼ����:" + sb2.capacity());
		
		//��֤StringBuffer����С����
		sb2.ensureCapacity(160);
		System.out.println("String sb2����������:" + sb2.capacity());	//202
	}
}