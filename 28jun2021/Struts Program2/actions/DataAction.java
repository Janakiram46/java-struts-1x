package com.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.entity.Person;
import com.forms.PeopleForm;
import com.repos.PersonDAO;

public class DataAction extends DispatchAction{


	@Override
	public ActionForward unspecified(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Action got invoked");
		List<Person> list=PersonDAO.getPerson();
		System.out.println(list);
		request.setAttribute("people", list);
       return mapping.findForward("success");
	}

	public ActionForward store(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	     PeopleForm person=(PeopleForm)form;
	     
		 Person p=new Person(person.getId(),person.getName(),person.getMobileno(),person.getCity());
	        if(PersonDAO.addPerson(p)) {
	        List<Person> list=PersonDAO.getPerson();
	        request.setAttribute("people", list);
	        person.setCity(null);
	        person.setMobileno(null);
	        person.setName(null);
	        person.setId(null);
			return mapping.findForward("success");
	        }
	        else {
	        	return mapping.findForward("error");
	        }
			
	}
	public ActionForward delete(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		try {
			PersonDAO.remove(Integer.parseInt(request.getParameter("id")));
			 List<Person> list=PersonDAO.getPerson();
		        request.setAttribute("people", list);

			return mapping.findForward("success");
		}
		catch(Exception e) {
			return mapping.findForward("error");
		}

	}
}


