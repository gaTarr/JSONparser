# JSONparser

This console application parses JSON data from a specified URL.  It allows the user to select one from 100 albums, and it returns the album image numbers and their titles.  

# System Requirements
Java Development Kit 1.7 or above.
Maven 3.3 or above.


For this application, please ensure that both Maven and Java are installed and both environment variables are added to PATH. If needed, you can download the Maven Binary zip archive: apache-maven-3.6.0-bin.zip, here, (https://maven.apache.org/download.cgi#) and follow the installation instructions (https://maven.apache.org/install.html).

# Version Information 0.0.1
JSON data in this application is from an online web service that can be found here: https://jsonplaceholder.typicode.com/photos

This project uses the java based Jackson library to parse the JSON data. (https://github.com/FasterXML/jackson)

This project uses the exec-maven plugin to assist in the execution of the program. (https://search.maven.org/search?q=a:exec-maven-plugin)

# Instructions

Once required components are downloaded/installed, you may run the application using Command Prompt (Windows).

1. Set the directory to the location of your JSONparser folder. For example, if you downloaded this project to your desktop, your command might look something like this:

C:> cd C:\Desktop\JSONparser

2. Using Maven, call the package build phase and the exec plugin in one command, like this:

...\JSONparser> mvn package exec:java

# Still To Do
-Develop unit testing packages


