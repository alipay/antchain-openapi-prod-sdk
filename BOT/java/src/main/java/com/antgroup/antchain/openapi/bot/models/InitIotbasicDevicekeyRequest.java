// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class InitIotbasicDevicekeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 所属业务
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 设备厂商名称
    @NameInMap("corp_name")
    @Validation(required = true)
    public String corpName;

    // 产品code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 设备品类
    @NameInMap("device_type")
    public String deviceType;

    // json字符串，包含设备sn等信息
    @NameInMap("device_info")
    @Validation(required = true)
    public String deviceInfo;

    // RSA公钥
    @NameInMap("pub_key")
    public String pubKey;

    public static InitIotbasicDevicekeyRequest build(java.util.Map<String, ?> map) throws Exception {
        InitIotbasicDevicekeyRequest self = new InitIotbasicDevicekeyRequest();
        return TeaModel.build(map, self);
    }

    public InitIotbasicDevicekeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitIotbasicDevicekeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitIotbasicDevicekeyRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public InitIotbasicDevicekeyRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public InitIotbasicDevicekeyRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public InitIotbasicDevicekeyRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public InitIotbasicDevicekeyRequest setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public String getDeviceInfo() {
        return this.deviceInfo;
    }

    public InitIotbasicDevicekeyRequest setPubKey(String pubKey) {
        this.pubKey = pubKey;
        return this;
    }
    public String getPubKey() {
        return this.pubKey;
    }

}
