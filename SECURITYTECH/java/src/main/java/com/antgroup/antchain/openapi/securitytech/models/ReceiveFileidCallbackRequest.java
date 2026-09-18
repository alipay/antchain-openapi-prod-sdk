// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ReceiveFileidCallbackRequest extends TeaModel {
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

    // 上传场景
    @NameInMap("upload_scene")
    @Validation(required = true)
    public String uploadScene;

    // 渠道方租户
    @NameInMap("channel_tenant")
    @Validation(required = true)
    public String channelTenant;

    // 上传唯一标识
    @NameInMap("upload_id")
    @Validation(required = true)
    public String uploadId;

    public static ReceiveFileidCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        ReceiveFileidCallbackRequest self = new ReceiveFileidCallbackRequest();
        return TeaModel.build(map, self);
    }

    public ReceiveFileidCallbackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReceiveFileidCallbackRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReceiveFileidCallbackRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public ReceiveFileidCallbackRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public ReceiveFileidCallbackRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ReceiveFileidCallbackRequest setUploadScene(String uploadScene) {
        this.uploadScene = uploadScene;
        return this;
    }
    public String getUploadScene() {
        return this.uploadScene;
    }

    public ReceiveFileidCallbackRequest setChannelTenant(String channelTenant) {
        this.channelTenant = channelTenant;
        return this;
    }
    public String getChannelTenant() {
        return this.channelTenant;
    }

    public ReceiveFileidCallbackRequest setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

}
