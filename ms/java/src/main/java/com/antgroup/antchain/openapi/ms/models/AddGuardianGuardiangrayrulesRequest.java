// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddGuardianGuardiangrayrulesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 监控规则
    @NameInMap("guardian_rule")
    @Validation(required = true)
    public String guardianRule;

    // ip 列表
    @NameInMap("ip_list")
    @Validation(required = true)
    public String ipList;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static AddGuardianGuardiangrayrulesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGuardianGuardiangrayrulesRequest self = new AddGuardianGuardiangrayrulesRequest();
        return TeaModel.build(map, self);
    }

    public AddGuardianGuardiangrayrulesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddGuardianGuardiangrayrulesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddGuardianGuardiangrayrulesRequest setGuardianRule(String guardianRule) {
        this.guardianRule = guardianRule;
        return this;
    }
    public String getGuardianRule() {
        return this.guardianRule;
    }

    public AddGuardianGuardiangrayrulesRequest setIpList(String ipList) {
        this.ipList = ipList;
        return this;
    }
    public String getIpList() {
        return this.ipList;
    }

    public AddGuardianGuardiangrayrulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
