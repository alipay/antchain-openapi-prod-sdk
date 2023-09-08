// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.hk_securitytech.models;

import com.aliyun.tea.*;

public class GetAshieldHardeningresultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求id
    @NameInMap("request_id")
    public String requestId;

    // 查询是否成功
    @NameInMap("res_success")
    public Boolean resSuccess;

    // SUCCESS为成功，其他为失败
    @NameInMap("res_code")
    public String resCode;

    // 返回信息描述
    @NameInMap("res_message")
    public String resMessage;

    // 返回的下载链接
    @NameInMap("res_data")
    public String resData;

    public static GetAshieldHardeningresultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAshieldHardeningresultResponse self = new GetAshieldHardeningresultResponse();
        return TeaModel.build(map, self);
    }

    public GetAshieldHardeningresultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAshieldHardeningresultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAshieldHardeningresultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAshieldHardeningresultResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAshieldHardeningresultResponse setResSuccess(Boolean resSuccess) {
        this.resSuccess = resSuccess;
        return this;
    }
    public Boolean getResSuccess() {
        return this.resSuccess;
    }

    public GetAshieldHardeningresultResponse setResCode(String resCode) {
        this.resCode = resCode;
        return this;
    }
    public String getResCode() {
        return this.resCode;
    }

    public GetAshieldHardeningresultResponse setResMessage(String resMessage) {
        this.resMessage = resMessage;
        return this;
    }
    public String getResMessage() {
        return this.resMessage;
    }

    public GetAshieldHardeningresultResponse setResData(String resData) {
        this.resData = resData;
        return this;
    }
    public String getResData() {
        return this.resData;
    }

}
