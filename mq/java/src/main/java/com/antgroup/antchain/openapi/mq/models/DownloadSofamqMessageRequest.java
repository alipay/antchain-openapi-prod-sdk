// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class DownloadSofamqMessageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需配置的 Group ID 所对应的实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // topic名
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    //  需查询的消息的 ID，即 Message ID
    @NameInMap("msg_id")
    @Validation(required = true)
    public String msgId;

    // 需要查询的Cell名
    @NameInMap("cell")
    public String cell;

    public static DownloadSofamqMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadSofamqMessageRequest self = new DownloadSofamqMessageRequest();
        return TeaModel.build(map, self);
    }

    public DownloadSofamqMessageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DownloadSofamqMessageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DownloadSofamqMessageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DownloadSofamqMessageRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public DownloadSofamqMessageRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public DownloadSofamqMessageRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

}
