package base;

import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class BaseDemo1 {
	public static void main(String[] args){
		testConn();
		System.out.println("------------------------");
		testStoreString();
//		System.out.println("------------------------");
//		testStoreList();
		System.out.println("------------------------");
		testGetAllKeys();
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
	public static void testStoreList(){
		Jedis redis = new Jedis("127.0.0.1");
		
		//�洢���ݵ��б���
		redis.lpush("demo-list", "redis");
		redis.lpush("demo-list", "java");
		redis.lpush("demo-list", "study");
		
		//�����洢�����ݲ����
		List<String> list = redis.lrange("demo-list", 0, 10);
		System.out.println("Stored list in redis:: " + list );
	}
	
	//��ȡ�洢�� redis �е�����key
	public static void testGetAllKeys(){
		Jedis redis = new Jedis("127.0.0.1");
		
		Set<String> allKeys = redis.keys("*");
		for(String key : allKeys ){
			System.out.println("Store Key in redis:: " + key);
		}
	}
	
}
