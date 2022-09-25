class Donut(
    val isDonut: Boolean = true, //запись доступна только платным подписчикам VK Donut;
    val paidDuration: Int = 5, //время, в течение которого запись будет доступна только платным подписчикам VK Donut;
    val canPublishFreeCopy: Boolean = true, //можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut;
)