//Create a function that takes in 4 strings  and creates an array out of them
//then prints out the array
//Create a function that given an array below:
// var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.      (2 points)
//3. Create one function that given the below array:
// var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements                         (1 point)
//(ii) prints out the index of 158                                                                                (1 point)
//(iii) prints out the elements in ascending order                                           (2 points)
//4. Create a function that takes in 3 names and returns a string array
fun main(){
    giveAnimals(arrayOf("cats","puppies","zebras","antelopes"))
    getCities(arrayOf("harare","mumbai","dodoma","jakarta"))
    Numbers(arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62))
    var siblings = takesNames(arrayOf("vicky","Ann","Musa"))
    println(siblings.contentToString())

}
fun giveAnimals(animals:Array<String>){
    println(animals.contentToString())
}
fun getCities(cities:Array<String>){
    cities.forEach { city->
        println(city.capitalize())
    }

}
fun Numbers(nums:Array<Int>){
    //var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    println(nums.get(1) + nums.get(4))
    println(nums.indexOf(158))
    println(nums.sortedArray().contentToString())
    takesNames(arrayOf())
}
fun takesNames(names:Array<String>):Array<String>{
    return names



}
