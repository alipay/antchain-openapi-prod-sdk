// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class QueryRiskplusDubbridgeRepayofflineaccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总条数
    @NameInMap("total_num")
    public String totalNum;

    // 总页数
    @NameInMap("total_page")
    public String totalPage;

    // 账户流水信息
    @NameInMap("account_detail_list")
    public java.util.List<AccountDetail> accountDetailList;

    public static QueryRiskplusDubbridgeRepayofflineaccountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskplusDubbridgeRepayofflineaccountResponse self = new QueryRiskplusDubbridgeRepayofflineaccountResponse();
        return TeaModel.build(map, self);
    }

    public QueryRiskplusDubbridgeRepayofflineaccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRiskplusDubbridgeRepayofflineaccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRiskplusDubbridgeRepayofflineaccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRiskplusDubbridgeRepayofflineaccountResponse setTotalNum(String totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public String getTotalNum() {
        return this.totalNum;
    }

    public QueryRiskplusDubbridgeRepayofflineaccountResponse setTotalPage(String totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public String getTotalPage() {
        return this.totalPage;
    }

    public QueryRiskplusDubbridgeRepayofflineaccountResponse setAccountDetailList(java.util.List<AccountDetail> accountDetailList) {
        this.accountDetailList = accountDetailList;
        return this;
    }
    public java.util.List<AccountDetail> getAccountDetailList() {
        return this.accountDetailList;
    }

}
