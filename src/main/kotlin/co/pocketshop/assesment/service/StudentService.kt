package co.pocketshop.assesment.service

import co.pocketshop.assesment.models.response.ExternalStudent
import co.pocketshop.assesment.models.response.StudentResponse
import co.pocketshop.assesment.repository.StudentRepository
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
