# Spring_Annotations
Some practice of annotation in Spring
A
nnotations

Refer as metadata in Java
Allow to skip using bean in xml
Need to scan <context:component-scan base-package="com.dstar.springannotations"></context:component-scan>
Some example of annotations in spring

@Component

A the class ready for auto scanning

@Scope

Define the class\(bean\) scope

@Bean

For individual class define as bean

@PostConstruct

Method execute after constructor and after injection of dependencies

@PreDestroy

Method execute before bean destroyed

@Qualifier

Use @Qualifier annotation along with @Autowired to look for specific bean \(When there are too many of method with same type\)

@Value

For the variable
