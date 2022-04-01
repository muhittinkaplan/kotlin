class main {
    init {
        var myDog=DogClass()
        myDog.sleep()//animal class
        myDog.roam()//mammal class
        myDog.makeNoise()//dog class


        var mySnake=SnakeClass()
        mySnake.sleep()//animal class method
        mySnake.roam()//reptiles class method
        mySnake.makeNoise()//snake class method
        println(mySnake.animalCount)


        var myChicken=ChickenClass()
        myChicken.sleep()
        myChicken.roam()
        myChicken.makeNoise()
        println(myChicken.animalCount)
        println(myChicken.birdCound)
    }

}

fun main(args: Array<String>) {
    var myMain=main()
}