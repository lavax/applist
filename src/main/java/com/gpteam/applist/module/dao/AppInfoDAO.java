package com.gpteam.applist.module.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gpteam.applist.module.entity.AppInfo;

@Repository
public interface AppInfoDAO extends CrudRepository<AppInfo, Integer> {
	public List<AppInfo> findByEnviroment(String enviroment);

	public List<AppInfo> findByBusinessUnit(String businessUnit);

	public List<AppInfo> findByAppName(String appName);

	@Query("from AppInfo a where a.enviroment like :enviroment and a.businessUnit like :businessUnit and a.appName like :appName")
	public List<AppInfo> findList(@Param("enviroment") String enviroment, @Param("businessUnit") String businessUnit,
			@Param("appName") String appName);
}
