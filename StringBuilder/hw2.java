import java.util.Random;
public class Randomshoe {
public static void main(String[] args){
	
		char ca;
		int hi;
		int num = 0;
		Random random = new Random();
		StringBuilder s = new StringBuilder();
	
		for(int i = 0; i <= 1111;++i){
		
			hi = random.nextInt(126-32) + 33;
			ca = (char)hi;
			s.append(ca);
			num +=1;
		
			if(num == 100){
				s.append("\n");
				num = 0;
			}
		}
		System.out.println(s);
	}
}
