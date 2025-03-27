package ir.fa.Payment.controller;

import ir.fa.Payment.dto.CodeTypeDTO;
import ir.fa.Payment.service.CodeTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "rest/CodeType")
public class CodeTypeController {
    @Autowired
    CodeTypeService codeTypeService;


    @PostMapping(value = "")
    public ResponseEntity<CodeTypeDTO> addCodeType(@RequestBody CodeTypeDTO model) throws Exception {
        try {
            CodeTypeDTO response = codeTypeService.save(model);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @PostMapping(value = "/list-info")
    public ResponseEntity<List<CodeTypeDTO>> getCodeTypeList() throws Exception {
        try {
            List<CodeTypeDTO> response = codeTypeService.findAll();
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @PostMapping(value = "/get/{id}")
    public ResponseEntity<CodeTypeDTO> getCodeType(@PathVariable Long id) throws Exception {
        try {
            CodeTypeDTO response = codeTypeService.findById(id);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @PostMapping(value = "/deleteById/{id}")
    public ResponseEntity deleteCodeType(@PathVariable Long id) throws Exception {
        try {
            codeTypeService.deleteById(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }



}
