// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.extract.models;

import com.aliyun.tea.*;

public class ExecAntdigitalAiclaimImageExtractionRequest extends TeaModel {
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
    public String fileId;

    public static ExecAntdigitalAiclaimImageExtractionRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAntdigitalAiclaimImageExtractionRequest self = new ExecAntdigitalAiclaimImageExtractionRequest();
        return TeaModel.build(map, self);
    }

    public ExecAntdigitalAiclaimImageExtractionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAntdigitalAiclaimImageExtractionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecAntdigitalAiclaimImageExtractionRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public ExecAntdigitalAiclaimImageExtractionRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public ExecAntdigitalAiclaimImageExtractionRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
