// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class SendCouponAnnotatedRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 优惠券模板ID
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 幂等号
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    public static SendCouponAnnotatedRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCouponAnnotatedRequest self = new SendCouponAnnotatedRequest();
        return TeaModel.build(map, self);
    }

    public SendCouponAnnotatedRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendCouponAnnotatedRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SendCouponAnnotatedRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SendCouponAnnotatedRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

}
