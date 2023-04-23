// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class ApplyPartnerSettleinResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果编码
    @NameInMap("code")
    public String code;

    // 错误描述
    @NameInMap("error_message")
    public String errorMessage;

    // 入驻申请记录id
    @NameInMap("apply_id")
    public Long applyId;

    public static ApplyPartnerSettleinResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyPartnerSettleinResponse self = new ApplyPartnerSettleinResponse();
        return TeaModel.build(map, self);
    }

    public ApplyPartnerSettleinResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyPartnerSettleinResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyPartnerSettleinResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyPartnerSettleinResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplyPartnerSettleinResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ApplyPartnerSettleinResponse setApplyId(Long applyId) {
        this.applyId = applyId;
        return this;
    }
    public Long getApplyId() {
        return this.applyId;
    }

}
