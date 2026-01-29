// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiclaim.models;

import com.aliyun.tea.*;

public class ExecImageExtractionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // file_id
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

    // 理赔单号
    @NameInMap("claim_number")
    @Validation(required = true)
    public String claimNumber;

    public static ExecImageExtractionRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecImageExtractionRequest self = new ExecImageExtractionRequest();
        return TeaModel.build(map, self);
    }

    public ExecImageExtractionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecImageExtractionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecImageExtractionRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public ExecImageExtractionRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public ExecImageExtractionRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ExecImageExtractionRequest setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
        return this;
    }
    public String getClaimNumber() {
        return this.claimNumber;
    }

}
