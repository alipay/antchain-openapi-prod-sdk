// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class SendMarketingCouponRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 外部业务流水号，用于幂等判断
    // 
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    // 租户ID
    // 
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 优惠券模板ID，营销后台申请获取
    // 
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    public static SendMarketingCouponRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMarketingCouponRequest self = new SendMarketingCouponRequest();
        return TeaModel.build(map, self);
    }

    public SendMarketingCouponRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendMarketingCouponRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public SendMarketingCouponRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SendMarketingCouponRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
