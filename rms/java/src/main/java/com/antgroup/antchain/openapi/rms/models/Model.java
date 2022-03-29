// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class Model extends TeaModel {
    // rules
    @NameInMap("rules")
    @Validation(required = true)
    public java.util.List<Rule> rules;

    // batch_rule_id
    @NameInMap("batch_rule_id")
    @Validation(required = true)
    public String batchRuleId;

    public static Model build(java.util.Map<String, ?> map) throws Exception {
        Model self = new Model();
        return TeaModel.build(map, self);
    }

    public Model setRules(java.util.List<Rule> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<Rule> getRules() {
        return this.rules;
    }

    public Model setBatchRuleId(String batchRuleId) {
        this.batchRuleId = batchRuleId;
        return this;
    }
    public String getBatchRuleId() {
        return this.batchRuleId;
    }

}
