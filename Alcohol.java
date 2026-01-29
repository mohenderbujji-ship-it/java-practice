class Alcohol{
String 	brand = " jack daniels";
double price =3090.21;
String litter = "750 ml";
byte no_bottels = 7;
 
public static void main (String args[]){
// System.out.println(price);
/*
 java cant print the price because the variables created
 outside of the method block so it cant call the variable 
 price here
*/

Alcohol bottel = new Alcohol();

//System.out.println(bottel); 
/*
 here if you print the object stright away then it will print
 the address of the object
*/
// to print the object's inside variables you need to code (objectname.variable)

System.out.println(bottel.litter);  

}
}