package com.niit.upholsteryback.model;

/*import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "Role")
@Component

public class Role {
		
		@Id
		@Column
		@GeneratedValue(generator = "newGenerator")
		@GenericGenerator(name="newGenerator",strategy="foreign", 
		parameters = {@Parameter(value = "useraccount", name="property")})
		
	  private int userid; 
		
	
		private  int roleid;
		@Column
	     private String role; 
		@Column
		 private String password;
		@Column
		  private String username;
		@Column
		 private boolean enabled;
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name="userid")

private UserAccount  useraccount; 
		
		public UserAccount getUseraccount() {
			return useraccount;
		}
		public void setUseraccount(UserAccount useraccount) {
			this.useraccount = useraccount;
		}
		public int getRoleId() {
		 return roleid;
		}
		public void setRoleId(int roleid) {
			this.roleid = roleid;
		}
		
		public String getPassword() {
		 return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}

		public String getUsername() {
			 return username;
			}
			public void setUsername(String username) {
				this.username = username;
			}
			
				public boolean getEnabled() {
				return enabled;
			}
			public void setEnabled(boolean enabled) {
				this.enabled = enabled;
			}
				public String getRole() {
					 return role;
					}
					public void setRole(String role) {
						this.role= role;
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
@Table(name = "Role")
@Component

public class Role {
		
		@Id
		@Column
		@GeneratedValue/*(generator = "newGenerator")*/
	/*	@GenericGenerator(name="newGenerator",strategy="foreign", 
		parameters = {@Parameter(value = "useraccount", name="property")})
		*/
	  private int userid; 
		@Column
		private  int roleid;
		@Column
	     private String role; 
		@Column
		 private String password;
		@Column
		  private String username;
		@Column
		 private boolean enabled;
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name="userid")

private UserAccount  useraccount; 
		
		public UserAccount getUseraccount() {
			return useraccount;
		}
		public void setUseraccount(UserAccount useraccount) {
			this.useraccount = useraccount;
		}
		public int getRoleId() {
		 return roleid;
		}
		public void setRoleId(int roleid) {
			this.roleid = roleid;
		}
		public int getUserId() {
		 return userid;
		}
		public void setUserId(int userid) {
		    this.userid = userid;
		}
		public String getPassword() {
		 return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}

		public String getUsername() {
			 return username;
			}
			public void setUsername(String username) {
				this.username = username;
			}
			
				public boolean getEnabled() {
				return enabled;
			}
			public void setEnabled(boolean enabled) {
				this.enabled = enabled;
			}
				public String getRole() {
					 return role;
					}
					public void setRole(String role) {
						this.role= role;
					}
			
		}

