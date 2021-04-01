// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CreateConsumecardBillingcontractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础请求结构
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 购买数字商品服务平台的租户ID
    @NameInMap("platform_tenant_id")
    @Validation(required = true)
    public String platformTenantId;

    // 认证平台ID 本期支付宝用户ID
    @NameInMap("certification_id")
    @Validation(required = true)
    public String certificationId;

    // 企业名称 企业营业执照名称
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 企业简称 默认企业营业执照名称，可自定义
    @NameInMap("company_short_name")
    @Validation(required = true)
    public String companyShortName;

    // 身份信息 金融机构/非金融机构
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    // 统一信用社会代码
    @NameInMap("usci")
    @Validation(required = true)
    public String usci;

    // 客户编号（业务系统） 平台业务系统IP
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 营业执照地址
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    // 说明商家收款原因-字数中文500字以内（例如ETC服务,加油卡服务）
    @NameInMap("service_content")
    @Validation(required = true)
    public String serviceContent;

    public static CreateConsumecardBillingcontractRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumecardBillingcontractRequest self = new CreateConsumecardBillingcontractRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsumecardBillingcontractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateConsumecardBillingcontractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateConsumecardBillingcontractRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public CreateConsumecardBillingcontractRequest setPlatformTenantId(String platformTenantId) {
        this.platformTenantId = platformTenantId;
        return this;
    }
    public String getPlatformTenantId() {
        return this.platformTenantId;
    }

    public CreateConsumecardBillingcontractRequest setCertificationId(String certificationId) {
        this.certificationId = certificationId;
        return this;
    }
    public String getCertificationId() {
        return this.certificationId;
    }

    public CreateConsumecardBillingcontractRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public CreateConsumecardBillingcontractRequest setCompanyShortName(String companyShortName) {
        this.companyShortName = companyShortName;
        return this;
    }
    public String getCompanyShortName() {
        return this.companyShortName;
    }

    public CreateConsumecardBillingcontractRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public CreateConsumecardBillingcontractRequest setUsci(String usci) {
        this.usci = usci;
        return this;
    }
    public String getUsci() {
        return this.usci;
    }

    public CreateConsumecardBillingcontractRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateConsumecardBillingcontractRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreateConsumecardBillingcontractRequest setServiceContent(String serviceContent) {
        this.serviceContent = serviceContent;
        return this;
    }
    public String getServiceContent() {
        return this.serviceContent;
    }

}
