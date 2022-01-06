// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class EnableSgAuthrulegroupsbatchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 鉴权规则id集合，多条数据用逗号隔开
    @NameInMap("auth_rule_ids")
    @Validation(required = true)
    public String authRuleIds;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static EnableSgAuthrulegroupsbatchRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSgAuthrulegroupsbatchRequest self = new EnableSgAuthrulegroupsbatchRequest();
        return TeaModel.build(map, self);
    }

    public EnableSgAuthrulegroupsbatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public EnableSgAuthrulegroupsbatchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public EnableSgAuthrulegroupsbatchRequest setAuthRuleIds(String authRuleIds) {
        this.authRuleIds = authRuleIds;
        return this;
    }
    public String getAuthRuleIds() {
        return this.authRuleIds;
    }

    public EnableSgAuthrulegroupsbatchRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
