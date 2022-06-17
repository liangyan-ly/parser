package com.parser.demo.service;


import com.parser.demo.entity.DroolsRule;

import java.util.List;

/**
 * drools rule service
 *
 * @author huan.fu
 * @date 2022/5/27 - 14:32
 */
public interface DroolsRuleService {
    /**
     * 从数据库中加载所有的drools规则
     */
    List<DroolsRule> findAll();

    /**
     * 添加drools规则
     */
    void addDroolsRule(DroolsRule droolsRule);

    /**
     * 修改drools 规则
     */
    void updateDroolsRule(DroolsRule droolsRule);

    /**
     * 删除drools规则
     */
    void deleteDroolsRule(Long ruleId, String ruleName);
}
