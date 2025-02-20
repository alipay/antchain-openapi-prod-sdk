// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bxpt_new.models;

import com.aliyun.tea.*;

public class ExecDataproductAsyncRequest extends TeaModel {
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

    public static ExecDataproductAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDataproductAsyncRequest self = new ExecDataproductAsyncRequest();
        return TeaModel.build(map, self);
    }

    public ExecDataproductAsyncRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecDataproductAsyncRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ExecDataproductAsyncRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ExecDataproductAsyncRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecDataproductAsyncRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
