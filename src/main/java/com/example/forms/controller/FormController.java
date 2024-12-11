package com.example.forms.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
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
import com.example.forms.repositories.FormRepository;

@RestController
@RequestMapping("/api/forms")
public class FormController {

    private final FormRepository formRepository;

    public FormController(FormRepository formRepository) {
        this.formRepository = formRepository;
    }

    @GetMapping("")
    List<Form> findAll(){
        return formRepository.findAllForms();
    }

    @GetMapping("/{id}")
    Optional<Form> getById(@PathVariable Integer id ) {
        return formRepository.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    void create(@RequestBody Form form){
        formRepository.create(form);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    void update(@RequestBody Form form, @PathVariable Integer id){
        formRepository.update(form, id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void deleteById(@PathVariable Integer id){
        formRepository.delete(id);
    }
}