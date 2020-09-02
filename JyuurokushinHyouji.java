package kadai13;

class JyuurokushinHyouji implements Observer{
	public void update(Subject s) {
		print(((Suuchi)s).getValue());
	}

	private void print(int n) {
		System.out.println(n + "を16進数で表示します");

		//16進数表示処理
		System.out.println(Integer.toHexString(n));
	}
}
