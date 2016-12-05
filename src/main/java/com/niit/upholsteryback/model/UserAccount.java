package com.niit.upholsteryback.model;




/*import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "UserAccount")
@Component
public class UserAccount {
	@Id
	@Column
	@GeneratedValue
		private int userid;
	
	
		private String username;
	
	
		private String gender;
	
		private String emailid;
	
		private String password;
	
		private int mobilenumber;

		private String address;

	private boolean enabled=true;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(int mobilennumber) {
		this.mobilennumber = mobilenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


}
*/


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "UserAccount")
@Component
public class UserAccount {
	@Id
	@Column
	@GeneratedValue
		private int userid;
	
	@Column
		private String username;
	
	@Column
		private String gender;
	@Column
		private String emailid;
	@Column
		private String password;
	@Column
		private int mobilenumber;
	@Column
		private String address;
	@Column
	private boolean enabled=true;

public boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="userid")

private Role role;
		public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
}
		public int getUserId() {
		 return userid;
		}
		public void setUserId(int userid) {
		 this.userid = userid;
		}
		
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getGender() {
			 return gender;
			}
			public void setGender(String gender) {
			 this.gender =gender;
			}
		public String getEmailid() {
		 return emailid;
		}
		public void setEmailid(String emailid) {
		 this.emailid = emailid;
		}
		public String Password() {
			 return password;
		}
		public void setPassword(String password) {
		 this.password = password;
		}
		
		
		public int getMobilenumber() {
			return mobilenumber;
		}
		public void setMobilenumber(int mobilenumber) {
			this.mobilenumber = mobilenumber;
		}
		public String getAddress() {
		 return address;
		}
		public void setAddress(String address) {
		 this.address = address;
		}
		
			
		}
