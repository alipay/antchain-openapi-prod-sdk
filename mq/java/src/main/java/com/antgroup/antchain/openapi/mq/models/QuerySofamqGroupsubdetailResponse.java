// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqGroupsubdetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回 Data 信息
    @NameInMap("data")
    public GroupSubDetailDTO data;

    public static QuerySofamqGroupsubdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqGroupsubdetailResponse self = new QuerySofamqGroupsubdetailResponse();
        return TeaModel.build(map, self);
    }

    public QuerySofamqGroupsubdetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySofamqGroupsubdetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySofamqGroupsubdetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySofamqGroupsubdetailResponse setData(GroupSubDetailDTO data) {
        this.data = data;
        return this;
    }
    public GroupSubDetailDTO getData() {
        return this.data;
    }

}
