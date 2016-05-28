/**
 * Created by Kyler on 4/23/2016.
 */
public class Employee {
    private String mFirstName;
    private String mLastName;
    private String mEmail;
    private String mPhoneNum;
    private Employee next; // references next employee in the LinkedList
    private int key;
    private int hashBucket; // add Math.abs here to make all hashbuckets positive

//TODO this may need to get used as a constructor but probably not;
    public Employee(String firstName, String lastName,String email, String phoneNum){
        mFirstName = firstName;
        mLastName = lastName;
        mEmail = email;
        mPhoneNum = phoneNum;
        key = nameToHash();
        hashBucket = (nameToHash()+1) % 13;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "mFirstName='" + mFirstName + '\'' +
                ", mLastName='" + mLastName + '\'' +
                ", mEmail='" + mEmail + '\'' +
                ", mPhoneNum='" + mPhoneNum + '\'' +
                ", next=" + next +
                ", key=" + key +
                ", hashBucket=" + hashBucket +
                '}';
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public Employee getNext() {
        return next;
    }

    public void setNext(Employee next) {
        this.next = next;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public String getPhoneNum() {
        return mPhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        mPhoneNum = phoneNum;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getHashBucket() {
        return hashBucket;
    }
    /*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (mFirstName != null ? !mFirstName.equals(employee.mFirstName) : employee.mFirstName != null) return false;
        return mLastName != null ? mLastName.equals(employee.mLastName) : employee.mLastName == null;

    }*/

  /*  @Override
    public int hashCode() {
        int result = mFirstName != null ? mFirstName.hashCode() : 0;
        result = 31 * result + (mLastName != null ? mLastName.hashCode() : 0);

        return result;
    }*/
    public String fullName(){

        return mFirstName.toUpperCase().concat(mLastName.toUpperCase());
    }
    public int nameToHash(){
      return Math.abs( fullName().hashCode() -1);
    }

}
