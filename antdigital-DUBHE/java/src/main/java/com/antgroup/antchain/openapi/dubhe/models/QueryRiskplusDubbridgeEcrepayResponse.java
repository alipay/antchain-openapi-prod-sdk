// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class QueryRiskplusDubbridgeEcrepayResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public EcRepayQuery data;

    public static QueryRiskplusDubbridgeEcrepayResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskplusDubbridgeEcrepayResponse self = new QueryRiskplusDubbridgeEcrepayResponse();
        return TeaModel.build(map, self);
    }

    public QueryRiskplusDubbridgeEcrepayResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRiskplusDubbridgeEcrepayResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRiskplusDubbridgeEcrepayResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRiskplusDubbridgeEcrepayResponse setData(EcRepayQuery data) {
        this.data = data;
        return this;
    }
    public EcRepayQuery getData() {
        return this.data;
    }

}
