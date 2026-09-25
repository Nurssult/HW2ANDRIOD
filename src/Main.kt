class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
){
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}
fun main() {
    val Song = Song("Thriller", "Michael Jackson", 1982, 1_000_000)
    Song.printDescription()
    println(Song.isPopular)
}