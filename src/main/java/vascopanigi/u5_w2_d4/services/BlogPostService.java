package vascopanigi.u5_w2_d4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import vascopanigi.u5_w2_d4.entities.BlogPost;
import vascopanigi.u5_w2_d4.repositories.BlogPostRepository;

@Service
public class BlogPostService {

    @Autowired
    private BlogPostRepository blogPostRepository;

    @Autowired
    private AuthorService authorService;

    public Page<BlogPost> getBlogPosts(int pageNum, int pageSize, String sortBy) {
        if (pageSize > 50) pageSize = 50;
        Pageable pageable = PageRequest.of(pageNum, pageSize, Sort.by(sortBy));
        return blogPostRepository.findAll(pageable);
    }

//    public BlogPost save(BlogPostDTO newBlogPost) {
//        //poi si aggiungono cose
//        Author author = authorService.findById(newBlogPost.getAuthorId());
//        newBlogPost.setCategory("cose");
//        Random random = new Random();
//        int randomNum = random.nextInt(1, 90);
//        String cover = ("https://ui-avatars.com/api/?name=" + newBlogPost.getTitle());
//        BlogPost newPost = new BlogPost("cose", newBlogPost.getTitle(), ("https://ui-avatars.com/api/?name=" + newBlogPost.getTitle()), newBlogPost.getContent(), randomNum, author);
//
//        //infine si salva
//        return blogPostRepository.save(newPost);
//    }
}
