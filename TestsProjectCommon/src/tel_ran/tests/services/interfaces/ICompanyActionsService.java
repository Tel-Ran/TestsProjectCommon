package tel_ran.tests.services.interfaces;

import java.util.Date;
import java.util.List;

public interface ICompanyActionsService {
void printQuestion(int id);


//Use case 3.1.1
boolean getCompanyByName(String companyName);
boolean CompanyAuthorization(String companyName , String password);
	


//alexfoox Company 
boolean createCompany(String C_Name,String C_Site, String C_Specialization,String C_AmountEmployes,String C_Password);
String []getAnySingleQuery(String strQuery);

//Use case Ordering Test 3.1.3
long createIdTest(List<Long> list,int personId);
int createPerson(int personId,String personName,String personSurname,String personEmail);

//Company actions for 3.1.4. Viewing test results
List<String> getTestsResultsAll(String currCompanyId);
List<String> getTestsResultsForTimeInterval(String currCompanyId, Date timeFrom, Date timeUntil);
List<String> getTestsResultsForPersonID(String currCompanyId, int personID);

}