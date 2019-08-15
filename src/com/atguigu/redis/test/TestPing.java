package com.atguigu.redis.test;

import redis.clients.jedis.Jedis;

public class TestPing {
	public static void main(String[] args) 
	{
		Jedis jedis = new Jedis("127.0.0.1",6379);
		jedis.auth("pass123");
		jedis.select(11);
		System.out.println(jedis.ping());
	}
}
