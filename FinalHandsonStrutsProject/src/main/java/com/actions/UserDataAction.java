package com.actions;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.entity.UserDataEntity;
import com.entity.UserRegisterEntity;
import com.forms.UserDataForm;
import com.repos.UserDataDAO;
import com.repos.UserRegisterDAO;


public class UserDataAction extends Action
{
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		UserDataForm udf=(UserDataForm)form;
		List<UserDataEntity> list=UserDataDAO.getUserData();
		
		for(UserDataEntity data:list)
		{
			
			if(udf.getUsername().equals(data.getUsername()) &&(udf.getPassword().equals(data.getPassword()))&& (data.getUsertype().equals("admin")))
			{
				request.getSession().setAttribute("user", udf);
				System.out.println(udf.toString());
				return mapping.findForward("admin");
			}
			else if(udf.getUsername().equals(data.getUsername()) && (udf.getPassword().equals(data.getPassword()))&&(data.getUsertype().equals("user")))
			{
				request.getSession().setAttribute("user", udf);
				System.out.println(udf.toString());
				return mapping.findForward("user");
			}
			
		}
		return mapping.findForward("error");
	}
}
