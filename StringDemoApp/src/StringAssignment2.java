/**
* Name: Manoj Kumar P S
* Description:return the command from url
* Date: 3/16/2021
*/
public class StringAssignment2 {

	public static void main(String[] args) {
		String url1="https://www.cognizant.com/admin/policy/index.html";
		String url2="https://www.cognizant.com/service.jsp";
		String url3="https://www.cognizant.com/products/local/showProducts.asp";
		
		String command1=getCommand(url1);
		String command2=getCommand(url2);
		String command3=getCommand(url3);
		
		System.out.println("Command 1:" +command1);
		System.out.println("Command 2:" +command2);
		System.out.println("Command 3:"+ command3);
	}

	private static String getCommand(String url1) {
	   int index1,index2;
	   index1=url1.lastIndexOf('.');
	   index2=url1.lastIndexOf('/');
	   return url1.substring(index2+1,index1+1);
	
	}

}
