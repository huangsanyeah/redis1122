package com.atguigu.redis.test;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class TestAPI {
	public static void main(String[] args) 
	{
		Jedis jedis = new Jedis("127.0.0.1",6379);
		jedis.auth("pass123");
		//先登录 才能select
		jedis.select(11);
		System.out.println(jedis.ping());
		
		jedis.set("k1","v1");
		jedis.set("k2","v2");
		jedis.set("k3","v3");
		
		
		System.out.println(jedis.get("k3"));
		
		Set<String> sets = jedis.keys("*");
		System.out.println(sets.size());
		
		//后续请参考脑图，家庭作业，敲一遍......
	}
}
