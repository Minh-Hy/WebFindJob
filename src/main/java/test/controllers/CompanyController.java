package test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import test.beans.Company;
import test.dao.ProjectDao;

@Controller
public class CompanyController {
	@Autowired
	ProjectDao pd;
	
	@RequestMapping("/registerCompany")
	public String RegisterPage() {
		
		return "registerCompany";
	}
	
	@RequestMapping("/loginCompany")
	public String LoginPage() {
		
		return "loginCompany";
		
	}
	
	@RequestMapping(value="/registercompany", method=RequestMethod.POST)
	public String registerCompanyData(@ModelAttribute("c1") Company c1) {
		
		pd.registercompany(c1);
		
		return "loginCompany";
		
	}
}
