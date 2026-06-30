// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeRouterFundrouterResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资金方代码
    @NameInMap("fund_code")
    public String fundCode;

    // 资金方简称
    @NameInMap("abbre_fund_name")
    public String abbreFundName;

    // 客户编号
    @NameInMap("customer_no")
    public String customerNo;

    // 资金方列表
    @NameInMap("fund_list")
    public java.util.List<GwFundRouterResult> fundList;

    public static QueryDubbridgeRouterFundrouterResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeRouterFundrouterResponse self = new QueryDubbridgeRouterFundrouterResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeRouterFundrouterResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeRouterFundrouterResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeRouterFundrouterResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeRouterFundrouterResponse setFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }
    public String getFundCode() {
        return this.fundCode;
    }

    public QueryDubbridgeRouterFundrouterResponse setAbbreFundName(String abbreFundName) {
        this.abbreFundName = abbreFundName;
        return this;
    }
    public String getAbbreFundName() {
        return this.abbreFundName;
    }

    public QueryDubbridgeRouterFundrouterResponse setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
        return this;
    }
    public String getCustomerNo() {
        return this.customerNo;
    }

    public QueryDubbridgeRouterFundrouterResponse setFundList(java.util.List<GwFundRouterResult> fundList) {
        this.fundList = fundList;
        return this;
    }
    public java.util.List<GwFundRouterResult> getFundList() {
        return this.fundList;
    }

}
