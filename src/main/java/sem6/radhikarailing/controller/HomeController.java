package sem6.radhikarailing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import sem6.radhikarailing.entity.OrderData;
import sem6.radhikarailing.entity.Product;

import sem6.radhikarailing.service.OrderService;
import sem6.radhikarailing.service.ProductService;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ProductService service;

    @Autowired
    private OrderService orderService;

    // HOME PAGE

    @GetMapping("/")
    public String home() {

        return "home";
    }

    // ALL PRODUCTS

    @GetMapping("/products")
    public String products(Model model) {

        model.addAttribute(
                "products",
                service.getAllProducts());

        return "products";
    }

    // CATEGORY PRODUCTS

    @GetMapping("/products/{category}")
    public String categoryProducts(
            @PathVariable String category,
            Model model) {

        List<Product> products =
                service.getProductsByCategory(category);

        model.addAttribute("products", products);

        return "products";
    }

    // QUOTATION PAGE

    @GetMapping("/quotation")
    public String quotation() {

        return "quotation";
    }

    // ADMIN PAGE

    @GetMapping("/admin")
    public String admin(Model model) {

        model.addAttribute(
                "products",
                service.getAllProducts());

        return "admin";
    }

    // SAVE PRODUCT

    @PostMapping("/save")
    public String save(Product product) {

        service.save(product);

        return "redirect:/admin";
    }

    // DELETE PRODUCT

    @GetMapping("/delete/{id}")
    public String delete(
            @PathVariable Long id) {

        service.delete(id);

        return "redirect:/admin";
    }

    // EDIT PRODUCT PAGE

    @GetMapping("/edit/{id}")
    public String editProduct(
            @PathVariable Long id,
            Model model) {

        Product product =
                service.getProductById(id);

        model.addAttribute(
                "product",
                product);

        return "edit";
    }

    // UPDATE PRODUCT

    @PostMapping("/update")
    public String updateProduct(
            Product product) {

        service.save(product);

        return "redirect:/admin";
    }

    // PLACE ORDER

    @PostMapping("/place-order")
    public String placeOrder(
            OrderData order) {

        orderService.save(order);

        return "success";
    }

    // ORDERS PAGE

    @GetMapping("/orders")
    public String orders(Model model) {

        model.addAttribute(
                "orders",
                orderService.getAllOrders());

        return "orders";
    }

    // SUCCESS PAGE

    @GetMapping("/success")
    public String success() {

        return "success";
    }

}