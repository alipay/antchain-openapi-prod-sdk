// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PushDeviceAudioRequest extends TeaModel {
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

    // 推送消息主题
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

    // 设备唯一ID
    @NameInMap("device_did")
    public String deviceDid;

    // kyt硬件唯一ID
    @NameInMap("tuid")
    public String tuid;

    public static PushDeviceAudioRequest build(java.util.Map<String, ?> map) throws Exception {
        PushDeviceAudioRequest self = new PushDeviceAudioRequest();
        return TeaModel.build(map, self);
    }

    public PushDeviceAudioRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushDeviceAudioRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushDeviceAudioRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public PushDeviceAudioRequest setDeviceCorp(String deviceCorp) {
        this.deviceCorp = deviceCorp;
        return this;
    }
    public String getDeviceCorp() {
        return this.deviceCorp;
    }

    public PushDeviceAudioRequest setTopicIdentifer(String topicIdentifer) {
        this.topicIdentifer = topicIdentifer;
        return this;
    }
    public String getTopicIdentifer() {
        return this.topicIdentifer;
    }

    public PushDeviceAudioRequest setMesageType(String mesageType) {
        this.mesageType = mesageType;
        return this;
    }
    public String getMesageType() {
        return this.mesageType;
    }

    public PushDeviceAudioRequest setMessageContent(String messageContent) {
        this.messageContent = messageContent;
        return this;
    }
    public String getMessageContent() {
        return this.messageContent;
    }

    public PushDeviceAudioRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public PushDeviceAudioRequest setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public PushDeviceAudioRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

}
