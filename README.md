# MyFirstSpringAPI
In this project I used Spring Boot and implemented the main HTTP methods (get, post, put, delete).
I used PostgreSQL and Postman.

First let's use Postman get method to see if there are any car objects existing in my database: 

![image](https://github.com/DenisVoinescu/MyFirstSpringAPI/assets/126812746/7c35cfac-03e4-4a23-8bec-22a46b458861)

Looks like it's empty. Let's add some: 

![image](https://github.com/DenisVoinescu/MyFirstSpringAPI/assets/126812746/ea2e31f8-6e82-4363-ad53-aa4531dcb212)
![image](https://github.com/DenisVoinescu/MyFirstSpringAPI/assets/126812746/ef73ab37-ad87-4a33-b448-0074959ba192)

Great!

![image](https://github.com/DenisVoinescu/MyFirstSpringAPI/assets/126812746/7eafbfaa-638e-4bb0-a0ee-eecd971cd908)



Now let's use the get method again to see if anything changed: 

![image](https://github.com/DenisVoinescu/MyFirstSpringAPI/assets/126812746/26247be7-f328-4733-a552-f53151da8cb1)
![image](https://github.com/DenisVoinescu/MyFirstSpringAPI/assets/126812746/dc747f5e-c05c-4e09-84cc-ece50c245c61)


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


