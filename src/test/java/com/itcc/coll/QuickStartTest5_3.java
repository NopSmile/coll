package com.itcc.coll;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Test;


/**
 * 单元测试用例执行顺序
 *
 */
public class QuickStartTest5_3 {



    @Test
    public void testAuthentication() {


        //创建SecurityManager工厂，通过配置文件ini创建
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:jdbcrealm.ini");

        SecurityManager securityManager = factory.getInstance();

        //将securityManager 设置到当前运行环境中
        SecurityUtils.setSecurityManager(securityManager);

        Subject subject = SecurityUtils.getSubject();

        //用户输入的账号密码
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("jack", "123");

        subject.login(usernamePasswordToken);

        //org.apache.shiro.realm.jdbc.JdbcRealm

        System.out.println(" 认证结果:"+subject.isAuthenticated());

        System.out.println(" 是否有对应的role1角色:"+subject.hasRole("role1"));

        System.out.println("是否有video:find权限:"+ subject.isPermitted("video:find"));

    }


    @Test
    public void test2(){
        DefaultSecurityManager securityManager = new DefaultSecurityManager();

        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://120.76.62.13:3606/xdclass_shiro?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false");
        ds.setUsername("test");
        ds.setPassword("Xdclasstest");


        JdbcRealm jdbcRealm = new JdbcRealm();
        jdbcRealm.setPermissionsLookupEnabled(true);
        jdbcRealm.setDataSource(ds);

        securityManager.setRealm(jdbcRealm);

        //将securityManager 设置到当前运行环境中
        SecurityUtils.setSecurityManager(securityManager);

        Subject subject = SecurityUtils.getSubject();

        //用户输入的账号密码
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("jack", "123");

        subject.login(usernamePasswordToken);


        System.out.println(" 认证结果:"+subject.isAuthenticated());

        System.out.println(" 是否有对应的role1角色:"+subject.hasRole("role1"));

        System.out.println("是否有video:find权限:"+ subject.isPermitted("video:find"));

        System.out.println("是否有任意权限:"+ subject.isPermitted("aaaa:xxxxxxxxx"));

    }





}
