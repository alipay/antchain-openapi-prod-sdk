// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class QueryUsedcarResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 二手车估值信息
    @NameInMap("used_car_valuation")
    public UsedCarValuation usedCarValuation;

    public static QueryUsedcarResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUsedcarResponse self = new QueryUsedcarResponse();
        return TeaModel.build(map, self);
    }

    public QueryUsedcarResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUsedcarResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUsedcarResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUsedcarResponse setUsedCarValuation(UsedCarValuation usedCarValuation) {
        this.usedCarValuation = usedCarValuation;
        return this;
    }
    public UsedCarValuation getUsedCarValuation() {
        return this.usedCarValuation;
    }

}
