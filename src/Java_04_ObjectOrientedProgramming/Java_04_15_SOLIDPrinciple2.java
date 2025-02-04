package Java_04_ObjectOrientedProgramming;

import javax.management.Notification;

public class Java_04_15_SOLIDPrinciple2 {
    public static void main(String[] args) {
        NotificationService s = new SendOTP();
        s.sendNotification("hello");
        s = new SendEmail();
        s.sendNotification("test 2");

    }
}


/*
    SRP-> A class can only be changed by one stakeholder or a group of stakeholder. Only
    those function will remain, without whom the class will not be able to function properly
*/
// Breaking SRP...
class UserUpdate{
    String getMessage(){ // related to database
        return "";
    }
    void sendMessage(){ // related to internet

    }
}

// Follows SRP...
class GetInfo{
    String getMessage(){
        return "";
    }
}

class SendInfo{
    void sendMessage(){
        //...
    }
}

// OCP -> Open for extension and Closed for modification. editing is not the problem.
//  The problem is -> being able to edit.

// It is editable.
class SendInfoo{
    void sendMessage(String str){
        //...
    }
    void SendEmail(String str){
        //...
    }
    void sendOTP(String str){
        //...
    }
    //we can add more function in here. that is the problem
}

//Here is the solution.
interface NotificationService{
    void sendNotification(String message);
}

class SendEmail implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("From email: " + message);
    }
}

class SendOTP implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("From otp: " + message);
    }
}
class UseCaseNotification{
    public void use(NotificationService service){
        service = new SendOTP();
        service.sendNotification("test 1");


    }
}


