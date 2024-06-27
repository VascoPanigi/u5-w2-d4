package vascopanigi.u5_w2_d4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vascopanigi.u5_w2_d4.entities.BlogPost;
import vascopanigi.u5_w2_d4.services.BlogPostService;


@RestController
@RequestMapping("/blogposts")
public class BlogPostController {
    @Autowired
    private BlogPostService blogPostService;

    //1. GET
    @GetMapping
    private Page<BlogPost> geetBlogPosts(@RequestParam(defaultValue = "0") int pageNum, @RequestParam(defaultValue = "10") int pageSize, @RequestParam(defaultValue = "id") String sortBy) {
        return this.blogPostService.getBlogPosts(pageNum, pageSize, sortBy);
    }

    //2. POST
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    private BlogPost save(@RequestBody BlogPostDTO body) {
//        return this.blogPostService.save(body);
//    }
}
