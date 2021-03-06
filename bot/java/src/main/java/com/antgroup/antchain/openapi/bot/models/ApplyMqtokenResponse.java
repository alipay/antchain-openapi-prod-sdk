// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ApplyMqtokenResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 服务端返回的Token值，用于阿里云 MQTT连接
    @NameInMap("token")
    public String token;

    // 接入阿里云LMQ的所需的accessKey
    @NameInMap("access_key")
    public String accessKey;

    // mqtt的instanceId
    @NameInMap("instance_id")
    public String instanceId;

    // mqtt的topic
    @NameInMap("sub_topic")
    public String subTopic;

    // mqtt的topic
    @NameInMap("pub_topic")
    public String pubTopic;

    // mqtt的groupId
    @NameInMap("group_id")
    public String groupId;

    public static ApplyMqtokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyMqtokenResponse self = new ApplyMqtokenResponse();
        return TeaModel.build(map, self);
    }

    public ApplyMqtokenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyMqtokenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyMqtokenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyMqtokenResponse setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public ApplyMqtokenResponse setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public ApplyMqtokenResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ApplyMqtokenResponse setSubTopic(String subTopic) {
        this.subTopic = subTopic;
        return this;
    }
    public String getSubTopic() {
        return this.subTopic;
    }

    public ApplyMqtokenResponse setPubTopic(String pubTopic) {
        this.pubTopic = pubTopic;
        return this;
    }
    public String getPubTopic() {
        return this.pubTopic;
    }

    public ApplyMqtokenResponse setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
