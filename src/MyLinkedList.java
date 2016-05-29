


/**
 * Created by Kyler on 4/20/2016.
 */
public class MyLinkedList {

    private Employee firstEmployee = null;// don't know why this works


    public MyLinkedList(Employee firstEmployee) {
        //TODO fix this first Employee object
        this.firstEmployee = firstEmployee;
        System.out.println(firstEmployee + " is in the mulinkedList class");

    }

  /*  public Employee getFirstEmployee() {
        return firstEmployee;
    }

    public void setFirstEmployee(Employee firstEmployee) {
        this.firstEmployee = firstEmployee;
    }*/

    public MyLinkedList insert(Employee newEmployee) {
        Employee previousEmployee = firstEmployee;
        System.out.println(previousEmployee + "is what happened after prev emp");


        Employee currentEmployee = firstEmployee;
        System.out.println(currentEmployee + "is what happened after current emp");

        if (newEmployee == null) {
            System.out.println("Failure to insert new Employee into Linked List.");
            return this;
        }

        if (firstEmployee == null) //we're at the start of the list
        {
            firstEmployee = newEmployee; //adds to the front of the list.
            firstEmployee.setNext(newEmployee);
        } else {
            while (newEmployee != null) {
                newEmployee = firstEmployee;
                firstEmployee = firstEmployee.getNext();
            }
        }


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

