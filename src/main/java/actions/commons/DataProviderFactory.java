package actions.commons;

import org.testng.annotations.DataProvider;

public class DataProviderFactory {

	@DataProvider(name = "accountTestRisefairsketch")
	public static Object[][] dataTest() {
		return new Object[][] { { "admin@demo.com", "riseDemo" }, { "client@demo.com", "riseDemo" } };
	}

	@DataProvider(name = "inputValue01")
	public static Object[][] dataTestValue01() {
		return new Object[][] {
				{ "project", "Online Course Creation and Launch", "1 Point", "Release", "John Doe", "John Doe", "To do",
						"Minor", "Feedback" },
				{ "client", "Social Media Influencer Collaboration", "2 Points", "Beta Release", "Mark Thomas",
						"Mark Thomas", "To do", "Major", "Bug" },
				{ "Contract", "Market Research and Analysis", "3 Points", "Beta Release", "Michael Wood",
						"Michael Wood", "Review", "Critical", "Design" } };
	}

	@DataProvider(name = "inputManageLabels")
	public static Object[][] dataTestManageLabels() {
		return new Object[][] { { "LabelTest01" }, { "LabelTest02" } };
	}

	@DataProvider(name = "inputAddProject")
	public static Object[][] dataTestAddProject() {
		return new Object[][] { { "Title01", "Client Project", "Demo Client", "Description01", "1000", "LabelTest01" },
				{ "Title02", "Client Project", "Hauck Ltd", "Description02", "1500", "LabelTest01" },
				{ "Title03", "Client Project", "Blaze Rohan", "Description03", "1750", "LabelTest02" },
				{ "Title04", "Client Project", "Demo Client", "Description04", "2000", "LabelTest01" },
				{ "Title05", "Client Project", "Halvorson Inc", "Description05", "2500", "LabelTest02" } };
	}

}
