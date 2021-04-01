// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CheckIpAccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 申请状态(0:运营审核中, 1:运营审核失败, 2:进件审核中, 3:进件审核失败, 4:进件审核成功)
    @NameInMap("status")
    public String status;

    // 运营审核失败原因
    @NameInMap("reject_reason")
    public String rejectReason;

    // 是否需要支付宝签约(当为true,需要用户到支付宝进行签约) 签约引导说明: https://opendocs.alipay.com/open/00gfyb	
    @NameInMap("need_sign")
    public Boolean needSign;

    public static CheckIpAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckIpAccountResponse self = new CheckIpAccountResponse();
        return TeaModel.build(map, self);
    }

    public CheckIpAccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckIpAccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckIpAccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckIpAccountResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CheckIpAccountResponse setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
        return this;
    }
    public String getRejectReason() {
        return this.rejectReason;
    }

    public CheckIpAccountResponse setNeedSign(Boolean needSign) {
        this.needSign = needSign;
        return this;
    }
    public Boolean getNeedSign() {
        return this.needSign;
    }

}
