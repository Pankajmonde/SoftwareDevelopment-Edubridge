package java8;

interface Calci{
	int add(int i, int j);
	
}
class Op{
	static int sum(int i, int j) {
		return i+j;
	}
}
interface Info{
	String msg(String msg);
}
class Disp{
	static String printMsg(String m) {
		return "Message"+m;
	}
}

public class MethodCalsi {
	public static void main(String args[]) {
		
		Calci c1=Op::sum;
		System.out.println(c1.add(10, 20));
		Info i1=Disp::printMsg;
		System.out.println(i1.msg("Hello"));
		
	}

}
//static method is arsmeterixd use inbuikt interface 















