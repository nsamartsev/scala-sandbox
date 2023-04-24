package playground.week2oop

object ModelsCourseAndInstructor extends App {

  class Course(var courseID: Int,
               var title: String,
               var releaseYear: String,
               var instructor: Instructor) {

    def isTaughtBy(instructor: Instructor): Boolean = {
      if (this.instructor.id == instructor.id &&
          this.instructor.equals(instructor))
        true
      else
        false
    }

    def copyCourse(newReleaseYear: String): Course = {
      new Course(courseID = this.courseID,
        title = this.title,
        releaseYear = newReleaseYear,
        instructor = this.instructor)
    }

    def getID: String = {
      this.courseID.toString + this.instructor.id.toString
    }
  }

  class Instructor(val id: Int, var name: String, var surname: String) {
    this.name = name.toLowerCase.capitalize
    this.surname = surname.toLowerCase.capitalize

    def fullName(): String = {
      this.name + " " +this.surname
    }
  }

  val instructor: Instructor = new Instructor(1, "вася", "пупкин")
  println(instructor.fullName())    // Вася Пупкин

  val course: Course = new Course(2, "Course Name", "1234", instructor)
  println(course.instructor.fullName())    // Вася Пупкин
  println(course.getID)    // 21
  println(course.isTaughtBy(instructor))    // true
  println(course.isTaughtBy(new Instructor(1, "Вася", "Пупкин")))    // false

  val courseCopy = course.copyCourse("4321")
  assert (!courseCopy.eq(course)) // false
  assert (courseCopy.releaseYear == "4321")

}
