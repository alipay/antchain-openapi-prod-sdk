// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class CreateDepositCertificateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务幂等id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 合约服务实例id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 基础信息json
    @NameInMap("base_info_json")
    public String baseInfoJson;

    // 额外信息json
    @NameInMap("extension_info_json")
    public String extensionInfoJson;

    // 文件id
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

    public static CreateDepositCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDepositCertificateRequest self = new CreateDepositCertificateRequest();
        return TeaModel.build(map, self);
    }

    public CreateDepositCertificateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDepositCertificateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDepositCertificateRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateDepositCertificateRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateDepositCertificateRequest setBaseInfoJson(String baseInfoJson) {
        this.baseInfoJson = baseInfoJson;
        return this;
    }
    public String getBaseInfoJson() {
        return this.baseInfoJson;
    }

    public CreateDepositCertificateRequest setExtensionInfoJson(String extensionInfoJson) {
        this.extensionInfoJson = extensionInfoJson;
        return this;
    }
    public String getExtensionInfoJson() {
        return this.extensionInfoJson;
    }

    public CreateDepositCertificateRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public CreateDepositCertificateRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public CreateDepositCertificateRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
