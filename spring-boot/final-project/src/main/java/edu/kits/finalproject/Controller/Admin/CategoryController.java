package edu.kits.finalproject.Controller.Admin;

import edu.kits.finalproject.Domain.Category;
import edu.kits.finalproject.Domain.Product;
import edu.kits.finalproject.Model.CategoryDto;
import edu.kits.finalproject.Model.ResponseDto;
import edu.kits.finalproject.Service.CategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("admin/categories")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("add")
    public ResponseDto add() {
        return new ResponseDto();
    }

    @GetMapping("edit/{categoryId}")
    public ResponseDto edit(ModelMap model, @PathVariable("categoryId") Long categoryId) {
        return new ResponseDto();
    }

    @PostMapping("saveOrUpdate")
    public ResponseDto saveOrUpdate(ModelMap model, @Valid CategoryDto dto, BindingResult result) {
        if (result.hasErrors()) {
            for (Object object : result.getAllErrors()) {
                if (object instanceof FieldError fieldError) {
                    return new ResponseDto();
                }
            }
        }
        return new ResponseDto();
    }

    @GetMapping("")
    @ResponseBody
    public ResponseDto list(ModelMap model) {
        List<Category> result = categoryService.getAllCategorys();
        for(Category category : result) {
            List<Product> prds = category.getProducts();
            String prdOut = "";
            for(Product prd : prds){
                prdOut += prd.getProductId() + " - " + prd.getName() + "\n";
            }
            System.out.println("======> " + category.getCategoryId() + " - " + category.getName() + "\n" + prdOut);
        }
        return new ResponseDto(
                "", "", "", "USER_NO_EXIST"
        );
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseDto getById(@PathVariable("id") Long id) {
        Category cat = categoryService.getById(id);
        System.out.println(cat.getProducts().get(0).getName());
        return new ResponseDto();
    }
}
