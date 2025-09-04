// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class QueryDistributorResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 账户明细列表
    @NameInMap("data")
    public java.util.List<SubUserAccountDetailVO> data;

    public static QueryDistributorResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributorResponse self = new QueryDistributorResponse();
        return TeaModel.build(map, self);
    }

    public QueryDistributorResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDistributorResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDistributorResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDistributorResponse setData(java.util.List<SubUserAccountDetailVO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SubUserAccountDetailVO> getData() {
        return this.data;
    }

}
