// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class CreateBssecpicRequest extends TeaModel {
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

    public static CreateBssecpicRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBssecpicRequest self = new CreateBssecpicRequest();
        return TeaModel.build(map, self);
    }

    public CreateBssecpicRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBssecpicRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBssecpicRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateBssecpicRequest setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }
    public String getClientName() {
        return this.clientName;
    }

    public CreateBssecpicRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public CreateBssecpicRequest setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public CreateBssecpicRequest setCertSign(String certSign) {
        this.certSign = certSign;
        return this;
    }
    public String getCertSign() {
        return this.certSign;
    }

    public CreateBssecpicRequest setAppKeyData(String appKeyData) {
        this.appKeyData = appKeyData;
        return this;
    }
    public String getAppKeyData() {
        return this.appKeyData;
    }

    public CreateBssecpicRequest setSecurityData(String securityData) {
        this.securityData = securityData;
        return this;
    }
    public String getSecurityData() {
        return this.securityData;
    }

    public CreateBssecpicRequest setExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }
    public String getExtraData() {
        return this.extraData;
    }

    public CreateBssecpicRequest setWhiteBoxData(String whiteBoxData) {
        this.whiteBoxData = whiteBoxData;
        return this;
    }
    public String getWhiteBoxData() {
        return this.whiteBoxData;
    }

}
