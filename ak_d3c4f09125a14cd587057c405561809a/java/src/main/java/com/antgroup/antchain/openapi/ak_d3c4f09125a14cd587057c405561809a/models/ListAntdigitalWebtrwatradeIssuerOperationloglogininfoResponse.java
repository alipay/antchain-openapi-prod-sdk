// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 回参
    @NameInMap("data")
    public java.util.List<LoginOperationLogVO> data;

    public static ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse self = new ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse();
        return TeaModel.build(map, self);
    }

    public ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse setData(java.util.List<LoginOperationLogVO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<LoginOperationLogVO> getData() {
        return this.data;
    }

}
