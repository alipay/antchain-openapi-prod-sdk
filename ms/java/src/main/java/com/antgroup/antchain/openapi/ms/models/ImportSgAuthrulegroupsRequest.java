// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ImportSgAuthrulegroupsRequest extends TeaModel {
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
    @NameInMap("auth_rule_json")
    @Validation(required = true)
    public String authRuleJson;

    public static ImportSgAuthrulegroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportSgAuthrulegroupsRequest self = new ImportSgAuthrulegroupsRequest();
        return TeaModel.build(map, self);
    }

    public ImportSgAuthrulegroupsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportSgAuthrulegroupsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportSgAuthrulegroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ImportSgAuthrulegroupsRequest setAuthRuleJson(String authRuleJson) {
        this.authRuleJson = authRuleJson;
        return this;
    }
    public String getAuthRuleJson() {
        return this.authRuleJson;
    }

}
