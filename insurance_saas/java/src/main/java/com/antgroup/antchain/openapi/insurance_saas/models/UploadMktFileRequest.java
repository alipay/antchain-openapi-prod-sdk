// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class UploadMktFileRequest extends TeaModel {
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

    // 业务入参json格式字符串
    @NameInMap("biz_content")
    @Validation(maxLength = 1024)
    public String bizContent;

    // 请求id，每一次请求保持唯一，若重复，则报错；
    @NameInMap("request_id")
    @Validation(required = true, maxLength = 128)
    public String requestId;

    // 产品编码，蚂蚁分配
    @NameInMap("product_code")
    @Validation(required = true, maxLength = 64)
    public String productCode;

    // 数据类型，
    // 营销人群底包--MKT_AUD_SRC，
    // 营销目标人群包--MKT_AUD_TAR
    @NameInMap("data_type")
    @Validation(required = true, maxLength = 64)
    public String dataType;

    public static UploadMktFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadMktFileRequest self = new UploadMktFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadMktFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadMktFileRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public UploadMktFileRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public UploadMktFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UploadMktFileRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public UploadMktFileRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadMktFileRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public UploadMktFileRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

}
