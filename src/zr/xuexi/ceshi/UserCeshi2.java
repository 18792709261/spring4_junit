package zr.xuexi.ceshi;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import zr.xuexi.bean.User2;

/**
 * 搭建spring和junit测试--通过配置文件创建
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)//创建spring容器和junit上下文
@ContextConfiguration("classpath:applicationContext.xml")//加载spring容器需要的配置文件创建容器
public class UserCeshi2 {
	
	@Resource(name="User2")//指定bean对象进行装配
	//@Autowired  //自动装备bean，对象
	private User2 u2;
	
	@Test
	public void fun1(){
		System.out.println(u2);
	}
}

