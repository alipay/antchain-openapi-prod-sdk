// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateDataauthorizationParticipantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 扩展参数，标准JSON格式
    @NameInMap("extension_info")
    @Validation(maxLength = 2000)
    public String extensionInfo;

    // 用户名称
    @NameInMap("name")
    @Validation(required = true, maxLength = 64)
    public String name;

    // 回调通知服务地址
    @NameInMap("notification_service")
    public String notificationService;

    // 参与方ID
    @NameInMap("participant_id")
    @Validation(required = true, maxLength = 100)
    public String participantId;

    // did doc中的公开信息
    @NameInMap("public_info")
    public String publicInfo;

    // 用户角色列表
    @NameInMap("role")
    @Validation(required = true)
    public java.util.List<String> role;

    // 账户名称
    @NameInMap("account")
    public String account;

    public static UpdateDataauthorizationParticipantRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataauthorizationParticipantRequest self = new UpdateDataauthorizationParticipantRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataauthorizationParticipantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDataauthorizationParticipantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDataauthorizationParticipantRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public UpdateDataauthorizationParticipantRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDataauthorizationParticipantRequest setNotificationService(String notificationService) {
        this.notificationService = notificationService;
        return this;
    }
    public String getNotificationService() {
        return this.notificationService;
    }

    public UpdateDataauthorizationParticipantRequest setParticipantId(String participantId) {
        this.participantId = participantId;
        return this;
    }
    public String getParticipantId() {
        return this.participantId;
    }

    public UpdateDataauthorizationParticipantRequest setPublicInfo(String publicInfo) {
        this.publicInfo = publicInfo;
        return this;
    }
    public String getPublicInfo() {
        return this.publicInfo;
    }

    public UpdateDataauthorizationParticipantRequest setRole(java.util.List<String> role) {
        this.role = role;
        return this;
    }
    public java.util.List<String> getRole() {
        return this.role;
    }

    public UpdateDataauthorizationParticipantRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

}
