// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class RecoveryDTO extends TeaModel {
    // 客户端版本
    // 
    @NameInMap("client_version")
    public String clientVersion;

    // 发起方组编号
    @NameInMap("group_id")
    public String groupId;

    // 主键id，更新时需要
    @NameInMap("id")
    public Long id;

    // 是否异步化
    @NameInMap("is_asyn")
    public Boolean isAsyn;

    // 是否压测任务
    @NameInMap("is_load_test")
    public Boolean isLoadTest;

    // 是否混合模式
    @NameInMap("is_mix")
    public Boolean isMix;

    // 恢复条数/分/表
    @NameInMap("recovery_limit")
    public Long recoveryLimit;

    // 恢复线程数
    @NameInMap("recovery_thread_num")
    public Long recoveryThreadNum;

    public static RecoveryDTO build(java.util.Map<String, ?> map) throws Exception {
        RecoveryDTO self = new RecoveryDTO();
        return TeaModel.build(map, self);
    }

    public RecoveryDTO setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public RecoveryDTO setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RecoveryDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RecoveryDTO setIsAsyn(Boolean isAsyn) {
        this.isAsyn = isAsyn;
        return this;
    }
    public Boolean getIsAsyn() {
        return this.isAsyn;
    }

    public RecoveryDTO setIsLoadTest(Boolean isLoadTest) {
        this.isLoadTest = isLoadTest;
        return this;
    }
    public Boolean getIsLoadTest() {
        return this.isLoadTest;
    }

    public RecoveryDTO setIsMix(Boolean isMix) {
        this.isMix = isMix;
        return this;
    }
    public Boolean getIsMix() {
        return this.isMix;
    }

    public RecoveryDTO setRecoveryLimit(Long recoveryLimit) {
        this.recoveryLimit = recoveryLimit;
        return this;
    }
    public Long getRecoveryLimit() {
        return this.recoveryLimit;
    }

    public RecoveryDTO setRecoveryThreadNum(Long recoveryThreadNum) {
        this.recoveryThreadNum = recoveryThreadNum;
        return this;
    }
    public Long getRecoveryThreadNum() {
        return this.recoveryThreadNum;
    }

}
