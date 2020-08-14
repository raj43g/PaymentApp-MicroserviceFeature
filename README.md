# PaymentApp-MicroserviceFeature

Payment CRUD Application POC using Springboot + Kafka + mongoDb (with microservice feature enabled)


Overview

The project having 3 different modules namely account, alert and user , all the modules has been deployed into the Eureka naming server to have microservice behaviour to the application.

Step 1 : Import the code shared in Github : and set it up into your worksapce.

Step 2 : Connect to mongodb before running any app launcher class.

Step 3 : First ran Eureka naming server appliation launcher and validate it, then you can deploy other modules in the order like account, alert and user module into the eureka naming server.(validate whether all the modules has been deloyed into eureka server or not)

Step 4 : Spring security has been added as part of this project for the roles like USER and ADMIN. (for the first time you need to create the 1 user role for admin and user to get started with the application before you create, To do this you have uncomment the code section from the user module application launcher class i.e WellsFargoPaymentUserApplication.java )

Step 5: Security has been provided for the email id, it should be unique everytime you create new user and admin roles. While doing the testing through POSTMAN API, provide the email and password section in Authorization to validate and allow you to perfrom with the crud operations of account and alert modules.

Step 6: Validate the data in the mongodb for all the crud operations which you had performed.
