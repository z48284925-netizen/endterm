🎵 Music Management System API
This is a Spring Boot RESTful API developed as part of the Endterm project. The application provides a robust system for managing music content, incorporating modern Java development practices, design patterns, and performance optimizations.

🚀 Core Features
RESTful Endpoints: Full CRUD capabilities for music management.

Database Integration: Powered by H2 In-memory Database for fast and reliable data handling.

OOP Architecture: Utilizes inheritance with a base abstract class MusicContent.

JPA Inheritance: Implements the SINGLE_TABLE strategy to manage entity hierarchies efficiently within a single database table.

🏗 Design Patterns & Bonus Features
To meet the advanced requirements of the project, the following patterns were implemented:

1. Singleton Pattern (Bonus Task)
The MusicCache class is implemented as a Singleton. This ensures that only one instance of the cache exists throughout the application lifecycle, preventing memory leaks and ensuring data consistency.

2. Factory Pattern
A MediaFactory is used to decouple the creation of Song and Podcast objects from the service layer, centralizing the instantiation logic.

3. In-Memory Caching Layer
A high-performance caching mechanism was added to the MusicService:

Caching Strategy: The findAll() method stores results in an internal Map after the first database query.

Performance: Subsequent calls return data directly from the cache, significantly reducing database load.

Automatic Invalidation: The cache is automatically cleared (cache.clear()) whenever a new entry is saved via POST requests, ensuring the user never receives outdated information.

🛠 Tech Stack
Java 25 (OpenJDK)

Spring Boot 3.2.2

Spring Data JPA

H2 Database

Maven

📂 Project Structure
controller — Handles HTTP requests and manages REST endpoints.

service — Contains business logic and the Caching Layer.

model — Entities (MusicContent, Song, Podcast) using JPA annotations.

patterns — Implementation of Singleton, Factory, and Cache.

repository — Data access layer interfaces.

✅ Final Submission Checklist
Before evaluating the project, please ensure the following components are verified:

 Singleton Implementation: The MusicCache class is a thread-safe Singleton (checked via getInstance()).
 In-Memory Storage: Data is stored in a ConcurrentHashMap to ensure thread safety during concurrent API calls.
 Layered Architecture: Caching logic is encapsulated within the Service Layer, keeping the Controller and Repository decoupled.
 Cache Invalidation: The cache is automatically cleared during POST operations to maintain data integrity.
 JPA Entities: All subclasses (Song, Podcast) are marked with @Entity to ensure proper database persistence.
 SOLID Principles: The system follows the Single Responsibility Principle by separating data access, business logic, and caching concerns.
