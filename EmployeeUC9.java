//Ability to save the Tota Wage for Each Company 

import java.lang.Math;

public class EmployeeUC9{
	
public static final  int partTime=1,fullTime=2;
private final int salaryPerHour;
private final String Company;
private final int workingDays ;
private final int maxWorkingHours;

public  EmployeeUC9(String company ,int salaryPerHour, int workingDays, int maxWorkingHours){
        this.company = company;
        this .salaryPerHour =  salaryPerHour;
        this.workingDays= workingDays;
        this.maxWorkingHours = maxWorkingHours;
}

	
public void ComputeEmployeeWage( ) {
	    	   
	    	   int empHours=0,totalEmpHours=0,totalWorkingDays=0,totalEmpWage=0;
	    	   
	    	   while(totalWorkingDays < workingDays && totalEmpHours < maxWorkingHours) {
	    		   
	    		   totalWorkingDays ++;
				    
					  int empCheck = (int)Math.floor(Math.random() *10 )% 3;
					  
					  
					  switch(empCheck) {
					  
					      case partTime:
						  System.out.println("Employee is Present Part Time");
						  empHours=4;
						  break;
						  
					      case fullTime:
					    	  System.out.println("Employee is Present Full Time");
					    	  empHours=8;
					    	  break;
					    	  
					      default:
					    	  System.out.println("Employee is Absent");
					    	  empHours=0;
					    	  
					  }
					  
					  

					    totalEmpHours += empHours;
					    System.out.println("DAY:"+ totalWorkingDays +" Emphrs:" + totalEmpHours);
					    	  
			    }
	    	   
	    	   
					    totalEmpWage= totalEmpHours * salaryPerHour;
					  
					    System.out.println("Total wage for company " + company + " is" + totalEmpWage);
					    return totalEmpWage;
					 	  
				
	       }

                       @Override
                        public String toString(){
                                  return "Total Emp Wage for Company: " +Company+ "is:" + totalEmpWage;
		}			  	
	    
	
		        public static void main(String[] args) {
			    
                                                  EmployeeUC9 Magic = new  EmployeeUC9("Magic" , 23,3,10);
                                                  EmployeeUC9 Magic = new  EmployeeUC9("HSBC" , 40,5,15);
                                                  
			   
			      
			
		
		  }
				           			    

	}