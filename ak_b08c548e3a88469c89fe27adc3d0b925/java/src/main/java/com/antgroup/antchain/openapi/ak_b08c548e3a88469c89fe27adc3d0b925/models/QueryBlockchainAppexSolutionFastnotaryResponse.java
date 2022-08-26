// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_b08c548e3a88469c89fe27adc3d0b925.models;

import com.aliyun.tea.*;

public class QueryBlockchainAppexSolutionFastnotaryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 存证记录
    @NameInMap("notary_record")
    public NotaryRecord notaryRecord;

    public static QueryBlockchainAppexSolutionFastnotaryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainAppexSolutionFastnotaryResponse self = new QueryBlockchainAppexSolutionFastnotaryResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainAppexSolutionFastnotaryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBlockchainAppexSolutionFastnotaryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBlockchainAppexSolutionFastnotaryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBlockchainAppexSolutionFastnotaryResponse setNotaryRecord(NotaryRecord notaryRecord) {
        this.notaryRecord = notaryRecord;
        return this;
    }
    public NotaryRecord getNotaryRecord() {
        return this.notaryRecord;
    }

}
