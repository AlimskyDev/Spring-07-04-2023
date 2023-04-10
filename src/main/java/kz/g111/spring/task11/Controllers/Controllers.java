package kz.g111.spring.task11.Controllers;

import kz.g111.spring.task11.Db.Db;
import kz.g111.spring.task11.Models.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;


@Controller
public class Controllers {
    @GetMapping("/")
    public String home(Model model){
        ArrayList<Item> items = Db.getItems();
        model.addAttribute("items", items);
        return "home";
    }
    @GetMapping("/details/{idParam}")
    public String details(Model model, @PathVariable(name = "idParam") Long id){
        Item item = Db.getItem(id);
        model.addAttribute("item", item);
        return("details");
    }
    @PostMapping("/addItem")
    public String addItem(@RequestParam(name = "item_name", defaultValue = "No Item") String name,
                          @RequestParam(name = "item_descr", defaultValue = "No description") String descr,
                          @RequestParam(name = "item_price", defaultValue = "0.00") double price){
        Db.addItem(new Item(null, name, descr, price));
        return "redirect:/";
    }
    @GetMapping("/addNewItem")
    public static String addNewItem() {
        return "addNewItem";
    }
}
