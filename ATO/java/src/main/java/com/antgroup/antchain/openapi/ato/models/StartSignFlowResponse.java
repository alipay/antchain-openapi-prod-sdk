// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class StartSignFlowResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 受理结果与拉起参数，RentalSignInitiateResp 对象的 JSON 字符串
    @NameInMap("response_data")
    public RentalSignInitiateResp responseData;

    public static StartSignFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        StartSignFlowResponse self = new StartSignFlowResponse();
        return TeaModel.build(map, self);
    }

    public StartSignFlowResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartSignFlowResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartSignFlowResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartSignFlowResponse setResponseData(RentalSignInitiateResp responseData) {
        this.responseData = responseData;
        return this;
    }
    public RentalSignInitiateResp getResponseData() {
        return this.responseData;
    }

}
