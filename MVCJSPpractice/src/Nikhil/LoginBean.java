package Nikhil;
public class LoginBean {  
private String name,password,studnumber;    
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
public String getPassword() {  
    return password;  
}  
public void setPassword(String password) {  
    this.password = password;  
}  
public boolean validate(){  
    if((password.equals("admin")) && (studnumber.equals("admin"))){  
        return true;  
    }else{  
        return false;  
    }  
}




public String getStudnumber() {
	return studnumber;
}
public void setStudnumber(String studnumber) {
	this.studnumber = studnumber;
}  
}  
