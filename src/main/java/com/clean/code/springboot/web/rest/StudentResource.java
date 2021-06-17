//package com.clean.code.springboot.web.rest;
//
//
//import com.clean.code.springboot.model.Student;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@SuppressWarnings("ALL")
//@RestController
//@RequestMapping("/api")
//public class StudentResource {
//@GetMapping("/students")
//    public ResponseEntity getAll() {
//    Student student = new Student( 1l,"Saidbek", "Abduxamidov", "1-kurs");
//    Student student1 = new Student(1l, "Davlat", "Jalolov", "2-kurs");
//    Student student2 = new Student(1l, "Jaloliddin", "Kimdurov", "3-kurs");
//
//    List<Student> students = new ArrayList<>();
//    students.add(student);
//    students.add(student1);
//    students.add(student2);
//    return ResponseEntity.ok(students);
//
//}
//@GetMapping("/students{id}")
//    public  ResponseEntity getune(@PathVariable Long id){
//    Student student =new Student(id,"Saidbek", "Abduxamidov", "1-kurs" );
//    return ResponseEntity.ok(student);
//}
//@PostMapping("/students/all")
//    public ResponseEntity create(@RequestBody Student student){
//    return ResponseEntity.ok(student);
//}
//@GetMapping("/studdents")
//public ResponseEntity getOne(@RequestParam Long id,
//                             @RequestParam String name,
//                             @RequestParam String lastName,
//                             @RequestParam String course) {
//    Student student = new Student(id, name, lastName,course);
//    return ResponseEntity.ok(student);
//}
//
//@DeleteMapping("/students{id}")
//public ResponseEntity delete(@PathVariable Long id){
//    return ResponseEntity.ok("Ma'lumot o'chirildi");
//}


//
//@PutMapping("/students{id}")
//    public ResponseEntity update(@PathVariable Long id, @RequestBody Student studentNew){
//    Student student = new Student(1l, "Saidbek", "Abduxamidov","1-kurs");
//    student.setId (id);
//    student.setLastname(student.getLastname());
//    return ResponseEntity.ok(student);
//
//}
//
//
//}
