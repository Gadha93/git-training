package package3;

public class VersionCheck {

	public static void main(String[] args) {
		int i;
		String v1="3.32.2.5";
		String v2="4.03.8.5";
		String[] version1 = v1.split("\\.");
		String[] version2 = v2.split("\\.");
				
		for (i=0; i<version1.length; i++) {
			//System.out.println("version1["+i+"] "+version1[i]);
			System.out.print(version1[i]);
			
		}
		System.out.println();
		
		for ( i=0; i<version2.length; i++) {
			System.out.print(version2[i]);
		}
		System.out.println();
		/*for( i=0;i<version1.length&&i<version2.length;i++)
		{
		if(Integer.parseInt(version1[i])>Integer.parseInt(version2[i]))
				{
				System.out.println("latest version "+version1[i]);
				}
		//else if(Integer.parseInt(version1[i])<Integer.parseInt(version2[i]))
		else
				{
			System.out.println("latest version"+version2[i]);
				}
		}*/
		
	}
}
