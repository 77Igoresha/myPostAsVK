object WallService {
    private var posts =
        emptyArray<Post>()

    private var uniqueId = 0   //уникальный номер

    fun add(post: Post): Post {
        uniqueId += 1
        val addPost = post.copy(id = uniqueId)
        posts += addPost
        return addPost
    }

    fun update(post: Post): Boolean {
        for ((index, item) in posts.withIndex()) {
            if (item.id == post.id) {
                posts[index] = post
                return true
            }
        }
        return false
    }

    fun clear() {
        posts = emptyArray()
    }
}