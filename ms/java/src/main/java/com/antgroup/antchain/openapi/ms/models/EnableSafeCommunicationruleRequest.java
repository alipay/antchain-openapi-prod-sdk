// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class EnableSafeCommunicationruleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 状态(1-生效,0-关闭)
    @NameInMap("enabled")
    @Validation(required = true)
    public Long enabled;

    public static EnableSafeCommunicationruleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSafeCommunicationruleRequest self = new EnableSafeCommunicationruleRequest();
        return TeaModel.build(map, self);
    }

    public EnableSafeCommunicationruleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public EnableSafeCommunicationruleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public EnableSafeCommunicationruleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableSafeCommunicationruleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public EnableSafeCommunicationruleRequest setEnabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }
    public Long getEnabled() {
        return this.enabled;
    }

}
