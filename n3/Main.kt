@SuppressWarnings("all")
fun main(args: Array<String>) {

    val u = mutableListOf<User>()
    u.add(User("Pavel", 50))
    u.add(User("Suresh", 59))
    u.add(User("Robin", 50))
    val s: Int = u.map { it.age }.sum()
    val av: Double = u.map { it.age }.average()
    val m: Int? = u.map { it.age }.max()
    for (i in 0..2){
        if(u[i].age == m)
            println("The eldest user is " +u[i].name )

    }
    println("Sum of all ages is " + s)
    println("Average is "+av)
}

class User(
        var name: String,
        var age: Int
)

