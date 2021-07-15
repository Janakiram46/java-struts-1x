package com.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.entity.UserRegisterEntity;
import com.forms.UserDataForm;
import com.repos.UserRegisterDAO;

public class ProfileLinkAction extends Action
{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		UserDataForm udf=(UserDataForm) form;
		UserRegisterEntity ure=new UserRegisterEntity();
		List<UserRegisterEntity> l=UserRegisterDAO.getProfile(udf.getUsername());	
		System.out.println(l);
		request.getSession().setAttribute("profile",l);	
		return mapping.findForward("success");
	
		
	}

}
