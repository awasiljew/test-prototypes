package awasiljew.springtestapp.controller;

import awasiljew.springtestapp.model.Shop;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author adam
 */
@Controller
@RequestMapping("/json")
public class SimpleJSONController {

    @RequestMapping(value = "{name}", method = RequestMethod.GET)
    public @ResponseBody Shop getShopInJSON(@PathVariable String name) {
        System.out.println("SimpleJSONController: Passing through...");
        Shop shop = new Shop();
        shop.setName(name);
        shop.setStaffName(new String[]{"mkyong1", "mkyong2"});

        return shop;

    }
    
}
