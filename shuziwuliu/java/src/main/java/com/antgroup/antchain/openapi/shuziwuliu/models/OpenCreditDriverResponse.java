// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class OpenCreditDriverResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签署开通申请id
    @NameInMap("apply_id")
    public String applyId;

    // 协议签署开通url
    @NameInMap("sign_url")
    public String signUrl;

    // 签署状态
    // -1:签署开通失败, 0:未签署开通, 1:已签署开通
    @NameInMap("status")
    public Long status;

    public static OpenCreditDriverResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenCreditDriverResponse self = new OpenCreditDriverResponse();
        return TeaModel.build(map, self);
    }

    public OpenCreditDriverResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public OpenCreditDriverResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OpenCreditDriverResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public OpenCreditDriverResponse setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public OpenCreditDriverResponse setSignUrl(String signUrl) {
        this.signUrl = signUrl;
        return this;
    }
    public String getSignUrl() {
        return this.signUrl;
    }

    public OpenCreditDriverResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
