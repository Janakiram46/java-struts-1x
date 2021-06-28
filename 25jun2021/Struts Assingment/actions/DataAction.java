package com.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.forms.PeopleForm;

public class DataAction extends DispatchAction{


	@Override
	public ActionForward unspecified(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Action got invoked");
       return mapping.findForward("success");
	}

	public ActionForward store(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		 PeopleForm person=(PeopleForm)form;
	        request.setAttribute("id", person.getId());
	        request.setAttribute("name", person.getName());
	        request.setAttribute("city", person.getCity());
	        request.setAttribute("mobileno", person.getMobileno());
			return mapping.findForward("result");
	}
}


