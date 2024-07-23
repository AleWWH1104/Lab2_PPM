data class Person(val name: String, var age: Int, val gender: String)
data class Student(val name: String, var age: Int, val gender: String, val studentId: String)

fun mapeo(student: Person, studentId: String): Student{
    return Student(student.name, student.age, student.gender, studentId)
}

fun main(){
    val personas = listOf(Person("Xitu", 19, "F"),Person("Raquel", 19, "F"), Person("Oli", 19, "M"))
    val estudiantes = personas.mapIndexed {index, person -> mapeo(person, "ID:${index + 1}")}

    for (i in estudiantes){
        println("El estudiante ${i.name}, con ${i.studentId}, tiene ${i.age} de edad")
    }
}