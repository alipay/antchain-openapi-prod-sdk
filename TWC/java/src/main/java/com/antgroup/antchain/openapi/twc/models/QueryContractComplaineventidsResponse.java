// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractComplaineventidsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 投诉单id列表
    @NameInMap("complain_event_ids")
    public java.util.List<String> complainEventIds;

    public static QueryContractComplaineventidsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContractComplaineventidsResponse self = new QueryContractComplaineventidsResponse();
        return TeaModel.build(map, self);
    }

    public QueryContractComplaineventidsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContractComplaineventidsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContractComplaineventidsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContractComplaineventidsResponse setComplainEventIds(java.util.List<String> complainEventIds) {
        this.complainEventIds = complainEventIds;
        return this;
    }
    public java.util.List<String> getComplainEventIds() {
        return this.complainEventIds;
    }

}
