// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class EnableSgAuthrulesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 所属的鉴权规则黑、白名单id
    @NameInMap("auth_group_id")
    @Validation(required = true)
    public Long authGroupId;

    // 服务接口id
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 启用的规则id
    @NameInMap("rule_id")
    @Validation(required = true)
    public Long ruleId;

    public static EnableSgAuthrulesRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSgAuthrulesRequest self = new EnableSgAuthrulesRequest();
        return TeaModel.build(map, self);
    }

    public EnableSgAuthrulesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public EnableSgAuthrulesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public EnableSgAuthrulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableSgAuthrulesRequest setAuthGroupId(Long authGroupId) {
        this.authGroupId = authGroupId;
        return this;
    }
    public Long getAuthGroupId() {
        return this.authGroupId;
    }

    public EnableSgAuthrulesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public EnableSgAuthrulesRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
