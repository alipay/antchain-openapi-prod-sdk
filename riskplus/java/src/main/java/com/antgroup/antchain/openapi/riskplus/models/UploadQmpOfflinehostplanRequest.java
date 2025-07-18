// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UploadQmpOfflinehostplanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件上传后的fileId
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

    // MOBILE/MOBILE_MD5/OAID/IDFA/IMEI/CAID选择其中一种
    @NameInMap("file_template")
    @Validation(required = true)
    public String fileTemplate;

    // plancode，托管计划编码
    @NameInMap("plan_code")
    @Validation(required = true)
    public String planCode;

    // properties的header,其他的为ext_info,
    @NameInMap("properties")
    public String properties;

    public static UploadQmpOfflinehostplanRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadQmpOfflinehostplanRequest self = new UploadQmpOfflinehostplanRequest();
        return TeaModel.build(map, self);
    }

    public UploadQmpOfflinehostplanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadQmpOfflinehostplanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadQmpOfflinehostplanRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public UploadQmpOfflinehostplanRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public UploadQmpOfflinehostplanRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UploadQmpOfflinehostplanRequest setFileTemplate(String fileTemplate) {
        this.fileTemplate = fileTemplate;
        return this;
    }
    public String getFileTemplate() {
        return this.fileTemplate;
    }

    public UploadQmpOfflinehostplanRequest setPlanCode(String planCode) {
        this.planCode = planCode;
        return this;
    }
    public String getPlanCode() {
        return this.planCode;
    }

    public UploadQmpOfflinehostplanRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}
