package com.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.entity.UserRegisterEntity;
import com.forms.UserRegisterForm;
import com.repos.UserRegisterDAO;

public class UserRegisterAction extends Action
{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		UserRegisterForm urf=(UserRegisterForm) form;
		System.out.println(urf.toString());
		
		UserRegisterEntity ure=new UserRegisterEntity();
		ure.setUsername(urf.getUsername());
		ure.setPassword(urf.getPassword());
		ure.setMobilenumber(urf.getMobilenumber());
		ure.setAddress(urf.getAddress());
		ure.setEmail(urf.getEmail());
		System.out.println(ure.toString());
		
		if(UserRegisterDAO.addUserData(ure))
		{
			System.out.println("enter the data");
			System.out.println(ure.toString());
		}
		return mapping.findForward("success");
	}

}
