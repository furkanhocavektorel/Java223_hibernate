package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Data // getter ,setter,toString
@NoArgsConstructor // bos const
@AllArgsConstructor // dolu const
@Entity
public class Category{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true, // benzersiz olsun mu?
           // name = "category_adi", // kolon adı
            length = 50, // uzunluk
            nullable = false, // bos gecilebilir mi? false ise bos gecilemez
            updatable = false // false yapar iseniz güncelleme yapamazsınız
    )
    private String name;
    private String serial;
    @Embedded
    private BaseEntity baseEntity;

}
