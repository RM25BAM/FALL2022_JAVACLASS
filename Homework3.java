/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
/**
 *
 * @author natashapiedrabuena
 /*
public class Homework3 {
    
    /**
     * @param args the command line arguments
     */
/*
    public static void main(String[] args) {
        int point=0;
        int firstPoint=0;
        int diceNum1=getDice();
        int diceNum2=getDice();
        int sumOfDice= diceNum1 + diceNum2;
        if(sumOfDice== 7 ||sumOfDice == 11){
            System.out.printf( "Player rolled %d + %d = %d\n",diceNum1,diceNum2,sumOfDice);
            System.out.println("You Win");
            System.exit(0);
        }
        else if(sumOfDice==2||sumOfDice==3||sumOfDice==12){
            System.out.printf( "Player rolled %d + %d = %d\n",diceNum1,diceNum2,sumOfDice);
            System.out.println("You Lose");// craps
            System.exit(0);
        } 
        else{
                while(true){
                    diceNum1= getDice();
                    diceNum2= getDice();
                    sumOfDice = diceNum1 + diceNum2;
                    if(sumOfDice==7){
                        System.out.printf( "Player rolled %d + %d = %d\n",diceNum1,diceNum2,sumOfDice);
                        System.out.println("You Lose");
                        System.exit(0);
                    }
                    else if(sumOfDice==2||sumOfDice==3||sumOfDice==12){
                        System.out.printf( "Player rolled %d + %d = %d\n",diceNum1,diceNum2,sumOfDice);
                        System.out.println("You Lose");// craps
                        System.exit(0);
                    }        
                    if(sumOfDice==4||sumOfDice==5||sumOfDice==6||sumOfDice==8||sumOfDice==9||sumOfDice==10||sumOfDice==11){
                        if(point==0){
                           firstPoint = sumOfDice;
                        }
                        else if(firstPoint==point){
                           System.out.printf( "Player rolled %d + %d = %d\n",diceNum1,diceNum2,sumOfDice);
                           System.out.println("You Win");
                           System.exit(0);        
                        }
                        point = sumOfDice;
                        System.out.printf( "Player rolled %d + %d = %d\n",diceNum1,diceNum2,sumOfDice);
                        System.out.printf("point is %"+ point);
                    }
                        
                            //need to figure out how to compare the point to the rolled dice. if they are the same
                    }
                    
                }
               
        }   
    */
     
    
    /**
     *
     * @return
     */
/*
        public static int getDice(){
            int diceGen = 1+(int)(Math.random()*((5)+1));
            return diceGen;
            
    }
}
*/
 
 
   

// sum is right
//issues arise with getting the rolled value of dice Num 1 and 2
//issues if number is greater than 10, issues that nunber can reach up to 12 6 + 6 = 12anything less than 12
//theoretically speaking you can roll a minimum of 2 all the way to 12. dice is 1 to 6. 


//when stacking points, find way to store the points... maybe in an array so we dont lose the values of the points


package practiceproblem2;
public class Homework3 {
public static void main (String[] args){

int point=0;
int tempPoint=0;
while(true){
int sumOfDice = getDice() ;
switch(sumOfDice){
case 7:case 11:
if (point==0){
    System. out.println( "You Win");// its natural if the first roll(come out roll) is 7 or 11( meaning you win
    System.exit(0);
}
else{
    System. out.println("You Lose");
    System. exit (0);
}
case 2: case 3: case 12:
    System.out.println("You Lose"); // craps
    System.exit(0);
case 4: case 5: case 6: case 8: case 9: case 10:// how to get the point 
    if(point== 0){
       tempPoint = sumOfDice;
       point = sumOfDice;
       System.out.printf ("point is %d \n", point);
       break;
    }
    if(tempPoint==sumOfDice){
        System.out.println("You Win" );
        System.exit(0);
    }
    }
  }
 }

public static int getDice(){
int diceNum1 = 1+(int) (Math.random()*( (5) +1)) ;
int diceNum2 = 1+(int) (Math.random()*( (5)+1));// same as saving (6) but just following formula Min + (int) (Math.random() * ((Max - Min)
System.out.printf( "Player rolled  % d + %d = %d \n ", diceNum1, diceNum2, diceNum1 + diceNum2 );
return diceNum1 + diceNum2;
  }
}