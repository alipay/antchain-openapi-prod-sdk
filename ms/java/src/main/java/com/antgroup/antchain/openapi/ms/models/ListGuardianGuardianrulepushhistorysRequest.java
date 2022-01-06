// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListGuardianGuardianrulepushhistorysRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 规则id
    @NameInMap("rule_id")
    @Validation(required = true)
    public Long ruleId;

    public static ListGuardianGuardianrulepushhistorysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGuardianGuardianrulepushhistorysRequest self = new ListGuardianGuardianrulepushhistorysRequest();
        return TeaModel.build(map, self);
    }

    public ListGuardianGuardianrulepushhistorysRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListGuardianGuardianrulepushhistorysRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListGuardianGuardianrulepushhistorysRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListGuardianGuardianrulepushhistorysRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListGuardianGuardianrulepushhistorysRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
