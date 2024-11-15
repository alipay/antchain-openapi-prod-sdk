// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class ExecRobotIntelligentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求id
    @NameInMap("target_req_msg_id")
    @Validation(required = true)
    public String targetReqMsgId;

    // 通知人
    @NameInMap("sender_staff_id")
    public String senderStaffId;

    // 回调通知接口
    @NameInMap("call_url")
    public String callUrl;

    // token
    @NameInMap("robot_token")
    public String robotToken;

    public static ExecRobotIntelligentRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecRobotIntelligentRequest self = new ExecRobotIntelligentRequest();
        return TeaModel.build(map, self);
    }

    public ExecRobotIntelligentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecRobotIntelligentRequest setTargetReqMsgId(String targetReqMsgId) {
        this.targetReqMsgId = targetReqMsgId;
        return this;
    }
    public String getTargetReqMsgId() {
        return this.targetReqMsgId;
    }

    public ExecRobotIntelligentRequest setSenderStaffId(String senderStaffId) {
        this.senderStaffId = senderStaffId;
        return this;
    }
    public String getSenderStaffId() {
        return this.senderStaffId;
    }

    public ExecRobotIntelligentRequest setCallUrl(String callUrl) {
        this.callUrl = callUrl;
        return this;
    }
    public String getCallUrl() {
        return this.callUrl;
    }

    public ExecRobotIntelligentRequest setRobotToken(String robotToken) {
        this.robotToken = robotToken;
        return this;
    }
    public String getRobotToken() {
        return this.robotToken;
    }

}
