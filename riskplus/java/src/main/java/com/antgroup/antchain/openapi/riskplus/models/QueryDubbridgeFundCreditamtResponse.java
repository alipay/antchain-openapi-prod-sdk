// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeFundCreditamtResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务类型
    @NameInMap("prod_type")
    public String prodType;

    // 客户编号
    @NameInMap("custom_no")
    public String customNo;

    // 资金方列表
    @NameInMap("fund_list")
    public java.util.List<FundInfo> fundList;

    public static QueryDubbridgeFundCreditamtResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeFundCreditamtResponse self = new QueryDubbridgeFundCreditamtResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeFundCreditamtResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeFundCreditamtResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeFundCreditamtResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeFundCreditamtResponse setProdType(String prodType) {
        this.prodType = prodType;
        return this;
    }
    public String getProdType() {
        return this.prodType;
    }

    public QueryDubbridgeFundCreditamtResponse setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

    public QueryDubbridgeFundCreditamtResponse setFundList(java.util.List<FundInfo> fundList) {
        this.fundList = fundList;
        return this;
    }
    public java.util.List<FundInfo> getFundList() {
        return this.fundList;
    }

}
