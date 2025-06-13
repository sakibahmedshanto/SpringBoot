# SpringBoot

# ShortCuts
1. 🚀 Shortcut Method to Add Maven Dependency:
Open your pom.xml file.
Place your cursor inside the <dependencies> tag.

Press:
Alt + Insert (on Windows/Linux)
Cmd + N (on macOS)

Select "Add Maven Dependency" from the popup.

2. ctrl+shift+0 --> to find something


# Error Handle
If theres a port busy error add this to application.properties
spring.application.name=store
server.port=8081



# Initializing a Project

1. we have basic dependency package->
goto maven central repo and search
-> spring-boot-starter-web
-> copy that piece of code to pom.xml


2. dont add version no to the pom.xml
cause its parent may have already working version that will be automaticaly inherited . and if the parent hasnt any version the system will use the latest version
-> more neat clean code
-> more stable versioning


#Annotations
Great question! In Spring Boot (or Spring Framework in general), annotations like @Controller and @RequestMapping are used to tell the framework how to handle HTTP requests and map them to Java methods. They’re part of Spring’s annotation-based configuration system.




