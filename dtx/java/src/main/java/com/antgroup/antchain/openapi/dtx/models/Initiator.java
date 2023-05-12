// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class Initiator extends TeaModel {
    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 客户端版本
    @NameInMap("client_version")
    @Validation(required = true)
    public String clientVersion;

    // 记录id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 环境唯一标识
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 是否异步化
    @NameInMap("is_asyn")
    @Validation(required = true)
    public Boolean isAsyn;

    // 是否压测任务
    @NameInMap("is_load_test")
    @Validation(required = true)
    public Boolean isLoadTest;

    // 是否混合模式
    @NameInMap("is_mix")
    @Validation(required = true)
    public Boolean isMix;

    // 发起方数据源
    @NameInMap("recovery_datasources")
    @Validation(required = true)
    public java.util.List<InitiatorDatasource> recoveryDatasources;

    // 恢复条数/分/表
    @NameInMap("recovery_limit")
    public Long recoveryLimit;

    // 恢复线程数
    @NameInMap("recovery_thread_num")
    public Long recoveryThreadNum;

    public static Initiator build(java.util.Map<String, ?> map) throws Exception {
        Initiator self = new Initiator();
        return TeaModel.build(map, self);
    }

    public Initiator setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public Initiator setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public Initiator setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Initiator setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public Initiator setIsAsyn(Boolean isAsyn) {
        this.isAsyn = isAsyn;
        return this;
    }
    public Boolean getIsAsyn() {
        return this.isAsyn;
    }

    public Initiator setIsLoadTest(Boolean isLoadTest) {
        this.isLoadTest = isLoadTest;
        return this;
    }
    public Boolean getIsLoadTest() {
        return this.isLoadTest;
    }

    public Initiator setIsMix(Boolean isMix) {
        this.isMix = isMix;
        return this;
    }
    public Boolean getIsMix() {
        return this.isMix;
    }

    public Initiator setRecoveryDatasources(java.util.List<InitiatorDatasource> recoveryDatasources) {
        this.recoveryDatasources = recoveryDatasources;
        return this;
    }
    public java.util.List<InitiatorDatasource> getRecoveryDatasources() {
        return this.recoveryDatasources;
    }

    public Initiator setRecoveryLimit(Long recoveryLimit) {
        this.recoveryLimit = recoveryLimit;
        return this;
    }
    public Long getRecoveryLimit() {
        return this.recoveryLimit;
    }

    public Initiator setRecoveryThreadNum(Long recoveryThreadNum) {
        this.recoveryThreadNum = recoveryThreadNum;
        return this;
    }
    public Long getRecoveryThreadNum() {
        return this.recoveryThreadNum;
    }

}
