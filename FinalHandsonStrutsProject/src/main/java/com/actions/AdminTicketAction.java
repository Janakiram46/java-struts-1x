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

public class AdminTicketAction extends Action
{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		UserDataForm udf=(UserDataForm) form;
		List<TicketEntity> l=TicketDAO.getAdmin(udf.getUsername());
		request.getSession().setAttribute("admin", l);
		return mapping.findForward("admin");
	}

}
