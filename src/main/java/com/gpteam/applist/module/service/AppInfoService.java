package com.gpteam.applist.module.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gpteam.applist.module.dao.AppInfoDAO;
import com.gpteam.applist.module.entity.AppInfo;

@Service
public class AppInfoService {

	@Autowired
	private AppInfoDAO appInfoDAO;

	public AppInfo save(AppInfo appInfo) {
		return appInfoDAO.save(appInfo);
	}

	public AppInfo findOne(int id) {
		return appInfoDAO.findOne(id);
	}

	public Iterable<AppInfo> findAll() {
		return appInfoDAO.findAll();
	}

	public List<AppInfo> findList(String enviroment, String businessUnit, String appName) {
		return appInfoDAO.findList(enviroment, businessUnit, appName);
	}

	public AppInfo update(AppInfo newAppInfo) {
		// AppInfo oldAppInfo = findOne(newAppInfo.getId());
		return save(newAppInfo);
	}

	public void delete(int id) {
		appInfoDAO.delete(id);
	}

}
