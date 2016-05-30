



/**
 * Created by Kyler on 4/20/2016.
 */
public class MyLinkedList {

    private Employee firstEmployee = null;// don't know why this works


    public MyLinkedList(Employee firstEmployee) {
        //TODO fix this first Employee object
        this.firstEmployee = firstEmployee;
        System.out.println(firstEmployee);

    }

    public Employee getFirstEmployee() {
        return firstEmployee;
    }

    public void setFirstEmployee(Employee firstEmployee) {
        this.firstEmployee = firstEmployee;
    }

    public MyLinkedList insert(Employee newEmployee) {
        Employee previousEmployee = getFirstEmployee();
        Employee currentEmployee = getFirstEmployee();

        if (newEmployee == null) {
            System.out.println("Failure to insert new Employee into Linked List.");
            return this;
        }

        if( firstEmployee == null) //we're at the start of the list
        {
            firstEmployee = newEmployee; //adds to the front of the list.
            firstEmployee.setNext(newEmployee);
        }
        else {

                previousEmployee = currentEmployee;
                currentEmployee = currentEmployee.setNext(newEmployee);
            }

            //prevoius Employee contains the last valid Employee in the list.
            //Do the insert
            previousEmployee.setNext(newEmployee); //append to the end of the list
            newEmployee.setNext(null); //newEmployee is the end of the list.
        }
        //ADDS THE EMPLOYEE OBJECT TO
        return this;
    }





    public void displayLinkedList() {
        Employee current = firstEmployee;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }

    // Search for the employee object that is being called
    public Employee search(int hashKey) throws NullPointerException, ArrayIndexOutOfBoundsException {
        Employee current = firstEmployee;
        while (current != null && current.getKey() != hashKey) {
            if (current.getKey() == hashKey) {
                return current;
            } else {

                current = current.getNext();
            }
        }

        return null;
    }


}

