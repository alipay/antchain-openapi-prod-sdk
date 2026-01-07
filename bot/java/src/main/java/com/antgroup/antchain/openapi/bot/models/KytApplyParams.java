// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class KytApplyParams extends TeaModel {
    // 设备类型
    /**
     * <strong>example:</strong>
     * <p>tw_car</p>
     */
    @NameInMap("device_type")
    public String deviceType;

    // 凭证类型
    /**
     * <strong>example:</strong>
     * <p>mcu_dk_cred</p>
     */
    @NameInMap("cred_type")
    public String credType;

    // 品牌
    /**
     * <strong>example:</strong>
     * <p>JL</p>
     */
    @NameInMap("brand_id")
    @Validation(required = true)
    public String brandId;

    // 凭证内容
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("generate_code")
    public String generateCode;

    // 协议类型
    /**
     * <strong>example:</strong>
     * <p>ble</p>
     */
    @NameInMap("protocol_type")
    @Validation(required = true)
    public String protocolType;

    // 无感参数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("key_less")
    @Validation(required = true)
    public String keyLess;

    // mac
    /**
     * <strong>example:</strong>
     * <p>F8:5F:56:F6:05:BC</p>
     */
    @NameInMap("mac")
    @Validation(required = true)
    public String mac;

    // ble_name
    /**
     * <strong>example:</strong>
     * <p>ble_</p>
     */
    @NameInMap("ble_name")
    @Validation(required = true)
    public String bleName;

    // 通道
    /**
     * <strong>example:</strong>
     * <p>DT</p>
     */
    @NameInMap("channel")
    public String channel;

    public static KytApplyParams build(java.util.Map<String, ?> map) throws Exception {
        KytApplyParams self = new KytApplyParams();
        return TeaModel.build(map, self);
    }

    public KytApplyParams setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public KytApplyParams setCredType(String credType) {
        this.credType = credType;
        return this;
    }
    public String getCredType() {
        return this.credType;
    }

    public KytApplyParams setBrandId(String brandId) {
        this.brandId = brandId;
        return this;
    }
    public String getBrandId() {
        return this.brandId;
    }

    public KytApplyParams setGenerateCode(String generateCode) {
        this.generateCode = generateCode;
        return this;
    }
    public String getGenerateCode() {
        return this.generateCode;
    }

    public KytApplyParams setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public KytApplyParams setKeyLess(String keyLess) {
        this.keyLess = keyLess;
        return this;
    }
    public String getKeyLess() {
        return this.keyLess;
    }

    public KytApplyParams setMac(String mac) {
        this.mac = mac;
        return this;
    }
    public String getMac() {
        return this.mac;
    }

    public KytApplyParams setBleName(String bleName) {
        this.bleName = bleName;
        return this;
    }
    public String getBleName() {
        return this.bleName;
    }

    public KytApplyParams setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

}
