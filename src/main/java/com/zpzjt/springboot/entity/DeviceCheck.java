package com.zpzjt.springboot.entity;

import javax.persistence.*;

@Entity
@Table(name="device_check")
public class DeviceCheck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


}
