package co.pocketshop.eng.takehome.service

import co.pocketshop.eng.takehome.models.response.ExternalStudent
import co.pocketshop.eng.takehome.models.response.StudentResponse
import co.pocketshop.eng.takehome.repository.StudentRepository
import org.springframework.stereotype.Service

@Service
class StudentService(private val studentRepository: StudentRepository) {

  fun getAllStudents(): StudentResponse {
    studentRepository
        .getAll()
        .map { ExternalStudent(it.id.toString(), it.name, it.major) }
        .let {
          return StudentResponse(it)
        }
  }
}
