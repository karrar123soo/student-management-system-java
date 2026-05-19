package util;

import service.StudentService;

public class AutoSaveThread 
implements Runnable {
	
	private StudentService service;
	
	public AutoSaveThread(
			StudentService service) {
		this.service=service;
		
	}
	@Override
	public void run () {
		
		while(true) {
			
			try {
				Thread.sleep(3000);
				
				FileUtil.saveToFile(service.getStudentMap());
				
				System.out.println("Auto Backup Complete");
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
				
				
			}
		}
	}
	
			}

