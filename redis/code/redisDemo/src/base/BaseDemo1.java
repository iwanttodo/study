package base;

import redis.clients.jedis.Jedis;

public class BaseDemo1 {
	public static void main(String[] args){
		testConn();
		System.out.println("------------------------");
		testStoreString();
	}
	//��������
	public static void testConn(){
		//���ӵ����ص� redis ����
		Jedis redis = new Jedis("127.0.0.1");
		
		//�鿴�����Ƿ���������
		System.out.println("Redis Server is running: " + redis.ping());
	}
	
	public static void testStoreString(){
		Jedis redis = new Jedis("127.0.0.1");
		
		//���� redis �ַ�������
		redis.set("name", "lhat");
		//��ȡ�洢�����ݲ����
		System.out.println("Stored string in redis:: " + redis.get("name"));
	}
}
