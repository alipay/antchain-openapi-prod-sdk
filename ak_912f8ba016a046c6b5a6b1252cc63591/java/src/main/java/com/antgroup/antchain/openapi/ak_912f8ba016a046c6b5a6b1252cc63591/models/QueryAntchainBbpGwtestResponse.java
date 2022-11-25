// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_912f8ba016a046c6b5a6b1252cc63591.models;

import com.aliyun.tea.*;

public class QueryAntchainBbpGwtestResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果码
    @NameInMap("stauts")
    public String stauts;

    public static QueryAntchainBbpGwtestResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainBbpGwtestResponse self = new QueryAntchainBbpGwtestResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainBbpGwtestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainBbpGwtestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainBbpGwtestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainBbpGwtestResponse setStauts(String stauts) {
        this.stauts = stauts;
        return this;
    }
    public String getStauts() {
        return this.stauts;
    }

}
