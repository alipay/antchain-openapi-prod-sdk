// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_b2fa5792ded1452da5b0670a022d18a0.models;

import com.aliyun.tea.*;

public class CreateAntsecuritytechGatewayBlueshieldSecuritypictureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名
    @NameInMap("app_name")
    public String appName;

    // 客户名
    @NameInMap("client_name")
    @Validation(required = true)
    public String clientName;

    // 操作系统
    @NameInMap("os_type")
    @Validation(required = true)
    public String osType;

    // 包名
    @NameInMap("package_name")
    @Validation(required = true)
    public String packageName;

    // 签名信息
    @NameInMap("cert_sign")
    public String certSign;

    // 签名秘钥内容
    @NameInMap("app_key_data")
    public String appKeyData;

    // 加密秘钥内容
    @NameInMap("security_data")
    public String securityData;

    // 自定义秘钥内容
    @NameInMap("extra_data")
    public String extraData;

    // 白盒秘钥内容
    @NameInMap("white_box_data")
    public String whiteBoxData;

    // raas产品码列表
    @NameInMap("raas_products")
    @Validation(required = true)
    public String raasProducts;

    // 直接透传的二级租户，可选
    @NameInMap("raas_second_tenant")
    public String raasSecondTenant;

    public static CreateAntsecuritytechGatewayBlueshieldSecuritypictureRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntsecuritytechGatewayBlueshieldSecuritypictureRequest self = new CreateAntsecuritytechGatewayBlueshieldSecuritypictureRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntsecuritytechGatewayBlueshieldSecuritypictureRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAntsecuritytechGatewayBlueshieldSecuritypictureRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAntsecuritytechGatewayBlueshieldSecuritypictureRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAntsecuritytechGatewayBlueshieldSecuritypictureRequest setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }
    public String getClientName() {
        return this.clientName;
    }

    public CreateAntsecuritytechGatewayBlueshieldSecuritypictureRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public CreateAntsecuritytechGatewayBlueshieldSecuritypictureRequest setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public CreateAntsecuritytechGatewayBlueshieldSecuritypictureRequest setCertSign(String certSign) {
        this.certSign = certSign;
        return this;
    }
    public String getCertSign() {
        return this.certSign;
    }

    public CreateAntsecuritytechGatewayBlueshieldSecuritypictureRequest setAppKeyData(String appKeyData) {
        this.appKeyData = appKeyData;
        return this;
    }
    public String getAppKeyData() {
        return this.appKeyData;
    }

    public CreateAntsecuritytechGatewayBlueshieldSecuritypictureRequest setSecurityData(String securityData) {
        this.securityData = securityData;
        return this;
    }
    public String getSecurityData() {
        return this.securityData;
    }

    public CreateAntsecuritytechGatewayBlueshieldSecuritypictureRequest setExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }
    public String getExtraData() {
        return this.extraData;
    }

    public CreateAntsecuritytechGatewayBlueshieldSecuritypictureRequest setWhiteBoxData(String whiteBoxData) {
        this.whiteBoxData = whiteBoxData;
        return this;
    }
    public String getWhiteBoxData() {
        return this.whiteBoxData;
    }

    public CreateAntsecuritytechGatewayBlueshieldSecuritypictureRequest setRaasProducts(String raasProducts) {
        this.raasProducts = raasProducts;
        return this;
    }
    public String getRaasProducts() {
        return this.raasProducts;
    }

    public CreateAntsecuritytechGatewayBlueshieldSecuritypictureRequest setRaasSecondTenant(String raasSecondTenant) {
        this.raasSecondTenant = raasSecondTenant;
        return this;
    }
    public String getRaasSecondTenant() {
        return this.raasSecondTenant;
    }

}
