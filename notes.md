# SpringInjection
Steps<br/>
1. Run following command in order to generate maven project<br/>
mvn archetype:generate -DgroupId=com.seanyoung.common -DartifactId=SpringInjection -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
2. Run following command in order to convert the project into eclipse IDE 
Run mvn eclipse:eclipse for java application and mvn eclipse:eclipse -Dwtpversion=2.0 for web app
3. Add spring dependency
<dependency>
	<groupId>org.springframework</groupId>
	<artifactId>spring-context</artifactId>
	<version>4.3.0.RELEASE</version>
</dependency>
3. Run mvn eclipse:eclipse for java application and mvn eclipse:eclipse -Dwtpversion=2.0 for web app
4. mvn eclipse:eclipse


Explanation
-DarchetypeArtifactId=maven-archetype-quickstart -> to create java application project
-DarchetypeArtifactId=maven-archetype-webapp -> to create java web application project

This introduction has 2 samples.
1. How to inject bean by annotation
2. Differentiate between @Autowired, @Inject and @Resource

By default beans marked with '@Component' will have the same name as the class. Therefore the name of the class ‘Person’ is person.

Annotation to inject the bean from spring container
1. @Autowired -> org.springframework.bean.factor -> Spring 
2. @Inject -> javax.inject -> Java
3. @Qualifier -> javax.inject -> Java
4. @Resource -> javax.annotation -> Java

Conclusion
@Autowired and @Inject
1. Matches by Type
2. Restricts by Qualifiers
3. Matches by Name

@Resource
1. Matches by Name
2. Matches by Type
3. Restricts by Qualifiers (ignored if match is found by name)

@Autowired and @Inject are using the same by using 'AutowiredAnnotationBeanPostProcessor' to inject.
@Resource is using 'CommonAnnotationBeanPostProcessor'. Even though they are using different post processor classes they all behave nearly identical.

source:
http://blogs.sourceallies.com/2011/08/spring-injection-with-resource-and-autowired/
