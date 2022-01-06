// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateGuardianGuardiangrayrulestatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // ip 列表
    @NameInMap("ip_list")
    @Validation(required = true)
    public String ipList;

    // 规则id
    @NameInMap("rule_id")
    @Validation(required = true)
    public Long ruleId;

    public static UpdateGuardianGuardiangrayrulestatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGuardianGuardiangrayrulestatusRequest self = new UpdateGuardianGuardiangrayrulestatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGuardianGuardiangrayrulestatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateGuardianGuardiangrayrulestatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateGuardianGuardiangrayrulestatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateGuardianGuardiangrayrulestatusRequest setIpList(String ipList) {
        this.ipList = ipList;
        return this;
    }
    public String getIpList() {
        return this.ipList;
    }

    public UpdateGuardianGuardiangrayrulestatusRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
