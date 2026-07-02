// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DataVerifyFailureData extends TeaModel {
    // 主键id 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // Alipay-0101
    /**
     * <strong>example:</strong>
     * <p>场景码</p>
     */
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 设备ID 
    /**
     * <strong>example:</strong>
     * <p>device_id_001</p>
     */
    @NameInMap("device_id")
    public String deviceId;

    // 发行设备ID 
    /**
     * <strong>example:</strong>
     * <p>00202009111700539276</p>
     */
    @NameInMap("dis_device_id")
    public String disDeviceId;

    // 类型：0:数据上报;1:数据完整性校验
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // c89b65a2e3afd604977c0....
    /**
     * <strong>example:</strong>
     * <p>公钥</p>
     */
    @NameInMap("public_key")
    public String publicKey;

    // 验签类型：0(RAW_DATA)；1(公钥格式为PEM)；2(公钥格式为DER)
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("format_type")
    public Long formatType;

    // 验证内容hash
    /**
     * <strong>example:</strong>
     * <p>aa5304221185b370ea84d...</p>
     */
    @NameInMap("content_id")
    public String contentId;

    // 验证内容
    /**
     * <strong>example:</strong>
     * <p>{&quot;content&quot;:&quot;demo&quot;,...}</p>
     */
    @NameInMap("content")
    public String content;

    // 签名
    /**
     * <strong>example:</strong>
     * <p>9b47e12b0ddb8df...</p>
     */
    @NameInMap("signature")
    public String signature;

    // 错误信息
    /**
     * <strong>example:</strong>
     * <p>数据验真失败</p>
     */
    @NameInMap("fail_message")
    public String failMessage;

    // 补充数据
    /**
     * <strong>example:</strong>
     * <p>{“DEVICE-ID”:&quot;DEMO-001&quot;}</p>
     */
    @NameInMap("extra_data")
    public String extraData;

    // 数据来源：0(普通数据上报)；1(MAAS数据上报)；2(设备业务数据上报);3(标签流转)
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("source")
    public Long source;

    public static DataVerifyFailureData build(java.util.Map<String, ?> map) throws Exception {
        DataVerifyFailureData self = new DataVerifyFailureData();
        return TeaModel.build(map, self);
    }

    public DataVerifyFailureData setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DataVerifyFailureData setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DataVerifyFailureData setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public DataVerifyFailureData setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public DataVerifyFailureData setDisDeviceId(String disDeviceId) {
        this.disDeviceId = disDeviceId;
        return this;
    }
    public String getDisDeviceId() {
        return this.disDeviceId;
    }

    public DataVerifyFailureData setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public DataVerifyFailureData setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public DataVerifyFailureData setFormatType(Long formatType) {
        this.formatType = formatType;
        return this;
    }
    public Long getFormatType() {
        return this.formatType;
    }

    public DataVerifyFailureData setContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }
    public String getContentId() {
        return this.contentId;
    }

    public DataVerifyFailureData setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DataVerifyFailureData setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public DataVerifyFailureData setFailMessage(String failMessage) {
        this.failMessage = failMessage;
        return this;
    }
    public String getFailMessage() {
        return this.failMessage;
    }

    public DataVerifyFailureData setExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }
    public String getExtraData() {
        return this.extraData;
    }

    public DataVerifyFailureData setSource(Long source) {
        this.source = source;
        return this;
    }
    public Long getSource() {
        return this.source;
    }

}
