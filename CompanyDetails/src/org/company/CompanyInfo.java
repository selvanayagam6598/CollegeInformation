package org.company;

import org.testng.annotations.Test;

public class CompanyInfo {
	@Test(priority=1)
	private void companyName() {
System.out.println("company name is HCL");
	}
	@Test(priority=0)
	private void companyId() {
System.out.println("company id is 51638");
	}
	@Test(priority=2)
	private void companyAddress() {
System.out.println("company address is sholinganallur");
	}
	/*public static void main(String[] args) {
		CompanyInfo c=new CompanyInfo();
		c.companyName();
		c.companyId();
		c.companyAddress();
	}*/
}
