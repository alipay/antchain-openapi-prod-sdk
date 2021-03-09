// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class CheckAlipayTenantRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 支付宝账号关联的证件号
    @NameInMap("cert_no")
    public String certNo;

    // 渠道编码 ，新接入时需要申请
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    // 企业名称
    @NameInMap("firm_name")
    public String firmName;

    // 法人姓名
    @NameInMap("real_name")
    public String realName;

    // 业务场景编码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 智科租户id(支付宝账号会员id）
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static CheckAlipayTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAlipayTenantRequest self = new CheckAlipayTenantRequest();
        return TeaModel.build(map, self);
    }

    public CheckAlipayTenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckAlipayTenantRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CheckAlipayTenantRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public CheckAlipayTenantRequest setFirmName(String firmName) {
        this.firmName = firmName;
        return this;
    }
    public String getFirmName() {
        return this.firmName;
    }

    public CheckAlipayTenantRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public CheckAlipayTenantRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public CheckAlipayTenantRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
