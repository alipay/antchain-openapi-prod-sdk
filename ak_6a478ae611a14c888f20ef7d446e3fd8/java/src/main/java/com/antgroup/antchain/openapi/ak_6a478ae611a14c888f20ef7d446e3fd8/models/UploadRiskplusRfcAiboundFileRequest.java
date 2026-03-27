// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_6a478ae611a14c888f20ef7d446e3fd8.models;

import com.aliyun.tea.*;

public class UploadRiskplusRfcAiboundFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件ID
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

    // 参数，jsonString
    @NameInMap("params")
    @Validation(required = true)
    public String params;

    // 外呼为 AI_BOUND 
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static UploadRiskplusRfcAiboundFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadRiskplusRfcAiboundFileRequest self = new UploadRiskplusRfcAiboundFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadRiskplusRfcAiboundFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadRiskplusRfcAiboundFileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadRiskplusRfcAiboundFileRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public UploadRiskplusRfcAiboundFileRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public UploadRiskplusRfcAiboundFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UploadRiskplusRfcAiboundFileRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public UploadRiskplusRfcAiboundFileRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
