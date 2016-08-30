package base;

import java.util.Set;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;
import redis.clients.jedis.Response;
import redis.clients.jedis.Transaction;

public class BaseDemo2 {
	
	//һ��ִ��һ��redis����
	@Test
	public void testPipeline(){
		Jedis redis = new Jedis("127.0.0.1", 6379);
		Pipeline p = redis.pipelined();
		p.set("employee.name", "liuchuanwei");
		p.sadd("employee.books", "java");	//������򼯺�Ԫ��
		p.sadd("employee.books", "mysql");
		p.sadd("employee.books", "php");
		Response<String> name = p.get("employee.name");
		Response<Set<String>> res_books = p.smembers("employee.books");	//��ȡ���򼯺��е�����Ԫ��
		p.sync();
		
		Set<String> books = res_books.get();
		System.out.println("employee.name : " + name);
		System.out.println("employee.books : " + books);
	}
	
	//����
	@Test
	public void testTransactions(){
		Jedis redis = new Jedis("127.0.0.1", 6379);
		
		Transaction t = redis.multi();	//��������
		Response<String> name = t.get("employee.name");
		t.sadd("employee.books", "����Ħ˹̽��ȫ��");
		Response<Set<String>> books = t.smembers("employee.books");
		t.exec();					//�ύ����
		
		System.out.println("exec֮���name : " + name);
		System.out.println("exec֮���books : " + books.get());
	}
	//��������
	@Test
	public void testPubSub(){
		
	}
}
