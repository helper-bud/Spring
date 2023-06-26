This is the most used configuration. The video that was followed to build up this configuration is : https://www.youtube.com/watch?v=If1Lw4pLLEo&t=2350s

### How to implement in the most basic way
1. Create the spring file and add the dependency beans. but dont add the "<context:component-scan base-package="com.example.shykat.demo"></context:component-scan>" yet. Beacuse you need to create file for that.
2. Then create the Vehicle(2) interface which hase a drive method which will be used by the Car.java(3) and Bike.java (4)
3. To use this file without adding them one by one in the xml. Add @Component at the begining of the file, so that it can be used as a annotation based component. 
4. Then add the code in the spring.xml
5. In the App.java(5), now you can easily "applicationContext.getBean("bike");" ask anything in the file or object
