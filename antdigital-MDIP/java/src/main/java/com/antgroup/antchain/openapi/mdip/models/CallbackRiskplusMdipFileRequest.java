// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mdip.models;

import com.aliyun.tea.*;

public class CallbackRiskplusMdipFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

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

    // 数据服务code
    @NameInMap("service_code")
    @Validation(required = true)
    public String serviceCode;

    // 业务调用方
    @NameInMap("caller")
    @Validation(required = true)
    public String caller;

    // 扩展字段
    @NameInMap("extend")
    public String extend;

    public static CallbackRiskplusMdipFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackRiskplusMdipFileRequest self = new CallbackRiskplusMdipFileRequest();
        return TeaModel.build(map, self);
    }

    public CallbackRiskplusMdipFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackRiskplusMdipFileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackRiskplusMdipFileRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public CallbackRiskplusMdipFileRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public CallbackRiskplusMdipFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CallbackRiskplusMdipFileRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public CallbackRiskplusMdipFileRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public CallbackRiskplusMdipFileRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

}
