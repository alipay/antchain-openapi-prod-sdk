// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class ApplyMktserviceproviderAudiencecircleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求id，每一次请求保持唯一；
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 项目ID，待蚂蚁分配
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 业务场景标识
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 加密类型，MD5 32位小写
    @NameInMap("encryption_type")
    @Validation(required = true)
    public String encryptionType;

    // 加密用户标识
    @NameInMap("encrypted_user_ids")
    @Validation(required = true)
    public java.util.List<String> encryptedUserIds;

    public static ApplyMktserviceproviderAudiencecircleRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyMktserviceproviderAudiencecircleRequest self = new ApplyMktserviceproviderAudiencecircleRequest();
        return TeaModel.build(map, self);
    }

    public ApplyMktserviceproviderAudiencecircleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyMktserviceproviderAudiencecircleRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyMktserviceproviderAudiencecircleRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ApplyMktserviceproviderAudiencecircleRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public ApplyMktserviceproviderAudiencecircleRequest setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    public String getEncryptionType() {
        return this.encryptionType;
    }

    public ApplyMktserviceproviderAudiencecircleRequest setEncryptedUserIds(java.util.List<String> encryptedUserIds) {
        this.encryptedUserIds = encryptedUserIds;
        return this;
    }
    public java.util.List<String> getEncryptedUserIds() {
        return this.encryptedUserIds;
    }

}
