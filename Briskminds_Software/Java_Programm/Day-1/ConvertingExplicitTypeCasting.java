class ConvertingExplicitTypeCasting {
	public static void main(String args []) {
        	//for converting long -> int
		long a = 10;
		int b = (int)a;
		System.out.println(b);

                //flow runs in this way like            byte -> short -> int -> long -> double
                long l = 100000l;
                byte byt = (byte)(l);
                System.out.println("Converting from long to byte then " + byt);

                //charchter can't convert into byte and short but charcter and int literal can be converted into range of types
                byte x = 'a';
                System.out.println(x);

                //char can't be converted into short and byte they converts we have to do explicitly convertion for them
                char ch = 'a';
                byte chByte = (byte)(ch);
		System.out.println(chByte);

                //addition in char 
                char characterss = 'a'; 
                byte addition = (byte)(characterss + 123);
                System.out.println(addition);
	}
}