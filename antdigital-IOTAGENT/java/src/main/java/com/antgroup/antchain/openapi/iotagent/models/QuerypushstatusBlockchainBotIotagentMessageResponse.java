// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class QuerypushstatusBlockchainBotIotagentMessageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 推送消息的受理标识
    @NameInMap("receipt_id")
    public String receiptId;

    // 消息ID
    @NameInMap("message_id")
    public String messageId;

    // 客户端ID
    @NameInMap("client_id")
    public String clientId;

    // 最后的状态更新时间
    @NameInMap("update_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String updateTime;

    // 失败的异常信息
    @NameInMap("failed_reason")
    public String failedReason;

    // 状态，取值范围：PENDING->已入队；WAITING->等待中（设备离线/忙碌）;EXECUTING->已下发设备、执行中；SUCCEEDED->成功；FAILED->失败；EXPIRED->已过期
    @NameInMap("status")
    public String status;

    public static QuerypushstatusBlockchainBotIotagentMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerypushstatusBlockchainBotIotagentMessageResponse self = new QuerypushstatusBlockchainBotIotagentMessageResponse();
        return TeaModel.build(map, self);
    }

    public QuerypushstatusBlockchainBotIotagentMessageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerypushstatusBlockchainBotIotagentMessageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerypushstatusBlockchainBotIotagentMessageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerypushstatusBlockchainBotIotagentMessageResponse setReceiptId(String receiptId) {
        this.receiptId = receiptId;
        return this;
    }
    public String getReceiptId() {
        return this.receiptId;
    }

    public QuerypushstatusBlockchainBotIotagentMessageResponse setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public QuerypushstatusBlockchainBotIotagentMessageResponse setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public QuerypushstatusBlockchainBotIotagentMessageResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public QuerypushstatusBlockchainBotIotagentMessageResponse setFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }
    public String getFailedReason() {
        return this.failedReason;
    }

    public QuerypushstatusBlockchainBotIotagentMessageResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
