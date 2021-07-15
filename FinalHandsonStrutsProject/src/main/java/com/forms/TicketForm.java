package com.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class TicketForm extends ActionForm
{
private String subject;
private String description;
public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
    ActionErrors errors = new ActionErrors();
    if (subject == null || subject.length() < 10) {
        errors.add("subject", new ActionMessage("error.subject.required"));
    }
    if (description == null || description.length() < 10) {
        errors.add("description", new ActionMessage("error.description.required"));
    }
    return errors;
}
public TicketForm() {}
public TicketForm(String subject, String description) {
	super();
	this.subject = subject;
	this.description = description;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "TicketForm [subject=" + subject + ", description=" + description + "]";
}

}
