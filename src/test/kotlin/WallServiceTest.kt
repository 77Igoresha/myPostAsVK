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
                "Type1",
                Likes(10, true, true, true),
                true,
                true
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
                "Type1",
                Likes(10, true, true, true),
                true,
                true
            )
        )

        val bibi = WallService.update(hiWall)

        assertTrue(bibi)
    }

    @Test
    fun should_return_false() {

        val myPost= Post(
                95,
                12,
                13,
                14,
                15,
                "Kotofey",
                12,
                "Type3",
                Likes(45, true, true, true), true,
                true
            )

        val post2 = WallService.update(myPost)

        assertFalse(post2)
    }
}