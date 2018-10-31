package com.example.demo.elaticsearch;

import java.util.List;

public interface CityESService {
	
	void saveEntity(Entity entity);
	
	void saveEntity(List<Entity> entityList);
	
	List<Entity> searchEntity(String searchContent);
}
