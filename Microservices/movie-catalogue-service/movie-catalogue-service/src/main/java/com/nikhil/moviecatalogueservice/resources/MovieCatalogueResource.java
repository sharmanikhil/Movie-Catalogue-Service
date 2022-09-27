package com.nikhil.moviecatalogueservice.resources;

import com.nikhil.moviecatalogueservice.model.CatalogueItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalogue")
public class MovieCatalogueResource {
    @RequestMapping("/{userId}")
    public List<CatalogueItem> getCatalog(@PathVariable("userId") String userId){
        List<CatalogueItem> list=new ArrayList<>();

        return Collections.singletonList(
                new CatalogueItem("Transformers","Test",4)

                );

    }
}
