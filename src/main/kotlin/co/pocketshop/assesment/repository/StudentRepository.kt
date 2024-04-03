package co.pocketshop.assesment.repository

import co.pocketshop.assesment.models.dto.StudentDTO
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import java.util.*

interface StudentRepository : CrudRepository<StudentDTO, UUID> {

  @Query("SELECT * FROM students", nativeQuery = true)
  fun getAll() : List<StudentDTO>
}
