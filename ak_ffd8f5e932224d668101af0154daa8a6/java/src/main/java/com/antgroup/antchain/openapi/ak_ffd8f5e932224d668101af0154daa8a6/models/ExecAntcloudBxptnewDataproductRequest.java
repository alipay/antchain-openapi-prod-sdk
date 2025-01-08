// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ffd8f5e932224d668101af0154daa8a6.models;

import com.aliyun.tea.*;

public class ExecAntcloudBxptnewDataproductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 数据产品编码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 请求ID，调用方需要确保唯一
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 业务入参的json字符串
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    public static ExecAntcloudBxptnewDataproductRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAntcloudBxptnewDataproductRequest self = new ExecAntcloudBxptnewDataproductRequest();
        return TeaModel.build(map, self);
    }

    public ExecAntcloudBxptnewDataproductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAntcloudBxptnewDataproductRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ExecAntcloudBxptnewDataproductRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecAntcloudBxptnewDataproductRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
