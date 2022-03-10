package values

class Max {
    fun max(vararg  nums : Int) : Int{
        var maxNum = Int.MIN_VALUE
        for (num in nums) {
            maxNum = kotlin.math.max(maxNum,num)
        }
        return maxNum
    }
}