package com.niit.upholsteryback.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ramya.UpholsteryBack.model.Card;
import com.ramya.UpholsteryBack.model.Cart;
import com.ramya.UpholsteryBack.model.Category;
import com.ramya.UpholsteryBack.model.Product;
import com.ramya.UpholsteryBack.model.Role;
import com.ramya.UpholsteryBack.model.ShippingAddress;
import com.ramya.UpholsteryBack.model.Supplier;
import com.ramya.UpholsteryBack.model.UserAccount;
import com.ramya.UpholsteryBack.service.CardDAOImpl;
import com.ramya.UpholsteryBack.service.CartDAOImpl;
import com.ramya.UpholsteryBack.service.ProductDAOImpl;
import com.ramya.UpholsteryBack.service.RoleDAOImpl;
import com.ramya.UpholsteryBack.service.ShippingAddressDAOImpl;
import com.ramya.UpholsteryBack.service.SupplierDAOImpl;

import com.ramya.UpholsteryBack.service.UserAccountDAOImpl;


@Configuration
@ComponentScan("com.ramya.*")
@EnableTransactionManagement
public class ApplicationContextConfig {
	
	@Autowired
	@Bean(name="datasource")
	public DataSource getH2DataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/upholsteryback");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		return dataSource;	
	}
	private Properties getHibernateProperties() {
		Properties properties=new Properties();
		 properties.put("hibernate.show_sql","true");
		 properties.put("hibernate.hbm2ddl.auto","update");
		 properties.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		 properties.put("hibernate.format_sql","true");
		return properties;
	}
	
	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder sessionBuilder=new LocalSessionFactoryBuilder(dataSource);
		  sessionBuilder.addProperties(getHibernateProperties());
		  sessionBuilder.addAnnotatedClass(Role.class);
		  sessionBuilder.addAnnotatedClass(UserAccount.class);
		  sessionBuilder.addAnnotatedClass(Cart.class);
		  sessionBuilder.addAnnotatedClass(Product.class);
		  sessionBuilder.addAnnotatedClass(Category.class);
		 
		  sessionBuilder.addAnnotatedClass(Supplier.class);
		  sessionBuilder.addAnnotatedClass(ShippingAddress.class);
		  sessionBuilder.addAnnotatedClass(Card.class);
		  return sessionBuilder.buildSessionFactory();	  
		
	}
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager transcationManager=new HibernateTransactionManager(sessionFactory);
		return transcationManager;
	}
	
    @Autowired(required=true)  
    @Bean(name="useraccountDAO")
    public UserAccountDAOImpl getUserAccountDAO(SessionFactory sessionFactory) {
	      return new UserAccountDAOImpl(sessionFactory);
    }
  
    @Autowired(required=true)  
    @Bean(name="productDAO")
    public ProductDAOImpl getProductDAO(SessionFactory sessionFactory) {
	      return new ProductDAOImpl(sessionFactory);
    
    }
    
    @Autowired(required=true)  
    @Bean(name="supplierDAO")
    public SupplierDAOImpl getSupplierDAO(SessionFactory sessionFactory) {
	      return new SupplierDAOImpl(sessionFactory);
    
    }
   
   
    @Autowired(required=true)  
    @Bean(name="cartDAO")
    public CartDAOImpl getCartDAO(SessionFactory sessionFactory) {
	      return new CartDAOImpl(sessionFactory);
    
    }
    
    @Autowired(required=true)  
    @Bean(name="shippingaddressDAO")
    public ShippingAddressDAOImpl getShippingAddressDAO(SessionFactory sessionFactory) {
	      return new ShippingAddressDAOImpl(sessionFactory);
    
    }
    
    
    @Autowired(required=true)  
    @Bean(name="roleDAO")
    public RoleDAOImpl getRoleDAO(SessionFactory sessionFactory) {
	      return new RoleDAOImpl(sessionFactory);
    
    }
    
    
    @Autowired(required=true)  
    @Bean(name="cardDAO")
    public CardDAOImpl getCardDAO(SessionFactory sessionFactory) {
	      return new CardDAOImpl(sessionFactory);
    
    }
    
    
    
}