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

        //arrange
        val realIdAfterAdded = null            //цель

        //act
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

        val idIsNotNull = myNewWall.copy(id = myNewWall.id)

        //assert
        assertEquals(realIdAfterAdded, idIsNotNull)

    }

    @Test
    fun should_return_true() {

        //arrange
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
        val coincidence: Boolean = true

        //act
        val bibi = WallService.update(hiWall)

        //assert
        assertEquals(coincidence, bibi)
    }

    @Test
    fun should_return_false() {
        //arrange
        val myWall = WallService.add(
            Post(
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
        )
        val notCoincidence: Boolean = false

        //act
        val bibi = WallService.update(myWall)

        //assert
        assertEquals(notCoincidence, bibi)
    }
}