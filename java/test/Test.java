
public class Test{
	public static void main(String[] args){
		// testBitCalc();
		testInitArray();
		// testSubString();
		// testEquals();
		// testConstantPool();
	}
	
	static void testConstantPool(){
		int i1 = 1;
		int i2 = 1;
		System.out.println(i1==i2);			//true
		
		int i3 = 128;
		int i4 = 128;
		System.out.println(i3==i4);			//true
		
		Integer int1 = 1;
		Integer int2 = 1;
		System.out.println(int1==int2);		//true
		
		Integer int3 = 128;
		Integer int4 = 128;
		System.out.println(int3==int4);		//false
	}
	//equals�Ƚϵ���ֵ��==�Ƚϵ������õ�ַ
	static void testEquals(){
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1.equals(str2));	//true
		System.out.println(str1==str2);			//true
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str3.equals(str4));	//true
		System.out.println(str3==str4);			//false
	}
	
	//String.substring(fromIndex, endIndex)�ķ�Χ�� [)
	static void testSubString(){
		String str = "yishanggu";
		String smallStr = str.substring(1, 4);	//[)
		System.out.println(smallStr);
	}
	//��ʼ������
	static void testInitArray(){
		//��̬��ʼ����������ʱͬʱ����ռ䲢��ֵ
		int[] arr11 = new int[]{1,3,6};
		int[] arr12 = {2,4,6};
		System.out.println("--��̬��ʼ��--");
		for(int i=0; i<arr11.length; i++){
			System.out.print(arr11[i] + " ");
		}
		
		//��̬��ʼ�������������ͷ���ռ䡢��ֵ�ֿ�����
		int[] arr13;
		arr13 = new int[3]{1,3,9};
		System.out.println("\n--��̬��ʼ��--");
		for(int i=0; i<arr13.length; i++){
			System.out.print(arr13[i] + " ");
		}
		
		//Ĭ��(��ʽ)��ʼ��
		int[] arr14 = new int[5];
		System.out.println("\n--Ĭ��(��ʽ)��ʼ��--");
		for(int i=0; i<arr14.length; i++){
			System.out.print(arr14[i] + " ");
		}
		
		//��ά����
		int[][] arr3 = new int[2][];
		// int[][] arr3 = new int[][];	//����
		arr3[0] = new int[]{2,0,8};
		arr3[1] = new int[]{1,4,7};
		System.out.println("\n--��ά����--");
		for(int i=0; i<arr3.length; i++){
			for(int j=0; j<arr3[i].length; j++){
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	//����λ����Ľ��,���ص��������͵�int
	static void testBitCalc(){
		int i=1;
		System.out.println(i&1);
	}
	//string.contains(CharSequence s);
	//CharSequence��һ���ӿڣ�����ʵ������String��StringBuilder��StringBuffer
	public static void testStringContains(){
		String str = "abcdefg";
		if(str.contains("abc")){
			System.out.println("����abc");
		}
	}
}