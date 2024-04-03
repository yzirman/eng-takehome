package co.pocketshop.eng.takehome.controller

import co.pocketshop.eng.takehome.models.response.StudentResponse
import co.pocketshop.eng.takehome.service.StudentService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("/students")
class StudentController(private val studentService: StudentService) {

  @CrossOrigin
  @GetMapping("/all")
  fun getAllStudents(): ResponseEntity<StudentResponse> {
    return ResponseEntity.ok(studentService.getAllStudents())
  }

  /** This endpoint should return a list of all _distinct_ majors */
  @GetMapping("/majors")
  fun getMajors(): ResponseEntity<Void> {
    return ResponseEntity.ok(null)
  }
}
