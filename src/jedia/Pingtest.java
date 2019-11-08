package jedia;

import static org.junit.Assert.*;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class Pingtest {
	
	@Test
	public void test() {
		Jedis jedis = new Jedis("192.168.220.188", 6379, 6000);
		String pong = jedis.ping();
		System.out.println(pong);
		jedis.close();
	}
}
