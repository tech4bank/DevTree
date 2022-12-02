package myapp;

public class todoarray {
    public static void main (String[] args) {
        String[] tasks = new String[3];

        tasks[0] = "running";
        tasks[1] = "eating";
        tasks[2] = "sleeping";
        
        System.out.println(tasks);
    // useless 'tasks',only gives array location, not values
        System.out.println(tasks[0]);
        System.out.println(tasks[1]);
        System.out.println(tasks[2]);
        System.out.println(tasks.length);
            
    // prints out all the elements of an array
        int index = 0;    
        while (index < tasks.length) {
            System.out.printf("%d: %s", index, tasks[index]);
            index = index + 1;
        }
}
}
