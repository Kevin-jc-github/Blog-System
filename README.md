# SpringBootBlogger

Welcome to the repository for SpringBootBlogger, a robust Spring Boot-based web application designed for blogging aficionados. This application serves as a platform for creating, reading, updating, and deleting insightful blog posts with ease. Dive into our engaging categories, share your thoughts via comments, and experience seamless navigation with our intuitive pagination and sorting features.

## Features

### Posts Management
- **Create Posts**: Users can author new blog posts using a rich text editor for content formatting.
- **Read Posts**: Each post is displayed with a title, author, and creation date, and can be viewed in full by selecting it from a list.
- **Update Posts**: Authors have the ability to edit their posts to correct or update content as needed.
- **Delete Posts**: Unwanted posts can be removed from the system by their authors or admins.
- **Pagination**: Navigate through posts in an organized manner with pagination, avoiding overwhelming single-page content loads.
- **Sorting**: Sort posts by date, popularity, or comments to find content quickly and efficiently.

### Comments Management
- **Create Comments**: Readers can contribute to the discussion by posting comments on blog articles.
- **Read Comments**: All comments are visible underneath their respective blog posts, fostering a community dialogue.
- **Update Comments**: Commenters can edit their remarks to add further information or correct errors.
- **Delete Comments**: Inappropriate or outdated comments can be deleted by their authors or moderators.

### Authentication and Authorization
- **Register**: New users can sign up by providing a username, email, and strong password.
- **Login**: Secure login that protects user credentials and sessions with JWTs.
- **Profile Management**: Users can manage their profile and update their personal information.
- **Security**: All user data is protected with Spring Security, ensuring that data breaches are prevented.

### Category Management
- **Create Categories**: Admins can define categories to organize posts under common topics.
- **Read Categories**: Users can filter posts by categories to find content relevant to their interests.
- **Update Categories**: Admins have the ability to rename categories to reflect the nature of the content more accurately.
- **Delete Categories**: To keep the blog organized, obsolete or irrelevant categories can be removed.


## Technology Stack

- **Java Platform**: Java 17+
- **Java Frameworks**: Utilizing the power of Spring Framework, including Spring Boot, Spring Security, and Spring Data JPA.
- **Authentication**: JWT (JSON Web Token) for secure token-based authentication.
- **Build Tool**: Maven for dependable project management.
- **IDE**: Developed with IntelliJ IDEA (STS - Spring Tool Suite is also an option).
- **Server**: Embedded Tomcat for a streamlined deployment process.
- **Database**: MySQL for reliable data storage.
- **REST Client**: Postman for testing and interacting with the RESTful API.
- **Cloud Deployment**: Hosted on AWS Cloud for scalability and performance.

