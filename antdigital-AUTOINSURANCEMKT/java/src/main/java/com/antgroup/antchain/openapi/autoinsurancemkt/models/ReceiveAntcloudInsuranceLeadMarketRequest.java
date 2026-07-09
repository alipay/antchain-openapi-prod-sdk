// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.autoinsurancemkt.models;

import com.aliyun.tea.*;

public class ReceiveAntcloudInsuranceLeadMarketRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求流水号，全局唯一
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 本次固定传LMKT_LEADS_TRANSFER
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 业务参数，json
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    public static ReceiveAntcloudInsuranceLeadMarketRequest build(java.util.Map<String, ?> map) throws Exception {
        ReceiveAntcloudInsuranceLeadMarketRequest self = new ReceiveAntcloudInsuranceLeadMarketRequest();
        return TeaModel.build(map, self);
    }

    public ReceiveAntcloudInsuranceLeadMarketRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReceiveAntcloudInsuranceLeadMarketRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReceiveAntcloudInsuranceLeadMarketRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ReceiveAntcloudInsuranceLeadMarketRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
