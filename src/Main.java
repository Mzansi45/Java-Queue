public class Main{
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        queue.enqueue("Apple");
        queue.enqueue("Banana");
        queue.enqueue("Cherry");

        System.out.println(queue.peek()); // Output: Apple
        System.out.println(queue.size()); // Output: 3

        System.out.println(queue.dequeue()); // Output: Apple
        System.out.println(queue.size()); // Output: 2

        System.out.println(queue.isEmpty()); // Output: false
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.isEmpty()); // Output: true

    }
}
