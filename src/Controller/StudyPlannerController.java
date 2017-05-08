package Controller;

import Model.*;
import View.ConsoleIO;


import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**
 * Created by bendickson on 5/4/17.
 */
public class StudyPlannerController
{
    private StudyPlanner planner;
    // public methods

    public String[] getStudyProfiles()
    {
        return planner.getListOfStudyProfiles();
    }

    /**
     * validates whether a file is valid or not
     * @param filedata
     * @return true = valid,  false = not valid
     */
    public boolean fileValidation(String filedata)
    {
        return false;
        // not implemented yet
    }

    public Notification[] getNotifications()
    {
        return this.planner.getNotifications();
    }

    /**
     * does the StudyPlanner contain the profile within the hubfile
     * @param hubFile
     * @return
     */
    public boolean containsStudyProfile(HubFile hubFile)
    {
        return false;
        // not implemented yet
    }

    /**
     * if the StudyPlanner contains the hubfile, this returns the version
     * if not, returns -1
     * @param hubFile
     * @return
     */
    public int getCurrentVersion(HubFile hubFile)
    {
        if(containsStudyProfile(hubFile))
        {
            return 0;
            // return version
        }
        else
        {
            return -1;
        }
    }

    /**
     * if valid, this method creates a new StudyProfile and returns true
     * if invalid, it returns false
     *  * fail states include:
     *
     * @param hubFile
     */
    public boolean createStudyProfile(HubFile hubFile)
    {
        return false;

    }

    /**
     * If the study profile exists and the hubfile is newer, this method updates and returns true
     * If not, returns false
     * @param hubFile
     * @return
     */
    public boolean updateStudyProfile(HubFile hubFile)
    {
        return false;

    }

    /**
     * returns a list of tasks from the array list that contain the ModelEntity provided
     * @param model
     * @param taskList
     * @return
     */
    public ArrayList<Task> getListOfTasks(ModelEntity model, ArrayList<Task> taskList)
    {
        return null;
    }

    /**
     * Adds a new activity to the StudyPlanner
     * @return
     */
    public boolean newActivity(ArrayList<Task> taskList)
    {
        return false;
        // not implemented, argument list incomplete
    }



    // constructors
    public StudyPlannerController() throws NoSuchAlgorithmException, NoSuchPaddingException {
        // checks if there is a existing settings file
        if(DataController.existingSettingsFile())
        {
            // import data
        }
        else
        {
            // create a blank one

            // create an Account
            String fullName ="";
            boolean familyNameLast =false;
            String salutation = "";
            String email="";

            // CONSOLE INPUT  - to be replaced by javaFX
            fullName = View.ConsoleIO.getDataString("Enter Name:");
            while(!Person.validName(fullName)) {
                fullName = View.ConsoleIO.getDataString("I'm sorry " + fullName +
                        " I'm afraid I can't do that.\nName must only contain letters and spaces.\nPlease Enter Name:");
            }
            salutation = View.ConsoleIO.getDataString("Enter salutation:");
            while(!Person.validSalutation(salutation)) {
                salutation = View.ConsoleIO.getDataString("Salutation must only contain letters.\nPlease Enter Salutation:");
            }
            familyNameLast = View.ConsoleIO.getDataBool("Is the family name last (y/n)");

            email = View.ConsoleIO.getDataString("Enter Email Address:");
            while(!Person.validEmail(email)) {
                email = View.ConsoleIO.getDataString("Invalid email address.\nPlease enter a valid email address:");
            }
            Person studentDetails = new Person(salutation,fullName,familyNameLast,email);
            String studentAccountNumber ="";

            View.ConsoleIO.setConsoleMessage("Hello "+studentDetails.getSalutation()+" "+studentDetails.getFamilyName());
            View.ConsoleIO.setConsoleMessage("Thank you for creating a study profile.");


            Account newAccount = new Account(studentDetails,studentAccountNumber);


            planner = new StudyPlanner(newAccount);
        }
    }

    /**
     * Temporary constructor for testing UI
     * @param newAccount
     */
    public StudyPlannerController(Account newAccount) throws NoSuchAlgorithmException, NoSuchPaddingException {
        planner = new StudyPlanner(newAccount);
    }
}