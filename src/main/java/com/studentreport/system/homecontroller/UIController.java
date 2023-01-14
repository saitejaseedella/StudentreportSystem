package com.studentreport.system.homecontroller;

import com.studentreport.system.model.Product;
import com.studentreport.system.service.ElasticSearchQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Controller
public class UIController {

    @Autowired
    private ElasticSearchQuery elasticSearchQuery;

 /*   @GetMapping("/")
    public String viewHomePage(Model model) throws IOException {
        model.addAttribute("listProductDocuments",elasticSearchQuery.searchAllDocuments());
        return "index";
    }*/

    @GetMapping("/")
    public String viewHomePage(Model model) throws IOException {
         model.addAttribute("listProductDocuments",elasticSearchQuery.searchAllDocuments());
        return "index";
    }

    @PostMapping("/saveStudent")
    public String saveProduct(@ModelAttribute("product") Product product) throws IOException {
        elasticSearchQuery.createOrUpdateDocument(product);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") String id, Model model) throws IOException {

        Product product = elasticSearchQuery.getDocumentById(id);
        model.addAttribute("product", product);
        return "UpdateStudent";
    }

    @GetMapping("/showNewStudentForm")
    public String showNewEmployeeForm(Model model) {
        // create model attribute to bind form data
        Product product = new Product();
        model.addAttribute("product", product);
        return "AddStudent";
    }

    @GetMapping("/deleteStudent/{id}")
    public String deleteProduct(@PathVariable(value = "id") String id) throws IOException {

        this.elasticSearchQuery.deleteDocumentById(id);
        return "redirect:/";
    }


}
