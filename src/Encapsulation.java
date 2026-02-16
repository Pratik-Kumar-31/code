 class Student {
        private String name;
        private int age;

        public String getName () {
            return name;
        }
        
        public int getAge() {


            return age;
        }
        public void setName (String name,int age){
            this.name = name;
            this.age=age;

    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("sumit",98);
        System.out.println(st.getName());
        System.out.println(st.getAge());
    }
}