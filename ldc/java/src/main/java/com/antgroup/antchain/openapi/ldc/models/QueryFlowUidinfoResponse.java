// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryFlowUidinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // UID 列表
    @NameInMap("uid_info_list")
    public java.util.List<UidInfo> uidInfoList;

    public static QueryFlowUidinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowUidinfoResponse self = new QueryFlowUidinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryFlowUidinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFlowUidinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFlowUidinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFlowUidinfoResponse setUidInfoList(java.util.List<UidInfo> uidInfoList) {
        this.uidInfoList = uidInfoList;
        return this;
    }
    public java.util.List<UidInfo> getUidInfoList() {
        return this.uidInfoList;
    }

}
