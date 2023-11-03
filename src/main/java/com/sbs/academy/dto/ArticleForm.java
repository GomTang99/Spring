package com.sbs.academy.dto;


import com.sbs.academy.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.hibernate.sql.Update;

import javax.persistence.*;
@AllArgsConstructor
@ToString
public class ArticleForm {
    private String title;
    private String content;

    /* @Id */
    /* @GeneratedValue(strategy = GenerationType.AUTO) */
    /* @Transient필드를 매핑하지 않는다. 임시로 어떤값을 보관하고 싶을때 사용 */
    /* @Access(AccessType.PROPERTY)GETTER에 의해 사용할수있음 */
    /* @Column() */
    private Long id;

//    public ArticleForm(String title, String content) {
//        this.title = title;
//        this.content = content;
//    }
//
//    @Override
//    public String toString() {
//        return "DTOForm{" + "title='" + title + '\'' +
//                ", content='" + content + '\'' + '}';
//    }

    public Article toEntity() {
        return new Article(null, title, content);
    }



}
