// Author: Brandon Rose
// Date Created: 4/22/2019
// Last Edited: 4/22/2019
// Description: GitOuttaHere class used to start first Git repository

public class GitOuttaHere {
	
	private String lol;
	
	public GitOuttaHere(String lol)
	{
		setLol(lol);
	}
	
	public String getLol()
	{
		return lol;
	}
	
	public void setLol(String lol)
	{
		this.lol = lol;
	}
	
	public void promptUser()
	{
		System.out.println(getLol() + "\n");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		GitOuttaHere c1 = new GitOuttaHere("You know it's funny!");
		
		c1.promptUser();
	}

}
