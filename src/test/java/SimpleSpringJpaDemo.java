
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.gpteam.applist.module.entity.AppInfo;
import com.gpteam.applist.module.entity.User;
import com.gpteam.applist.module.service.AppInfoService;
import com.gpteam.applist.module.service.UserService;

/**
 * Author:ZhangJianPing Time:11-9-4,下午8:57
 */
public class SimpleSpringJpaDemo {
	public static void main(String[] args) {
		System.out.println("start");
		String url = "E:\\Eric\\workspace\\java\\applist\\src\\main\\webapp\\WEB-INF\\applist-servlets.xml";
		ApplicationContext ctx = new FileSystemXmlApplicationContext(url);
		UserService userService = ctx.getBean("userService", UserService.class);
		User user = new User();
		user.setUserName("GG");
		User savedUser = userService.create(user);
		int id = savedUser.getId();
		System.out.println(id);
		User retrieveUser = userService.retrieve(id);
		System.out.println(retrieveUser.getId());
		AppInfoService ais = ctx.getBean("appInfoService", AppInfoService.class);
		AppInfo appInfo = new AppInfo();
		appInfo.setAppName("L");
		appInfo.setBusinessUnit("LL");
		appInfo.setEnviroment("LLL");
		AppInfo appInfo2 = new AppInfo();
		appInfo2.setAppName("P");
		appInfo2.setBusinessUnit("PP");
		appInfo2.setEnviroment("PPP");
		AppInfo appInfo3 = new AppInfo();
		appInfo3.setAppName("Z");
		appInfo3.setBusinessUnit("ZZ");
		appInfo3.setEnviroment("ZZZ");
		ais.save(appInfo);
		ais.save(appInfo2);
		ais.save(appInfo3);

		Iterable<AppInfo> findAll = ais.findAll();
		for (AppInfo a : findAll) {
			System.out.println(a.getAppName());
		}

		System.out.println("-------");
		List<AppInfo> findList = ais.findList("Z%Z", null, "%");
		for (AppInfo a : findList) {
			System.out.println(a.getAppName());
		}

	}
}
