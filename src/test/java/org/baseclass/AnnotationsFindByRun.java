package org.baseclass;

import org.openqa.selenium.support.pagefactory.Annotations;

public class AnnotationsFindByRun extends BaseClass{
	public static void main(String[] args) {
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		AnnotationsBaseFindBy l = new AnnotationsBaseFindBy();
		insert(l.gettextmail(),"padmavathianbalagan99@gmail.com");
		insert(l.gettextpass(),"Padmavathi@1010000");
		click(l.getlogin());
		
	}
	

}
