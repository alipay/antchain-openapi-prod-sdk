// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mpaasfaceverify.models;

import com.aliyun.tea.*;

public class QueryCertifyrecordChargeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 单据计费信息
    @NameInMap("charge_info_list")
    public java.util.List<ChargeInfo> chargeInfoList;

    public static QueryCertifyrecordChargeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCertifyrecordChargeResponse self = new QueryCertifyrecordChargeResponse();
        return TeaModel.build(map, self);
    }

    public QueryCertifyrecordChargeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCertifyrecordChargeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCertifyrecordChargeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCertifyrecordChargeResponse setChargeInfoList(java.util.List<ChargeInfo> chargeInfoList) {
        this.chargeInfoList = chargeInfoList;
        return this;
    }
    public java.util.List<ChargeInfo> getChargeInfoList() {
        return this.chargeInfoList;
    }

}
