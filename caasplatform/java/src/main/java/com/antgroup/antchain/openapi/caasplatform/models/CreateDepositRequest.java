// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class CreateDepositRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务幂等id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 服务实例id
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

    public static CreateDepositRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDepositRequest self = new CreateDepositRequest();
        return TeaModel.build(map, self);
    }

    public CreateDepositRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDepositRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDepositRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateDepositRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateDepositRequest setBaseInfoJson(String baseInfoJson) {
        this.baseInfoJson = baseInfoJson;
        return this;
    }
    public String getBaseInfoJson() {
        return this.baseInfoJson;
    }

    public CreateDepositRequest setExtensionInfoJson(String extensionInfoJson) {
        this.extensionInfoJson = extensionInfoJson;
        return this;
    }
    public String getExtensionInfoJson() {
        return this.extensionInfoJson;
    }

    public CreateDepositRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public CreateDepositRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public CreateDepositRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
