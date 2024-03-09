# Report: Java Project with Spring and Twilio

This is a project that aims the create a an easier monitoring framework for web applications. This works such that when a logged in user accesses a particular endpoint, the system alerts the admin about the new user. Like this, the security admin gets to monitor the security activities of the application as soon as possible.


This is a Java project that utilizes the Spring framework and Twilio for communication functionalities.


![Screenshot (73)](https://github.com/dhranny/Report/blob/main/Screenshot%20(73).png)

## Description

This project aims to demonstrate how to integrate Twilio's messaging and voice services into a Java application built with the Spring framework. With Twilio, you can easily send SMS messages and make voice calls programmatically.

This functionality is used to log details of each logged in user to the server of the application. The helps the admin to monitor and discover abnormalities in the security state of their application.

![Screenshot (74)](https://github.com/dhranny/Report/blob/main/Screenshot%20(74).png)

## Features

- Integration with Twilio's SMS messaging service.
- Integration with Twilio's voice call functionality.
- Utilization of Spring's dependency injection and inversion of control features.
- 
![Screenshot (75)](https://github.com/dhranny/Report/blob/main/Screenshot%20(75).png)

## Installation

To run this project locally, follow these steps:

1. Clone the repository to your local machine:

```bash
git clone https://github.com/yourusername/yourproject.git
```

2. Navigate to the project directory:

```bash
cd yourproject
```

3. Configure Twilio credentials:

   - Obtain Twilio API credentials from [Twilio's website](https://www.twilio.com/).
   - Set the credentials in your project's configuration file.

4. Build the project using Maven:

```bash
mvn clean install
```

5. Run the application:

```bash
java -jar yourproject.jar
```

## Configuration

Ensure you have the following dependencies in your `pom.xml` file:

```xml
<dependencies>
    <!-- Spring Boot Starter Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <!-- Twilio -->
    <dependency>
        <groupId>com.twilio.sdk</groupId>
        <artifactId>twilio</artifactId>
        <version>8.24.0</version>
    </dependency>
</dependencies>
```

In your `application.properties` or `application.yml` file, configure your Twilio credentials:

```properties
# Twilio Configuration
twilio.accountSid=your_account_sid
twilio.authToken=your_auth_token
```

## Usage

Once the application is running, you can utilize the provided API endpoints to send SMS messages or make voice calls using Twilio's services.

Example API endpoints:

- `POST /send-sms`: Send an SMS message.

Ensure you provide appropriate request bodies containing recipient information and message content.

## Contributing

Contributions are welcome! Feel free to open issues or pull requests to suggest improvements or report bugs.

## License

This project is licensed under the [MIT License](LICENSE). Feel free to use and modify it according to your needs.

---

Feel free to modify this README according to your specific project details and requirements. Happy coding!
