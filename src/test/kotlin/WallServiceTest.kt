import org.junit.Test
import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun id_should_is_not_null() {

        val myNewWall = WallService.add(
            Post(
                5,
                2,
                3,
                4,
                5,
                "GutenTag",
                1,
                7,
                Comments(24, true, true, false),
                Likes(18, false, true, true),
                Copyright(237, "Link4", "Name1", "type1"),
                Reposts(13, true),
                views = Views(1),
                "type2",
                geo = Geo("type5","coor2"),
                97,
                true,
                false,
                true,
                true,
                donut = Donut(true,9,false)
            )
        )
        val idIsNotNull = myNewWall.id

        assertNotNull(idIsNotNull)
    }

    @Test
    fun should_return_true() {

        val hiWall = WallService.add(
            Post(
                5,
                2,
                3,
                4,
                5,
                "GutenTag",
                1,
                2,
                Comments(2, true, true, false),
                Likes(10, true, true, true),
                Copyright(837, "Link8", "Name4", "type9"),
                Reposts(1, true),
                views = Views(6),
                "Type1", geo = Geo("Type1", "coor2"),
                78,
                true,
                true,
                false,
                true,
                donut = Donut(true,9,false)
            )
        )

        val bibi = WallService.update(hiWall)

        assertTrue(bibi)
    }

    @Test
    fun should_return_false() {

        val myPost = Post(
            95,
            12,
            13,
            14,
            15,
            "Kotofey",
            12,
            42,
            Comments(29, true, true, false),
            Likes(11, true, true, true),
            Copyright(183, "Link4", "Name4", "type10"),
            Reposts(13, true),
            views = Views(6),
            "Type3", geo = Geo("Type3","core3"),
            74,
            true,
            false,
            donut = Donut(false,6,false)
        )

        val post2 = WallService.update(myPost)

        assertFalse(post2)
    }
}