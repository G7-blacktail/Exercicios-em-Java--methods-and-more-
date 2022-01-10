package casting;

public class Casting {

	public static void main(String[] args) {
		
		byte b1;
		short s1 = 1000;
		b1 = (byte) s1;
		
		long l1;
		int i1 = 20;
		l1 = i1;
		
		int i;
		long l = 100000000000000L;
		i = (int) l;
		
		long L = 10000L;
		int I = (int) L;
		
		float f = 10.5002F;
		double d;
		d = f;
		
		double D = 10.5002D;
		float F = (float) D;
		
		float F2 = 10.5F;
		int I2 = (int) F2;
		
		byte b2;
		b2 = (byte) D;
		
		System.out.println("Byte = " + b1);
		System.out.println("short (casting) = " + s1 + "\n");
		
		System.out.println("int " + i1);
		System.out.println("long (casting) = " + l1 + "\n");
		
		
		System.out.println("Long = " + l);
		System.out.println("int (casting) = " + i + "\n");
		
		System.out.println("Long = " + L);
		System.out.println("int (casting) = " + I + "\n");
		
		System.out.println("float = "+ f);
		System.out.println("double (casting) = " + d + "\n");
		
		System.out.println("Double = " + D);
		System.out.println("float (casting) = " + F + "\n");
		
		System.out.println("float = " + F2);
		System.out.println("int (casting) = " + I2 + "\n");
		
		System.out.println("byte (casting) = " + b2);
		
		

	}

}
