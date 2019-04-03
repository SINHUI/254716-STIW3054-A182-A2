package com.A182DraftStudPdf.maven.MavenProject_Ass2;



public class InfoSTIW3054 extends ReadFile implements Runnable{

	public void run() {
		Thread t5 = new Thread(new InfoSTIW3054());
		t5.setName("\nThread 5 --->");
		super.run();
		
			try {	
				System.out.println(t5.getName( )+ lines[getLineByLine("STIW3054")]);
				Thread.sleep(2000);
			} catch (Exception e) {
				e.getStackTrace();
			}
			
		}	
	
	}

