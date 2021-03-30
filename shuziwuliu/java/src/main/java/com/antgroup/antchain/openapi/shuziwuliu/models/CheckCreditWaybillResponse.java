// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CheckCreditWaybillResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 核验结果列表,  格式为 运单号:核验状态， 核验状态包含  0:运单未知状态   1:通过   2:不通过   3:未核验   4:没有指定信息
    @NameInMap("check_result")
    public java.util.List<String> checkResult;

    public static CheckCreditWaybillResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCreditWaybillResponse self = new CheckCreditWaybillResponse();
        return TeaModel.build(map, self);
    }

    public CheckCreditWaybillResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckCreditWaybillResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckCreditWaybillResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckCreditWaybillResponse setCheckResult(java.util.List<String> checkResult) {
        this.checkResult = checkResult;
        return this;
    }
    public java.util.List<String> getCheckResult() {
        return this.checkResult;
    }

}
