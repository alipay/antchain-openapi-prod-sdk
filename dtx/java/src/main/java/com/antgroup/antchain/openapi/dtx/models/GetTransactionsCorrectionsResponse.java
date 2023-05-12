// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class GetTransactionsCorrectionsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 事务悬挂恢复详情
    @NameInMap("data")
    public Correction data;

    // 接口返回码
    @NameInMap("success")
    public Boolean success;

    public static GetTransactionsCorrectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTransactionsCorrectionsResponse self = new GetTransactionsCorrectionsResponse();
        return TeaModel.build(map, self);
    }

    public GetTransactionsCorrectionsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetTransactionsCorrectionsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetTransactionsCorrectionsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetTransactionsCorrectionsResponse setData(Correction data) {
        this.data = data;
        return this;
    }
    public Correction getData() {
        return this.data;
    }

    public GetTransactionsCorrectionsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
