package pereira.mateus.frmkmbdemo.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class Book extends BaseModel{
    private Long id;
    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private Integer year;
    private Integer pages;
    private String language;
    private String description;
    private String website;
    private String cover;


}
