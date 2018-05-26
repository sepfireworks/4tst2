package ed94.fortst;

public class btccount {
	

	public static void main(String args[]){

	    long btc = (long) (50*Math.pow(10,8)); // 初始，每个块奖励 50*10^8聪(1BTC = 10^8聪)

	    long total_btc = 0;
	    int k = 0;
	    int interval = 210000; //每隔210000块，比特币奖励减半

	    while(btc > 0){
	    	System.out.println(k + " " + btc);

	        total_btc += interval * btc;

	        btc /= 2; k = k + 1;

	    }
	    System.out.println(" ");
	    System.out.println(" ");
	    System.out.println(" ");
	    System.out.println(" ");
	    System.out.println(" ");
	    System.out.println("BTC总量" + total_btc + " cong ");

	}

}
