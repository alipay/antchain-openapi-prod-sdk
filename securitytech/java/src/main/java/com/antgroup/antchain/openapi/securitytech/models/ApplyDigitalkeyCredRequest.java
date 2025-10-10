// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ApplyDigitalkeyCredRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备类型
    @NameInMap("device_type")
    public String deviceType;

    // 凭证类型
    @NameInMap("cred_type")
    public String credType;

    // 需要生成的内容
    @NameInMap("generate_code")
    public String generateCode;

    // 客户身份ID
    @NameInMap("secret_id")
    @Validation(required = true)
    public String secretId;

    // 设备SN号
    @NameInMap("device_sn")
    public String deviceSn;

    // MAC地址
    @NameInMap("mac")
    public String mac;

    // ble名称
    @NameInMap("ble_nme")
    @Validation(required = true)
    public String bleNme;

    // 无感控车数据
    @NameInMap("key_less")
    public String keyLess;

    // 凭证格式
    @NameInMap("format_type")
    public String formatType;

    // 加密类型
    @NameInMap("enc_type")
    public String encType;

    // 协议类型
    @NameInMap("protocol_type")
    public String protocolType;

    // 品牌ID
    @NameInMap("brand_id")
    @Validation(required = true)
    public String brandId;

    // IOT通道
    @NameInMap("channel")
    public String channel;

    public static ApplyDigitalkeyCredRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDigitalkeyCredRequest self = new ApplyDigitalkeyCredRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDigitalkeyCredRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyDigitalkeyCredRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyDigitalkeyCredRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public ApplyDigitalkeyCredRequest setCredType(String credType) {
        this.credType = credType;
        return this;
    }
    public String getCredType() {
        return this.credType;
    }

    public ApplyDigitalkeyCredRequest setGenerateCode(String generateCode) {
        this.generateCode = generateCode;
        return this;
    }
    public String getGenerateCode() {
        return this.generateCode;
    }

    public ApplyDigitalkeyCredRequest setSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }
    public String getSecretId() {
        return this.secretId;
    }

    public ApplyDigitalkeyCredRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public ApplyDigitalkeyCredRequest setMac(String mac) {
        this.mac = mac;
        return this;
    }
    public String getMac() {
        return this.mac;
    }

    public ApplyDigitalkeyCredRequest setBleNme(String bleNme) {
        this.bleNme = bleNme;
        return this;
    }
    public String getBleNme() {
        return this.bleNme;
    }

    public ApplyDigitalkeyCredRequest setKeyLess(String keyLess) {
        this.keyLess = keyLess;
        return this;
    }
    public String getKeyLess() {
        return this.keyLess;
    }

    public ApplyDigitalkeyCredRequest setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public ApplyDigitalkeyCredRequest setEncType(String encType) {
        this.encType = encType;
        return this;
    }
    public String getEncType() {
        return this.encType;
    }

    public ApplyDigitalkeyCredRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public ApplyDigitalkeyCredRequest setBrandId(String brandId) {
        this.brandId = brandId;
        return this;
    }
    public String getBrandId() {
        return this.brandId;
    }

    public ApplyDigitalkeyCredRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

}
