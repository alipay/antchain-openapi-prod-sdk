// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_7365e031a87c467bbe817bec28a2a1dc.models;

import com.aliyun.tea.*;

public class GetBaasPlusDataserviceTransactioncountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 交易总数
    @NameInMap("data")
    public Long data;

    public static GetBaasPlusDataserviceTransactioncountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBaasPlusDataserviceTransactioncountResponse self = new GetBaasPlusDataserviceTransactioncountResponse();
        return TeaModel.build(map, self);
    }

    public GetBaasPlusDataserviceTransactioncountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetBaasPlusDataserviceTransactioncountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetBaasPlusDataserviceTransactioncountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetBaasPlusDataserviceTransactioncountResponse setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

}
