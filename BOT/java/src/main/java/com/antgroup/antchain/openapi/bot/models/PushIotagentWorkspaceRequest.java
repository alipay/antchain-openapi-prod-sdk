// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PushIotagentWorkspaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    @NameInMap("media_type")
    @Validation(required = true)
    public String mediaType;

    @NameInMap("size_bytes")
    @Validation(required = true)
    public Long sizeBytes;

    @NameInMap("sha256")
    public String sha256;

    @NameInMap("client_id")
    public String clientId;

    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    public static PushIotagentWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        PushIotagentWorkspaceRequest self = new PushIotagentWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public PushIotagentWorkspaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushIotagentWorkspaceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushIotagentWorkspaceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public PushIotagentWorkspaceRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public PushIotagentWorkspaceRequest setSizeBytes(Long sizeBytes) {
        this.sizeBytes = sizeBytes;
        return this;
    }
    public Long getSizeBytes() {
        return this.sizeBytes;
    }

    public PushIotagentWorkspaceRequest setSha256(String sha256) {
        this.sha256 = sha256;
        return this;
    }
    public String getSha256() {
        return this.sha256;
    }

    public PushIotagentWorkspaceRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public PushIotagentWorkspaceRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
