
public class SmartPhone extends Mp3Player{ //サブクラス（子クラス）
	
	public void play() { //親クラスの機能を上書き（オーバーライド）
		
		System.out.println("再生（ハイレゾ機能）");
		
	}
	
	public void stop() { //親クラスの機能を上書き（オーバーライド）
		
		System.out.println("停止（ハイレゾ機能）");
		
	}
	
	public void next() { //親クラスの機能を上書き（オーバーライド）
		
		System.out.println("次へ（ハイレゾ機能）");
		
	}
	
	public void back() { //親クラスの機能を上書き（オーバーライド）
		
		System.out.println("戻る（ハイレゾ機能）");
		
	}
	
	public void call() {
		
		System.out.println("電話");
		
	}
	
	public void mail() {
		
		System.out.println("メール");
		
	}
	
	public void photo() {
		
		System.out.println("写真");
		
	}
	
	public void internet() {
		
		System.out.println("インターネット");
		
	}

}
