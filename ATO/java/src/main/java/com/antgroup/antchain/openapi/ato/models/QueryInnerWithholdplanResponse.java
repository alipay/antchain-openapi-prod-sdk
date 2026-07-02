// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerWithholdplanResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总金额，单位为分
    @NameInMap("total_money")
    public Long totalMoney;

    // 总期数
    @NameInMap("total_term")
    public Long totalTerm;

    // 用户履约信息列表
    @NameInMap("pay_info")
    public java.util.List<UserPerformanceInfo> payInfo;

    public static QueryInnerWithholdplanResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerWithholdplanResponse self = new QueryInnerWithholdplanResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerWithholdplanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerWithholdplanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerWithholdplanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerWithholdplanResponse setTotalMoney(Long totalMoney) {
        this.totalMoney = totalMoney;
        return this;
    }
    public Long getTotalMoney() {
        return this.totalMoney;
    }

    public QueryInnerWithholdplanResponse setTotalTerm(Long totalTerm) {
        this.totalTerm = totalTerm;
        return this;
    }
    public Long getTotalTerm() {
        return this.totalTerm;
    }

    public QueryInnerWithholdplanResponse setPayInfo(java.util.List<UserPerformanceInfo> payInfo) {
        this.payInfo = payInfo;
        return this;
    }
    public java.util.List<UserPerformanceInfo> getPayInfo() {
        return this.payInfo;
    }

}
