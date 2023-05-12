// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class AppRecoveryVO extends TeaModel {
    // app
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 客户端模式
    @NameInMap("client_version")
    @Validation(required = true)
    public String clientVersion;

    // 数据源数组
    @NameInMap("ds_array")
    @Validation(required = true)
    public java.util.List<ActivityDsVO> dsArray;

    // 唯一id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 是否异步化
    @NameInMap("is_asyn")
    @Validation(required = true)
    public Boolean isAsyn;

    // 数据源配置是否在dds中
    @NameInMap("is_dds")
    @Validation(required = true)
    public Boolean isDds;

    // 压测
    @NameInMap("is_load_test")
    @Validation(required = true)
    public Boolean isLoadTest;

    // 是否混合模式 
    @NameInMap("is_mix")
    @Validation(required = true)
    public Boolean isMix;

    // 单条恢复数
    @NameInMap("recovery_limit")
    @Validation(required = true)
    public Long recoveryLimit;

    // 恢复任务线程数
    @NameInMap("recovery_thread_num")
    @Validation(required = true)
    public Long recoveryThreadNum;

    // 是否被使用
    @NameInMap("used")
    @Validation(required = true)
    public Boolean used;

    public static AppRecoveryVO build(java.util.Map<String, ?> map) throws Exception {
        AppRecoveryVO self = new AppRecoveryVO();
        return TeaModel.build(map, self);
    }

    public AppRecoveryVO setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppRecoveryVO setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public AppRecoveryVO setDsArray(java.util.List<ActivityDsVO> dsArray) {
        this.dsArray = dsArray;
        return this;
    }
    public java.util.List<ActivityDsVO> getDsArray() {
        return this.dsArray;
    }

    public AppRecoveryVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AppRecoveryVO setIsAsyn(Boolean isAsyn) {
        this.isAsyn = isAsyn;
        return this;
    }
    public Boolean getIsAsyn() {
        return this.isAsyn;
    }

    public AppRecoveryVO setIsDds(Boolean isDds) {
        this.isDds = isDds;
        return this;
    }
    public Boolean getIsDds() {
        return this.isDds;
    }

    public AppRecoveryVO setIsLoadTest(Boolean isLoadTest) {
        this.isLoadTest = isLoadTest;
        return this;
    }
    public Boolean getIsLoadTest() {
        return this.isLoadTest;
    }

    public AppRecoveryVO setIsMix(Boolean isMix) {
        this.isMix = isMix;
        return this;
    }
    public Boolean getIsMix() {
        return this.isMix;
    }

    public AppRecoveryVO setRecoveryLimit(Long recoveryLimit) {
        this.recoveryLimit = recoveryLimit;
        return this;
    }
    public Long getRecoveryLimit() {
        return this.recoveryLimit;
    }

    public AppRecoveryVO setRecoveryThreadNum(Long recoveryThreadNum) {
        this.recoveryThreadNum = recoveryThreadNum;
        return this;
    }
    public Long getRecoveryThreadNum() {
        return this.recoveryThreadNum;
    }

    public AppRecoveryVO setUsed(Boolean used) {
        this.used = used;
        return this;
    }
    public Boolean getUsed() {
        return this.used;
    }

}
