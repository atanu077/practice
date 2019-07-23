import java.text.DecimalFormat;
import java.text.MessageFormat;

public class phoneNo {
	public static void main(String[] args) {
		
		long phoneFmt = 1234567890L;
		//get a 12 digits String, filling with left '0' (on the prefix)   
		DecimalFormat phoneDecimalFmt = new DecimalFormat("000000000");
		String phoneRawString= phoneDecimalFmt.format(phoneFmt);

		MessageFormat phoneMsgFmt=new MessageFormat("({0})-{1}-{2}");
		    //suposing a grouping of 3-3-4
		String[] phoneNumArr={phoneRawString.substring(0, 3),
		          phoneRawString.substring(3,6),
		          phoneRawString.substring(6)};

		System.out.println(phoneMsgFmt.format(phoneNumArr));
	}

}
