package com.thenewboston.data.dto.bankapi.invalidblockdto

import com.google.gson.Gson
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class InvalidBlockDTOTest {
    private val jsonString =
        """
{
    "id": "2bcd53c5-19f9-4226-ab04-3dfb17c3a1fe",
    "created_date": "2020-07-11T18:44:16.518695Z",
    "modified_date": "2020-07-11T18:44:16.518719Z",
    "block_identifier": "65ae26192dfb9ec41f88c6d582b374a9b42ab58833e1612452d7a8f685dcd4d5",
    "block": "3ff4ebb0-2b3d-429b-ba90-08133fcdee4e",
    "confirmation_validator": "fcd2dce8-9e4f-4bf1-8dac-cdbaf64e5ce8",
    "primary_validator": "51461a75-dd8d-4133-81f4-543a3b054149"
  }
        """.trimIndent()

    @Test
    fun invalidBlockTest() {
        val invalidBlock = Gson().fromJson(jsonString, InvalidBlockDTO::class.java)

        invalidBlock.apply {
            assertEquals("2bcd53c5-19f9-4226-ab04-3dfb17c3a1fe", id)
            assertEquals(
                "65ae26192dfb9ec41f88c6d582b374a9b42ab58833e1612452d7a8f685dcd4d5",
                blockIdentifier
            )
            assertEquals("3ff4ebb0-2b3d-429b-ba90-08133fcdee4e", block)
            assertEquals("fcd2dce8-9e4f-4bf1-8dac-cdbaf64e5ce8", confirmationValidator)
            assertEquals("51461a75-dd8d-4133-81f4-543a3b054149", primaryValidator)
        }
    }
}
