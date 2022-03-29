// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqTopicsubdetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回 Data 对象
    @NameInMap("data")
    public TopicSubDetailDTO data;

    public static QuerySofamqTopicsubdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqTopicsubdetailResponse self = new QuerySofamqTopicsubdetailResponse();
        return TeaModel.build(map, self);
    }

    public QuerySofamqTopicsubdetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySofamqTopicsubdetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySofamqTopicsubdetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySofamqTopicsubdetailResponse setData(TopicSubDetailDTO data) {
        this.data = data;
        return this;
    }
    public TopicSubDetailDTO getData() {
        return this.data;
    }

}
