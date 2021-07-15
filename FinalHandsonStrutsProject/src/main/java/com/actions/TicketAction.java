package com.actions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.entity.StatusEntity;
import com.entity.TicketEntity;
import com.entity.UserDataEntity;
import com.forms.TicketForm;
import com.forms.UserDataForm;
import com.repos.TicketDAO;
import com.repos.UserDataDAO;

public class TicketAction extends Action
{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub	
		TicketForm tf=(TicketForm) form;
		System.out.println(tf.toString());
		TicketEntity te=new TicketEntity();
		te.setSubject(tf.getSubject());
		
		te.setDescription(tf.getDescription());
		
		te.setStatus("open");
		UserDataForm ufe= (UserDataForm) request.getSession().getAttribute("user");
		
		System.out.println("In TicketAction,"+request.getSession().getAttribute("user"));
		te.setByusername(ufe.getUsername());	
		LocalDate localDate = LocalDate.now();
        
        //Get LocalDate from SQL date
        java.sql.Date sqlDate = java.sql.Date.valueOf( localDate );
        te.setDateraised(sqlDate);
        List<UserDataEntity> list=TicketDAO.getAdminList();
         System.out.println(list);
        Random random=new Random();
		int r=random.nextInt(list.size());
		System.out.println(r);
		System.out.println(list.get(r).getUsername());
		//te.setToadminname(list.get(r).getUsertype());
		te.setToadminname(list.get(r).getUsername());
		System.out.println(te.toString());
       
      
		System.out.println(te);
		
	    if(TicketDAO.addTicket(te))
	    {
	    	System.out.println(te);
	    	
	    	return mapping.findForward("Tickets");
	    }
	    return mapping.findForward("error");
		
		
	}

}
