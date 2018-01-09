package experiment6;


import secondtest.ChoclateBoiler;

public class ThreadTest implements Runnable {
	private String name;
	private ThreadTest(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		ThreadChoclateBoiler.getInstance();
		ThreadChoclateBoiler.fill(this.name);
		ThreadChoclateBoiler.boil(this.name);
		ThreadChoclateBoiler.drain(this.name);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Thread tA = new Thread(new ThreadTest("java")); //�Ը������ֱ�ʵ����4���߳�
		Thread tB = new Thread(new ThreadTest("android"));
		Thread tC = new Thread(new ThreadTest("google"));
		Thread tD = new Thread(new ThreadTest("git"));
		tA.start(); //�ֱ������߳�
		tB.start();
		tC.start();
		tD.start();
	}

}
