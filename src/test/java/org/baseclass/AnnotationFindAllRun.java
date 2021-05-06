package org.baseclass;

public class AnnotationFindAllRun extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		loadUrl("https://dashboard.i2h.ai/");
		AnnotationFindAll afl = new AnnotationFindAll();
		insert(afl.getUserid(),"sandiya.t");
		Thread.sleep(5000);
		insert(afl.getPass(),"pass@123");
		click(afl.getClklogin());
		
	}

}
