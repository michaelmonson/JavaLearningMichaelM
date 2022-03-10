import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class JavaStreams {
    
    public static void main(String args[]) {

        JavaStreams javaStreams = new JavaStreams();
        //create inner class instances.  Is there an easier way?
        JavaStreams.Person person1 = javaStreams.new Person("John", "Talbot", Gender.MALE, new Date());
        JavaStreams.Person person2 = javaStreams.new Person("Sariah", "Monson", Gender.FEMALE, new Date());
        JavaStreams.Person person3 = javaStreams.new Person("Leonard", "Nimoy", Gender.MALE, new Date());

        List<Person> personList = Arrays.asList(person1, person2, person3);
        
        String personString = personList.collectors. mapping(Person::getName, joining(", "));
    }   
       
    
    //inner class:
    public class Person {
        String firstName;
        String lastName;
        Gender gender;
        Date birthDate;

        //Getter's and Setter's:
        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        
        public Gender getGender() {
            return (JavaStreams.Gender) gender;
        }
        public void setGender(Gender gender) {
            this.gender = gender;
        }
        
        public Date getBirthDate() {
            return birthDate;
        }
        public void setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
        }


        //Constructors:
        public Person() 
        { }

        public Person(String firstName, String lastName, Gender gender, Date birthDate) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
            this.birthDate = birthDate;
        }

        @Override
        public String toString() {
            return "Person [birthDate=" + birthDate + ", firstName=" + firstName + ", gender=" + gender + ", lastName="
                    + lastName + "]";
        }        
        
    }


    public enum Gender {
        MALE, FEMALE
    }

    

}
