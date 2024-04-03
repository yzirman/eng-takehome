package co.pocketshop.eng.takehome.models.dto

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.UUID

@Entity(name = "students")
data class StudentDTO(
    @Id
    val id: UUID,
    val name: String,
    val major: String
)
