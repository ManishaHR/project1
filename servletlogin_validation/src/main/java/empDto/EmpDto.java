package empDto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmpDto {
	@Id
private String emailid;
private int password;
private String name;


public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
