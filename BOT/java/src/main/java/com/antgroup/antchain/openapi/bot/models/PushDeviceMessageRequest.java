// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PushDeviceMessageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备序列化
    @NameInMap("device_sn")
    public String deviceSn;

    // 设备厂商
    @NameInMap("device_corp")
    public String deviceCorp;

    // 推送消息 主题
    @NameInMap("topic_identifer")
    @Validation(required = true)
    public String topicIdentifer;

    // 推送消息类型
    @NameInMap("mesage_type")
    @Validation(required = true)
    public String mesageType;

    // 消息内容
    @NameInMap("message_content")
    @Validation(required = true)
    public String messageContent;

    // 业务场景-项目
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 设备唯一ID，蚂蚁IoT平台生成
    @NameInMap("device_did")
    public String deviceDid;

    // iffaa 硬件唯一ID
    @NameInMap("tuid")
    public String tuid;

    public static PushDeviceMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        PushDeviceMessageRequest self = new PushDeviceMessageRequest();
        return TeaModel.build(map, self);
    }

    public PushDeviceMessageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushDeviceMessageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushDeviceMessageRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public PushDeviceMessageRequest setDeviceCorp(String deviceCorp) {
        this.deviceCorp = deviceCorp;
        return this;
    }
    public String getDeviceCorp() {
        return this.deviceCorp;
    }

    public PushDeviceMessageRequest setTopicIdentifer(String topicIdentifer) {
        this.topicIdentifer = topicIdentifer;
        return this;
    }
    public String getTopicIdentifer() {
        return this.topicIdentifer;
    }

    public PushDeviceMessageRequest setMesageType(String mesageType) {
        this.mesageType = mesageType;
        return this;
    }
    public String getMesageType() {
        return this.mesageType;
    }

    public PushDeviceMessageRequest setMessageContent(String messageContent) {
        this.messageContent = messageContent;
        return this;
    }
    public String getMessageContent() {
        return this.messageContent;
    }

    public PushDeviceMessageRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public PushDeviceMessageRequest setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public PushDeviceMessageRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

}
