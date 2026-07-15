// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class CallbackAntdigitalAssetOrgoperationRepayResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 还款回调结果
    @NameInMap("data")
    public RepayCallBackResData data;

    public static CallbackAntdigitalAssetOrgoperationRepayResponse build(java.util.Map<String, ?> map) throws Exception {
        CallbackAntdigitalAssetOrgoperationRepayResponse self = new CallbackAntdigitalAssetOrgoperationRepayResponse();
        return TeaModel.build(map, self);
    }

    public CallbackAntdigitalAssetOrgoperationRepayResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CallbackAntdigitalAssetOrgoperationRepayResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CallbackAntdigitalAssetOrgoperationRepayResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CallbackAntdigitalAssetOrgoperationRepayResponse setData(RepayCallBackResData data) {
        this.data = data;
        return this;
    }
    public RepayCallBackResData getData() {
        return this.data;
    }

}
