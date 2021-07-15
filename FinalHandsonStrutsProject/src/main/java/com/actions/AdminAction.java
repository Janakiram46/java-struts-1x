package com.actions;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.entity.TicketEntity;
import com.entity.TicketHistoryEntity;
import com.forms.TicketHistoryForm;
import com.forms.UserDataForm;
import com.repos.AdminDAO;

public class AdminAction extends Action
{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		
		TicketEntity te=new TicketEntity();
		TicketHistoryForm thf=(TicketHistoryForm) form;
		System.out.println(thf.toString());
		TicketHistoryEntity the=new TicketHistoryEntity();
		the.setMessage(thf.getMessage());
		int k=461;
		the.setSno(k);
		UserDataForm ufe= (UserDataForm) request.getSession().getAttribute("user");
       List<TicketEntity> ticketid=AdminDAO.getIdDetails(ufe.getUsername());
       System.out.println(ticketid.size());
      for(int i=0;i<ticketid.size();i++)
      {
    	  int t=ticketid.get(i).getTicketid();
    	  the.setTicketid(t);
    	System.out.println(ticketid.get(i).getTicketid());
    	 
    	 
      }
		//System.out.println(ticketid.get(r));
		
		//the.setTicketid(4608);
      
        
        LocalDate localDate = LocalDate.now();
        java.sql.Date sqlDate = java.sql.Date.valueOf( localDate );
        the.setTimestamp(sqlDate);
        System.out.println(the.toString());
        if(AdminDAO.addTicket(the))
        {
        	System.out.println(the.toString());
        }
		return mapping.findForward("history");
	}

}
