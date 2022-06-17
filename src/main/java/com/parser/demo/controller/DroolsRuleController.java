package com.parser.demo.controller;


import com.parser.demo.config.DroolsManager;
import com.parser.demo.entity.Rule;
import com.parser.demo.entity.DroolsRule;
import com.parser.demo.service.DroolsRuleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 控制层
 *
 * @date 2022/5/27 - 14:36
 */
@RestController
@RequestMapping("/drools/rule")
public class DroolsRuleController {

    @Resource
    private DroolsRuleService droolsRuleService;
    @Resource
    private DroolsManager droolsManager;

    @GetMapping("/findAll")
    public List<DroolsRule> findAll() {
        return droolsRuleService.findAll();
    }

    @PostMapping("/add")
    public String addRule(@RequestBody DroolsRule droolsRule) {
        droolsRuleService.addDroolsRule(droolsRule);
        return "添加成功";
    }

    @PostMapping("/update")
    public String updateRule(@RequestBody DroolsRule droolsRule) {
        droolsRuleService.updateDroolsRule(droolsRule);
        return "修改成功";
    }

    @PostMapping("/deleteRule")
    public String deleteRule(Long ruleId, String ruleName) {
        droolsRuleService.deleteDroolsRule(ruleId, ruleName);
        return "删除成功";
    }

    @GetMapping("/fireRule")
    public String fireRule(String kieBaseName, String param) {
        return droolsManager.fireRule(kieBaseName, param);
    }

    @GetMapping("/test")
    public String test(){
        return "aaaa";
    }
}
