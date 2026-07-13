// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class CreateAlipayTenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 支付宝账号关联的证件号
    @NameInMap("cert_no")
    public String certNo;

    // 渠道编码 ，新接入时需要申请
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    // 支付宝账号关联的企业名称
    @NameInMap("firm_name")
    public String firmName;

    // 支付宝账号关联的法人姓名
    @NameInMap("real_name")
    public String realName;

    // 业务场景编码，新接入时需要申请
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 支付宝账号会员id（数科租户id）
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static CreateAlipayTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlipayTenantRequest self = new CreateAlipayTenantRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlipayTenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAlipayTenantRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateAlipayTenantRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public CreateAlipayTenantRequest setFirmName(String firmName) {
        this.firmName = firmName;
        return this;
    }
    public String getFirmName() {
        return this.firmName;
    }

    public CreateAlipayTenantRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public CreateAlipayTenantRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public CreateAlipayTenantRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
