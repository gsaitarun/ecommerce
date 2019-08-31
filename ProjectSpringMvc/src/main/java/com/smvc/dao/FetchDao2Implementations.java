package com.smvc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.smvc.pojo.FetchPojo;
import com.smvc.pojo.FetchPojo2;
import com.smvc.pojo.FetchPojo3;

@Repository
public class FetchDao2Implementations implements FetchDao2 
{

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<FetchPojo> listCategory() 
	{
		System.out.println("implementsclass22");
		Session session = sessionFactory.getCurrentSession();
		//Query query = session.createQuery("from FetchPojo2 where id<4");
		/*
		 * Criteria c=session.createCriteria("FetchPojo2.class");
		 * c.add(Restrictions.lt("id",4));
		 */
		//List<FetchPojo2> list=c.list();  
		String hql = "FROM FetchPojo2 where id < 4 ";
		org.hibernate.Query query = session.createQuery(hql);
		System.out.println(""+query);
		List results = query.list();
	 System.out.println(results.iterator().hasNext());
	 return results;
		
		
		/*
		 * List<FetchPojo2> list = session.createQuery("from FetchPojo2").list();
		 * 
		 * for (FetchPojo2 fetchPojo2 : list) { System.out.println(fetchPojo2); }
		 */

		
	}

	@Transactional
	public List<FetchPojo2> listCategory2()   
	{
		System.out.println("implementsclass23");
		Session session = sessionFactory.getCurrentSession();
		String hql = "FROM FetchPojo2 where id < 2 ";
		 Query query = session.createQuery(hql);
		System.out.println(""+query);
		List results = (query).list();
		 return results ;
	}

	@Override
	@Transactional
	public List<FetchPojo2> getProductDetailsById(int parseInt) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "FROM FetchPojo2 where id = '"+parseInt+" '";
		 Query query = session.createQuery(hql);
		 System.out.println(query.list());
		return query.list();
	}

// this is trial for setting different images for different data
	/*
	@Transactional
	public List<FetchPojo3> getProductDetailsById(int parseInt) 
	{
		System.out.println("implementsclass23");
		Session session = sessionFactory.getCurrentSession();
		String query="from ProductModel where productId='"+parseInt+"'";
		List<FetchPojo3> list=session.createQuery(query).list();
		//System.out.println(""+query);
		//List results = (query).list();
		 return list ;
		*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	//this is the trial and errored sections
	
	//Query query = session.createQuery("from FetchPojo2 where id<4");
		/*
		 * Criteria c=session.createCriteria("FetchPojo2.class");
		 * c.add(Restrictions.lt("id",4));
		 */
		
	
		
		
		//List<FetchPojo2> list=c.list();  
		
		/*
		 * byte[] content = ((ResultSet) query).getBytes("image");
		 * response.setContentLength(content.length);
		 * response.getOutputStream().write(content); request.setAttribute("image",
		 * content); RequestDispatcher rd=request.getRequestDispatcher("View.jsp");
		 * rd.forward(request, response);
		 */  
		//String s = query.toString();
		
		/*
		 * ResultSet rs = (ResultSet) query.list();
		 * System.out.println(results.iterator().hasNext()); Blob blob =
		 * (Blob)rs.getBlob("image"); InputStream x = blob.getBinaryStream(); int size =
		 * x.available(); FileOutputStream out = new
		 * FileOutputStream("C:/Users/TO-OWDG-10/Desktop/rough/acer.jpg"); byte b[] =
		 * new byte[size]; x.read(b); out.write(b);
		 */
		/*
		 * Item item = (Item) results.get(1); response.setContentType(" image/jpg");
		 * response.getOutputStream();
		 */
	
	
	

	/*
	 * @RequestMapping(value = "/imageDisplay", method = RequestMethod.GET) public
	 * void showImage(@RequestParam("id") Integer itemId, HttpServletResponse
	 * response,HttpServletRequest request) throws ServletException, IOException{
	 */
/*
	    Item item = itemService.get(itemId);        
	    response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
	    response.getOutputStream().write(item.getItemImage());


	    response.getOutputStream().close();*/
	/*
	 * private void conversion() { ResultSet rs = (ResultSet) query.list();
	 * System.out.println(results.iterator().hasNext()); Blob blob =
	 * (Blob)rs.getBlob("image"); InputStream x = blob.getBinaryStream(); int size =
	 * x.available(); FileOutputStream out = new
	 * FileOutputStream("C:/Users/TO-OWDG-10/Desktop/rough/acer.jpg"); byte b[] =
	 * new byte[size]; x.read(b); out.write(b);
	 * 
	 * };
	 */
}