/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacar;

/**
 *
 * @author mattstauder
 */
public class Branch {
    String branchID;
    String addressID;
    String branchName;
    String phoneNumber;
    
    public Branch(String branchID, String addressID, String branchName, String phoneNumber) {
        this.branchID = branchID;
        this.addressID = addressID;
        this.branchName = branchName;
        this.phoneNumber = phoneNumber;
    }
}
