// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class EnableOcpProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品实例Id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 产品码 全局唯一
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    public static EnableOcpProductRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableOcpProductRequest self = new EnableOcpProductRequest();
        return TeaModel.build(map, self);
    }

    public EnableOcpProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public EnableOcpProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public EnableOcpProductRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableOcpProductRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
