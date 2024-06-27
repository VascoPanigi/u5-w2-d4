package vascopanigi.u5_w2_d4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthDate;
    private String avatar;

//    @OneToMany(mappedBy = "author")
//    private List<BlogPost> blogPostList;

    public Author(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
}