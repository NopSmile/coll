package com.itcc.coll;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.junit.Before;
import org.junit.Test;

public class realmDemo {

    private SimpleAccountRealm accountRealm = new SimpleAccountRealm();


    private DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();


    @Before
    public void init() {

        //初始化数据源
        accountRealm.addAccount("xdclass", "123");
        accountRealm.addAccount("jack", "456");

        //构建环境
        defaultSecurityManager.setRealm(accountRealm);

    }

    @Test
    public void testAuthentication() {

        SecurityUtils.setSecurityManager(defaultSecurityManager);

        //当前操作主体， application user
        Subject subject = SecurityUtils.getSubject();

        //用户输入的账号密码
        UsernamePasswordToken usernamePasswordToken =
                new UsernamePasswordToken("jack", "456");

        subject.login(usernamePasswordToken);


        System.out.println("认证结果:"+subject.isAuthenticated());


    }

    public static void main(String[] args) {
        String hashAlgorithmName = "MD5";
        String credentials = "root";
        int hashIterations = 2;
        ByteSource credentialsSalt = ByteSource.Util.bytes("user");
        Object obj = new SimpleHash(hashAlgorithmName, credentials, credentialsSalt,hashIterations);
        System.out.println(obj);
    }

}
