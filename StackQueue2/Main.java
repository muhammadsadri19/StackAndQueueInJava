package StackAndQueue.StackQueue2;

public class Main {
    public static void main(String[] args) {

        QueueLL<String> queue = new QueueLL<>();

        queue.tambahData("Belajar");
        queue.tambahData("Mengaji");
        queue.tambahData("Bermain");
        queue.printQueue();
        System.out.println();

        boolean continueLoop = true;

        while (!queue.isEmpty()){
            String removeItem = queue.hapusData();
            System.out.println("Pekerjaan yang sudah siap : " + removeItem);
            queue.printQueue();
            System.out.println();
        }
        System.out.println("Semua Pekerjaan sudah siap ya boss :)");
    }
}
