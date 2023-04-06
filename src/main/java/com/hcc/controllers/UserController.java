package com.hcc.controllers;

//import com.hcc.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Arrays;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/v1/students")
//public class UserController {
//
//    @Autowired
//    UserService userService;
//
//    @GetMapping("/{studentId}")
//    public User getUser(@PathVariable("studentId") Long id) {
////        Optional<User> user = userService.getUser(id);
//        return USERS.stream()
//                .filter(user -> id.equals(user.getId()))
//                .findFirst()
//                .orElseThrow(() -> new IllegalStateException("Student " + id + "does not exist"));
//    }

//    @PostMapping("/user")
//    public void addUser(@RequestBody User user) {
//        userService.addUser(user);
//    }
//
//    @DeleteMapping("/user/{userId}")
//    public void deleteUser(@PathVariable Long id) {
//        userService.deleteUser(id);
//    }
//}
