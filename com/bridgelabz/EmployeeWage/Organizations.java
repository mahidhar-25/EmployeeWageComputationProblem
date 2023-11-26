package com.bridgelabz.EmployeeWage;

import java.util.ArrayList;
import java.util.Scanner;

/*
@desc : Organization class hold a set of companies and with unique organization id and set of methods to take user input
   and add , remove a company from organization.
 */
public class Organizations {
    //usecase 12 having list of companies and each company has a list of employee and wage
    ArrayList<Company> companies;
    private String organizationId;

    /*
@desc : this function takes the series of inputs required to create an instance of organization from user
@params : no params
@return : return an organization instance by initializing
     */

    public static Organizations getOrganizationDetailsFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter organization id : ");
        String organizationId = input.next();
        return new Organizations(organizationId);
    }

    /*
@desc : constructor initializes the organization instance , and companies list
@params - string : organization id
@return : no return
 */
    public Organizations(String organizationId) {
        this.organizationId = organizationId;
        companies = new ArrayList<>();
    }

    /*
    @desc : new company will added to the collect of companies inside a organization
    @params -  Company : new compnay with initializing
    @return : no return
     */
    public void addCompanyToOrganization(Company newCompany){
        companies.add(newCompany);
    }

    /*
@desc :  this function will find out the company by taking company name
         as a param in the collection of company inside a organization
@params - String : company Name
@return - Company - returns an matching instance of company otherwise return a null

 */
    public Company getCompanyDetailsFromOrganizations(String companyName){
        for(Company organization : companies){
            if(organization.getCompanyName().equals(companyName)){
                return organization;
            }
        }
        return null;
    }

    /*
@desc :  this function will remove the company  by taking company name
        as a param in the collection of company  inside a organization
@params -String : company Name
@return - void - no return

*/
    public void removeCompanyFromOrganization(String companyName){
        for(Company organization : companies){
            if(organization.getCompanyName().equals(companyName)){
                companies.remove(organization);
            }
        }
    }

    /*
@desc : it gives the organizationId
@param : no params
@return - String : organizationId
 */

    public String getSoftwareOrganizationId() {
        return organizationId;
    }

        /*
@desc : it sets/updates the organization id
@param : no params
@return - String : organizationId
 */


    public void setSoftwareOrganizationId(String softwareOrganizationId) {
        this.organizationId = softwareOrganizationId;
    }
    /*
@desc :Returns a string representation of the organization object.
@params : no params
@return A string containing the formatted details of the organization.
*/
    @Override
    public String toString() {
        return "Organizations : \n" +
                "{" +
                "   softwareOrganizationId = " + organizationId + "\n" +
                "   companies = " + companies + "\n" +
                '}';
    }
}
