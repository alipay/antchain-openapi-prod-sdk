// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryUserTopicqueueResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // Topic队列列表信息
    @NameInMap("data")
    public java.util.List<TopicQueueDTO> data;

    public static QueryUserTopicqueueResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserTopicqueueResponse self = new QueryUserTopicqueueResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserTopicqueueResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUserTopicqueueResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUserTopicqueueResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUserTopicqueueResponse setData(java.util.List<TopicQueueDTO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<TopicQueueDTO> getData() {
        return this.data;
    }

}
