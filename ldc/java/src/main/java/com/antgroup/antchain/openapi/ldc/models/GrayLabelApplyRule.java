// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GrayLabelApplyRule extends TeaModel {
    // 多个指定条件的计算方式，目前支持AND和OR
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 入口流量的多个规则，将根据operator进行与、或运算
    @NameInMap("downstream_rules")
    @Validation(required = true)
    public java.util.List<GrayLabelDownstreamRule> downstreamRules;

    public static GrayLabelApplyRule build(java.util.Map<String, ?> map) throws Exception {
        GrayLabelApplyRule self = new GrayLabelApplyRule();
        return TeaModel.build(map, self);
    }

    public GrayLabelApplyRule setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public GrayLabelApplyRule setDownstreamRules(java.util.List<GrayLabelDownstreamRule> downstreamRules) {
        this.downstreamRules = downstreamRules;
        return this;
    }
    public java.util.List<GrayLabelDownstreamRule> getDownstreamRules() {
        return this.downstreamRules;
    }

}
