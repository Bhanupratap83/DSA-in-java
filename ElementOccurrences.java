
    public class ElementOccurrences {
        public static void main(String[] args) {
            // Example array
            int[] array = {4, 5, 4, 6, 7, 5, 6, 4, 8, 9, 7};
    
            // Call the function to find occurrences
            findOccurrences(array);
        }
    
        public static void findOccurrences(int[] array) {
            // Create a boolean array to keep track of which elements have been processed
            boolean[] visited = new boolean[array.length];
    
            System.out.println("Element occurrences in the array:");
    
            // Loop through each element of the array
            for (int i = 0; i < array.length; i++) {
                // Skip this element if it is already processed
                if (visited[i]) {
                    continue;
                }
    
                // Initialize count for the current element
                int count = 1;  // Current element itself is counted as 1
    
                // Check for all subsequent elements
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        visited[j] = true; // Mark the element as processed
                    }
                }
    
                // Print the element and its occurrence
                System.out.println("Element " + array[i] + ": " + count + " times");
            }
        }
    }
 

