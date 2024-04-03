package co.pocketshop.eng.takehome.repository

import co.pocketshop.eng.takehome.models.dto.StudentDTO
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import java.util.*

interface StudentRepository : CrudRepository<StudentDTO, UUID> {

  @Query("SELECT * FROM students", nativeQuery = true)
  fun getAll() : List<StudentDTO>
}
