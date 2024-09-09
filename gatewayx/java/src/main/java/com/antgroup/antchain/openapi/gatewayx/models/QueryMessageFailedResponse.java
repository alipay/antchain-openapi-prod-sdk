// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gatewayx.models;

import com.aliyun.tea.*;

public class QueryMessageFailedResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 消息事件编码
    @NameInMap("msg_key")
    public String msgKey;

    // 消费方id，例如appId，tenantId
    @NameInMap("consumer_id")
    public String consumerId;

    // 消费者类型，例如TENANT, APP
    @NameInMap("consumer_type")
    public String consumerType;

    // 业务消息内容，json格式
    @NameInMap("biz_content")
    public String bizContent;

    // 消息发送过程中的唯一ID
    @NameInMap("msg_id")
    public String msgId;

    // 每页条数
    @NameInMap("page_size")
    public String pageSize;

    // 第几页
    @NameInMap("page_num")
    public String pageNum;

    // 总条数
    @NameInMap("total_num")
    public String totalNum;

    public static QueryMessageFailedResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageFailedResponse self = new QueryMessageFailedResponse();
        return TeaModel.build(map, self);
    }

    public QueryMessageFailedResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMessageFailedResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMessageFailedResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMessageFailedResponse setMsgKey(String msgKey) {
        this.msgKey = msgKey;
        return this;
    }
    public String getMsgKey() {
        return this.msgKey;
    }

    public QueryMessageFailedResponse setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public QueryMessageFailedResponse setConsumerType(String consumerType) {
        this.consumerType = consumerType;
        return this;
    }
    public String getConsumerType() {
        return this.consumerType;
    }

    public QueryMessageFailedResponse setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public QueryMessageFailedResponse setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public QueryMessageFailedResponse setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryMessageFailedResponse setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public QueryMessageFailedResponse setTotalNum(String totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public String getTotalNum() {
        return this.totalNum;
    }

}
