# Contributing to Eatsmeet

First off, thanks for taking the time to contribute! 🎉

All types of contributions are encouraged and valued. See the [Table of Contents](https://www.google.com/search?q=%23table-of-contents) for different ways to help and details about how this project handles them. Please make sure to read the relevant section before making your contribution. It will make it a lot easier for us maintainers and smooth out the experience for all involved. The community looks forward to your contributions.

> And if you like the project, but just don't have time to contribute, that's fine. There are other easy ways to support the project and show your appreciation, which we would also be very happy about:
> * Star the project
> * Tweet about it
> * Refer this project in your project's readme
> * Mention the project at local meetups and tell your friends/colleagues
> 
> 

## Table of Contents

* [Code of Conduct](https://www.google.com/search?q=%23code-of-conduct)
* [I Have a Question](https://www.google.com/search?q=%23i-have-a-question)
* [I Want To Contribute](https://www.google.com/search?q=%23i-want-to-contribute)
* [Reporting Bugs](https://www.google.com/search?q=%23reporting-bugs)
* [Suggesting Enhancements](https://www.google.com/search?q=%23suggesting-enhancements)
* [Your First Code Contribution](https://www.google.com/search?q=%23your-first-code-contribution)
* [Improving The Documentation](https://www.google.com/search?q=%23improving-the-documentation)
* [Styleguides](https://www.google.com/search?q=%23styleguides)
* [Commit Messages](https://www.google.com/search?q=%23commit-messages)
* [Join The Project Team](https://www.google.com/search?q=%23join-the-project-team)

## Code of Conduct

This project and everyone participating in it is governed by the [Code of Conduct](https://www.google.com/search?q=CODE_OF_CONDUCT.md).
By participating, you are expected to uphold this code. Please report unacceptable behavior to **pathugit**.

## I Have a Question

> If you want to ask a question, we assume that you have read the available [Documentation](README.md).

Before you ask a question, it is best to search for existing [suspicious link removed] that might help you. In case you have found a suitable issue and still need clarification, you can write your question in this issue. It is also advisable to search the internet for answers first.

If you then still feel the need to ask a question and need clarification, we recommend the following:

* Open an [suspicious link removed].
* Provide as much context as you can about what you're running into.
* Provide project and platform versions (**Java 21**, **Maven**, **MySQL version**), depending on what seems relevant.

We will then take care of the issue as soon as possible.

## I Want To Contribute

> ### Legal Notice
> 
> 
> When contributing to this project, you must agree that you have authored 100% of the content, that you have the necessary rights to the content and that the content you contribute may be provided under the project license.

### Reporting Bugs

#### Before Submitting a Bug Report

A good bug report shouldn't leave others needing to chase you up for more information. Therefore, we ask you to investigate carefully, collect information and describe the issue in detail in your report. Please complete the following steps in advance to help us fix any potential bug as fast as possible.

* Make sure that you are using the latest version.
* Determine if your bug is really a bug and not an error on your side e.g. using incompatible environment components/versions (Make sure that you have read the [documentation](README.md). If you are looking for support, you might want to check [this section](https://www.google.com/search?q=%23i-have-a-question)).
* To see if other users have experienced (and potentially already solved) the same issue you are having, check if there is not already a bug report existing for your bug or error in the [suspicious link removed].
* Collect information about the bug:
* Stack trace (Traceback) from the Spring Boot console.
* OS, Platform and Version (Windows, Linux, macOS).
* Java Version (JDK 21 is required) and MySQL version.
* Possibly your input and the output (API JSON responses).
* Can you reliably reproduce the issue?



#### How Do I Submit a Good Bug Report?

> You must never report security related issues, vulnerabilities or bugs including sensitive information to the issue tracker, or elsewhere in public. Instead sensitive bugs must be sent by email to **[Insert Your Email Here]**.

We use GitHub issues to track bugs and errors. If you run into an issue with the project:

* Open an [suspicious link removed]. (Since we can't be sure at this point whether it is a bug or not, we ask you not to talk about a bug yet and not to label the issue.)
* Explain the behavior you would expect and the actual behavior.
* Please provide as much context as possible and describe the *reproduction steps* that someone else can follow to recreate the issue on their own. This usually includes your code. For good bug reports you should isolate the problem and create a reduced test case.
* Provide the information you collected in the previous section.

Once it's filed:

* The project team will label the issue accordingly.
* A team member will try to reproduce the issue with your provided steps.

### Suggesting Enhancements

This section guides you through submitting an enhancement suggestion for Eatsmeet, **including completely new features and minor improvements to existing functionality**.

#### Before Submitting an Enhancement

* Make sure that you are using the latest version.
* Read the [documentation](README.md) carefully and find out if the functionality is already covered.
* Perform a [suspicious link removed] to see if the enhancement has already been suggested. If it has, add a comment to the existing issue instead of opening a new one.
* Find out whether your idea fits with the scope and aims of the project (Food Ordering System).

#### How Do I Submit a Good Enhancement Suggestion?

Enhancement suggestions are tracked as [suspicious link removed].

* Use a **clear and descriptive title** for the issue to identify the suggestion.
* Provide a **step-by-step description of the suggested enhancement** in as many details as possible.
* **Describe the current behavior** and **explain which behavior you expected to see instead** and why.
* **Explain why this enhancement would be useful** to most Eatsmeet users.

### Your First Code Contribution

1. **Fork the Project**: Click the "Fork" button on the top right of the GitHub page.
2. **Clone the Repository**:
```bash
git clone https://github.com/YOUR-USERNAME/eatsmeet.git
cd eatsmeet

```


3. **Create a Branch**:
```bash
git checkout -b feature/AmazingFeature

```


4. **Setup Environment**:
* Ensure MySQL is running and you have created a database named `eatsmeet`.
* Update `src/main/resources/application.properties` with your database credentials.


5. **Build and Run**:
* Use the Maven wrapper: `./mvnw clean install` and `./mvnw spring-boot:run`.


6. **Verify**: Ensure the API is accessible at `http://localhost:8080`.

### Improving The Documentation

Documentation improvements are always welcome! You can help by:

* Fixing typos in the `README.md`.
* Adding Javadoc comments to complex classes in `src/main/java`.
* Updating the Postman collection if API endpoints change.

## Styleguides

To ensure code consistency, please follow these guidelines:

### Java Coding Standards

* **Naming Conventions**:
* Classes: `PascalCase` (e.g., `FoodController`).
* Methods & Variables: `camelCase` (e.g., `findFoodById`).
* Constants: `UPPER_SNAKE_CASE` (e.g., `MAX_LOGIN_ATTEMPTS`).


* **Architecture**:
* **Controllers**: Should only handle HTTP requests and validation. Logic should be delegated to Services.
* **Services**: Contain the core business logic.
* **Repositories**: Interfaces extending `JpaRepository`.


* **Logging**: Avoid using `System.out.println`. Use a logger (SLF4J) instead.
* **DTOs**: Always use DTOs (Data Transfer Objects) for request and response bodies; do not expose Entities directly in the Controller.

### Commit Messages

We generally follow the [Conventional Commits](https://www.conventionalcommits.org/) specification.

* `feat: Add new curry endpoint`
* `fix: Resolve null pointer exception in Auth Service`
* `docs: Update README with setup instructions`
* `style: Fix indentation in EmployeeController`
* `refactor: Simplify cart calculation logic`

## Join The Project Team

If you are an active contributor and interested in a bigger role, feel free to reach out to the project owner!

## Attribution

This guide is based on the **contributing.md**. [Make your own](https://contributing.md/)!
