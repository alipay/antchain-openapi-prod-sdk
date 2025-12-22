// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bxpt_new.models;

import com.aliyun.tea.*;

public class ExecSyncmultimodalDataprodRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 文件唯一id
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

    // 业务入参的json字符串
    @NameInMap("biz_content")
    public String bizContent;

    // 数据产品编码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 请求唯一标识
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    public static ExecSyncmultimodalDataprodRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecSyncmultimodalDataprodRequest self = new ExecSyncmultimodalDataprodRequest();
        return TeaModel.build(map, self);
    }

    public ExecSyncmultimodalDataprodRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecSyncmultimodalDataprodRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public ExecSyncmultimodalDataprodRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public ExecSyncmultimodalDataprodRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ExecSyncmultimodalDataprodRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public ExecSyncmultimodalDataprodRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ExecSyncmultimodalDataprodRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
