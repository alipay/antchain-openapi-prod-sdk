// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class GetAshieldFiletokenResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // .
    @NameInMap("request_id")
    public String requestId;

    // res_success
    @NameInMap("res_success")
    public Boolean resSuccess;

    // res_code
    @NameInMap("res_code")
    public String resCode;

    // res_message
    @NameInMap("res_message")
    public String resMessage;

    // .
    @NameInMap("res_data")
    public FileTokenForUpload resData;

    public static GetAshieldFiletokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAshieldFiletokenResponse self = new GetAshieldFiletokenResponse();
        return TeaModel.build(map, self);
    }

    public GetAshieldFiletokenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAshieldFiletokenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAshieldFiletokenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAshieldFiletokenResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAshieldFiletokenResponse setResSuccess(Boolean resSuccess) {
        this.resSuccess = resSuccess;
        return this;
    }
    public Boolean getResSuccess() {
        return this.resSuccess;
    }

    public GetAshieldFiletokenResponse setResCode(String resCode) {
        this.resCode = resCode;
        return this;
    }
    public String getResCode() {
        return this.resCode;
    }

    public GetAshieldFiletokenResponse setResMessage(String resMessage) {
        this.resMessage = resMessage;
        return this;
    }
    public String getResMessage() {
        return this.resMessage;
    }

    public GetAshieldFiletokenResponse setResData(FileTokenForUpload resData) {
        this.resData = resData;
        return this;
    }
    public FileTokenForUpload getResData() {
        return this.resData;
    }

}
