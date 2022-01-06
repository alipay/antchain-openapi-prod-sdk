// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddSgAuthrulegroupsbatchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 鉴权规则json串
    @NameInMap("auth_rule_add_model")
    @Validation(required = true)
    public String authRuleAddModel;

    public static AddSgAuthrulegroupsbatchRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSgAuthrulegroupsbatchRequest self = new AddSgAuthrulegroupsbatchRequest();
        return TeaModel.build(map, self);
    }

    public AddSgAuthrulegroupsbatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddSgAuthrulegroupsbatchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddSgAuthrulegroupsbatchRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddSgAuthrulegroupsbatchRequest setAuthRuleAddModel(String authRuleAddModel) {
        this.authRuleAddModel = authRuleAddModel;
        return this;
    }
    public String getAuthRuleAddModel() {
        return this.authRuleAddModel;
    }

}
