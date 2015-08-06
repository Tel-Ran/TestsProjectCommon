package tel_ran.tests.services.common;

public interface ICommonData {
	static final String TESTS_RESULTS = "/all_tests_results";
	static final String TESTS_RESULTS_BY_DATES = "/tests_results_by_dates";
	static final String TESTS_RESULTS_BY_PERSON_ID = "/tests_results_by_person";
	static final String TEST_RESULT_DETAILS = "/test_details";
	static final String DATE_FORMAT = "yyyy-MM-dd";
	static final String delimiter = ",";
	static final int TOKEN_VALID_IN_SECONDS = 300;
		
	static final String NO_CATEGORY1 = "null";
	

	static final String NO_QUESTION = "  ";
	
	/**
	 * number of responses in the picture, for American test question`s. Default = 4
	 */
	static final int NUMBERofRESPONSESinThePICTURE = 4;	
	static final String[] USER_CATEGORY = {IPublicStrings.COMPANY_AMERICAN_TEST, IPublicStrings.COMPANY_QUESTION};

	
}
