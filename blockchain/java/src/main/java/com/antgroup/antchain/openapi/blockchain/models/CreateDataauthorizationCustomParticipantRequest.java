// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDataauthorizationCustomParticipantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块链ID
    @NameInMap("blockchain_id")
    public String blockchainId;

    // 扩展参数
    @NameInMap("extension_info")
    public String extensionInfo;

    // 参与方名字
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 服务地址
    @NameInMap("notification_service")
    public String notificationService;

    // 参与方ID，全局唯一
    @NameInMap("participant_id")
    @Validation(required = true)
    public String participantId;

    // 公钥
    @NameInMap("public_key")
    @Validation(required = true)
    public String publicKey;

    // 恢复公钥
    @NameInMap("recover_key")
    @Validation(required = true)
    public String recoverKey;

    // 参与方角色列表
    @NameInMap("role")
    @Validation(required = true)
    public java.util.List<String> role;

    // 信用代码，证件号等
    @NameInMap("credit_number")
    public String creditNumber;

    // 空间ID
    @NameInMap("space_id")
    public String spaceId;

    public static CreateDataauthorizationCustomParticipantRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataauthorizationCustomParticipantRequest self = new CreateDataauthorizationCustomParticipantRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataauthorizationCustomParticipantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDataauthorizationCustomParticipantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDataauthorizationCustomParticipantRequest setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }
    public String getBlockchainId() {
        return this.blockchainId;
    }

    public CreateDataauthorizationCustomParticipantRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public CreateDataauthorizationCustomParticipantRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDataauthorizationCustomParticipantRequest setNotificationService(String notificationService) {
        this.notificationService = notificationService;
        return this;
    }
    public String getNotificationService() {
        return this.notificationService;
    }

    public CreateDataauthorizationCustomParticipantRequest setParticipantId(String participantId) {
        this.participantId = participantId;
        return this;
    }
    public String getParticipantId() {
        return this.participantId;
    }

    public CreateDataauthorizationCustomParticipantRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public CreateDataauthorizationCustomParticipantRequest setRecoverKey(String recoverKey) {
        this.recoverKey = recoverKey;
        return this;
    }
    public String getRecoverKey() {
        return this.recoverKey;
    }

    public CreateDataauthorizationCustomParticipantRequest setRole(java.util.List<String> role) {
        this.role = role;
        return this;
    }
    public java.util.List<String> getRole() {
        return this.role;
    }

    public CreateDataauthorizationCustomParticipantRequest setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber;
        return this;
    }
    public String getCreditNumber() {
        return this.creditNumber;
    }

    public CreateDataauthorizationCustomParticipantRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
