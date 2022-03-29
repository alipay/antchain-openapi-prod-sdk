// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ExecSofamqDlqresendbatchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要查询的单元
    @NameInMap("cell")
    public String cell;

    // 需查询的消费端 Group ID
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 需查询消息所对应的实例 ID。
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 需重发的消息的 ID，即 Message ID，多个消息使用英文逗号分隔
    @NameInMap("msg_ids")
    @Validation(required = true)
    public String msgIds;

    public static ExecSofamqDlqresendbatchRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecSofamqDlqresendbatchRequest self = new ExecSofamqDlqresendbatchRequest();
        return TeaModel.build(map, self);
    }

    public ExecSofamqDlqresendbatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecSofamqDlqresendbatchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecSofamqDlqresendbatchRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public ExecSofamqDlqresendbatchRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ExecSofamqDlqresendbatchRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExecSofamqDlqresendbatchRequest setMsgIds(String msgIds) {
        this.msgIds = msgIds;
        return this;
    }
    public String getMsgIds() {
        return this.msgIds;
    }

}
