package com.liy.bootliy.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： liy
 * @date： 2022/11/21 0021
 */
@Data
@ToString
public class Nums implements Serializable {

    private int idd;

    private String times;

    private int num;
}
