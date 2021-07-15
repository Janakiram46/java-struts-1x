package com.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.entity.TicketEntity;
import com.forms.UserDataForm;
import com.repos.TicketDAO;

public class TicketHistoryAction extends Action
{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		UserDataForm udf=(UserDataForm) form;
		List<TicketEntity> l=TicketDAO.getDetails(udf.getUsername());	
		System.out.println(l);
		request.getSession().setAttribute("tickets",l);	
		return mapping.findForward("success");
	
		
	}

}
