// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class QueryRiskplusDubbridgeEccreditQuotaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回对象
    @NameInMap("data")
    public DubheEcQuota data;

    public static QueryRiskplusDubbridgeEccreditQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskplusDubbridgeEccreditQuotaResponse self = new QueryRiskplusDubbridgeEccreditQuotaResponse();
        return TeaModel.build(map, self);
    }

    public QueryRiskplusDubbridgeEccreditQuotaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRiskplusDubbridgeEccreditQuotaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRiskplusDubbridgeEccreditQuotaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRiskplusDubbridgeEccreditQuotaResponse setData(DubheEcQuota data) {
        this.data = data;
        return this;
    }
    public DubheEcQuota getData() {
        return this.data;
    }

}
