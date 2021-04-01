// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SetIpSkuRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础字段
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // ip的id
    @NameInMap("ip_id")
    @Validation(required = true)
    public String ipId;

    // 渠道名字
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // sku数组
    @NameInMap("skus")
    @Validation(required = true)
    public java.util.List<IpSkuEmphasisInfo> skus;

    public static SetIpSkuRequest build(java.util.Map<String, ?> map) throws Exception {
        SetIpSkuRequest self = new SetIpSkuRequest();
        return TeaModel.build(map, self);
    }

    public SetIpSkuRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetIpSkuRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetIpSkuRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public SetIpSkuRequest setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public SetIpSkuRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public SetIpSkuRequest setSkus(java.util.List<IpSkuEmphasisInfo> skus) {
        this.skus = skus;
        return this;
    }
    public java.util.List<IpSkuEmphasisInfo> getSkus() {
        return this.skus;
    }

}
