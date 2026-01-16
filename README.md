*Game App*

Before running the app, there should be some changes done to the database configuration, in order for the results to be properly saved

The H2 database dependency is included via Gradle, so no installation is needed

The location of the database should be changed using these steps:
1. Open the file: src/main/java/db/DBConfig.java
2. Locate the line: private static final String URL = "jdbc:h2:~/Documents/Kei_Database/game-db;AUTO_SERVER=TRUE";
3. Replace the path with your preferred location

Connection settings are also defined in DBConfig.java:
1. USER = "admin";
2. PASSWORD = "";
