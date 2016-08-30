package base;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import redis.clients.jedis.Jedis;

/**
 * ����������test������ֱ����redis-cli��ϰ��һͨ��ͨ
 * @author liuc
 * @date 2016��8��3��
 */
public class BaseDemo1 {
	//��������
	@Test
	public  void testConn(){
		//���ӵ����ص� redis ����
		Jedis redis = new Jedis("127.0.0.1");
//		redis.auth("123456");	//��֤����
		//�鿴�����Ƿ���������
		System.out.println("Redis Server is running: " + redis.ping());
	}
	@Test
	public  void testStoreString(){
		Jedis redis = new Jedis("127.0.0.1");
		//���� redis �ַ�������
		redis.set("name", "lhat");
		//��ȡ�洢�����ݲ����
		System.out.println("Stored string in redis:: " + redis.get("name"));
	}
	@Test
	public  void testStoreList(){
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
	public  void testGetAllKeys(){
		Jedis redis = new Jedis("127.0.0.1");
		
		Set<String> allKeys = redis.keys("*");
		for(String key : allKeys ){
			System.out.println("Store Key in redis:: " + key);
		}
	}
	
}
