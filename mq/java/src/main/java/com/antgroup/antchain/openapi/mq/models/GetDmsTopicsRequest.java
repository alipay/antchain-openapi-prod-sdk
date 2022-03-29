// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class GetDmsTopicsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // ins
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // group
    @NameInMap("group")
    @Validation(required = true)
    public String group;

    public static GetDmsTopicsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDmsTopicsRequest self = new GetDmsTopicsRequest();
        return TeaModel.build(map, self);
    }

    public GetDmsTopicsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDmsTopicsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDmsTopicsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDmsTopicsRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

}
