package com.studentapp.student_service.Implementation;



import com.studentapp.student_service.responses.AddressResponse;
import com.studentapp.student_service.entity.Student;
import com.studentapp.student_service.repository.StudentRepo;
import com.studentapp.student_service.responses.Studentresponses;
import com.studentapp.student_service.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Optional;

@Component
public class StudentImpl implements StudentService {




    @Value("${addressservice.base.url}")
    private String addressBaseURL;




    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private WebClient webClient;
//
//    @Autowired
//    private RestTemplate restTemplate;

    @Override
    public List<Student> getStudents() {
        List<Student> slist=studentRepo.findAll();
        return slist;
    }



    @Override
    public Studentresponses getStudent(int studId) {

//        AddressResponse addressResponse=new AddressResponse();
        Optional<Student> s1=studentRepo.findById(studId);
        Studentresponses studentresponses=  modelMapper.map(s1,Studentresponses.class);
        AddressResponse addressResponse=webClient
                .get()
                .uri("http://localhost:9091/address/getAddress/"+studId)
                .retrieve()
                .bodyToMono(AddressResponse.class)
                .block();
        studentresponses.setAddressResponse(addressResponse);

//    Studentresponses studentresponses=new Studentresponses();
//    studentresponses.setStudId(s1.getStudId());
//    studentresponses.setSuuid(s1.getSuuid());
//    studentresponses.setStudentName(s1.getStudentName());
//    studentresponses.setStudentCollege(s1.getStudentCollege());
        return studentresponses ;
    }









   ////////  method for REST TEMPLATE
//    @Override
//    public Studentresponses getStudent(int studId) {
//
////        AddressResponse addressResponse=new AddressResponse();
//    Optional<Student> s1=studentRepo.findById(studId);
//  Studentresponses studentresponses=  modelMapper.map(s1,Studentresponses.class);
// AddressResponse addressResponse= restTemplate.getForObject(addressBaseURL+"/address/getAddress/{studId}",AddressResponse.class,studId);
//
//  studentresponses.setAddressResponse(addressResponse);
////    Studentresponses studentresponses=new Studentresponses();
////    studentresponses.setStudId(s1.getStudId());
////    studentresponses.setSuuid(s1.getSuuid());
////    studentresponses.setStudentName(s1.getStudentName());
////    studentresponses.setStudentCollege(s1.getStudentCollege());
//           return studentresponses ;
//            }


//  // unused methods
//    @Override
//    public Student getStudent(UUID studId) {
//        Student s1=studentRepo.findBySuuid(studId);
//        return s1;
//    }

//    @Override
//    public Studentresponses getStudentr(UUID studId) {
//        Student s1=studentRepo.findBySuuid(studId);
//        return s1;
//    }

//    @Override
//    public Student getStudent(UUID studId) {
//        //set
////        AddressDto addressDto=new AddressDto();
//        Student s1=studentRepo.findBySuuid(studId);
////                restTemplate.getForObject("http://localhost:9090/student/getStudent/{studId}",AddressDto.class);
//        return s1;
//
//    }


    @Override
    public Student addStudent(Student student) {
//        UUID uid = UUID.randomUUID();
//        student.setSuuid();
        return studentRepo.save(student);

    }

    @Override
    public Student updateStudent(int studId, Student newStudent) {
//        Student oldStudent= studentRepo.findBySuuid(studId);
        Student oldStudent= studentRepo.findById(studId).get();
        oldStudent.setStudentName(newStudent.getStudentName());
        oldStudent.setStudentCollege(newStudent.getStudentCollege());
        return studentRepo.save(oldStudent);

    }

//    @Override
//    public ResponseEntity<String> deleteStudent(int studId) {<Optional<Student>> optionalStudent = Optional.ofNullable(studentRepo.findById(studId));
//
//        if (optionalStudent.isPresent()) {
//            Student studnetToDelete = optionalStudent.get();
//
//            studentRepo.delete(studnetToDelete);
//            return ResponseEntity.ok("Student deleted successfully.");
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//
//    }





    @Override
    public ResponseEntity<String> deleteStudent(int studId) {
           Student sd=     studentRepo.findById(studId).get();

                 studentRepo.delete(sd);
            return ResponseEntity.ok("Student deleted successfully.");


    }




//
//    @Override
//    public Student findAddressByStudentId(UUID studId) {
//
//
//
//                   Address addressDto = restTemplate.getForObject(
//                    "http://localhost:9091/address/getAddress/{studId}",
//                    Address.class,
//                    studId
//            );
//
//            Student student = studentRepo.findBySuuid(studId);
//            if (addressDto != null) {
//                student.setAddress(addressDto);
//            }
//
//            return student;
//        }


}