package vascopanigi.u5_w2_d4.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "BlogPosts")
public class BlogPost {
    @Id
    @GeneratedValue
    private UUID id;
    private String category;
    private String title;
    private String cover;
    private String content;
    private int readTime;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    public BlogPost(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public BlogPost(String category, String title, String cover, String content, int readTime, Author author) {
        this.category = category;
        this.title = title;
        this.cover = cover;
        this.content = content;
        this.readTime = readTime;
        this.author = author;
    }
}