package com.stackroute.util;

import org.springframework.stereotype.Component;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stackroute.entity.UserMq;

@Component
public class JsonUtil {
	
	//Obj->JSON
	public String toJson(UserMq user) {
		try {
			return new ObjectMapper().writeValueAsString(user);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

}
