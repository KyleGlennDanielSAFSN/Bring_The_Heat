# Bring_The_Heat Written by the devoloper of the application Kyle Daniel
The Heat Index calculator is a simple program that I created for a class project. The goal of this project is that it calculates the heat index when given the current temparature and the current humidity level. The basics of how the program does this primarily lies in the mathematical formula it uses. The formula is stated below.
 HI = C1 +(C2 * T)+(C3 * R)+(C4 * T * R)+(C5 * (T*T))+(C6 * R*R)+(C7 * (T*T)* R)+(C8 * T * R*R)+(C9 * (T*T) * (R*R)
Where HI is the heat index, T is temperature in farenheit and R is the percentage of humidity in the air entered as a double data type. For instance if it is currently forty three point seven percent humidity currently the user should enter the data as "43.7". The temperature should be entered as an interger meaning that there are no decimal points when entering data related to the temperature. All of the other variables are set within the program itself and are not impacted by user input. The remaining variables are as follow: C1 = -42.379 C2 = 2.04901523 C3 = 10.14333127 C4 = -0.22475541 C5 = -.00683783 C6 = -5.481717E-2 C7 = 1.22874E-3 C8 = 8.5282E-4 
C9 = -1.99E-6. These variables were calculated by experts in the field of meteorology and I have taken their data to create an easy to use application capable of calculating the current heat index.  Now that the math is out of the way I will wlak through what i did to make it work.
I will not cover every single line I will simply summarize how it work. I import and set up the scanner so i am able to take input from the user for the variables T and R. I then welcome the user to the program and have them input their data. I then put their data into the calculation and run the numbers. I then set the amount of decimal points to two and print the heat index. I also make sure to thank the user for using my product and instruct them to have a nice day.
It should be noted that this is object oriented programming that calls a function from another application nestled into the same package. both files are included and required to run effectively.
