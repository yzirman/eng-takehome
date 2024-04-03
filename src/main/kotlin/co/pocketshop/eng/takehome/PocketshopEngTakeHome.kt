package co.pocketshop.eng.takehome

import co.pocketshop.eng.takehome.models.dto.StudentDTO
import co.pocketshop.eng.takehome.repository.StudentRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Service
import java.util.*

@SpringBootApplication class EngAssesmentApplication

fun main(args: Array<String>) {
  runApplication<EngAssesmentApplication>(*args)
}

@Service
class Hydrate(private val studentRepository: StudentRepository) : CommandLineRunner {
  override fun run(vararg args: String?) {
    studentRepository.saveAll(
        listOf(
            StudentDTO(UUID.randomUUID(), "Alice", "Computer Science"),
            StudentDTO(UUID.randomUUID(), "Bob", "Computer Science"),
            StudentDTO(UUID.randomUUID(), "Charlie", "Math"),
            StudentDTO(UUID.randomUUID(), "David", "Math"),
            StudentDTO(UUID.randomUUID(), "Eve", "Math"),
            StudentDTO(UUID.randomUUID(), "Frank", "Math"),
            StudentDTO(UUID.randomUUID(), "Grace", "Math"),
            StudentDTO(UUID.randomUUID(), "Heidi", "Math"),
            StudentDTO(UUID.randomUUID(), "Ivan", "Math"),
            StudentDTO(UUID.randomUUID(), "Judy", "Math"),
            StudentDTO(UUID.randomUUID(), "Kevin", "Math"),
            StudentDTO(UUID.randomUUID(), "Linda", "Math"),
            StudentDTO(UUID.randomUUID(), "Michael", "Finance"),
            StudentDTO(UUID.randomUUID(), "Nancy", "Finance"),
            StudentDTO(UUID.randomUUID(), "Oscar", "Finance"),
            StudentDTO(UUID.randomUUID(), "Pam", "Finance"),
            StudentDTO(UUID.randomUUID(), "Quincy", "Finance"),
            StudentDTO(UUID.randomUUID(), "Randy", "Finance"),
            StudentDTO(UUID.randomUUID(), "Sally", "Finance"),
            StudentDTO(UUID.randomUUID(), "Tom", "Finance"),
            StudentDTO(UUID.randomUUID(), "Ursula", "Finance"),
            StudentDTO(UUID.randomUUID(), "Victor", "Finance"),
            StudentDTO(UUID.randomUUID(), "Wendy", "Finance"),
            StudentDTO(UUID.randomUUID(), "Xavier", "Finance"),
            StudentDTO(UUID.randomUUID(), "Yvonne", "Finance"),
            StudentDTO(UUID.randomUUID(), "Zach", "Finance"),
        ))
  }
}
