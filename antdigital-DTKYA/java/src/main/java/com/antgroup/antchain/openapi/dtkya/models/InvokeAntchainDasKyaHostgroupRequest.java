// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class InvokeAntchainDasKyaHostgroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 逻辑业务HTTP方法仅允许GET或POST
    @NameInMap("logical_method")
    @Validation(required = true)
    public String logicalMethod;

    // 保留签名原文的编码后群组业务路径
    @NameInMap("logical_path")
    @Validation(required = true)
    public String logicalPath;

    // 原始规范查询字符串无查询时传空字符串
    @NameInMap("logical_query")
    public String logicalQuery;

    // 七个Agent DID签名头的JSON字符串
    @NameInMap("logical_headers")
    @Validation(required = true)
    public String logicalHeaders;

    // 原始JSON元数据的Base64编码GET时传空字符串不含聊天正文
    @NameInMap("logical_body_base64")
    public String logicalBodyBase64;

    public static InvokeAntchainDasKyaHostgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeAntchainDasKyaHostgroupRequest self = new InvokeAntchainDasKyaHostgroupRequest();
        return TeaModel.build(map, self);
    }

    public InvokeAntchainDasKyaHostgroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InvokeAntchainDasKyaHostgroupRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InvokeAntchainDasKyaHostgroupRequest setLogicalMethod(String logicalMethod) {
        this.logicalMethod = logicalMethod;
        return this;
    }
    public String getLogicalMethod() {
        return this.logicalMethod;
    }

    public InvokeAntchainDasKyaHostgroupRequest setLogicalPath(String logicalPath) {
        this.logicalPath = logicalPath;
        return this;
    }
    public String getLogicalPath() {
        return this.logicalPath;
    }

    public InvokeAntchainDasKyaHostgroupRequest setLogicalQuery(String logicalQuery) {
        this.logicalQuery = logicalQuery;
        return this;
    }
    public String getLogicalQuery() {
        return this.logicalQuery;
    }

    public InvokeAntchainDasKyaHostgroupRequest setLogicalHeaders(String logicalHeaders) {
        this.logicalHeaders = logicalHeaders;
        return this;
    }
    public String getLogicalHeaders() {
        return this.logicalHeaders;
    }

    public InvokeAntchainDasKyaHostgroupRequest setLogicalBodyBase64(String logicalBodyBase64) {
        this.logicalBodyBase64 = logicalBodyBase64;
        return this;
    }
    public String getLogicalBodyBase64() {
        return this.logicalBodyBase64;
    }

}
