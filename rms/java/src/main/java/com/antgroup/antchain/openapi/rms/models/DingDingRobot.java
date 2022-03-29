// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class DingDingRobot extends TeaModel {
    // 钉钉机器人名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 钉钉机器人token
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    // 钉钉机器人ID
    @NameInMap("id")
    public Long id;

    // 是否全局有效
    @NameInMap("scope_global")
    public Boolean scopeGlobal;

    // 订阅类型：0、当前workspace有效； 1、当前租户有效
    @NameInMap("valid_scope")
    public Long validScope;

    // 订阅告警规则数量
    @NameInMap("subscribe_count")
    public Long subscribeCount;

    public static DingDingRobot build(java.util.Map<String, ?> map) throws Exception {
        DingDingRobot self = new DingDingRobot();
        return TeaModel.build(map, self);
    }

    public DingDingRobot setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DingDingRobot setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public DingDingRobot setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DingDingRobot setScopeGlobal(Boolean scopeGlobal) {
        this.scopeGlobal = scopeGlobal;
        return this;
    }
    public Boolean getScopeGlobal() {
        return this.scopeGlobal;
    }

    public DingDingRobot setValidScope(Long validScope) {
        this.validScope = validScope;
        return this;
    }
    public Long getValidScope() {
        return this.validScope;
    }

    public DingDingRobot setSubscribeCount(Long subscribeCount) {
        this.subscribeCount = subscribeCount;
        return this;
    }
    public Long getSubscribeCount() {
        return this.subscribeCount;
    }

}
