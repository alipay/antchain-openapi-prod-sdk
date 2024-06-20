// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class UpdateGeneralDivideRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合约实例id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 分账规则ID
    @NameInMap("rule_id")
    @Validation(required = true)
    public String ruleId;

    // 分账方用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 确认状态，0: 待确认；1:确认；2：拒绝
    @NameInMap("str_status")
    @Validation(required = true)
    public String strStatus;

    public static UpdateGeneralDivideRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGeneralDivideRequest self = new UpdateGeneralDivideRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGeneralDivideRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateGeneralDivideRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateGeneralDivideRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public UpdateGeneralDivideRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public UpdateGeneralDivideRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateGeneralDivideRequest setStrStatus(String strStatus) {
        this.strStatus = strStatus;
        return this;
    }
    public String getStrStatus() {
        return this.strStatus;
    }

}
