package com.chris.demo;


import net.sf.json.JSONObject;

import com.chris.model.User;

public class AntDemo
{

	public static void main(String[] args)
	{
		User user = new User();
		user.setId(10);
		user.setName("General Patton");
		user.setAge(60);
		user.setGender("male");
		
		JSONObject json = JSONObject.fromObject(user);

		
		System.out.println(json.toString());
	}
	
}