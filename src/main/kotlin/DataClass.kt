data class Post(
    val id: Int = 5,                //идентификатор записи
    val ownerId: Int = 7,          //Идентификатор владельца стены, на которой размещена запись
    val fromId: Int = 9,           //Идентификатор автора записи (от чьего имени опубликована запись)
    val createdBy: Int = 11,       //Идентификатор администратора, который опубликовал запись
    val date: Int? = 12,            //Время публикации записи
    val text: String = "Privet",   //Текст записи
    val replyOwnerId: Int = 9,           //Идентификатор владельца записи, в ответ на которую была оставлена текущая
    val replyPostId: Int = 3,      //Идентификатор записи, в ответ на которую была оставлена текущая
    val comments: Comments,
    val likes: Likes,
    val copyright: Copyright,
    val reposts: Reposts,
    val views: Views,
    val postType: String = "Type1",      //Тип записи
    val geo: Geo,
    val signerId: Int = 23, //Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
    val canPin: Boolean = true,      //Информация о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может).
    val canDelete: Boolean = true,
    val markerAsAds: Boolean = true,
    val canEdit: Boolean = true,     //Информация о том, может ли текущий пользователь редактировать запись (1 — может, 0 — не может).
    val donut: Donut
)