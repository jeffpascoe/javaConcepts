package javaServletExample;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class JsonWrapper {

	public JsonObject createValidJsonResponse(String name) {
		
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("name", name);;
		return jsonObject;
	}

}
