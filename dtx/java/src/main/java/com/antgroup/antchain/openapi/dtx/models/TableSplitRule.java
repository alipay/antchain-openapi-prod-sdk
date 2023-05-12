// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class TableSplitRule extends TeaModel {
    // 分表规则名
    @NameInMap("rule_name")
    @Validation(required = true)
    public String ruleName;

    // 格式模板
    @NameInMap("rule_template")
    @Validation(required = true)
    public String ruleTemplate;

    public static TableSplitRule build(java.util.Map<String, ?> map) throws Exception {
        TableSplitRule self = new TableSplitRule();
        return TeaModel.build(map, self);
    }

    public TableSplitRule setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public TableSplitRule setRuleTemplate(String ruleTemplate) {
        this.ruleTemplate = ruleTemplate;
        return this;
    }
    public String getRuleTemplate() {
        return this.ruleTemplate;
    }

}
