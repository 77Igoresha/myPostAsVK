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
            2,
            comments = Comments(2, true, true, true, false),
            likes = Likes(1, true, true, true),
            copyright = Copyright(432, "Link1", "Name1", "Type1"),
            reposts = Reposts(9, true),
            views = Views(5), "Type2",
            geo = Geo("type2", "coor2"),
            42,
            true,
            true,
            false,
            donut = Donut(true, 9, false)
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
            42,
            comments = Comments(4, false, true, true),
            likes = Likes(3, false, true, true),
            copyright = Copyright(472, "Link2", "Name2", "Type3"),
            reposts = Reposts(1, true),
            views = Views(0),
            "Type3",
            geo = Geo("type3", "coor2"),
            85,
            true,
            false,
            true,
            donut = Donut(true, 9, false)
        )
    )
}