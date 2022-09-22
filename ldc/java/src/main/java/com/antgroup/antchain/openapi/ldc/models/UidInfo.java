// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UidInfo extends TeaModel {
    // UID
    @NameInMap("uid")
    @Validation(required = true)
    public Long uid;

    // 当前分组
    @NameInMap("current_group")
    @Validation(required = true)
    public String currentGroup;

    // 默认分组
    @NameInMap("default_group")
    @Validation(required = true)
    public String defaultGroup;

    // 是否弹性
    @NameInMap("elastic")
    public Boolean elastic;

    // 是否压测
    @NameInMap("press")
    public Boolean press;

    // 是否灰度
    @NameInMap("gray")
    public Boolean gray;

    // 单元分片容灾状态，枚举，NORMAL（正常）、LOCAL（同城容灾）、REMOTE（异地容灾）
    @NameInMap("disaster_state")
    @Validation(required = true)
    public String disasterState;

    public static UidInfo build(java.util.Map<String, ?> map) throws Exception {
        UidInfo self = new UidInfo();
        return TeaModel.build(map, self);
    }

    public UidInfo setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

    public UidInfo setCurrentGroup(String currentGroup) {
        this.currentGroup = currentGroup;
        return this;
    }
    public String getCurrentGroup() {
        return this.currentGroup;
    }

    public UidInfo setDefaultGroup(String defaultGroup) {
        this.defaultGroup = defaultGroup;
        return this;
    }
    public String getDefaultGroup() {
        return this.defaultGroup;
    }

    public UidInfo setElastic(Boolean elastic) {
        this.elastic = elastic;
        return this;
    }
    public Boolean getElastic() {
        return this.elastic;
    }

    public UidInfo setPress(Boolean press) {
        this.press = press;
        return this;
    }
    public Boolean getPress() {
        return this.press;
    }

    public UidInfo setGray(Boolean gray) {
        this.gray = gray;
        return this;
    }
    public Boolean getGray() {
        return this.gray;
    }

    public UidInfo setDisasterState(String disasterState) {
        this.disasterState = disasterState;
        return this;
    }
    public String getDisasterState() {
        return this.disasterState;
    }

}
