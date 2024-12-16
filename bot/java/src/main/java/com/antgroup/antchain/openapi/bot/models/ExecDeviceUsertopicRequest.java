// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ExecDeviceUsertopicRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备did
    @NameInMap("device_did")
    @Validation(required = true)
    public String deviceDid;

    // 使用Hmac-SHA256 哈希算法对对deviceDid进行加签， key 为deviceSecret 
    // Hmac-SHA256(deviceDid,deviceSecret)
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    // 自定义topic名称
    @NameInMap("topic_identifer")
    @Validation(required = true)
    public String topicIdentifer;

    // FORWARD
    @NameInMap("user_topic_cmd_type")
    @Validation(required = true)
    public String userTopicCmdType;

    // 指令内容
    @NameInMap("cmd_content")
    @Validation(required = true)
    public String cmdContent;

    // 业务场景
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    public static ExecDeviceUsertopicRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDeviceUsertopicRequest self = new ExecDeviceUsertopicRequest();
        return TeaModel.build(map, self);
    }

    public ExecDeviceUsertopicRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecDeviceUsertopicRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecDeviceUsertopicRequest setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public ExecDeviceUsertopicRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public ExecDeviceUsertopicRequest setTopicIdentifer(String topicIdentifer) {
        this.topicIdentifer = topicIdentifer;
        return this;
    }
    public String getTopicIdentifer() {
        return this.topicIdentifer;
    }

    public ExecDeviceUsertopicRequest setUserTopicCmdType(String userTopicCmdType) {
        this.userTopicCmdType = userTopicCmdType;
        return this;
    }
    public String getUserTopicCmdType() {
        return this.userTopicCmdType;
    }

    public ExecDeviceUsertopicRequest setCmdContent(String cmdContent) {
        this.cmdContent = cmdContent;
        return this;
    }
    public String getCmdContent() {
        return this.cmdContent;
    }

    public ExecDeviceUsertopicRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

}
