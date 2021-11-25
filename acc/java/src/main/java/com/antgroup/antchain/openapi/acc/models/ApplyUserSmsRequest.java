// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class ApplyUserSmsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 邮箱 or 短信 二选一
    @NameInMap("telphone")
    public String telphone;

    // 过期时间（单位：秒），默认30分钟
    @NameInMap("expires")
    public Long expires;

    // 重发短信时间（单位：S），默认60s
    @NameInMap("intervals")
    public Long intervals;

    // 是否立刻发发送短信(1 立刻发送 0 等待业务触发)
    @NameInMap("send_direct")
    public Long sendDirect;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 邮箱
    @NameInMap("email")
    public String email;

    public static ApplyUserSmsRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyUserSmsRequest self = new ApplyUserSmsRequest();
        return TeaModel.build(map, self);
    }

    public ApplyUserSmsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyUserSmsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyUserSmsRequest setTelphone(String telphone) {
        this.telphone = telphone;
        return this;
    }
    public String getTelphone() {
        return this.telphone;
    }

    public ApplyUserSmsRequest setExpires(Long expires) {
        this.expires = expires;
        return this;
    }
    public Long getExpires() {
        return this.expires;
    }

    public ApplyUserSmsRequest setIntervals(Long intervals) {
        this.intervals = intervals;
        return this;
    }
    public Long getIntervals() {
        return this.intervals;
    }

    public ApplyUserSmsRequest setSendDirect(Long sendDirect) {
        this.sendDirect = sendDirect;
        return this;
    }
    public Long getSendDirect() {
        return this.sendDirect;
    }

    public ApplyUserSmsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ApplyUserSmsRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

}
