package ���̹߳�Ʊ;

public class Piao implements Runnable {
	int count=150;
	Object lock=new Object();
	
	public synchronized void xiaoshou(){
		System.out.println(Thread.currentThread().getName()+"������"+count+"��Ʊ");
		count--;
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void run() {
		// TODO Auto-generated method stub
		while(count>0){
			xiaoshou();
		}
	}
	
	
}
