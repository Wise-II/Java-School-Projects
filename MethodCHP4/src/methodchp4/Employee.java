/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodchp4;

/**
 *
 * @author Wise-XXIV
 */
public class Employee 
        
{
private int empNum;
private double empPayRate;
public void setValues()
{
empNum = 111;
empPayRate = 22.22;
}
public void methodThatUsesInstanceAttributes()
{
System.out.println("employee number is " + empNum);
System.out.println("pay rate is " + empPayRate);
}
public void methodThatUsesLocalVariables()
{
int empNum = 33333;
double empPayRate = 555.55;
System.out.println("employee number is " + empNum);
System.out.println("pay rate is " + empPayRate);
}}
