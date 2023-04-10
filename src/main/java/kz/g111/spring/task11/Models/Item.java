package kz.g111.spring.task11.Models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Item {
private Long id;

private String name;

private String description;

private double price;
}
