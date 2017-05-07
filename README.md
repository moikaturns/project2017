# project2017
self learning tasks on a range of technologies
# simpleClass
* Simple class to count the number of different characters in a word
* Build: mvn package
* Test: mvn test
* Run: java -cp target/project-1.0.jar com.tutorial.project.App aabbc
Expected: word [aabbc] has 3 different characters
# simpleWeb
* Added web project that uses the simple class
* Added parent project for both simple web and simple class projects
* Run mvn install on simple class
* Run mvn install on simple web
* Run this to start the web server mvn jetty:run
* Then open browser and request page: http://localhost:8080/simpleWeb/simple/countMee
* Should render a count of the string countMee
* Example: SimpleServlet Executed [countMee] [7]
