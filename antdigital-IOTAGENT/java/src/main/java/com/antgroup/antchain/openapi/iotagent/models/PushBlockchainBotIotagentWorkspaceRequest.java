// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class PushBlockchainBotIotagentWorkspaceRequest extends TeaModel {
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

    public static PushBlockchainBotIotagentWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        PushBlockchainBotIotagentWorkspaceRequest self = new PushBlockchainBotIotagentWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public PushBlockchainBotIotagentWorkspaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushBlockchainBotIotagentWorkspaceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushBlockchainBotIotagentWorkspaceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public PushBlockchainBotIotagentWorkspaceRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public PushBlockchainBotIotagentWorkspaceRequest setSizeBytes(Long sizeBytes) {
        this.sizeBytes = sizeBytes;
        return this;
    }
    public Long getSizeBytes() {
        return this.sizeBytes;
    }

    public PushBlockchainBotIotagentWorkspaceRequest setSha256(String sha256) {
        this.sha256 = sha256;
        return this;
    }
    public String getSha256() {
        return this.sha256;
    }

    public PushBlockchainBotIotagentWorkspaceRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public PushBlockchainBotIotagentWorkspaceRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
