// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class Participant extends TeaModel {
    // 业务系统唯一标示
    @NameInMap("biz_uid")
    @Validation(maxLength = 64)
    public String bizUid;

    // 区块链ID
    @NameInMap("blockchain_id")
    public String blockchainId;

    // 创建时间
    @NameInMap("create_time")
    @Validation(required = true)
    public Long createTime;

    // 信用代码
    @NameInMap("credit_number")
    public String creditNumber;

    // 扩展信息，标准JSON格式
    @NameInMap("extension_info")
    public String extensionInfo;

    // 参与方名字
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

    // DID  doc中的公开信息
    @NameInMap("public_info")
    public String publicInfo;

    // 参与方角色列表
    @NameInMap("role")
    @Validation(required = true)
    public java.util.List<String> role;

    // 空间ID
    @NameInMap("space_id")
    public String spaceId;

    // 参与方状态
    @NameInMap("status")
    public String status;

    // 更新时间
    @NameInMap("update_time")
    @Validation(required = true)
    public Long updateTime;

    // 账户名称
    @NameInMap("account")
    public String account;

    public static Participant build(java.util.Map<String, ?> map) throws Exception {
        Participant self = new Participant();
        return TeaModel.build(map, self);
    }

    public Participant setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public Participant setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }
    public String getBlockchainId() {
        return this.blockchainId;
    }

    public Participant setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public Participant setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber;
        return this;
    }
    public String getCreditNumber() {
        return this.creditNumber;
    }

    public Participant setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public Participant setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Participant setNotificationService(String notificationService) {
        this.notificationService = notificationService;
        return this;
    }
    public String getNotificationService() {
        return this.notificationService;
    }

    public Participant setParticipantId(String participantId) {
        this.participantId = participantId;
        return this;
    }
    public String getParticipantId() {
        return this.participantId;
    }

    public Participant setPublicInfo(String publicInfo) {
        this.publicInfo = publicInfo;
        return this;
    }
    public String getPublicInfo() {
        return this.publicInfo;
    }

    public Participant setRole(java.util.List<String> role) {
        this.role = role;
        return this;
    }
    public java.util.List<String> getRole() {
        return this.role;
    }

    public Participant setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public Participant setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Participant setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public Participant setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

}
