// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryMetricsTginstantResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前 Group 死信
    @NameInMap("dlq")
    public Long dlq;

    // 当前消息积压
    @NameInMap("msg_backlog")
    public Long msgBacklog;

    // 每分钟消费数据大小
    @NameInMap("recv_bpm")
    public Long recvBpm;

    // 每分钟拉请求数量
    @NameInMap("recv_ppm")
    public Long recvPpm;

    // 消费 TPM
    @NameInMap("recv_tpm")
    public Long recvTpm;

    // 每分钟发送消息大小
    @NameInMap("send_bpm")
    public Long sendBpm;

    // 发送 TPM
    @NameInMap("send_tpm")
    public Long sendTpm;

    public static QueryMetricsTginstantResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricsTginstantResponse self = new QueryMetricsTginstantResponse();
        return TeaModel.build(map, self);
    }

    public QueryMetricsTginstantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMetricsTginstantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMetricsTginstantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMetricsTginstantResponse setDlq(Long dlq) {
        this.dlq = dlq;
        return this;
    }
    public Long getDlq() {
        return this.dlq;
    }

    public QueryMetricsTginstantResponse setMsgBacklog(Long msgBacklog) {
        this.msgBacklog = msgBacklog;
        return this;
    }
    public Long getMsgBacklog() {
        return this.msgBacklog;
    }

    public QueryMetricsTginstantResponse setRecvBpm(Long recvBpm) {
        this.recvBpm = recvBpm;
        return this;
    }
    public Long getRecvBpm() {
        return this.recvBpm;
    }

    public QueryMetricsTginstantResponse setRecvPpm(Long recvPpm) {
        this.recvPpm = recvPpm;
        return this;
    }
    public Long getRecvPpm() {
        return this.recvPpm;
    }

    public QueryMetricsTginstantResponse setRecvTpm(Long recvTpm) {
        this.recvTpm = recvTpm;
        return this;
    }
    public Long getRecvTpm() {
        return this.recvTpm;
    }

    public QueryMetricsTginstantResponse setSendBpm(Long sendBpm) {
        this.sendBpm = sendBpm;
        return this;
    }
    public Long getSendBpm() {
        return this.sendBpm;
    }

    public QueryMetricsTginstantResponse setSendTpm(Long sendTpm) {
        this.sendTpm = sendTpm;
        return this;
    }
    public Long getSendTpm() {
        return this.sendTpm;
    }

}
