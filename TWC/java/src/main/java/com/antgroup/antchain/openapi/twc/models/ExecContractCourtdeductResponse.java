// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ExecContractCourtdeductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否执行成功
    @NameInMap("success")
    public Boolean success;

    // 扣款金额，单位：分
    @NameInMap("pay_money")
    public Long payMoney;

    // 扣款详情信息
    @NameInMap("pay_detail_msg")
    public String payDetailMsg;

    public static ExecContractCourtdeductResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecContractCourtdeductResponse self = new ExecContractCourtdeductResponse();
        return TeaModel.build(map, self);
    }

    public ExecContractCourtdeductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecContractCourtdeductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecContractCourtdeductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecContractCourtdeductResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExecContractCourtdeductResponse setPayMoney(Long payMoney) {
        this.payMoney = payMoney;
        return this;
    }
    public Long getPayMoney() {
        return this.payMoney;
    }

    public ExecContractCourtdeductResponse setPayDetailMsg(String payDetailMsg) {
        this.payDetailMsg = payDetailMsg;
        return this;
    }
    public String getPayDetailMsg() {
        return this.payDetailMsg;
    }

}
