package com.stackroute.util;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stackroute.entity.UserDto;

@Component
public class JsonUtil {
	
	//JSON->Obj
	public UserDto fromJson(String json) {
		try {
			return new ObjectMapper().readValue(json, UserDto.class);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
}
