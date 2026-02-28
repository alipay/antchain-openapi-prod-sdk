// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class ReceiveBusinessOpportunitiesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 全局唯一
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 产品编码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 业务参数，json格式
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    public static ReceiveBusinessOpportunitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ReceiveBusinessOpportunitiesRequest self = new ReceiveBusinessOpportunitiesRequest();
        return TeaModel.build(map, self);
    }

    public ReceiveBusinessOpportunitiesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReceiveBusinessOpportunitiesRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReceiveBusinessOpportunitiesRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ReceiveBusinessOpportunitiesRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
