package zr.xuexi.ceshi;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import zr.xuexi.bean.User;

/**
 * 通过注解搭建spring和junit测试
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)//创建spring容器和junit上下文
@ContextConfiguration(classes=User.class)//加载spring容器需要的配置创建容器
public class UserCeshi {
	
	@Autowired//自动装配bean
	private User u;
	
	
	@Test
	public void fun1(){
		System.out.println(u);
	}
}

