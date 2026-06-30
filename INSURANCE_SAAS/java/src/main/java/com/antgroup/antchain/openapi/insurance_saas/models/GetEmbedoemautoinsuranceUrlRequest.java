// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class GetEmbedoemautoinsuranceUrlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 调用方生成的唯一编码，参考格式： yyyyMMdd_xxxxx，已接口请求的当前日期开头；
    @NameInMap("request_no")
    @Validation(required = true, maxLength = 128)
    public String requestNo;

    // 产品编码
    @NameInMap("product_code")
    @Validation(required = true, maxLength = 64)
    public String productCode;

    // 业务参数，json格式
    @NameInMap("biz_info")
    @Validation(required = true, maxLength = 1000)
    public String bizInfo;

    public static GetEmbedoemautoinsuranceUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEmbedoemautoinsuranceUrlRequest self = new GetEmbedoemautoinsuranceUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetEmbedoemautoinsuranceUrlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetEmbedoemautoinsuranceUrlRequest setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }
    public String getRequestNo() {
        return this.requestNo;
    }

    public GetEmbedoemautoinsuranceUrlRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetEmbedoemautoinsuranceUrlRequest setBizInfo(String bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public String getBizInfo() {
        return this.bizInfo;
    }

}
