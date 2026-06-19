package com.example.mapp.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@Table(name = "t_orders")
@AllArgsConstructor
@NoArgsConstructor
public class Order{


   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String orderNumber;

   @OneToMany(cascade = CascadeType.ALL)
   private List<OrderLineItems> orderLineItemsList;

}

