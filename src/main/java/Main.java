public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[]{
                new Person("Styles","Harry",28),
                new Person("Brown","James",48),
                new Student("Chalamet","Timothee",26,222,346894),
                new Lecturer("Jackson","Michael",44,"IT",15666),
                new Student("Colman","Zendaya",26,222,523825),
                new Student("Thorne","Bella",25,222,118237),
                new Person("Pickler","Kellie",36),
                new Lecturer("Snyder","Timothy",53,"History",12000)
        };


        for (Person person : persons)
        {
            System.out.println(person.printInfo());
        }
    }
}
