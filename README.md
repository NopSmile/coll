### 系统框架：
 * 整体采用微服务，前后端分离
 * springboot+redis+oracle+shiro(RBAC)
 

|Filter Name|功能|
 |  ----  | ----  |
|anno|不需要授权、登录就可以访问。eg:/index|
|authc|需要登录授权才能访问。eg：/用户中心|
|authcBasic|Basic HTTP身份验证拦截器|
|logout|退出拦截器。退出成功后，会|redirect到设置的/URI|
|noSessionCreation|不创建会话连接器|
|perms|授权拦截器:perm['user:create']|
|port|端口拦截器.eg:port[80]|
|rest|rest风格拦截器|
|roles|角色拦截器。eg：role[administrator]|
|ssl|ssl拦截器。通过https协议才能通过|
|user|用户拦截器。eg：登录后（authc），第二次没登陆但是有记住我(remmbner)都可以访问。|