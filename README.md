# MyFirstSpringAPI
In this project I used Spring Boot and implemented the main HTTP methods (get, post, put, delete).
I used PostgreSQL and Postman.

First let's use Postman get method to see if there are any car objects existing in my database: 

![image](https://github.com/DenisVoinescu/MyFirstSpringAPI/assets/126812746/7c35cfac-03e4-4a23-8bec-22a46b458861)

Looks like it's empty. Let's add some: 

![image](https://github.com/DenisVoinescu/MyFirstSpringAPI/assets/126812746/d2c814bd-10fc-4288-8917-a06be9804864)

![image](https://github.com/DenisVoinescu/MyFirstSpringAPI/assets/126812746/508adb5b-2a2a-439c-9df7-8764cf735d51)


Now let's use the get method again to see if anything changed: 

![image](https://github.com/DenisVoinescu/MyFirstSpringAPI/assets/126812746/91913bae-479b-4f29-a9f5-fa8a4fef011c)

![image](https://github.com/DenisVoinescu/MyFirstSpringAPI/assets/126812746/261aa0e3-c026-49ef-ac51-b2ae6174c316)



Nice. Now let's update the kilometer count on the Ferrari Portofino, since the owner is still using it while it's listed for sale: 

![image](https://github.com/DenisVoinescu/MyFirstSpringAPI/assets/126812746/d8d86cfe-8c0d-497d-8740-187bd2926eb6)

The count went up to 4100. Let's see again with the get method: 

![image](https://github.com/DenisVoinescu/MyFirstSpringAPI/assets/126812746/172f5877-9a7c-47a9-afaa-58dbd5889ca0)

Awesome.

Now let's try to delete the Ferrari Purosangue from the database since the owner doesn't want to sell it anymore:

![image](https://github.com/DenisVoinescu/MyFirstSpringAPI/assets/126812746/4de7925f-81e1-4f29-94f2-1bb9f7303b02)

Reading all cars again: 

![image](https://github.com/DenisVoinescu/MyFirstSpringAPI/assets/126812746/96260d33-044c-42ed-9565-ee0754ed043c)

The Purosangue is gone.

![image](https://github.com/DenisVoinescu/MyFirstSpringAPI/assets/126812746/7a875b77-d161-4336-a262-54142459e073)

As you can see in this small project I learned how to use the 4 methods and experienced a bit with Spring Boot.


