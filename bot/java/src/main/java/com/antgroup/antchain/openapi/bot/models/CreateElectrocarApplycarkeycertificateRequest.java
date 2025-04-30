// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateElectrocarApplycarkeycertificateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求唯一标识Id 调用方生成，需要保证唯一性
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 模式 默认为false，产线申请为true
    @NameInMap("online_flag")
    public String onlineFlag;

    // 设备类型 默认为4-芯片SE，联系技术配置具体的设备类型
    @NameInMap("device_type")
    public String deviceType;

    // 凭证类型，默认se_dk_cred，如果是MCU，则mcu_dk_cred
    @NameInMap("cred_type")
    public String credType;

    // 品牌Id
    @NameInMap("brand_id")
    @Validation(required = true)
    public String brandId;

    // 凭证内容
    // 集合结构[0,1,2,3]
    // 0:IIFAA根密钥
    // 1:企业业务密钥
    // 2:设备密钥
    // 3:无感控车
    // 如果此字段为空，则默认生成0，1，2
    @NameInMap("generate_code")
    public String generateCode;

    // 协议类型
    // 蓝牙：ble
    // 4G: 4G
    // 蓝牙+4G：ble|4G
    // 如果此字段为空，默认为ble
    @NameInMap("protocol_type")
    @Validation(required = true)
    public String protocolType;

    // 无感控车设备端数据，当generateCode包含3的时候，此字段不能为空
    @NameInMap("key_less")
    public String keyLess;

    // mac
    @NameInMap("mac")
    @Validation(required = true)
    public String mac;

    // ble_name
    @NameInMap("ble_name")
    @Validation(required = true)
    public String bleName;

    // 设备sn 
    @NameInMap("device_sn")
    @Validation(required = true)
    public String deviceSn;

    // 接入场景码
    @NameInMap("access_scene")
    @Validation(required = true)
    public String accessScene;

    public static CreateElectrocarApplycarkeycertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateElectrocarApplycarkeycertificateRequest self = new CreateElectrocarApplycarkeycertificateRequest();
        return TeaModel.build(map, self);
    }

    public CreateElectrocarApplycarkeycertificateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateElectrocarApplycarkeycertificateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateElectrocarApplycarkeycertificateRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateElectrocarApplycarkeycertificateRequest setOnlineFlag(String onlineFlag) {
        this.onlineFlag = onlineFlag;
        return this;
    }
    public String getOnlineFlag() {
        return this.onlineFlag;
    }

    public CreateElectrocarApplycarkeycertificateRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public CreateElectrocarApplycarkeycertificateRequest setCredType(String credType) {
        this.credType = credType;
        return this;
    }
    public String getCredType() {
        return this.credType;
    }

    public CreateElectrocarApplycarkeycertificateRequest setBrandId(String brandId) {
        this.brandId = brandId;
        return this;
    }
    public String getBrandId() {
        return this.brandId;
    }

    public CreateElectrocarApplycarkeycertificateRequest setGenerateCode(String generateCode) {
        this.generateCode = generateCode;
        return this;
    }
    public String getGenerateCode() {
        return this.generateCode;
    }

    public CreateElectrocarApplycarkeycertificateRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public CreateElectrocarApplycarkeycertificateRequest setKeyLess(String keyLess) {
        this.keyLess = keyLess;
        return this;
    }
    public String getKeyLess() {
        return this.keyLess;
    }

    public CreateElectrocarApplycarkeycertificateRequest setMac(String mac) {
        this.mac = mac;
        return this;
    }
    public String getMac() {
        return this.mac;
    }

    public CreateElectrocarApplycarkeycertificateRequest setBleName(String bleName) {
        this.bleName = bleName;
        return this;
    }
    public String getBleName() {
        return this.bleName;
    }

    public CreateElectrocarApplycarkeycertificateRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public CreateElectrocarApplycarkeycertificateRequest setAccessScene(String accessScene) {
        this.accessScene = accessScene;
        return this;
    }
    public String getAccessScene() {
        return this.accessScene;
    }

}
