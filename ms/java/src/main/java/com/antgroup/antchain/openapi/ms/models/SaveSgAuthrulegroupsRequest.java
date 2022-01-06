// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class SaveSgAuthrulegroupsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // {"type":"WHITELIST","enabled":0,"instanceId":"000001","dataId":"com.alipay.antcloud.drmdata.facade.PushFacade:1.0@DEFAULT","rules":[{"ruleItems":[{"type":"SYSTEM","operation":"EQUAL","field":"source.application.id","value":"app1"}],"enabled":0,"name":"rule1"}]}
    @NameInMap("auth_rule_group")
    @Validation(required = true)
    public String authRuleGroup;

    // 服务鉴权接口id
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 租户instanceId
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static SaveSgAuthrulegroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSgAuthrulegroupsRequest self = new SaveSgAuthrulegroupsRequest();
        return TeaModel.build(map, self);
    }

    public SaveSgAuthrulegroupsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveSgAuthrulegroupsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveSgAuthrulegroupsRequest setAuthRuleGroup(String authRuleGroup) {
        this.authRuleGroup = authRuleGroup;
        return this;
    }
    public String getAuthRuleGroup() {
        return this.authRuleGroup;
    }

    public SaveSgAuthrulegroupsRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public SaveSgAuthrulegroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
