// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ffd8f5e932224d668101af0154daa8a6.models;

import com.aliyun.tea.*;

public class ExecAntcloudBxptnewDataproductAsyncRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 数据产品编码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 产品类型
    // 
    @NameInMap("product_type")
    @Validation(required = true)
    public String productType;

    // 请求ID，调用方需要确保唯一
    // 
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 业务入参的json字符串
    // 
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    public static ExecAntcloudBxptnewDataproductAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAntcloudBxptnewDataproductAsyncRequest self = new ExecAntcloudBxptnewDataproductAsyncRequest();
        return TeaModel.build(map, self);
    }

    public ExecAntcloudBxptnewDataproductAsyncRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAntcloudBxptnewDataproductAsyncRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ExecAntcloudBxptnewDataproductAsyncRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ExecAntcloudBxptnewDataproductAsyncRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecAntcloudBxptnewDataproductAsyncRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
