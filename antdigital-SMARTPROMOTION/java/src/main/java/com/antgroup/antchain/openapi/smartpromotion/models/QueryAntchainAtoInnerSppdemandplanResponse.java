// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartpromotion.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoInnerSppdemandplanResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // JSON示例
    @NameInMap("plan")
    public String plan;

    public static QueryAntchainAtoInnerSppdemandplanResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoInnerSppdemandplanResponse self = new QueryAntchainAtoInnerSppdemandplanResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoInnerSppdemandplanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainAtoInnerSppdemandplanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainAtoInnerSppdemandplanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainAtoInnerSppdemandplanResponse setPlan(String plan) {
        this.plan = plan;
        return this;
    }
    public String getPlan() {
        return this.plan;
    }

}
