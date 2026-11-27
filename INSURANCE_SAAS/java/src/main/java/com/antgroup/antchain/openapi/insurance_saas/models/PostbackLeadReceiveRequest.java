// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class PostbackLeadReceiveRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // string
    /**
     * <p>待上传文件</p>
     */
    @NameInMap("fileObject")
    public java.io.InputStream fileObject;

    /**
     * <p>待上传文件名</p>
     */
    @NameInMap("fileObjectName")
    public String fileObjectName;

    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 请求id，每一次请求保持唯一，若重复，则报错；
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 业务参数json，updateCycle等字段
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    // 本次固定传LMKT_LEADS_TRANSFER
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    public static PostbackLeadReceiveRequest build(java.util.Map<String, ?> map) throws Exception {
        PostbackLeadReceiveRequest self = new PostbackLeadReceiveRequest();
        return TeaModel.build(map, self);
    }

    public PostbackLeadReceiveRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PostbackLeadReceiveRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public PostbackLeadReceiveRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public PostbackLeadReceiveRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public PostbackLeadReceiveRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PostbackLeadReceiveRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public PostbackLeadReceiveRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
