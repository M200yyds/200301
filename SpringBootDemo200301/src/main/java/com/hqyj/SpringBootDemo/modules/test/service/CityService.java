package com.hqyj.SpringBootDemo.modules.test.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.hqyj.SpringBootDemo.modules.test.entity.City;

public interface CityService {

	List<City> getCitiesByCountryId(int countryId);
	
	City getCityByName(String cityName, String localCityName);
	
	PageInfo<City> getCitiesByPage(int currentPage, int pageSize, int countryId);
}
