// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ListSofamqTopicResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回所有查询到的 Topic 信息列表
    @NameInMap("data")
    public TopicPageDTO data;

    public static ListSofamqTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSofamqTopicResponse self = new ListSofamqTopicResponse();
        return TeaModel.build(map, self);
    }

    public ListSofamqTopicResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSofamqTopicResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSofamqTopicResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSofamqTopicResponse setData(TopicPageDTO data) {
        this.data = data;
        return this;
    }
    public TopicPageDTO getData() {
        return this.data;
    }

}
