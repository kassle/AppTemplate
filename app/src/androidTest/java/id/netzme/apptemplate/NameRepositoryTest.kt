package id.netzme.apptemplate

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class NameRepositoryTest {
    private lateinit var nameRepository: NameRepository

    @Before
    fun setup() {
        nameRepository = NameRepository()
    }

    @Test
    fun getNameShouldReturnDefinedName() {
        val expected = "Edward Pullen"
        val result = nameRepository.getName()

        assertEquals(expected, result)
    }
}