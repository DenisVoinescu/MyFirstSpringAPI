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

![image](https://github.com/DenisVoinescu/MyFirstSpringAPI/assets/126812746/f45a3c09-1a1f-4296-ac12-6879d321011b)


The count went up to 1800. Let's see again with the get method: 

![image](https://github.com/DenisVoinescu/MyFirstSpringAPI/assets/126812746/86ab841d-6751-44db-8b66-61346a8ddc0b)


Awesome.

Now let's try to delete the Ferrari Purosangue from the database since the owner doesn't want to sell it anymore:

![image](https://github.com/DenisVoinescu/MyFirstSpringAPI/assets/126812746/78e74d81-2fbb-4e7e-814d-a9b30604907b)

Reading all cars again: 

![image](https://github.com/DenisVoinescu/MyFirstSpringAPI/assets/126812746/546ade9b-0296-49e5-a7fd-be654558c647)

The Purosangue is gone.

![image](https://github.com/DenisVoinescu/MyFirstSpringAPI/assets/126812746/e312cf95-2087-4429-a679-8d96305aeb1c)


As you can see in this small project I learned how to use the 4 http methods and experienced a bit with Spring Boot.


