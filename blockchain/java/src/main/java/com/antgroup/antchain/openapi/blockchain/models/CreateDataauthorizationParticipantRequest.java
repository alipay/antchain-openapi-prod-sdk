// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDataauthorizationParticipantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 账户名称
    @NameInMap("account")
    public String account;

    // 业务系统唯一标示
    @NameInMap("biz_uid")
    @Validation(required = true, maxLength = 64)
    public String bizUid;

    // 区块链ID
    @NameInMap("blockchain_id")
    public String blockchainId;

    // 信用编号
    @NameInMap("credit_number")
    public String creditNumber;

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

    // did doc中的公开信息
    @NameInMap("public_info")
    public String publicInfo;

    // 用户角色列表
    @NameInMap("role")
    @Validation(required = true)
    public java.util.List<String> role;

    // 空间ID
    @NameInMap("space_id")
    public String spaceId;

    public static CreateDataauthorizationParticipantRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataauthorizationParticipantRequest self = new CreateDataauthorizationParticipantRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataauthorizationParticipantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDataauthorizationParticipantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDataauthorizationParticipantRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public CreateDataauthorizationParticipantRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public CreateDataauthorizationParticipantRequest setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }
    public String getBlockchainId() {
        return this.blockchainId;
    }

    public CreateDataauthorizationParticipantRequest setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber;
        return this;
    }
    public String getCreditNumber() {
        return this.creditNumber;
    }

    public CreateDataauthorizationParticipantRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public CreateDataauthorizationParticipantRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDataauthorizationParticipantRequest setNotificationService(String notificationService) {
        this.notificationService = notificationService;
        return this;
    }
    public String getNotificationService() {
        return this.notificationService;
    }

    public CreateDataauthorizationParticipantRequest setPublicInfo(String publicInfo) {
        this.publicInfo = publicInfo;
        return this;
    }
    public String getPublicInfo() {
        return this.publicInfo;
    }

    public CreateDataauthorizationParticipantRequest setRole(java.util.List<String> role) {
        this.role = role;
        return this;
    }
    public java.util.List<String> getRole() {
        return this.role;
    }

    public CreateDataauthorizationParticipantRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
