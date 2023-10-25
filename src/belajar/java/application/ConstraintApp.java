package belajar.java.application;

public class ConstraintApp {
    public static void main(String[] args) {
        NumberData<Integer> integerNumberData = new NumberData<>(1);

        System.out.println(integerNumberData.getData());

        // Dibawah ini error karena String bukan turunan dari Object Number
        // NumberData<String> stringNumberData = new NumberData<String>("Yanuar");
    }

    // Otomatis method yang ada di object Number bisa di akses di generic type nya
    public static class NumberData<T extends Number> {
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

    }
}
