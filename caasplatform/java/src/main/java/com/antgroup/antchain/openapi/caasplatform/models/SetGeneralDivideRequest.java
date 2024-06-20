// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class SetGeneralDivideRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合约实例id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 自定义分账规则唯一ID
    @NameInMap("rule_id")
    @Validation(required = true, maxLength = 64)
    public String ruleId;

    // 分账方，分账方不能重复配置
    @NameInMap("rule_item_list")
    @Validation(required = true)
    public java.util.List<RuleItem> ruleItemList;

    public static SetGeneralDivideRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGeneralDivideRequest self = new SetGeneralDivideRequest();
        return TeaModel.build(map, self);
    }

    public SetGeneralDivideRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetGeneralDivideRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetGeneralDivideRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public SetGeneralDivideRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public SetGeneralDivideRequest setRuleItemList(java.util.List<RuleItem> ruleItemList) {
        this.ruleItemList = ruleItemList;
        return this;
    }
    public java.util.List<RuleItem> getRuleItemList() {
        return this.ruleItemList;
    }

}
