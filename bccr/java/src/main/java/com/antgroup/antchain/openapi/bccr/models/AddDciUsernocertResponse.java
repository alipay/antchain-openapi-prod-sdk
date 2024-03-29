// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class AddDciUsernocertResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // dci用户id
    @NameInMap("dci_user_id")
    public String dciUserId;

    // dci用户状态
    @NameInMap("dci_user_status")
    public String dciUserStatus;

    public static AddDciUsernocertResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDciUsernocertResponse self = new AddDciUsernocertResponse();
        return TeaModel.build(map, self);
    }

    public AddDciUsernocertResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddDciUsernocertResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddDciUsernocertResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddDciUsernocertResponse setDciUserId(String dciUserId) {
        this.dciUserId = dciUserId;
        return this;
    }
    public String getDciUserId() {
        return this.dciUserId;
    }

    public AddDciUsernocertResponse setDciUserStatus(String dciUserStatus) {
        this.dciUserStatus = dciUserStatus;
        return this;
    }
    public String getDciUserStatus() {
        return this.dciUserStatus;
    }

}
