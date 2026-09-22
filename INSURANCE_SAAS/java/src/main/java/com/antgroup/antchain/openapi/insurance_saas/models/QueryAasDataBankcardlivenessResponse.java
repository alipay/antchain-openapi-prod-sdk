// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class QueryAasDataBankcardlivenessResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 响应ID（安科req_msg_id），回传接口必传
    @NameInMap("history_request_id")
    public String historyRequestId;

    // 银行活跃度详情（JSONArray，排最前最活跃）
    @NameInMap("liveness_info")
    public String livenessInfo;

    public static QueryAasDataBankcardlivenessResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAasDataBankcardlivenessResponse self = new QueryAasDataBankcardlivenessResponse();
        return TeaModel.build(map, self);
    }

    public QueryAasDataBankcardlivenessResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAasDataBankcardlivenessResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAasDataBankcardlivenessResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAasDataBankcardlivenessResponse setHistoryRequestId(String historyRequestId) {
        this.historyRequestId = historyRequestId;
        return this;
    }
    public String getHistoryRequestId() {
        return this.historyRequestId;
    }

    public QueryAasDataBankcardlivenessResponse setLivenessInfo(String livenessInfo) {
        this.livenessInfo = livenessInfo;
        return this;
    }
    public String getLivenessInfo() {
        return this.livenessInfo;
    }

}
