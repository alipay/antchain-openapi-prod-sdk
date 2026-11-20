// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class PushRightsprodGrantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户类型
    // 支付宝UID： alipay_uid
    // 手机号：phone_number
    // 微信OpenID： wechat_openId
    // 平台UID： platform_uid
    @NameInMap("user_type")
    @Validation(required = true)
    public String userType;

    // 用户身份标识
    @NameInMap("user_identifier")
    @Validation(required = true)
    public String userIdentifier;

    // 应用ID
    @NameInMap("app_id")
    public String appId;

    // 权益编码
    @NameInMap("rights_code")
    @Validation(required = true)
    public String rightsCode;

    // 发放数量
    @NameInMap("grant_num")
    @Validation(required = true)
    public Long grantNum;

    // 外部发放订单号
    @NameInMap("out_grant_order_no")
    @Validation(required = true)
    public String outGrantOrderNo;

    // 发放信息,如活动ID等信息
    @NameInMap("grant_info")
    public String grantInfo;

    // 技术租户ID、当开通权益中心产品在非数科的应用租户下时需要填写对应的技术租户ID（涉及到时技术对接时 技术会分配，如未分配则不需要传参数）
    @NameInMap("tech_tenant_id")
    public String techTenantId;

    public static PushRightsprodGrantRequest build(java.util.Map<String, ?> map) throws Exception {
        PushRightsprodGrantRequest self = new PushRightsprodGrantRequest();
        return TeaModel.build(map, self);
    }

    public PushRightsprodGrantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushRightsprodGrantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushRightsprodGrantRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public PushRightsprodGrantRequest setUserIdentifier(String userIdentifier) {
        this.userIdentifier = userIdentifier;
        return this;
    }
    public String getUserIdentifier() {
        return this.userIdentifier;
    }

    public PushRightsprodGrantRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PushRightsprodGrantRequest setRightsCode(String rightsCode) {
        this.rightsCode = rightsCode;
        return this;
    }
    public String getRightsCode() {
        return this.rightsCode;
    }

    public PushRightsprodGrantRequest setGrantNum(Long grantNum) {
        this.grantNum = grantNum;
        return this;
    }
    public Long getGrantNum() {
        return this.grantNum;
    }

    public PushRightsprodGrantRequest setOutGrantOrderNo(String outGrantOrderNo) {
        this.outGrantOrderNo = outGrantOrderNo;
        return this;
    }
    public String getOutGrantOrderNo() {
        return this.outGrantOrderNo;
    }

    public PushRightsprodGrantRequest setGrantInfo(String grantInfo) {
        this.grantInfo = grantInfo;
        return this;
    }
    public String getGrantInfo() {
        return this.grantInfo;
    }

    public PushRightsprodGrantRequest setTechTenantId(String techTenantId) {
        this.techTenantId = techTenantId;
        return this;
    }
    public String getTechTenantId() {
        return this.techTenantId;
    }

}
