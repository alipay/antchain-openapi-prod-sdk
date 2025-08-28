// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CountInnerAgreementterminateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 待处理-数量
    @NameInMap("un_handle_status_num")
    public Long unHandleStatusNum;

    // 处理中-数量
    @NameInMap("handing_status_num")
    public Long handingStatusNum;

    // 已处理-数量
    @NameInMap("finished_status_num")
    public Long finishedStatusNum;

    // 已超时-数量
    @NameInMap("timeout_status_num")
    public Long timeoutStatusNum;

    public static CountInnerAgreementterminateResponse build(java.util.Map<String, ?> map) throws Exception {
        CountInnerAgreementterminateResponse self = new CountInnerAgreementterminateResponse();
        return TeaModel.build(map, self);
    }

    public CountInnerAgreementterminateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CountInnerAgreementterminateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountInnerAgreementterminateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CountInnerAgreementterminateResponse setUnHandleStatusNum(Long unHandleStatusNum) {
        this.unHandleStatusNum = unHandleStatusNum;
        return this;
    }
    public Long getUnHandleStatusNum() {
        return this.unHandleStatusNum;
    }

    public CountInnerAgreementterminateResponse setHandingStatusNum(Long handingStatusNum) {
        this.handingStatusNum = handingStatusNum;
        return this;
    }
    public Long getHandingStatusNum() {
        return this.handingStatusNum;
    }

    public CountInnerAgreementterminateResponse setFinishedStatusNum(Long finishedStatusNum) {
        this.finishedStatusNum = finishedStatusNum;
        return this;
    }
    public Long getFinishedStatusNum() {
        return this.finishedStatusNum;
    }

    public CountInnerAgreementterminateResponse setTimeoutStatusNum(Long timeoutStatusNum) {
        this.timeoutStatusNum = timeoutStatusNum;
        return this;
    }
    public Long getTimeoutStatusNum() {
        return this.timeoutStatusNum;
    }

}
