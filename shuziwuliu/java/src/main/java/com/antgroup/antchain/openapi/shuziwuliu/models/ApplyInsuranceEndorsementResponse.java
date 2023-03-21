// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyInsuranceEndorsementResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 批单申请号
    @NameInMap("endorsement_apply_no")
    public String endorsementApplyNo;

    // 批单申请编码
    @NameInMap("endorsement_apply_code")
    public String endorsementApplyCode;

    public static ApplyInsuranceEndorsementResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsuranceEndorsementResponse self = new ApplyInsuranceEndorsementResponse();
        return TeaModel.build(map, self);
    }

    public ApplyInsuranceEndorsementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyInsuranceEndorsementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyInsuranceEndorsementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyInsuranceEndorsementResponse setEndorsementApplyNo(String endorsementApplyNo) {
        this.endorsementApplyNo = endorsementApplyNo;
        return this;
    }
    public String getEndorsementApplyNo() {
        return this.endorsementApplyNo;
    }

    public ApplyInsuranceEndorsementResponse setEndorsementApplyCode(String endorsementApplyCode) {
        this.endorsementApplyCode = endorsementApplyCode;
        return this;
    }
    public String getEndorsementApplyCode() {
        return this.endorsementApplyCode;
    }

}
