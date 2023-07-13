package edu.kits.finalproject.Controller.Admin;

import edu.kits.finalproject.Entity.Product;
import edu.kits.finalproject.Model.ProductDto;
import edu.kits.finalproject.Model.RegisterResponseDto;
import edu.kits.finalproject.Service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/admin/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("add")
    public RegisterResponseDto add() {
        return new RegisterResponseDto();
    }

    @GetMapping("edit/{productId}")
    public RegisterResponseDto edit(ModelMap model, @PathVariable("productId") Long productId) {
        return new RegisterResponseDto();
    }

    @PostMapping("saveOrUpdate")
    public RegisterResponseDto saveOrUpdate(ModelMap model, @Valid ProductDto dto, BindingResult result) {
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
    public RegisterResponseDto list(ModelMap model) {
        List<Product> result = productService.getAllProducts();
        for(Product prd : result) {
            System.out.println("======> " + prd.getProductId() + " - " + prd.getName());
        }
        return new RegisterResponseDto(
                "", "", "", "USER_NO_EXIST"
        );
    }
}
