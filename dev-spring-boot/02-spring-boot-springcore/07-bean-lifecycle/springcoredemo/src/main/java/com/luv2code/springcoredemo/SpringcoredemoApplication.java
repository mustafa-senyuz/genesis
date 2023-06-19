package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);		
	}

}

/*
2023-06-10T14:07:09.469+02:00  INFO 10600 --- [  restartedMain] c.l.s.SpringcoredemoApplication          : Starting SpringcoredemoApplication using Java 19.0.1 with PID 10600 (C:\Users\musta\OneDrive\Masaüstü\ADVANCE_JAVA\dev-spring-boot\02-spring-boot-springcore\05-lazy\springcoredemo\target\classes started by musta in C:\Users\musta\OneDrive\Masaüstü\ADVANCE_JAVA\dev-spring-boot\02-spring-boot-springcore\05-lazy\springcoredemo)
2023-06-10T14:07:09.473+02:00  INFO 10600 --- [  restartedMain] c.l.s.SpringcoredemoApplication          : No active profile set, falling back to 1 default profile: "default"
2023-06-10T14:07:09.510+02:00  INFO 10600 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2023-06-10T14:07:09.510+02:00  INFO 10600 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2023-06-10T14:07:10.201+02:00  INFO 10600 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2023-06-10T14:07:10.210+02:00  INFO 10600 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-06-10T14:07:10.210+02:00  INFO 10600 --- [  restartedMain] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.8]
2023-06-10T14:07:10.248+02:00  INFO 10600 --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-06-10T14:07:10.250+02:00  INFO 10600 --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 739 ms
2023-06-10T14:07:10.338+02:00  INFO 10600 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2023-06-10T14:07:10.342+02:00  INFO 10600 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2023-06-10T14:07:10.365+02:00  INFO 10600 --- [  restartedMain] c.l.s.SpringcoredemoApplication          : Started SpringcoredemoApplication in 1.173 seconds (process running for 1.448)
2023-06-10T14:07:18.608+02:00  INFO 10600 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2023-06-10T14:07:18.608+02:00  INFO 10600 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2023-06-10T14:07:18.749+02:00  INFO 10600 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 141 ms
class name : CricketCoach
*/
