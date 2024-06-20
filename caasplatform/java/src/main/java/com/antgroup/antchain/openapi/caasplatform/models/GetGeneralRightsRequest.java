// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class GetGeneralRightsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合约示例id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 数据资产id
    @NameInMap("token_id")
    @Validation(required = true)
    public Long tokenId;

    public static GetGeneralRightsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGeneralRightsRequest self = new GetGeneralRightsRequest();
        return TeaModel.build(map, self);
    }

    public GetGeneralRightsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetGeneralRightsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetGeneralRightsRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetGeneralRightsRequest setTokenId(Long tokenId) {
        this.tokenId = tokenId;
        return this;
    }
    public Long getTokenId() {
        return this.tokenId;
    }

}
