package model;

import org.hibernate.*;
import java.io.*;
import java.util.*;

public abstract class AbstractModel<T>{
	
	private Class<T> entity;
	private SessionFactory sessionFactory =HibernateUtil.getSessionFactory();
	
	public AbstractModel(Class<T> t){
		this.entity=t;
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findAll(){
		List<T> result=null;
		Session session=sessionFactory.openSession();
		Transaction transaction=null;
		try{
			transaction=session.beginTransaction();
			result=session.createQuery("from " +entity.getName()).list();
			transaction.commit();
		}catch(Exception e){
			result=null;
			if(transaction !=null){
				transaction.rollback();
			}
				
		}finally{
			session.close();
		}
		return result;
	}
	public T find(Object id){
		T result=null;
		Session session=sessionFactory.openSession();
		Transaction transaction=null;
		try{
			transaction=session.beginTransaction();
			result=(T) session.get(entity,(Serializable) id);
			transaction.commit();
		}catch(Exception e){
			result=null;
			if(transaction !=null){
				transaction.rollback();
			}
				
		}finally{
			session.close();
		}
		return result;
	}
	public void create(T entity){
		Session session=sessionFactory.openSession();
		Transaction transaction=null;
		try{
			transaction=session.beginTransaction();
			session.save(entity);
			transaction.commit();
		}catch(Exception e){
			
			if(transaction !=null){
				transaction.rollback();
			}
				
		}finally{
			session.close();
		}
		
	}
	public void update(T entity){
		Session session=sessionFactory.openSession();
		Transaction transaction=null;
		try{
			transaction=session.beginTransaction();
			session.update(entity);
			transaction.commit();
		}catch(Exception e){
			
			if(transaction !=null){
				transaction.rollback();
			}
				
		}finally{
			session.close();
		}
		
	}
	public void delete(T entity){
		Session session=sessionFactory.openSession();
		Transaction transaction=null;
		try{
			transaction=session.beginTransaction();
			session.delete(entity);
			transaction.commit();
		}catch(Exception e){
			
			if(transaction !=null){
				transaction.rollback();
			}
				
		}finally{
			session.close();
		}
		
	}
	
}
