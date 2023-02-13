/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser 
{
   public void statusDetail(String code)
{
switch(code.toUpperCase())
        {
        case "ZERO": System.out.println("User Status REJECTED");
        break;
        case "ONE": System.out.println("User Status PENDING");
        break;
        case "TWO":
        System.out.println("User Status PROCESSING");
        break;
        case "THREE": 
            System.out.println("User Status APPROVED");
            break;
            case "FOUR": 
            System.out.println("User Status APPROVED");
        break;
        default:
         System.out.println("NOT VALID CODE");
        break;
        }
}
 
}
