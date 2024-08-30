fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numMessages: Int) {
    if(numMessages < 100){
        println("You have $numMessages notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}
