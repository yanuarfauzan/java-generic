package belajar.java.application;

// Multiple extends hanya bisa satu parent Class sisanya harus interface
public class MultipleConstraintApp {
    public static void main(String[] args) {
        // Erron manager not implement canSayHello
        // Data<Manager> managerData = new Data<>(new Manager());
        Data<VicePresident> viceData = new Data<>(new VicePresident());
    }

    public static interface canSayHello {
        void canSayHello(String name);
    }

    public static abstract class Employee {

    }

    public static class Manager extends Employee {
        // @Override
        // public void canSayHello(String name) {
        //     System.out.println("Hello, " + name);
        // }
    }

    public static class VicePresident extends Employee implements canSayHello {
        @Override
        public void canSayHello(String name) {
            System.out.println("Hello " + name);
        }
    }

    public static class Data<T extends Employee & canSayHello> {
        private T data;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Data(T data) {
            this.data = data;
        }

    }
}
