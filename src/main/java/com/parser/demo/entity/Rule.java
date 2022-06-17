package com.parser.demo.entity;

import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlSchemaStatVisitor;
import com.alibaba.druid.stat.TableStat;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @项目名称: yusp-community-core模块
 * @类名称: Rule
 * @类描述: #资源类
 * @功能描述:
 * @创建人: 梁岩
 * @创建时间: 2022-06-16 11:47:03
 * @修改备注:
 * @修改记录: 修改时间    修改人员    修改原因
 * -------------------------------------------------------------
 * @version: 1.0.0
 * @Copyright (c) 宇信科技-版权所有
 */
@Data
public class Rule {

    //指标
    private String indicator;

    private String rulesNo;

    private MySqlSchemaStatVisitor visitor;

    private List<TableStat.Name> tableList;

    private List<TableStat.Column> columnList;

    private List<TableStat.Condition> conditionList;

    private Map<String,Object> result;
    //初始分数
    private Integer score;
}
