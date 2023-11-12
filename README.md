<p align="center">
    <a href='https://docs.oracle.com/en/java/javase/8'><img alt="Java 8" src="./Images/Java8.png"></a>
    <a href='https://docs.spring.io/spring-boot/docs/2.6.2-SNAPSHOT/reference/html'><img alt="Spring Boot 2" src="https://img.shields.io/badge/Spring%20Boot%202-%23000000.svg?logo=springboot"></a>
    <a href='https://staging-cn.vuejs.org'><img alt="Vue 3" src="https://img.shields.io/badge/Vue%202%20-%232b3847.svg?logo=vue.js"></a><br/>
    <a href='#'><img alt="Github stars" src="https://img.shields.io/github/stars/201206030/novel?logo=github"></a>
    <a href='#'><img alt="Github forks" src="https://img.shields.io/github/forks/201206030/novel?logo=github"></a>
    <a href='#'><img alt="Gitee stars" src="https://gitee.com/novel_dev_team/novel/badge/star.svg?theme=gitee"></a>
    <a href='#'><img alt="Gitee forks" src="https://gitee.com/novel_dev_team/novel/badge/fork.svg?theme=gitee"></a>
</p>

# 狗眼电影在线售票系统

#### 开发环境

+ Windows

#### 配置环境

| 程序           | 版本        | 说明                       |
|--------------|-----------|--------------------------|
| Jdk          | 1.8.0 161 | Java 开发工具包               |
| Mysql        | 5.5.27    | 关系型数据库                   |
| Redis        | 7.0.5     | 非关系型数据库                  |
| Apache-maven | 3.9.0     | Java 项目管理和构建工具           |
| Nvm          | 1.10      | Node.js 版本管理器            |
| Node         | 8.12.0    | Node.js JavaScript 运行时环境 |

#### 开发工具

| 工具                       | 版本            | 说明                      |
|--------------------------|---------------|-------------------------|
| IDEA                     | 2022.3.2      | 后前端开发IDE                |
| Git                      | 2.24.1        | 代码托管平台                  |
| Google   Chrome          | 75.0.3770.100 | 浏览器、前端调试工具              |
| Navicat                  | 11.1.13       | 数据库连接工具                 |
| Postman                  | 7.1.0         | 接口测试工具                  |
| VMware   Workstation Pro | 14.1.3        | 虚拟机(未用到或许你会用到)          |
| PowerDesigner            | 15            | 数据库设计工具(未用到或许你会用到)      |
| SQLyog                   | 12.0.3        | 数据库连接工具 (未用到或许你会用到)     |
| Visio                    | 2013          | 时序图、流程图等绘制工具(未用到或许你会用到) |
| ProcessOn                | ——            | 架构图等绘制工具(未用到或许你会用到)     |
| XMind   ZEN              | 9.2.0         | 思维导图绘制工具(未用到或许你会用到)     |
| RedisDesktop             | 0.9.3.817     | redis客户端连接工具(未用到或许你会用到) |

#### 编码规范

- 规范方式：严格遵守阿里编码规约。
- 命名统一：简介最大程度上达到了见名知意。
- 分包明确：层级分明可快速定位到代码位置。
- 注释完整：描述性高大量减少了开发人员的代码阅读工作量。
- 工具规范：使用统一jar包避免出现内容冲突。
- 代码整洁：可读性、维护性高。

#### 包的结构

```
+- gouyan -- 整个项目
|   +- .idea -- 存储项目的IDEA配置文件
|   +- gouyan-cloud -- 后端项目
|   |   +- .DS_Store -- macOS系统生成的存储文件夹的自定义属性的文件
|   |   +- .gitignore -- Git版本控制时忽略的文件配置
|   |   +- gouyan-actor -- 微服务模块，处理演员相关的业务逻辑
|   |   |   +- .DS_Store -- macOS系统生成的存储文件夹的自定义属性的文件
|   |   |   +- .mvn -- Maven Wrapper的配置文件目录
|   |   |   |   +- wrapper -- Maven Wrapper的JAR文件，用于自动下载Maven
|   |   |   |   |   +- maven-wrapper.jar 
|   |   |   |   |   +- maven-wrapper.properties 
|   |   |   +- gouyan-actor.iml -- IDEA项目文件
|   |   |   +- HELP.md -- 项目帮助文档
|   |   |   +- mvnw -- Maven Wrapper的Unix脚本文件（用于在Unix系统上运行Maven）
|   |   |   +- mvnw.cmd -- Maven Wrapper的Windows脚本文件（用于在Windows系统上运行Maven）
|   |   |   +- pom.xml -- Maven项目配置文件
|   |   |   +- src -- 项目源代码
|   |   |   +- target -- 存放编译生成的.class文件和打包生成的.jar文件
|   |   |   +- resources -- 存放项目资源文件
|   |   +- target -- 存放编译生成的.class文件和打包生成的.jar文件

|   |   +- gouyan-admin -- 微服务模块，处理后台管理相关的业务逻辑
|   |   |   +- .DS_Store -- macOS系统生成的存储文件夹的自定义属性的文件
|   |   |   +- .gitignore -- Git版本控制时忽略的文件配置
|   |   |   +- gouyan-admin.iml -- IDEA项目文件
|   |   |   +- pom.xml -- Maven项目配置文件
|   |   |   +- src -- 项目源代码
|   |   |   |   +- .DS_Store -- macOS系统生成的存储文件夹的自定义属性的文件
|   |   |   |   +- main
|   |   |   |   |   +- .DS_Store -- macOS系统生成的存储文件夹的自定义属性的文件
|   |   |   |   |   +- java
|   |   |   |   |   |   +- com
|   |   |   |   |   |   |   +- gouyan
|   |   |   |   |   |   |   |   +- GouyanAdminApplication.java -- 后台管理微服务的启动类
|   |   |   |   |   |   |   |   +- web -- 存放Web相关的代码
|   |   |   |   |   |   |   |   |   +- controller -- 存放控制器类
|   |   |   |   |   |   |   |   |   |   +- BaseController.java -- 基础控制器类
|   |   |   |   |   |   |   |   |   |   +- system -- 存放系统相关的控制器
|   |   |   +- resources -- 存放项目资源文件
|   |   |   +- target -- 存放编译生成的.class文件和打包生成的.jar文件
|   |   +- gouyan-auth -- 认证微服务模块，处理身份认证和权限管理相关的业务逻辑
|   |   |   +- .mvn -- Maven Wrapper的配置文件夹
|   |   |   |   +- wrapper -- Maven Wrapper的JAR和属性文件
|   |   |   +- gouyan-auth.iml -- IDEA项目文件
|   |   |   +- hs_err_pid31724.log -- Java虚拟机错误日志文件
|   |   |   +- replay_pid31724.log -- Java虚拟机重启错误日志文件
|   |   |   +- pom.xml -- Maven项目配置文件
|   |   |   +- src -- 项目源代码
|   |   |   |   +- main
|   |   |   |   |   +- java
|   |   |   |   |   |   +- com
|   |   |   |   |   |   |   +- gouyan
|   |   |   |   |   |   |   |   +- web -- 存放Web相关的代码
|   |   |   |   |   |   |   |   |   +- controller -- 存放控制器类
|   |   |   |   |   |   |   |   |   |   +- auth -- 存放认证相关的控制器
|   |   |   |   |   |   |   |   |   |   |   +- BaseController.java -- 基础控制器类
|   |   |   |   |   |   |   |   |   |   |   +- GouyanAuthApplication.java -- 认证微服务的启动类
|   |   |   |   |   |   |   |   |   |   |   +- SysResourceController.java -- 系统资源控制器
|   |   |   |   |   |   |   |   |   |   |   +- SysRoleController.java -- 系统角色控制器
|   |   |   |   |   |   |   |   |   |   |   +- SysSessionController.java -- 系统会话控制器
|   |   |   |   |   |   |   |   |   |   |   +- SysUserController.java -- 系统用户控制器
|   |   |   |   |   |   |   |   |   |   |   +- SysUserHobbyController.java -- 用户兴趣爱好控制器
|   |   |   +- resources -- 存放项目资源文件
|   |   |   +- target -- 存放编译生成的.class文件和打包生成的.jar文件
|   |   +- gouyan-bill -- 账单微服务模块，处理与账单相关的业务逻辑
|   |   |   +- .mvn -- Maven Wrapper的配置文件夹
|   |   |   |   +- wrapper -- Maven Wrapper的JAR和属性文件
|   |   |   +- gouyan-bill.iml -- IDEA项目文件
|   |   |   +- pom.xml -- Maven项目配置文件
|   |   |   +- src -- 项目源代码
|   |   |   |   +- main
|   |   |   |   |   +- java
|   |   |   |   |   |   +- com
|   |   |   |   |   |   |   +- gouyan
|   |   |   |   |   |   |   |   +- web -- 存放Web相关的代码
|   |   |   |   |   |   |   |   |   +- controller -- 存放控制器类
|   |   |   |   |   |   |   |   |   |   +- bill -- 存放账单相关的控制器
|   |   |   |   |   |   |   |   |   |   |   +- BaseController.java -- 基础控制器类
|   |   |   |   |   |   |   |   |   |   |   +- GouyanBillApplication.java -- 账单微服务的启动类
|   |   |   |   |   |   |   |   |   |   |   +- SysBillController.java -- 账单控制器
|   |   |   |   |   +- resources -- 存放项目资源文件
|   |   |   +- target -- 存放编译生成的.class文件和打包生成的.jar文件
|   |   +- gouyan-cinema -- 影院微服务模块，处理与影院相关的业务逻辑
|   |   |   +- .mvn -- Maven Wrapper的配置文件夹
|   |   |   |   +- wrapper -- Maven Wrapper的JAR和属性文件
|   |   |   +- gouyan-cinema.iml -- IDEA项目文件
|   |   |   +- pom.xml -- Maven项目配置文件
|   |   |   +- src -- 项目源代码
|   |   |   |   +- main
|   |   |   |   |   +- java
|   |   |   |   |   |   +- com
|   |   |   |   |   |   |   +- gouyan
|   |   |   |   |   |   |   |   +- web -- 存放Web相关的代码
|   |   |   |   |   |   |   |   |   +- controller -- 存放控制器类
|   |   |   |   |   |   |   |   |   |   +- cinema -- 存放影院相关的控制器
|   |   |   |   |   |   |   |   |   |   |   +- BaseController.java -- 基础控制器类
|   |   |   |   |   |   |   |   |   |   |   +- GouyanCinemaApplication.java -- 影院微服务的启动类
|   |   |   |   |   |   |   |   |   |   |   +- SysCinemaAreaController.java -- 影院区域控制器
|   |   |   |   |   |   |   |   |   |   |   +- SysCinemaBrandController.java -- 影院品牌控制器
|   |   |   |   |   |   |   |   |   |   |   +- SysCinemaController.java -- 影院控制器
|   |   |   |   |   +- resources -- 存放项目资源文件
|   |   |   +- target -- 存放编译生成的.class文件和打包生成的.jar文件
|   |   +- gouyan-common -- 通用模块，存放项目中多个模块通用的代码和工具类
|   |   |   +- .gitignore -- Git版本控制忽略文件配置
|   |   |   +- gouyan-common.iml -- IDEA项目文件
|   |   |   +- pom.xml -- Maven项目配置文件
|   |   |   +- src -- 项目源代码
|   |   |   |   +- main
|   |   |   |   |   +- java
|   |   |   |   |   |   +- com
|   |   |   |   |   |   |   +- gouyan
|   |   |   |   |   |   |   |   +- common -- 存放通用代码和工具类
|   |   |   |   |   |   |   |   |   +- constant -- 存放常量定义
|   |   |   |   |   |   |   |   |   |   +- HttpStatus.java -- HTTP状态码常量
|   |   |   |   |   |   |   |   |   |   +- MovieRankingList.java -- 电影排行榜常量
|   |   |   |   |   |   |   |   |   +- controller -- 存放通用的控制器类
|   |   |   |   |   |   |   |   |   |   +- FileUploadController.java -- 文件上传控制器
|   |   |   |   |   |   |   |   |   +- exception -- 存放通用的异常类
|   |   |   |   |   |   |   |   |   |   +- DataNotFoundException.java -- 数据未找到异常
|   |   |   |   |   |   |   |   |   |   +- FileNameLengthLimitExceededException.java -- 文件名长度超过限制异常
|   |   |   |   |   |   |   |   |   |   +- FileSizeLimitExceededException.java -- 文件大小超过限制异常
|   |   |   |   |   |   |   |   |   |   +- InvalidExtensionException.java -- 无效文件扩展名异常
|   |   |   |   |   |   |   |   |   +- file -- 存放文件相关的工具类
|   |   |   |   |   |   |   |   |   |   +- FileUploadUtils.java -- 文件上传工具类
|   |   |   |   |   |   |   |   |   |   +- MimeTypeUtils.java -- MIME类型工具类
|   |   |   |   |   |   |   |   |   +- page -- 存放分页相关的类
|   |   |   |   |   |   |   |   |   |   +- Page.java -- 分页类
|   |   |   |   |   |   |   |   |   |   +- PageBuilder.java -- 分页构建器
|   |   |   |   |   |   |   |   |   +- response -- 存放响应相关的类
|   |   |   |   |   |   |   |   |   |   +- ResponseResult.java -- 响应结果类
|   |   |   |   |   |   |   |   |   +- utils -- 存放通用的工具类
|   |   |   |   |   |   |   |   |   |   +- ApplicationContextUtils.java -- Spring上下文工具类
|   |   |   |   |   |   |   |   |   |   +- JwtUtil.java -- JWT工具类
|   |   |   |   |   |   |   |   |   |   +- SaltUtils.java -- 盐值工具类
|   |   |   |   |   |   |   |   |   |   +- ServletUtil.java -- Servlet工具类
|   |   |   |   |   |   |   |   |   |   +- StringUtil.java -- 字符串工具类
|   |   |   +- target -- 存放编译生成的.class文件和打包生成的.jar文件
|   |   +- gouyan-eureka -- 服务注册中心模块
|   |   |   +- .gitignore -- Git版本控制忽略文件配置
|   |   |   +- .mvn -- Maven配置文件夹
|   |   |   |   +- wrapper -- Maven包装器配置
|   |   |   |   |   +- maven-wrapper.jar -- Maven包装器JAR文件
|   |   |   |   |   +- maven-wrapper.properties -- Maven包装器属性配置
|   |   |   +- gouyan-eureka.iml -- IDEA项目文件
|   |   |   +- HELP.md -- 项目帮助文档
|   |   |   +- mvnw -- Maven包装器脚本（Unix）
|   |   |   +- mvnw.cmd -- Maven包装器脚本（Windows）
|   |   |   +- pom.xml -- Maven项目配置文件
|   |   |   +- src -- 项目源代码
|   |   |   |   +- main
|   |   |   |   |   +- java
|   |   |   |   |   |   +- com
|   |   |   |   |   |   |   +- example -- 示例代码
|   |   |   |   |   |   |   |   +- gouyaneureka -- 服务注册中心主要代码
|   |   |   |   |   |   |   |   |   +- GouyanEurekaApplication.java -- 服务注册中心应用入口
|   |   |   |   |   +- resources -- 项目资源文件
|   |   |   +- target -- 存放编译生成的.class文件和打包生成的.jar文件
|   |   +- gouyan-framework -- 项目框架模块
|   |   |   +- .DS_Store -- Mac系统存放文件信息的文件
|   |   |   +- .gitignore -- Git版本控制忽略文件配置
|   |   |   +- gouyan-framework.iml -- IDEA项目文件
|   |   |   +- pom.xml -- Maven项目配置文件
|   |   |   +- src -- 项目源代码
|   |   |   |   +- main
|   |   |   |   |   +- java
|   |   |   |   |   |   +- com
|   |   |   |   |   |   |   +- gouyan
|   |   |   |   |   |   |   |   +- framework -- 项目框架主要代码
|   |   |   |   |   |   |   |   |   +- config -- 存放配置类
|   |   |   |   |   |   |   |   |   |   +- ApplicationConfiguration.java -- Spring Boot应用配置类
|   |   |   |   |   |   |   |   |   |   +- CrosConfig.java -- 跨域配置类
|   |   |   |   |   |   |   |   |   |   +- ShiroConfig.java -- Shiro配置类
|   |   |   |   |   |   |   |   |   +- exception -- 存放异常处理类
|   |   |   |   |   |   |   |   |   |   +- GlobalExceptionHandler.java -- 全局异常处理类
|   |   |   |   |   |   |   |   |   +- shiro -- 存放Shiro相关的类
|   |   |   |   |   |   |   |   |   |   +- JwtFilter.java -- JWT过滤器
|   |   |   |   |   |   |   |   |   |   +- JwtToken.java -- 存储JWT的Token
|   |   |   |   |   |   |   |   |   |   +- realms -- 存放Shiro的Realm
|   |   |   |   |   |   |   |   |   |   |   +- CustomerRealm.java -- 自定义的Shiro Realm
|   |   |   +- target -- 存放编译生成的.class文件和打包生成的.jar文件
|   |   +- gouyan-gateway -- API网关模块
|   |   |   +- .mvn -- Maven Wrapper的配置目录
|   |   |   |   +- wrapper -- 存放Maven Wrapper的JAR文件和配置文件
|   |   |   |   |   +- maven-wrapper.jar -- Maven Wrapper的JAR文件
|   |   |   |   |   +- maven-wrapper.properties -- Maven Wrapper的配置文件
|   |   |   +- gouyan-gateway.iml -- IDEA项目文件
|   |   |   +- HELP.md -- 项目帮助文档
|   |   |   +- mvnw -- Maven Wrapper的Unix脚本
|   |   |   +- mvnw.cmd -- Maven Wrapper的Windows脚本
|   |   |   +- pom.xml -- Maven项目配置文件
|   |   |   +- src -- 项目源代码
|   |   |   |   +- main
|   |   |   |   |   +- java
|   |   |   |   |   |   +- com
|   |   |   |   |   |   |   +- example
|   |   |   |   |   |   |   |   +- gouyangateway -- API网关主要代码
|   |   |   |   |   |   |   |   |   +- config -- 存放网关的配置类
|   |   |   |   |   |   |   |   |   |   +- RateLimiterConfiguration.java -- 限流配置类
|   |   |   |   |   |   |   |   |   |   +- WebAjaxMvcConfigurer.java -- Web MVC配置类
|   |   |   |   |   |   |   |   |   +- GouyanGatewayApplication.java -- 网关应用主类
|   |   |   |   |   +- resources -- 项目资源文件
|   |   |   +- target -- 存放编译生成的.class文件和打包生成的.jar文件
|   |   +- gouyan-hall -- 影厅管理模块
|   |   |   +- .mvn -- Maven Wrapper的配置目录
|   |   |   |   +- wrapper -- 存放Maven Wrapper的JAR文件和配置文件
|   |   |   |   |   +- maven-wrapper.jar -- Maven Wrapper的JAR文件
|   |   |   |   |   +- maven-wrapper.properties -- Maven Wrapper的配置文件
|   |   |   +- gouyan-hall.iml -- IDEA项目文件
|   |   |   +- pom.xml -- Maven项目配置文件
|   |   |   +- src -- 项目源代码
|   |   |   |   +- main
|   |   |   |   |   +- java
|   |   |   |   |   |   +- com
|   |   |   |   |   |   |   +- gouyan
|   |   |   |   |   |   |   |   +- web -- 
|   |   |   |   |   |   |   |   |   +- controller -- 
|   |   |   |   |   |   |   |   |   |   +- hall -- 影厅相关的控制器
|   |   |   |   |   |   |   |   |   |   |   +- BaseController.java -- 影厅管理基础控制器
|   |   |   |   |   |   |   |   |   |   |   +- GouyanHallApplication.java -- 影厅管理应用主类
|   |   |   |   |   |   |   |   |   |   |   +- SysHallCategoryController.java -- 影厅类别控制器
|   |   |   |   |   |   |   |   |   |   |   +- SysHallController.java -- 影厅控制器
|   |   |   |   |   +- resources -- 项目资源文件
|   |   |   |   +- test -- 测试代码
|   |   |   |   |   +- java
|   |   |   |   |   |   +- com
|   |   |   |   |   |   |   +- example -- 
|   |   |   |   |   |   |   +- gouyan
|   |   |   |   |   |   |   |   +- web -- 
|   |   |   |   |   |   |   |   |   +- controller -- 
|   |   |   |   |   |   |   |   |   |   +- hall -- 影厅管理测试代码
|   |   |   |   |   |   |   |   |   |   |   +- GouyanHallApplicationTests.java -- 影厅管理应用测试类
|   |   |   +- target -- 存放编译生成的.class文件和打包生成的.jar文件
|   |   +- gouyan-movie -- 电影管理模块
|   |   |   +- .mvn -- Maven Wrapper的配置目录
|   |   |   |   +- wrapper -- 存放Maven Wrapper的JAR文件和配置文件
|   |   |   |   |   +- maven-wrapper.jar -- Maven Wrapper的JAR文件
|   |   |   |   |   +- maven-wrapper.properties -- Maven Wrapper的配置文件
|   |   |   +- gouyan-movie.iml -- IDEA项目文件
|   |   |   +- pom.xml -- Maven项目配置文件
|   |   |   +- src -- 项目源代码
|   |   |   |   +- main
|   |   |   |   |   +- java
|   |   |   |   |   |   +- com
|   |   |   |   |   |   |   +- gouyan
|   |   |   |   |   |   |   |   +- web -- 
|   |   |   |   |   |   |   |   |   +- controller -- 
|   |   |   |   |   |   |   |   |   |   +- movie -- 电影相关的控制器
|   |   |   |   |   |   |   |   |   |   |   +- BaseController.java -- 电影管理基础控制器
|   |   |   |   |   |   |   |   |   |   |   +- GouyanMovieApplication.java -- 电影管理应用主类
|   |   |   |   |   |   |   |   |   |   |   +- SysMovieAgeController.java -- 电影年龄控制器
|   |   |   |   |   |   |   |   |   |   |   +- SysMovieAreaController.java -- 电影地区控制器
|   |   |   |   |   |   |   |   |   |   |   +- SysMovieCategoryController.java -- 电影类别控制器
|   |   |   |   |   |   |   |   |   |   |   +- SysMovieCommentController.java -- 电影评论控制器
|   |   |   |   |   |   |   |   |   |   |   +- SysMovieController.java -- 电影控制器
|   |   |   |   |   |   |   |   |   |   |   +- SysMovieRuntimeController.java -- 电影时长控制器
|   |   |   |   |   |   |   |   |   |   |   +- SysMovieToCategoryController.java -- 电影与类别关联控制器
|   |   |   |   |   +- resources -- 项目资源文件
|   |   |   +- target -- 存放编译生成的.class文件和打包生成的.jar文件
|   |   +- gouyan-system -- 系统管理模块
|   |   |   +- .DS_Store -- Mac系统文件，存储文件夹的自定义属性
|   |   |   +- .gitignore -- Git版本控制系统的忽略文件配置
|   |   |   +- gouyan-system.iml -- IDEA项目文件
|   |   |   +- pom.xml -- Maven项目配置文件
|   |   |   +- src -- 项目源代码
|   |   |   |   +- main
|   |   |   |   |   +- java
|   |   |   |   |   |   +- com
|   |   |   |   |   |   |   +- gouyan
|   |   |   |   |   |   |   |   +- system -- 系统管理模块的Java代码
|   |   |   |   |   |   |   |   |   +- domin -- 存放系统管理相关的实体类
|   |   |   |   |   |   |   |   |   |   +- LoginUser.java -- 登录用户实体类
|   |   |   |   |   |   |   |   |   |   +- SysActor.java -- 演员实体类
|   |   |   |   |   |   |   |   |   |   +- SysActorMovie.java -- 演员与电影关联实体类
|   |   |   |   |   |   |   |   |   |   +- SysActorRole.java -- 演员与角色关联实体类
|   |   |   |   |   |   |   |   |   |   +- SysBill.java -- 账单实体类
|   |   |   |   |   |   |   |   |   |   +- SysCinema.java -- 影院实体类
|   |   |   |   |   |   |   |   |   |   +- SysCinemaArea.java -- 影院区域实体类
|   |   |   |   |   |   |   |   |   |   +- SysCinemaBrand.java -- 影院品牌实体类
|   |   |   |   |   |   |   |   |   |   +- SysHall.java -- 影厅实体类
|   |   |   |   |   |   |   |   |   |   +- SysHallCategory.java -- 影厅类别实体类
|   |   |   |   |   |   |   |   |   |   +- SysMovie.java -- 电影实体类
|   |   |   |   |   |   |   |   |   |   +- SysMovieAge.java -- 电影年龄实体类
|   |   |   |   |   |   |   |   |   |   +- SysMovieArea.java -- 电影地区实体类
|   |   |   |   |   |   |   |   |   |   +- SysMovieCategory.java -- 电影类别实体类
|   |   |   |   |   |   |   |   |   |   +- SysMovieComment.java -- 电影评论实体类
|   |   |   |   |   |   |   |   |   |   +- SysMovieRuntime.java -- 电影时长实体类
|   |   |   |   |   |   |   |   |   |   +- SysMovieToCategory.java -- 电影与类别关联实体类
|   |   |   |   |   |   |   |   |   |   +- SysResource.java -- 系统资源实体类
|   |   |   |   |   |   |   |   |   |   +- SysRole.java -- 系统角色实体类
|   |   |   |   |   |   |   |   |   |   +- SysSession.java -- 系统会话实体类
|   |   |   |   |   |   |   |   |   |   +- SysUser.java -- 系统用户实体类
|   |   |   |   |   |   |   |   |   |   +- SysUserHobby.java -- 用户爱好实体类
|   |   |   |   |   |   |   |   |   |   +- vo -- 存放系统管理相关的视图对象
|   |   |   |   |   |   |   |   |   |   |   +- SysBillVo.java -- 账单视图对象
|   |   |   |   |   |   |   |   |   |   |   +- SysCinemaVo.java -- 影院视图对象
|   |   |   |   |   |   |   |   |   |   |   +- SysMovieChartsVo.java -- 电影图表视图对象
|   |   |   |   |   |   |   |   |   |   |   +- SysMovieVo.java -- 电影视图对象
|   |   |   |   |   |   |   |   |   |   |   +- SysSessionVo.java -- 系统会话视图对象
|   |   |   |   |   |   |   |   |   |   |   +- SysUserVo.java -- 用户视图对象
|   |   |   |   |   |   |   |   |   +- mapper -- 存放系统管理相关的数据访问对象
|   |   |   |   |   |   |   |   |   |   +- SysActorMapper.java -- 演员数据访问对象
|   |   |   |   |   |   |   |   |   |   +- SysActorMovieMapper.java -- 演员与电影关联数据访问对象
|   |   |   |   |   |   |   |   |   |   +- SysActorRoleMapper.java -- 演员与角色关联数据访问对象
|   |   |   |   |   |   |   |   |   |   +- SysBillMapper.java -- 账单数据访问对象
|   |   |   |   |   |   |   |   |   |   +- SysCinemaAreaMapper.java -- 影院区域数据访问对象
|   |   |   |   |   |   |   |   |   |   +- SysCinemaBrandMapper.java -- 影院品牌数据访问对象
|   |   |   |   |   |   |   |   |   |   +- SysCinemaMapper.java -- 影院数据访问对象
|   |   |   |   |   |   |   |   |   |   +- SysHallCategoryMapper.java -- 影厅类别数据访问对象
|   |   |   |   |   |   |   |   |   |   +- SysHallMapper.java -- 影厅数据访问对象
|   |   |   |   |   |   |   |   |   |   +- SysMovieAgeMapper.java -- 电影年龄数据访问对象
|   |   |   |   |   |   |   |   |   |   +- SysMovieAreaMapper.java -- 电影地区数据访问对象
|   |   |   |   |   |   |   |   |   |   +- SysMovieCategoryMapper.java -- 电影类别数据访问对象
|   |   |   |   |   |   |   |   |   |   +- SysMovieCommentMapper.java -- 电影评论数据访问对象
|   |   |   |   |   |   |   |   |   |   +- SysMovieMapper.java -- 电影数据访问对象
|   |   |   |   |   |   |   |   |   |   +- SysMovieRuntimeMapper.java -- 电影时长数据访问对象
|   |   |   |   |   |   |   |   |   |   +- SysMovieToCategoryMapper.java -- 电影与类别关联数据访问对象
|   |   |   |   |   |   |   |   |   |   +- SysResourceMapper.java -- 系统资源数据访问对象
|   |   |   |   |   |   |   |   |   |   +- SysRoleMapper.java -- 系统角色数据访问对象
|   |   |   |   |   |   |   |   |   |   +- SysSessionMapper.java -- 系统会话数据访问对象
|   |   |   |   |   |   |   |   |   |   +- SysUserHobbyMapper.java -- 用户爱好数据访问对象
|   |   |   |   |   |   |   |   |   |   +- SysUserMapper.java -- 系统用户数据访问对象
|   |   |   |   |   |   |   |   |   +- service -- 存放系统管理相关的服务接口和实现
|   |   |   |   |   |   |   |   |   |   +- impl -- 存放系统管理相关的服务接口实现
|   |   |   |   |   |   |   |   |   |   |   +- SysActorMovieServiceImpl.java -- 演员与电影关联服务实现
|   |   |   |   |   |   |   |   |   |   |   +- SysActorRoleServiceImpl.java -- 演员与角色关联服务实现
|   |   |   |   |   |   |   |   |   |   |   +- SysActorServiceImpl.java -- 演员服务实现
|   |   |   |   |   |   |   |   |   |   |   +- SysBillServiceImpl.java -- 账单服务实现
|   |   |   |   |   |   |   |   |   |   |   +- SysCinemaAreaServiceImpl.java -- 影院区域服务实现
|   |   |   |   |   |   |   |   |   |   |   +- SysCinemaBrandServiceImpl.java -- 影院品牌服务实现
|   |   |   |   |   |   |   |   |   |   |   +- SysCinemaServiceImpl.java -- 影院服务实现
|   |   |   |   |   |   |   |   |   |   |   +- SysHallCategoryServiceImpl.java -- 影厅类别服务实现
|   |   |   |   |   |   |   |   |   |   |   +- SysHallServiceImpl.java -- 影厅服务实现
|   |   |   |   |   |   |   |   |   |   |   +- SysMovieAgeServiceImpl.java -- 电影年龄服务实现
|   |   |   |   |   |   |   |   |   |   |   +- SysMovieAreaServiceImpl.java -- 电影地区服务实现
|   |   |   |   |   |   |   |   |   |   |   +- SysMovieCategoryServiceImpl.java -- 电影类别服务实现
|   |   |   |   |   |   |   |   |   |   |   +- SysMovieCommentServiceImpl.java -- 电影评论服务实现
|   |   |   |   |   |   |   |   |   |   |   +- SysMovieRuntimeServiceImpl.java -- 电影时长服务实现
|   |   |   |   |   |   |   |   |   |   |   +- SysMovieServiceImpl.java -- 电影服务实现
|   |   |   |   |   |   |   |   |   |   |   +- SysMovieToCategoryServiceImpl.java -- 电影与类别关联服务实现
|   |   |   |   |   |   |   |   |   |   |   +- SysResourceServiceImpl.java -- 系统资源服务实现
|   |   |   |   |   |   |   |   |   |   |   +- SysRoleServiceImpl.java -- 系统角色服务实现
|   |   |   |   |   |   |   |   |   |   |   +- SysSessionServiceImpl.java -- 系统会话服务实现
|   |   |   |   |   |   |   |   |   |   |   +- SysUserHobbyServiceImpl.java -- 用户爱好服务实现
|   |   |   |   |   |   |   |   |   |   |   +- SysUserServiceImpl.java -- 系统用户服务实现
|   |   |   |   |   |   |   |   |   |   +- SysActorMovieService.java -- 演员与电影关联服务接口
|   |   |   |   |   |   |   |   |   |   +- SysActorRoleService.java -- 演员与角色关联服务接口
|   |   |   |   |   |   |   |   |   |   +- SysActorService.java -- 演员服务接口
|   |   |   |   |   |   |   |   |   |   +- SysBillService.java -- 账单服务接口
|   |   |   |   |   |   |   |   |   |   +- SysCinemaAreaService.java -- 影院区域服务接口
|   |   |   |   |   |   |   |   |   |   +- SysCinemaBrandService.java -- 影院品牌服务接口
|   |   |   |   |   |   |   |   |   |   +- SysCinemaService.java -- 影院服务接口
|   |   |   |   |   |   |   |   |   |   +- SysHallCategoryService.java -- 影厅类别服务接口
|   |   |   |   |   |   |   |   |   |   +- SysHallService.java -- 影厅服务接口
|   |   |   |   |   |   |   |   |   |   +- SysMovieAgeService.java -- 电影年龄服务接口
|   |   |   |   |   |   |   |   |   |   +- SysMovieAreaService.java -- 电影地区服务接口
|   |   |   |   |   |   |   |   |   |   +- SysMovieCategoryService.java -- 电影类别服务接口
|   |   |   |   |   |   |   |   |   |   +- SysMovieCommentService.java -- 电影评论服务接口
|   |   |   |   |   |   |   |   |   |   +- SysMovieRuntimeService.java -- 电影时长服务接口
|   |   |   |   |   |   |   |   |   |   +- SysMovieService.java -- 电影服务接口
|   |   |   |   |   |   |   |   |   |   +- SysMovieToCategoryService.java -- 电影和类别关联关系服务接口
|   |   |   |   |   |   |   |   |   |   +- SysResourceService.java -- 系统资源服务接口
|   |   |   |   |   |   |   |   |   |   +- SysRoleService.java -- 系统角色服务接口
|   |   |   |   |   |   |   |   |   |   +- SysSessionService.java -- 用户会话服务接口
|   |   |   |   |   |   |   |   |   |   +- SysUserHobbyService.java -- 用户爱好服务接口
|   |   |   |   |   |   |   |   |   |   +- SysUserService.java -- 系统用户服务接口
|   |   |   |   |   +- resources -- 存放配置文件等资源
|   |   |   +- target -- 存放编译生成的文件
|   |   +- gouyan.iml -- IntelliJ IDEA 项目配置文件
|   |   +- http-requests -- 包含了针对系统中不同控制器的 HTTP 请求文件
|   |   |   +- SysActorController.http -- SysActor 控制器的 HTTP 请求文件
|   |   |   +- SysActorMovieController.http -- SysActorMovie 控制器的 HTTP 请求文件
|   |   |   +- SysActorRoleController.http -- SysActorRole 控制器的 HTTP 请求文件
|   |   |   +- SysBillController.http -- SysBill 控制器的 HTTP 请求文件
|   |   |   +- SysCinemaAreaController.http -- SysCinemaArea 控制器的 HTTP 请求文件
|   |   |   +- SysCinemaBrandController.http -- SysCinemaBrand 控制器的 HTTP 请求文件
|   |   |   +- SysCinemaController.http -- SysCinema 控制器的 HTTP 请求文件
|   |   |   +- SysHallCategoryController.http -- SysHallCategory 控制器的 HTTP 请求文件
|   |   |   +- SysHallController.http -- SysHall 控制器的 HTTP 请求文件
|   |   |   +- SysMovieAgeController.http -- SysMovieAge 控制器的 HTTP 请求文件
|   |   |   +- SysMovieAreaController.http -- SysMovieArea 控制器的 HTTP 请求文件
|   |   |   +- SysMovieCategoryController.http -- SysMovieCategory 控制器的 HTTP 请求文件
|   |   |   +- SysMovieCommentController.http -- SysMovieComment 控制器的 HTTP 请求文件
|   |   |   +- SysMovieController.http -- SysMovie 控制器的 HTTP 请求文件
|   |   |   +- SysMovieRuntimeController.http -- SysMovieRuntime 控制器的 HTTP 请求文件
|   |   |   +- SysMovieToCategoryController.http -- SysMovieToCategory 控制器的 HTTP 请求文件
|   |   |   +- SysResourceController.http -- SysResource 控制器的 HTTP 请求文件
|   |   |   +- SysRoleController.http -- SysRole 控制器的 HTTP 请求文件
|   |   |   +- SysSessionController.http -- SysSession 控制器的 HTTP 请求文件
|   |   |   +- SysUserController.http -- SysUser 控制器的 HTTP 请求文件
|   |   |   +- SysUserHobbyController.http -- SysUserHobby 控制器的 HTTP 请求文件
|   |   +- pom.xml -- Maven 项目的配置文件，包含了项目的依赖、插件等配置信息
|   |   +- README.md -- 项目的说明文档，通常包含项目的介绍、配置、运行方式等信息
|   |   +- sql -- 存放与数据库相关的脚本文件
|   |   |   +- movie.sql -- 影院在线售票系统的数据库脚本文件，可能包含数据库表结构的定义和初始化数据
|   |   |   +- 影院在线售票系统数据库脚本(含数据).sql -- 另一个版本的数据库脚本，可能包含了初始化数据
|   +- gouyan-web -- Vue.js 前端项目的根目录
|   |   +- .DS_Store -- 操作系统生成的临时文件，通常在 Mac 系统中出现
|   |   +- gouyan-ui -- Vue.js 项目的前端代码
|   |   |   +- .browserslistrc -- 用于配置支持的浏览器范围
|   |   |   +- .DS_Store -- 操作系统生成的临时文件，通常在 Mac 系统中出现
|   |   |   +- .gitignore -- Git 版本控制系统的忽略配置文件，指定不需要纳入版本控制的文件或目录
|   |   |   +- babel.config.js -- Babel 配置文件，用于配置 JavaScript 编译器 Babel
|   |   |   +- node_modules -- 存放项目依赖的 Node.js 模块
|   |   |   +- package-lock.json -- 锁定安装时的包的版本号，确保不同开发环境安装的包版本一致
|   |   |   +- package.json -- 项目的配置文件，包含了项目的元信息和依赖信息
|   |   |   +- public -- 存放不需要编译的静态资源
|   |   |   |   +- favicon.ico -- 网站的图标文件
|   |   |   |   +- index.html -- 项目的入口 HTML 文件
|   |   |   +- README.md -- 项目的说明文档，通常包含项目的介绍、配置、运行方式等信息
|   |   |   +- src -- 存放源代码
|   |   |   |   +- App.vue -- Vue.js 应用的根组件
|   |   |   |   +- assets -- 存放静态资源，如图片、字体等
|   |   |   |   +- components -- 存放 Vue.js 组件
|   |   |   |   +- element-variables.scss -- Element UI 框架的样式变量文件
|   |   |   |   +- main.js -- Vue.js 应用的入口文件
|   |   |   |   +- plugins -- 存放 Vue.js 插件
|   |   |   |   |   +- axios.js -- Axios HTTP 客户端的配置文件
|   |   |   |   |   +- element.js -- Element UI 框架的配置文件
|   |   |   |   +- router -- 存放 Vue.js 路由配置
|   |   |   |   |   +- index.js -- Vue.js 路由的主配置文件
|   |   |   |   +- store -- 存放 Vuex 状态管理的配置
|   |   |   |   |   +- index.js -- Vuex 的主配置文件
|   |   |   |   +- views -- 存放 Vue.js 视图组件
|   |   |   |   |   +- actor -- 存放与演员相关的视图组件
|   |   |   |   |   |   +- ActorInfo.vue -- 演员信息视图组件
|   |   |   |   |   |   +- ActorRole.vue -- 演员角色视图组件
|   |   |   |   |   +- cinema -- 存放与影院相关的视图组件
|   |   |   |   |   |   +- CinemaArea.vue -- 影院区域信息视图组件
|   |   |   |   |   |   +- CinemaBrand.vue -- 影院品牌信息视图组件
|   |   |   |   |   |   +- CinemaInfo.vue -- 影院信息视图组件
|   |   |   |   |   +- hall -- 存放与影厅相关的视图组件
|   |   |   |   |   |   +- HallCategory.vue -- 影厅类别信息视图组件
|   |   |   |   |   |   +- HallInfo.vue -- 影厅信息视图组件
|   |   |   |   |   +- Home.vue -- 主页视图组件
|   |   |   |   |   +- Login.vue -- 登录视图组件
|   |   |   |   |   +- movie -- 存放与电影相关的视图组件
|   |   |   |   |   |   +- MovieAge.vue -- 电影年龄信息视图组件
|   |   |   |   |   |   +- MovieArea.vue -- 电影产地信息视图组件
|   |   |   |   |   |   +- MovieCategory.vue -- 电影类别信息视图组件
|   |   |   |   |   |   +- MovieComment.vue -- 电影评论信息视图组件
|   |   |   |   |   |   +- MovieInfo.vue -- 电影信息视图组件
|   |   |   |   |   |   +- MovieRuntime.vue -- 电影时长信息视图组件
|   |   |   |   |   +- role -- 存放与角色相关的视图组件
|   |   |   |   |   |   +- ResourceInfo.vue -- 资源信息视图组件
|   |   |   |   |   |   +- RoleInfo.vue -- 角色信息视图组件
|   |   |   |   |   +- session -- 存放与会话相关的视图组件
|   |   |   |   |   |   +- SessionInfo.vue -- 会话信息视图组件
|   |   |   |   |   +- user -- 存放与用户相关的视图组件
|   |   |   |   |   |   +- BillInfo.vue -- 账单信息视图组件
|   |   |   |   |   |   +- UserHobby.vue -- 用户爱好信息视图组件
|   |   |   |   |   |   +- UserInfo.vue -- 用户信息视图组件
|   |   |   |   |   +- Welcome.vue -- 欢迎页视图组件
|   |   |   +- vue.config.js -- Vue.js 项目的配置文件，用于配置构建工具和开发服务器等
|   |   +- gouyan-user -- Vue.js项目：用户界面部分
|   |   |   +- .browserslistrc -- 浏览器兼容配置文件
|   |   |   +- .DS_Store -- 操作系统生成的目录文件
|   |   |   +- .gitignore -- Git版本控制忽略文件配置
|   |   |   +- babel.config.js -- Babel配置文件，用于转译ES6+代码
|   |   |   +- node_modules -- 存放项目依赖的Node.js模块
|   |   |   +- package-lock.json -- 记录当前状态下实际安装的各个npm package的具体来源和版本号
|   |   |   +- package.json -- 项目的元数据文件，记录了项目的相关信息和依赖
|   |   |   +- public -- 存放不需要编译的静态资源
|   |   |   |   +- favicon.ico -- 网站图标
|   |   |   |   +- index.html -- 项目的主HTML文件
|   |   |   +- README.md -- 项目的说明文档
|   |   |   +- src -- 存放源代码
|   |   |   |   +- App.vue -- 主组件
|   |   |   |   +- assets -- 存放静态资源文件，如图片、字体等
|   |   |   |   +- components -- 存放Vue组件
|   |   |   |   +- element-variables.scss -- Element UI组件库的主题样式配置
|   |   |   |   +- main.js -- 项目的入口文件，初始化Vue实例
|   |   |   |   +- plugins -- 存放Vue插件
|   |   |   |   |   +- axios.js -- Axios HTTP客户端的配置文件
|   |   |   |   |   +- element.js -- Element UI组件库的配置文件
|   |   |   |   +- router -- 存放Vue Router的配置文件
|   |   |   |   |   +- index.js -- 路由配置文件
|   |   |   |   +- store -- 存放Vuex的状态管理文件
|   |   |   |   |   +- index.js -- Vuex配置文件
|   |   |   |   +- views -- 存放Vue页面组件
|   |   |   |   |   +- actor -- 存放演员相关的页面组件
|   |   |   |   |   |   +- ActorInfo.vue -- 演员信息页面组件
|   |   |   |   |   +- cinema -- 存放影院相关的页面组件
|   |   |   |   |   |   +- Cinema.vue -- 影院页面组件
|   |   |   |   |   |   +- CinemaInfo.vue -- 影院信息页面组件
|   |   |   |   |   +- Error404.vue -- 404错误页面组件
|   |   |   |   |   +- home -- 存放首页相关的页面组件
|   |   |   |   |   |   +- Home.vue -- 首页页面组件
|   |   |   |   |   +- Login.vue -- 登录页面组件
|   |   |   |   |   +- movie -- 存放电影相关的页面组件
|   |   |   |   |   |   +- Movie.vue -- 电影页面组件
|   |   |   |   |   |   +- MovieClassics.vue -- 经典电影页面组件
|   |   |   |   |   |   +- MovieInfo.vue -- 电影信息页面组件
|   |   |   |   |   |   +- MovieOngoing.vue -- 正在上映电影页面组件
|   |   |   |   |   |   +- MovieUpcoming.vue -- 即将上映电影页面组件
|   |   |   |   |   +- pay -- 存放支付相关的页面组件
|   |   |   |   |   |   +- BillDetail.vue -- 账单详情页面组件
|   |   |   |   |   |   +- ChooseSeat.vue -- 选座页面组件
|   |   |   |   |   +- rankinglist -- 存放排行榜相关的页面组件
|   |   |   |   |   |   +- AmericanBoxOfficeList.vue -- 北美票房榜页面组件
|   |   |   |   |   |   +- DomesticBoxOfficeList.vue -- 国内票房榜页面组件
|   |   |   |   |   |   +- Rankinglist.vue -- 排行榜页面组件
|   |   |   |   |   |   +- ReputationList.vue -- 口碑榜页面组件
|   |   |   |   |   |   +- Top100List.vue -- Top100榜页面组件
|   |   |   |   |   +- Register.vue -- 注册页面组件
|   |   |   |   |   +- search -- 存放搜索相关的页面组件
|   |   |   |   |   |   +- Search.vue -- 综合搜索页面组件
|   |   |   |   |   |   +- SearchActor.vue -- 演员搜索页面组件
|   |   |   |   |   |   +- SearchCinema.vue -- 影院搜索页面组件
|   |   |   |   |   |   +- SearchMovie.vue -- 电影搜索页面组件
|   |   |   |   |   +- user -- 存放用户相关的页面组件
|   |   |   |   |   |   +- BillInfo.vue -- 账单信息页面组件
|   |   |   |   |   |   +- UserInfo.vue -- 用户信息页面组件
|   |   |   |   |   |   +- UserMenu.vue -- 用户菜单页面组件
|   |   |   |   |   +- Welcome.vue -- 欢迎页面组件
|   |   |   +- vue.config.js -- Vue CLI配置文件，用于配置构建工具和插件
|   +- Images -- 存放项目中使用的图片资源
|   +- README.md -- 项目的说明文档
|   +- sql2023 -- 存放2023年的SQL数据库脚本文件
|   |   +- movie.sql -- 电影相关的数据库脚本文件
```

#### 后端技术栈

| 技术                               | 版本           | 说明                                 |
|----------------------------------|--------------|------------------------------------|
| org.apache.shiro:shiro-spring-boot-starter | ${shiro.version} | Apache Shiro 集成 Spring Boot 的起步依赖。 |
| org.mybatis.spring.boot:mybatis-spring-boot-starter | ${mybatis.springboot.version} | MyBatis 集成 Spring Boot 的起步依赖。      |
| com.alibaba:druid-spring-boot-starter | ${druid.version} | Druid 数据源集成 Spring Boot 的起步依赖。  |
| com.github.pagehelper:pagehelper-spring-boot-starter | ${pagehelper.version} | PageHelper 分页插件集成 Spring Boot 的起步依赖。 |
| javax.servlet:servlet-api       | ${servlet.version} | Java 原生 Servlet API。                  |
| commons-io:commons-io            | ${commons.io.version} | Apache Commons IO 库，提供文件操作等功能。     |
| com.auth0:java-jwt               | ${java-jwt.version} | Java JWT，用于处理 JSON Web Tokens。       |
| com.github.anji-plus:captcha-spring-boot-starter | 1.2.4 | anjiplus 验证码集成 Spring Boot 的起步依赖。     |
| com.alibaba:fastjson             | ${fastjson.version} | 阿里巴巴的 JSON 解析库。                  |
| com.gouyan:gouyan-framework      | ${gouyan.version} | 狗眼电影在线售票系统框架模块。              |
| com.gouyan:gouyan-system         | ${gouyan.version} | 狗眼电影在线售票系统系统模块。              |
| com.gouyan:gouyan-common         | ${gouyan.version} | 狗眼电影在线售票系统通用模块。              |
| com.gouyan:gouyan-admin          | ${gouyan.version} | 狗眼电影在线售票系统管理员模块。            |
| org.springframework.cloud:spring-cloud-dependencies | Hoxton.SR7    | Spring Cloud 版本依赖管理。               |
| org.springframework.boot:spring-boot-dependencies | 2.3.2.RELEASE | Spring Boot 版本依赖管理。               |
| org.springframework.boot:spring-boot-devtools | (未指定)               | Spring Boot 开发者工具。                 |
| mysql:mysql-connector-java            | (未指定)               | MySQL 数据库驱动。                      |
| org.springframework:spring-context-support       | (未指定)               | Spring 框架基本的核心工具。                  |
| org.springframework:spring-web                   | (未指定)               | Spring Web 模块。                        |
| javax.servlet:servlet-api                       | (未指定)               | 原生 Servlet。                          |
| javax.validation:validation-api                 | (未指定)               | javax 提供的校验工具类。                   |
| org.hibernate.validator:hibernate-validator      | (未指定)               | 校验器。                              |
| org.projectlombok:lombok                        | (未指定)               | Lombok 插件。                          |
| com.github.pagehelper:pagehelper-spring-boot-starter | (未指定)               | Mybatis 分页插件。                     |
| com.fasterxml.jackson.core:jackson-databind     | (未指定)               | Jackson 数据绑定。                     |
| com.fasterxml.jackson.core:jackson-core         | (未指定)               | Jackson 核心。                        |
| com.fasterxml.jackson.core:jackson-annotations   | (未指定)               | Jackson 注解。                        |
| commons-io:commons-io                           | (未指定)               | IO 常用工具类。                       |
| org.apache.commons:commons-lang3                 | (未指定)               | Apache Commons Lang3 工具类库。         |
| org.apache.shiro:shiro-spring-boot-starter       | (未指定)               | Shiro 安全权限框架。                    |
| com.auth0:java-jwt                              | (未指定)               | Java JWT。                            |
| com.github.anji-plus:captcha-spring-boot-starter | (未指定)               | Anji 验证码。                         |
| com.alibaba:fastjson                            | (未指定)               | FastJSON。                            |
| org.springframework.cloud:spring-cloud-starter-netflix-eureka-client | (未指定)               | Spring Cloud Netflix Eureka Client。  |
| org.springframework.cloud:spring-cloud-starter-netflix-hystrix | (未指定)               | Spring Cloud Netflix Hystrix。        |
| org.springframework.cloud:spring-cloud-starter-openfeign | (未指定)               | Spring Cloud OpenFeign。|
| org.springframework.cloud:spring-cloud-starter-netflix-eureka-server | (未指定)               | Spring Cloud Netflix Eureka Server。  |
| org.springframework.boot:spring-boot-starter-web | (未指定)               | SpringBoot Web容器。                 |
| org.springframework.boot:spring-boot-starter-aop | (未指定)               | SpringBoot 拦截器。                 |
| org.springframework.boot:spring-boot-starter-test | (未指定)              | SpringBoot 测试。                   |
| com.alibaba:druid-spring-boot-starter            | (未指定)               | 阿里数据库连接池。                   |
| org.mybatis.spring.boot:mybatis-spring-boot-starter | (未指定)             | Mybatis。                           |
| com.gouyan:gouyan-system                        | (未指定)               | 后台系统模块。                      |
| org.springframework.cloud:spring-cloud-starter-gateway | (未指定)          | Spring Cloud 网关。                 |
| org.springframework.cloud:spring-cloud-starter-netflix-eureka-client | (未指定) | Eureka 客户端。                    |
| org.springframework.cloud:spring-cloud-starter-netflix-hystrix | (未指定)     | Spring Cloud Hystrix。             |
| org.springframework.boot:spring-boot-devtools | (未指定)               | Spring Boot 开发者工具。            |
| mysql:mysql-connector-java                    | (未指定)               | MySQL 数据库驱动。                 |
| com.gouyan:gouyan-framework                   | (未指定)               | 项目框架核心模块。                 |
| com.gouyan:gouyan-common         | (未指定)       | 公用工具模块。               |

#### 前端技术栈

| 技术                | 版本       | 说明                                       |
|---------------------|------------|------------------------------------------|
| core-js             | ^3.6.5     | JavaScript 标准库的扩展，提供新特性支持。     |
| crypto-js           | ^4.0.0     | 提供加密和解密功能的 JavaScript 库。         |
| element-ui          | ^2.4.5     | 基于 Vue.js 的组件库，用于快速构建用户界面。  |
| moment              | ^2.29.1    | JavaScript 日期处理库，用于解析、验证、操作和格式化日期。 |
| nprogress           | ^0.2.0     | 用于在 Vue 应用中显示加载进度条的插件。        |
| vue                 | ^2.6.11    | 渐进式 JavaScript 框架，用于构建用户界面。     |
| vue-resource        | ^1.5.1     | Vue.js 的 HTTP 插件，用于处理 Web 请求。      |
| vue-router          | ^3.2.0     | Vue.js 官方的路由管理器，用于构建单页面应用。  |
| vuex                | ^3.4.0     | Vue.js 的集中式状态管理，用于管理应用中的所有组件的状态。 |
| @vue/cli-plugin-babel | ^4.5.0    | Vue CLI 插件，用于支持 Babel 转译。          |
| @vue/cli-service    | ^4.5.0     | Vue CLI 提供的服务，用于构建和开发 Vue 项目。   |
| axios               | ^0.18.1    | 用于浏览器和 Node.js 的 Promise 化的 HTTP 客户端。 |
| node-sass           | ^4.14.1    | Node.js 下的 Sass 预处理器。                |
| sass-loader         | ^7.0.3     | 用于加载和转译 Sass/SCSS 文件的 Webpack 加载器。 |
| vue-cli-plugin-axios | 0.0.4     | Vue CLI 插件，集成 Axios 实现 HTTP 请求。     |
| vue-cli-plugin-element | ^1.0.1   | Vue CLI 插件，集成 Element UI。             |
| vue-template-compiler | ^2.6.11  | 用于预编译 Vue 模板的模板编译器。            |


#### 安装教程
1.  在navicat中运行数据库脚本生成对应的数据库表
2.  在src/main/resources/application.yml文件里更改数据库名称或数据库密码
3.  在pom.xml文件的父目录运行 mvn clean spring-boot:run 启动后端
4.  启动前端 你可以在package.json的父目录执行下如命令 或者 直接在IDEA里点击也可运行 值得一提的是后两命令分别是打包命令和检查修复命令

```
npm install
```
```
npm run serve
```
```
npm run build
```
```
npm run lint
```
+ 如下图所示

![](./Images/后端启动_1.png)
![](./Images/后端启动_2.png)
![](./Images/前端启动_1.png)
![](./Images/前端启动_2.png)
![](./Images/前端启动_3.png)

#### 登录账户

用户名：superadmin
密码：123456

#### 截图

