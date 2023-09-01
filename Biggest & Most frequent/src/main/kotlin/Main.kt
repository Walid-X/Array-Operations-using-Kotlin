import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in` )
    println("Enter the size of the array : ")
    val size:Int = scan.nextInt()
    val array: Array<Int> = Array(size) {0}
    for(i in 0 until size){
        print("Enter the element N $i in the array : ")
        array[i] = scan.nextInt()
    }
    val max:Int = maxi(array,size)
    println("The largest number in the array is : $max")
    val fre: Array<Int> = Array(size) {0}
    val mf = freq(array,size,fre)
    for(i in 0 until size){
        if (mf == array[i]){
            print("The most frequent number is $mf which have been repeated " + fre[i] + " times")
            break
        }
    }
    scan.close()
}
fun maxi(arr :Array<Int>,size:Int) : Int{
    var max = 0
    for(i in 0 until size){
        if (arr[i] > max){
            max = arr[i]
        }
    }
    return max
}
fun freq(arr :Array<Int>,size:Int,fre :Array<Int>): Int{
   var mf = 0
    for(i in 0 until size - 1){
        fre[i] = 0
        for(j in 0 until size ){
            if (arr[i] == arr[j]){
                fre[i] += 1
            }
            if(fre[i] > mf){
                mf = arr[i]
            }
        }
    }
    return mf
}
