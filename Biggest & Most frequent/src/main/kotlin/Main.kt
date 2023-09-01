import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    
    // Prompt the user for the size of the array
    println("Enter the size of the array: ")
    val size: Int = scan.nextInt()
    
    // Create an array to store user-input values, initialized with all elements set to 0
    val array: Array<Int> = Array(size) { 0 }
    
    // Loop to input values into the array
    for (i in 0 until size) {
        print("Enter the element N $i in the array: ")
        array[i] = scan.nextInt()
    }
    // Find the largest number in the array
    val max: Int = maxi(array, size)
    println("The largest number in the array is: $max")
    
    // Create an array to store frequency counts
    val fre: Array<Int> = Array(size) { 0 }
    
    // Find the most frequent number and its frequency
    val mf = freq(array, size, fre)
    
    // Loop to find the number with the highest frequency
    for (i in 0 until size) {
        if (mf == array[i]) {
            // Print the most frequent number and its frequency
            print("The most frequent number is $mf which has been repeated " + fre[i] + " times")
            break
        }
    }
    // Close the scanner to release resources
    scan.close()
}
// Function to find the maximum value in an array
fun maxi(arr: Array<Int>, size: Int): Int {
    var max = 0
    for (i in 0 until size) {
        if (arr[i] > max) {
            max = arr[i]
        }
    }
    return max
}
// Function to find the most frequent number in an array and its frequency
fun freq(arr: Array<Int>, size: Int, fre: Array<Int>): Int {
    var mf = 0
    for (i in 0 until size - 1) {
        fre[i] = 0
        for (j in 0 until size) {
            if (arr[i] == arr[j]) {
                fre[i] += 1
            }
            if (fre[i] > mf) {
                mf = arr[i]
            }
        }
    }
    return mf
}
