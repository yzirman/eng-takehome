package co.pocketshop.eng.takehome.models.response

data class ExternalStudent(val id: String, val name: String, val major: String)

data class StudentResponse(val student: List<ExternalStudent>)
