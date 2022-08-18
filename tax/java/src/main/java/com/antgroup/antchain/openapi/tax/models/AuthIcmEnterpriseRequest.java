// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class AuthIcmEnterpriseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 身份id，统一社会信用编码or其他
    @NameInMap("identity_id")
    @Validation(required = true)
    public String identityId;

    // 企业名称
    @NameInMap("identity_name")
    public String identityName;

    // 授权类型，不动产100，电力200
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 授权订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 扩展信息	
    @NameInMap("extend_info")
    @Validation(required = true)
    public StandardAuthExtendInfoRequest extendInfo;

    // 法人姓名
    @NameInMap("cognizant_name")
    public String cognizantName;

    // 法人手机号
    @NameInMap("cognizant_mobile")
    public String cognizantMobile;

    // 法人身份证号
    @NameInMap("cognizant_id")
    public String cognizantId;

    public static AuthIcmEnterpriseRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthIcmEnterpriseRequest self = new AuthIcmEnterpriseRequest();
        return TeaModel.build(map, self);
    }

    public AuthIcmEnterpriseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthIcmEnterpriseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthIcmEnterpriseRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public AuthIcmEnterpriseRequest setIdentityName(String identityName) {
        this.identityName = identityName;
        return this;
    }
    public String getIdentityName() {
        return this.identityName;
    }

    public AuthIcmEnterpriseRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public AuthIcmEnterpriseRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public AuthIcmEnterpriseRequest setExtendInfo(StandardAuthExtendInfoRequest extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public StandardAuthExtendInfoRequest getExtendInfo() {
        return this.extendInfo;
    }

    public AuthIcmEnterpriseRequest setCognizantName(String cognizantName) {
        this.cognizantName = cognizantName;
        return this;
    }
    public String getCognizantName() {
        return this.cognizantName;
    }

    public AuthIcmEnterpriseRequest setCognizantMobile(String cognizantMobile) {
        this.cognizantMobile = cognizantMobile;
        return this;
    }
    public String getCognizantMobile() {
        return this.cognizantMobile;
    }

    public AuthIcmEnterpriseRequest setCognizantId(String cognizantId) {
        this.cognizantId = cognizantId;
        return this;
    }
    public String getCognizantId() {
        return this.cognizantId;
    }

}
