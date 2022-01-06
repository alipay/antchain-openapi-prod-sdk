// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class OfflineSgServicepublishersRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 下线的机器IP列表,英文逗号隔开
    @NameInMap("ips")
    @Validation(required = true)
    public String ips;

    public static OfflineSgServicepublishersRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineSgServicepublishersRequest self = new OfflineSgServicepublishersRequest();
        return TeaModel.build(map, self);
    }

    public OfflineSgServicepublishersRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OfflineSgServicepublishersRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OfflineSgServicepublishersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OfflineSgServicepublishersRequest setIps(String ips) {
        this.ips = ips;
        return this;
    }
    public String getIps() {
        return this.ips;
    }

}
