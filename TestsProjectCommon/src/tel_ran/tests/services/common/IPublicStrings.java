package tel_ran.tests.services.common;

/**
 * Interface with String constants that can be shown to users (Company, Person, User, etc)
 */
public interface IPublicStrings {
	
	static final String COMPANY_AMERICAN_TEST_QUESTION = "Select the most correct answer from the following options";
	static final String COMPANY_QUESTION_QUESTION = "Type your answer in the textbox bellow";
	
	static final String[] CREATE_TEST_ERROR = {"", 
		"Not enough questions in the database to generate the test./n "
		+ "Please fill in the database or create one another test with fewer questions",
		"Invalid value in the E-mail box", 
		"Sending e-mail failed. Please try again later", 
		"Not enough data to generate the text./n For category * should be specified sub-category"};

	static final String COMPANY_AMERICAN_TEST = "American Test";
	static final String COMPANY_QUESTION = "Open Question";

}
