// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SetIpValueaddskuRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础字段
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 服务id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // sku
    @NameInMap("skus")
    @Validation(required = true)
    public java.util.List<IpSkuEmphasisInfo> skus;

    public static SetIpValueaddskuRequest build(java.util.Map<String, ?> map) throws Exception {
        SetIpValueaddskuRequest self = new SetIpValueaddskuRequest();
        return TeaModel.build(map, self);
    }

    public SetIpValueaddskuRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetIpValueaddskuRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetIpValueaddskuRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public SetIpValueaddskuRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public SetIpValueaddskuRequest setSkus(java.util.List<IpSkuEmphasisInfo> skus) {
        this.skus = skus;
        return this;
    }
    public java.util.List<IpSkuEmphasisInfo> getSkus() {
        return this.skus;
    }

}
