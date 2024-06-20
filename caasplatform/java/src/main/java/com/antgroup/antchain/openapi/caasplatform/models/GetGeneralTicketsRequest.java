// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class GetGeneralTicketsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合约实例id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 数据资产id
    @NameInMap("token_id")
    @Validation(required = true)
    public Long tokenId;

    public static GetGeneralTicketsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGeneralTicketsRequest self = new GetGeneralTicketsRequest();
        return TeaModel.build(map, self);
    }

    public GetGeneralTicketsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetGeneralTicketsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetGeneralTicketsRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetGeneralTicketsRequest setTokenId(Long tokenId) {
        this.tokenId = tokenId;
        return this;
    }
    public Long getTokenId() {
        return this.tokenId;
    }

}
