// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class UpdatePrivatecontractIntanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 私有化服务地址
    @NameInMap("service_url")
    @Validation(required = true)
    public String serviceUrl;

    // 实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static UpdatePrivatecontractIntanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivatecontractIntanceRequest self = new UpdatePrivatecontractIntanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrivatecontractIntanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdatePrivatecontractIntanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdatePrivatecontractIntanceRequest setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
        return this;
    }
    public String getServiceUrl() {
        return this.serviceUrl;
    }

    public UpdatePrivatecontractIntanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
