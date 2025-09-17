// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class QueryAntdigitalWebtrwatradeDistributorResponse extends TeaModel {
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

    public static QueryAntdigitalWebtrwatradeDistributorResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalWebtrwatradeDistributorResponse self = new QueryAntdigitalWebtrwatradeDistributorResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalWebtrwatradeDistributorResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntdigitalWebtrwatradeDistributorResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntdigitalWebtrwatradeDistributorResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntdigitalWebtrwatradeDistributorResponse setData(java.util.List<SubUserAccountDetailVO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SubUserAccountDetailVO> getData() {
        return this.data;
    }

}
