package io.javabrains.action;

import io.javabrains.service.TutorialFinderService;

public class TutorialAction {
	
	private String bestTutorialSite;
	private String language;
	
	public String execute() {
		TutorialFinderService tutorialFinderService = new TutorialFinderService();
		setLanguage(language);
		setBestTutorialSite(tutorialFinderService.getBestTutorialSite(getLanguage()));
		
		System.out.println(tutorialFinderService.getBestTutorialSite(getLanguage()));
		
		return "success";
	}
	
	public String someOtherMethod() {
		System.out.println("Some other method executed");
		return "success";
	}

	public String getBestTutorialSite() {
		return bestTutorialSite;
	}

	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
