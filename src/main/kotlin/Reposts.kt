class Reposts(
    val count: Int? = 2, // число пользователей, скопировавших запись;
    val userReposted: Boolean = true //наличие репоста от текущего пользователя (1 — есть, 0 — нет).
)