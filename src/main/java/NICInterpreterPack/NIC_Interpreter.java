package NICInterpreterPack;
import org.joda.time.*;
import NICInterpreterPack.InvalidNicException;

public class NIC_Interpreter {
    
   private String NICNumber;
   private int year;
   private int month;
   private int day;
   private int number_of_Days;
   private boolean isMale;
   private boolean is_a_Voter;
   DateTime currentDate;
   
   

    public NIC_Interpreter(String NICNum)throws InvalidNicException {
        this.NICNumber = NICNum;
      
        year = 1900+Integer.parseInt(NICNum.substring(0,2));
        number_of_Days = Integer.parseInt(NICNum.substring(2,5));
        
   
        if(number_of_Days>=500){
            isMale=false;
            number_of_Days=number_of_Days-500;
        }else{
            isMale=true;
        }
        
        currentDate = new DateTime();
        
        DateTime dt = new DateTime(2012,1,1,0,0,0);
        dt = dt.plusDays(number_of_Days-1);
        month=dt.getMonthOfYear();
        day=dt.getDayOfMonth();
        DateTime bDay = new DateTime(year,month,day,0,0,0);
        
        
        if (bDay.plusYears(18).compareTo(currentDate)<0){
            is_a_Voter=true;
        }
        else{
            is_a_Voter=false;
        }
    }
    
    public int getYear(){
        return year;
    }
    
    public int getMonth(){
        return month;
    }
    
    public int getDate(){
        return day;
    }
    
    public String getGender(){
        if(isMale){
            return "Male";
        }else{
            return "Female";
        }
    }
    
    public String isVoter(){
        if(is_a_Voter){
            return "True";
        }else{
            return "False";
        }
    }
    
}
