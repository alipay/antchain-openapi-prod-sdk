// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateCreditCommonsignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 账户号，account_type=ACCOUNT_BANK_NO时填写外部银行卡号， account_type=ACCOUNT_CLOUD_FUND时填写云资金商户ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 账户类型，ACCOUNT_BANK_NO:外部银行卡，ACCOUNT_CLOUD_FUND:云资金商户ID
    @NameInMap("account_type")
    @Validation(required = true)
    public String accountType;

    // 开户行联行号，当帐户类型为ACCOUNT_BANK_NO时必填
    @NameInMap("bank_cnaps")
    public String bankCnaps;

    // 开户行名称，当帐户类型为ACCOUNT_BANK_NO时必填
    @NameInMap("bank_name")
    public String bankName;

    // 签约结果回调地址
    @NameInMap("callback_url")
    @Validation(required = true)
    public String callbackUrl;

    // 驾驶证号码，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
    @NameInMap("driving_license")
    public String drivingLicense;

    // 驾驶证影像件ID，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
    @NameInMap("driving_license_file_id")
    public String drivingLicenseFileId;

    // 集团平台did
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 法定代表人名称，签约方sign_did类型为企业时必填
    @NameInMap("legal_name")
    public String legalName;

    // 产品id
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 签约方did
    @NameInMap("sign_did")
    @Validation(required = true)
    public String signDid;

    // 行驶证号码，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
    @NameInMap("vehicle_license")
    public String vehicleLicense;

    // 行驶证影像件ID，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
    @NameInMap("vehicle_license_file_id")
    public String vehicleLicenseFileId;

    public static CreateCreditCommonsignRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCreditCommonsignRequest self = new CreateCreditCommonsignRequest();
        return TeaModel.build(map, self);
    }

    public CreateCreditCommonsignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCreditCommonsignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateCreditCommonsignRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreateCreditCommonsignRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public CreateCreditCommonsignRequest setBankCnaps(String bankCnaps) {
        this.bankCnaps = bankCnaps;
        return this;
    }
    public String getBankCnaps() {
        return this.bankCnaps;
    }

    public CreateCreditCommonsignRequest setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public CreateCreditCommonsignRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CreateCreditCommonsignRequest setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
        return this;
    }
    public String getDrivingLicense() {
        return this.drivingLicense;
    }

    public CreateCreditCommonsignRequest setDrivingLicenseFileId(String drivingLicenseFileId) {
        this.drivingLicenseFileId = drivingLicenseFileId;
        return this;
    }
    public String getDrivingLicenseFileId() {
        return this.drivingLicenseFileId;
    }

    public CreateCreditCommonsignRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public CreateCreditCommonsignRequest setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }
    public String getLegalName() {
        return this.legalName;
    }

    public CreateCreditCommonsignRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public CreateCreditCommonsignRequest setSignDid(String signDid) {
        this.signDid = signDid;
        return this;
    }
    public String getSignDid() {
        return this.signDid;
    }

    public CreateCreditCommonsignRequest setVehicleLicense(String vehicleLicense) {
        this.vehicleLicense = vehicleLicense;
        return this;
    }
    public String getVehicleLicense() {
        return this.vehicleLicense;
    }

    public CreateCreditCommonsignRequest setVehicleLicenseFileId(String vehicleLicenseFileId) {
        this.vehicleLicenseFileId = vehicleLicenseFileId;
        return this;
    }
    public String getVehicleLicenseFileId() {
        return this.vehicleLicenseFileId;
    }

}
