// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_eed2ee0664ac41b78f2c14f3ffa051e7.models;

import com.aliyun.tea.*;

public class InitDemoBbpInsuranceUserResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 123
    @NameInMap("start_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startDate;

    public static InitDemoBbpInsuranceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        InitDemoBbpInsuranceUserResponse self = new InitDemoBbpInsuranceUserResponse();
        return TeaModel.build(map, self);
    }

    public InitDemoBbpInsuranceUserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitDemoBbpInsuranceUserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitDemoBbpInsuranceUserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitDemoBbpInsuranceUserResponse setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
