// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyPfFinancingqualificationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 申请流水号
    @NameInMap("apl_seq_no")
    public String aplSeqNo;

    // 受理标志
    // 0-受理失败
    // 1-受理成功
    @NameInMap("acceptance_flag")
    public String acceptanceFlag;

    public static ApplyPfFinancingqualificationResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyPfFinancingqualificationResponse self = new ApplyPfFinancingqualificationResponse();
        return TeaModel.build(map, self);
    }

    public ApplyPfFinancingqualificationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyPfFinancingqualificationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyPfFinancingqualificationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyPfFinancingqualificationResponse setAplSeqNo(String aplSeqNo) {
        this.aplSeqNo = aplSeqNo;
        return this;
    }
    public String getAplSeqNo() {
        return this.aplSeqNo;
    }

    public ApplyPfFinancingqualificationResponse setAcceptanceFlag(String acceptanceFlag) {
        this.acceptanceFlag = acceptanceFlag;
        return this;
    }
    public String getAcceptanceFlag() {
        return this.acceptanceFlag;
    }

}
