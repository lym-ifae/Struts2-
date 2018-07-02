package com.marost.action;

public class HelloWorldAction {
    private String msg;
    private String msg2;
    
    public String getMessage() {
        return msg;
    }
    public String getDdd() {
    	return msg2;
    }
    public String Mmsg2() {
    	int a=1;
    	 if(a==0) {
    		 msg = "hi";
         	 msg2="Liu Seiming";
             return "fail";
    		 
    	 }
    	 msg = "hello";
     	 msg2="Liu MM";
         return "success";
 
    
    }
    public String execute(){
        msg = "ÄãºÃ£¡";
    	msg2="Liu Meiming";
        return "success";
    }
}