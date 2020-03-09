# Doctor-Appointment-Booking-System
It is web application which helps to book appointment with the Doctor
           SOFTWARE REQUIREMENT SPECIFICATION
Introduction
1.1 Purpose
This document is to describe all the software requirement specification (SRS) for the Doctor Appointment Booking System. The system aims to help the patients to take appointments online through the internet and track their records through it.Polyclinic has been facing problems due to its paper-based appointment system. With the increase in the number of patients visiting, it has become difficult to manage the appointment system manually.The purpose of this project is to solve these complications by creating custom-built database software to manage the appointment system. For the user/patient it makes it easy to set date and time for the treatment of the patient to the relevant doctor.It also helps to maintain doctor’s consultation fee.Above all,it helps to develop a simple user interface to help the user with the doctors’ arrangement.  
1.2 Intended Users and Reading Suggestions
Developers: In order to be sure they are developing the right project that fulfills requirements provided in this document.
Testers: In order to have an exact list of the features and functions that has to respond according to requirements and provided diagrams.
Users: In order to get familiar with the idea of the project and suggest other features that would make it even more functional.
Documentation writers: To know what features and in what way they have to explain. What security technologies are required, how the system will respond in each user’s action etc.
Patients: In order to know exactly what they have to expect from the system, right inputs and outputs and response in error situations.

1.3 Project Scope
The system has been facing problems due to its paper-based appointment system.So The Doctor Appointment booking system is a web-application which gives a solution to the polyclinic patients. This system which manages complete booking details in a single application and in a single database.The users will use this system to handle all the functionalities easily.The intentions of the system are to reduce overtime pay and increase the number of patients that can be treated accurately.Requirements statements in this document are both functional and non-functional. 
1.4 References
Books              : Software Engineering:A Practitioner’s Approach, 7/e by Roger S. Pressman
Websites	: https://netbeans.org/kb/74/index.html
                         https://www.smartdraw.com/uml-diagram/
2. Overall Description
2.1 Product Perspective
This software is a totally independent system that manages activities of the Appointment system  such as taking appointments, generating patient reports, and profile management.
In this project all the records are stored in a single database. Different users have different permission to access this web application. Each user has a unique id making it more secure. 

2.2 Product Features
Authentication for different users.
Real-time validation of all fields and database to prevent errors.
History of patients recorded in database. 
Maintaining the billing section of the appointment. 
2.3 User Classes and Characteristics	
Patients:The Patients will be the main users. The system is also designed to be user-friendly. 
Patients can view their appointment history and doctors details and timings. And also can take appointments online.
2.4 Assumptions and Dependencies
The code should be free with compilation errors/syntax errors.
The product must have an interface which is simple enough to understand.
2.5 System Features
2.5.1 Login Account
2.5.1.1 Description:
To open the user account the users have to enter login information.
2.5.1.2 Stimulus/response
Users must enter valid user id and password to open the user page. If it is valid then it links to the user account page. If the user is new  he/she has to register.
      	2.5.1.3 Basic data flow
Here first the user enters their login id and password.
After entering the login information system checks whether entered login id and password is valid or not.
If it is valid then it is linked to the user account.
If the user doesn’t have a user account then the user needs to register.

     2.5.2 Online appointment:
2.5.2.1 Description:
Patients can take appointments online based on the availability of the doctor on specified date and time. Patients have to register or login to take appointments online.
     2.5.3 Basic data flow
Patient first logs into the website.
After logging in, the patient gets multiple options like cancelling, making an appointment,  editing the appointment.
After selecting a make appointment, the patient can confirm his appointment by selecting doctors according to the timings.
After selecting the edit option, the patient can edit his/her appointment according to doctor timings.
He can also cancel his appointment.
2.5.3.1 Functional requirements
Patients can take appointments online.
patients can view the old appointment details and their records.


3. External Interface Requirement
3.1 User Interfaces
The user interface is designed in JAVA Swings and Applets. The user of the product will get a very user friendly web page which will be very easy to work with.

3.2 Hardware Interfaces
The system should have these hardware requirements:
Processor: Intel Pentium4 2.00GHz or above
Memory: 512MB or above
Hard Disk Drive: 40MB or above

3.3 Software Interfaces
Front end : Swings,  Applets
Language : JAVA 
Back End: MySQL

3.4 Communications Interfaces
Communication is done through the internet and intranet.

4.Other Non-functionalRequirements
4.1 Performance Requirements
Doctor Appointment Booking System manages facilities required by the casual users quickly and easily. It offers to take appointments faster through online. It takes appointment details from the patients and sends the appointment date and timings to the particular patient.
4.2 Safety Requirements
In case the user forgets his Password, the repair functionality helps by choosing the “forgot password” option in the main login window.
To avoid this kind of situation, backups can be done regularly.

4.3 Security Requirements
This system is provided with authentication without which no user can pass. So only the legitimate users are allowed to use the application. If the legitimate users share the authentication information then the system is open to outsiders.
4.4 Software Quality Attributes
Reliability: Good validations of user inputs will be done to avoid incorrect storage of records.
Maintainability: During the maintenance stage, SRS documents can be referred for any validations.
Flexibility: The system keeps on updating the data according to the transactions that take place.
Timeless: The system carries out all the operations with consumption of very less time.
Security: Security of the system is maintained by giving access to only authenticated user id and password.
