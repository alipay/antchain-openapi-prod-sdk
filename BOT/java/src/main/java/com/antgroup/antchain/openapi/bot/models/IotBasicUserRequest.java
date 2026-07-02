// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotBasicUserRequest extends TeaModel {
    // 租户ID
    /**
     * <strong>example:</strong>
     * <p>XRE2DAS</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 金融云用户id
    /**
     * <strong>example:</strong>
     * <p>12321321</p>
     */
    @NameInMap("cloud_user_id")
    public String cloudUserId;

    // 登录名
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:test@alibaba-inc.com">test@alibaba-inc.com</a></p>
     */
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
