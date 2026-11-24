// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class UploadurlBlockchainBotIotagentFilesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件名
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 媒体类型
    @NameInMap("media_type")
    @Validation(required = true)
    public String mediaType;

    // 文件字节数
    @NameInMap("size_bytes")
    @Validation(required = true)
    public String sizeBytes;

    // 内容 SHA-256（十六进制小写）
    @NameInMap("sha256")
    @Validation(required = true)
    public String sha256;

    // 客户端绑定 ID（租户绑定鉴权锚点）
    @NameInMap("client_id")
    @Validation(required = true)
    public String clientId;

    // 会话ID（scene=SESSION_FILE 时必填）
    @NameInMap("session_id")
    public String sessionId;

    // 上传场景：SESSION_FILE（默认，会话附件）/SKILL_PACKAGE（SKILL 上传暂存）
    @NameInMap("scene")
    public String scene;

    public static UploadurlBlockchainBotIotagentFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadurlBlockchainBotIotagentFilesRequest self = new UploadurlBlockchainBotIotagentFilesRequest();
        return TeaModel.build(map, self);
    }

    public UploadurlBlockchainBotIotagentFilesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadurlBlockchainBotIotagentFilesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadurlBlockchainBotIotagentFilesRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadurlBlockchainBotIotagentFilesRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public UploadurlBlockchainBotIotagentFilesRequest setSizeBytes(String sizeBytes) {
        this.sizeBytes = sizeBytes;
        return this;
    }
    public String getSizeBytes() {
        return this.sizeBytes;
    }

    public UploadurlBlockchainBotIotagentFilesRequest setSha256(String sha256) {
        this.sha256 = sha256;
        return this;
    }
    public String getSha256() {
        return this.sha256;
    }

    public UploadurlBlockchainBotIotagentFilesRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public UploadurlBlockchainBotIotagentFilesRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public UploadurlBlockchainBotIotagentFilesRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
