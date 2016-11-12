class AsciiCodes {
	public static void main (String[] args)
	{
		int ascii_start = 65; //initialize ascii starting number
		//Using loop to print each character corresponding to 
		//ASCII codes from 65 to 90 in a tabular format
		for (ascii_start = 65; ascii_start <= 90; ascii_start++)
		{
			System.out.println(ascii_start + "-" + (char)ascii_start);
		}
	}
}