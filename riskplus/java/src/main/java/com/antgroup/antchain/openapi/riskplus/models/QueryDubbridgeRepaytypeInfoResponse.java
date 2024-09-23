// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeRepaytypeInfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 还款方式/借款期数集合
    @NameInMap("repay_type_info_list")
    public java.util.List<PlatformRepayTypeInfo> repayTypeInfoList;

    public static QueryDubbridgeRepaytypeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeRepaytypeInfoResponse self = new QueryDubbridgeRepaytypeInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeRepaytypeInfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeRepaytypeInfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeRepaytypeInfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeRepaytypeInfoResponse setRepayTypeInfoList(java.util.List<PlatformRepayTypeInfo> repayTypeInfoList) {
        this.repayTypeInfoList = repayTypeInfoList;
        return this;
    }
    public java.util.List<PlatformRepayTypeInfo> getRepayTypeInfoList() {
        return this.repayTypeInfoList;
    }

}
