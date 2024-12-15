package com.example.forms.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.forms.model.Form;
import com.example.forms.repositories.FormRepository;

@Service
public class FormService {

    private FormRepository formRepository;

    public FormService(FormRepository formRepository) {
        this.formRepository = formRepository;
    }

    public List<Form> findAllForms() {
        return formRepository.findAllForms();
    }

    public Optional<Form> findById(Integer id) {
        return formRepository.findById(id);
    }

    @Transactional
    public Form createForm(Form form){
        formRepository.create(form);
        return form; 
    }

    @Transactional
    public void updateForm(Form form, Integer id) {
        formRepository.update(form, id);
    }

    @Transactional
    public void deleteForm(Integer id) {
        formRepository.delete(id);
    }

}
