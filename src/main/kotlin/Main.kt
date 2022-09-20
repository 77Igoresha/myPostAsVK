fun main() {

    WallService.add(
        Post(
            5,
            2,
            3,
            4,
            5,
            "GoodBye",
            1,
            "Type2",
            likes = Likes(1, true, true, true),
            true,
            true
        )
    )

    WallService.update(
        Post(
            15,
            18,
            21,
            121,
            11,
            "GoodEvening",
            12,
            "Type3",
            likes = Likes(3, false, true, true),
        )
    )
}