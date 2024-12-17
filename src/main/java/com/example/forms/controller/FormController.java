package com.example.forms.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.forms.model.Form;
import com.example.forms.service.FormService;

@RestController
@RequestMapping("/api/forms")
public class FormController {


    private final FormService formService;

    public FormController(FormService formService) {
        this.formService = formService;
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome form";
    }

    @GetMapping("/all")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_USER')")
    List<Form> findAll(){
        return formService.findAllForms();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    Optional<Form> findById(@PathVariable Integer id ) {
        return formService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_USER')")
    void create(@RequestBody Form form){
        formService.createForm(form);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_USER')")
    void update(@RequestBody Form form, @PathVariable Integer id){
        formService.updateForm(form, id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN') || hasAuthority('ROLE_USER')")
    void deleteById(@PathVariable Integer id){
        formService.deleteForm(id);
    }
}