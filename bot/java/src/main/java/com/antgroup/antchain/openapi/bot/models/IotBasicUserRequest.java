// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotBasicUserRequest extends TeaModel {
    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 金融云用户id
    @NameInMap("cloud_user_id")
    public String cloudUserId;

    // 登录名
    @NameInMap("login_name")
    public String loginName;

    public static IotBasicUserRequest build(java.util.Map<String, ?> map) throws Exception {
        IotBasicUserRequest self = new IotBasicUserRequest();
        return TeaModel.build(map, self);
    }

    public IotBasicUserRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public IotBasicUserRequest setCloudUserId(String cloudUserId) {
        this.cloudUserId = cloudUserId;
        return this;
    }
    public String getCloudUserId() {
        return this.cloudUserId;
    }

    public IotBasicUserRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

}
