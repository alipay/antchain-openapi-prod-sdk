// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class CreateAntsaasStaffingcEpcertificationAuthorizeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要保证唯一，外部订单号
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 企业全称
    @NameInMap("ep_name")
    @Validation(required = true)
    public String epName;

    // 统一社会信用代码或营业执照注册号
    @NameInMap("ep_cert_no")
    @Validation(required = true)
    public String epCertNo;

    // 认证完成后，跳转到指定url地址
    @NameInMap("return_url")
    public String returnUrl;

    public static CreateAntsaasStaffingcEpcertificationAuthorizeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntsaasStaffingcEpcertificationAuthorizeRequest self = new CreateAntsaasStaffingcEpcertificationAuthorizeRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntsaasStaffingcEpcertificationAuthorizeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAntsaasStaffingcEpcertificationAuthorizeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAntsaasStaffingcEpcertificationAuthorizeRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public CreateAntsaasStaffingcEpcertificationAuthorizeRequest setEpName(String epName) {
        this.epName = epName;
        return this;
    }
    public String getEpName() {
        return this.epName;
    }

    public CreateAntsaasStaffingcEpcertificationAuthorizeRequest setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

    public CreateAntsaasStaffingcEpcertificationAuthorizeRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

}
