package edu.kits.finalproject.Controller.Admin;

import edu.kits.finalproject.Entity.Category;
import edu.kits.finalproject.Entity.Product;
import edu.kits.finalproject.Model.CategoryDto;
import edu.kits.finalproject.Model.RegisterResponseDto;
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
@RequestMapping("api/admin/categories")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("add")
    public RegisterResponseDto add() {
        return new RegisterResponseDto();
    }

    @GetMapping("edit/{categoryId}")
    public RegisterResponseDto edit(ModelMap model, @PathVariable("categoryId") Long categoryId) {
        return new RegisterResponseDto();
    }

    @PostMapping("saveOrUpdate")
    public RegisterResponseDto saveOrUpdate(ModelMap model, @Valid CategoryDto dto, BindingResult result) {
        if (result.hasErrors()) {
            for (Object object : result.getAllErrors()) {
                if (object instanceof FieldError fieldError) {
                    return new RegisterResponseDto();
                }
            }
        }
        return new RegisterResponseDto();
    }

    @GetMapping("")
    @ResponseBody
    public String list(ModelMap model) {
        return "Get all categories";
//        List<Category> result = categoryService.getAllCategorys();
//        for(Category category : result) {
//            List<Product> prds = category.getProducts();
//            String prdOut = "";
//            for(Product prd : prds){
//                prdOut += prd.getProductId() + " - " + prd.getName() + "\n";
//            }
//            System.out.println("======> " + category.getCategoryId() + " - " + category.getName() + "\n" + prdOut);
//        }
//        return new RegisterResponseDto(
//                "", "", "", "USER_NO_EXIST"
//        );
    }

    @GetMapping("/{id}")
    @ResponseBody
    public RegisterResponseDto getById(@PathVariable("id") Long id) {
        Category cat = categoryService.getById(id);
        System.out.println(cat.getProducts().get(0).getName());
        return new RegisterResponseDto();
    }
}
