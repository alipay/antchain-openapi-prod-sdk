// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class FinishLeaseSupplierstatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 租赁信息上链后，链上对应的txHash
    @NameInMap("response_data")
    public String responseData;

    // 错误码
    @NameInMap("code")
    public String code;

    // 错误信息描述
    @NameInMap("err_message")
    public String errMessage;

    public static FinishLeaseSupplierstatusResponse build(java.util.Map<String, ?> map) throws Exception {
        FinishLeaseSupplierstatusResponse self = new FinishLeaseSupplierstatusResponse();
        return TeaModel.build(map, self);
    }

    public FinishLeaseSupplierstatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public FinishLeaseSupplierstatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public FinishLeaseSupplierstatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public FinishLeaseSupplierstatusResponse setResponseData(String responseData) {
        this.responseData = responseData;
        return this;
    }
    public String getResponseData() {
        return this.responseData;
    }

    public FinishLeaseSupplierstatusResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FinishLeaseSupplierstatusResponse setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

}
