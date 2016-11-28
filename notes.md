# SpringInjection
Steps<br/>
1. Run following command in order to generate maven project<br/>
mvn archetype:generate -DgroupId=com.seanyoung.common -DartifactId=SpringInjection -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false<br/>
2. Run following command in order to convert the project into eclipse IDE<br/> 
Run mvn eclipse:eclipse for java application and mvn eclipse:eclipse -Dwtpversion=2.0 for web app<br/>
3. Add spring dependency<br/>
<dependency><br/>
	<groupId>org.springframework</groupId><br/>
	<artifactId>spring-context</artifactId><br/>
	<version>4.3.0.RELEASE</version><br/>
</dependency><br/>
3. Run mvn eclipse:eclipse for java application and mvn eclipse:eclipse -Dwtpversion=2.0 for web app<br/>
4. mvn eclipse:eclipse<br/><br/><br/>


Explanation<br/>
-DarchetypeArtifactId=maven-archetype-quickstart -> to create java application project<br/>
-DarchetypeArtifactId=maven-archetype-webapp -> to create java web application project<br/><br/>

This introduction has 2 samples.<br/>
1. How to inject bean by annotation<br/>
2. Differentiate between @Autowired, @Inject and @Resource<br/><br/>

By default beans marked with '@Component' will have the same name as the class. Therefore the name of the class ‘Person’ is person.<br/><br/>

Annotation to inject the bean from spring container<br/>
1. @Autowired -> org.springframework.bean.factor -> Spring <br/>
2. @Inject -> javax.inject -> Java<br/>
3. @Qualifier -> javax.inject -> Java<br/>
4. @Resource -> javax.annotation -> Java<br/><br/>

Conclusion<br/>
@Autowired and @Inject<br/>
1. Matches by Type<br/>
2. Restricts by Qualifiers<br/>
3. Matches by Name<br/><br/>

@Resource<br/>
1. Matches by Name<br/>
2. Matches by Type<br/>
3. Restricts by Qualifiers (ignored if match is found by name)<br/><br/>

@Autowired and @Inject are using the same by using 'AutowiredAnnotationBeanPostProcessor' to inject.<br/>
@Resource is using 'CommonAnnotationBeanPostProcessor'. Even though they are using different post processor classes they all behave nearly identical.<br/><br/>

source:<br/>
http://blogs.sourceallies.com/2011/08/spring-injection-with-resource-and-autowired/
