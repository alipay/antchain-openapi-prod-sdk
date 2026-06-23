// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class SendAntcloudMarketingPartnerCouponRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 优惠券模版id
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 支付宝登录名称
    @NameInMap("alipay_login_name")
    @Validation(required = true)
    public String alipayLoginName;

    // 业务唯一幂等标识，可以是订单号
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    // 备注
    @NameInMap("remark")
    public String remark;

    public static SendAntcloudMarketingPartnerCouponRequest build(java.util.Map<String, ?> map) throws Exception {
        SendAntcloudMarketingPartnerCouponRequest self = new SendAntcloudMarketingPartnerCouponRequest();
        return TeaModel.build(map, self);
    }

    public SendAntcloudMarketingPartnerCouponRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendAntcloudMarketingPartnerCouponRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SendAntcloudMarketingPartnerCouponRequest setAlipayLoginName(String alipayLoginName) {
        this.alipayLoginName = alipayLoginName;
        return this;
    }
    public String getAlipayLoginName() {
        return this.alipayLoginName;
    }

    public SendAntcloudMarketingPartnerCouponRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public SendAntcloudMarketingPartnerCouponRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
