// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class ListIssuerOperationlogResponse extends TeaModel {
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

    public static ListIssuerOperationlogResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIssuerOperationlogResponse self = new ListIssuerOperationlogResponse();
        return TeaModel.build(map, self);
    }

    public ListIssuerOperationlogResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListIssuerOperationlogResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListIssuerOperationlogResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListIssuerOperationlogResponse setData(java.util.List<LoginOperationLogVO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<LoginOperationLogVO> getData() {
        return this.data;
    }

}
