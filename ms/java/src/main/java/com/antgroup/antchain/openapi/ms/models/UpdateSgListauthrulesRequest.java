// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateSgListauthrulesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 所属黑白名单规则组id
    @NameInMap("auth_group_id")
    @Validation(required = true)
    public Long authGroupId;

    // 更新的规则数据
    // 
    @NameInMap("auth_rule")
    @Validation(required = true)
    public String authRule;

    // 服务接口id
    // 
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 租户实例id
    // 
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 更新的规则id
    // 
    @NameInMap("rule_id")
    @Validation(required = true)
    public Long ruleId;

    public static UpdateSgListauthrulesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSgListauthrulesRequest self = new UpdateSgListauthrulesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSgListauthrulesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSgListauthrulesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSgListauthrulesRequest setAuthGroupId(Long authGroupId) {
        this.authGroupId = authGroupId;
        return this;
    }
    public Long getAuthGroupId() {
        return this.authGroupId;
    }

    public UpdateSgListauthrulesRequest setAuthRule(String authRule) {
        this.authRule = authRule;
        return this;
    }
    public String getAuthRule() {
        return this.authRule;
    }

    public UpdateSgListauthrulesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public UpdateSgListauthrulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSgListauthrulesRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
