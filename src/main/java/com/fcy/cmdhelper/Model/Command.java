package com.fcy.cmdhelper.Model;

import lombok.Data;

import javax.persistence.*;

/*
 * Author:fcy
 * Date:2020/4/3 0:21
 * 命令  rev
关联的搜索词   字符串反转   反转字符串
样例  echo "ABCD" | rev    "DCBA"
语言  shell
相关链接


 */
@Data
@Entity(name="command")
public class Command {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private int exampleId;
    @Column
    private String command;
    private String language;
}
