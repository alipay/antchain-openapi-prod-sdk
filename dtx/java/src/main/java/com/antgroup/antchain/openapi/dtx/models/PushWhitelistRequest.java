// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class PushWhitelistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // instance_id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // ref _id
    @NameInMap("ref_id")
    @Validation(required = true)
    public Long refId;

    // 1按照服务器推送 2按照集群推送
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // 如果按照服务器推送 传多个ip的数组，逗号分割。如果是按照集群推送，传zone数组，一个不传就默认全部
    @NameInMap("push_target")
    @Validation(required = true)
    public java.util.List<String> pushTarget;

    public static PushWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        PushWhitelistRequest self = new PushWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public PushWhitelistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushWhitelistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushWhitelistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PushWhitelistRequest setRefId(Long refId) {
        this.refId = refId;
        return this;
    }
    public Long getRefId() {
        return this.refId;
    }

    public PushWhitelistRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public PushWhitelistRequest setPushTarget(java.util.List<String> pushTarget) {
        this.pushTarget = pushTarget;
        return this;
    }
    public java.util.List<String> getPushTarget() {
        return this.pushTarget;
    }

}
