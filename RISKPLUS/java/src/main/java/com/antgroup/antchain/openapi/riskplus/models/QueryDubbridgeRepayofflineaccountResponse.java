// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeRepayofflineaccountResponse extends TeaModel {
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

    public static QueryDubbridgeRepayofflineaccountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeRepayofflineaccountResponse self = new QueryDubbridgeRepayofflineaccountResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeRepayofflineaccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeRepayofflineaccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeRepayofflineaccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeRepayofflineaccountResponse setTotalNum(String totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public String getTotalNum() {
        return this.totalNum;
    }

    public QueryDubbridgeRepayofflineaccountResponse setTotalPage(String totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public String getTotalPage() {
        return this.totalPage;
    }

    public QueryDubbridgeRepayofflineaccountResponse setAccountDetailList(java.util.List<AccountDetail> accountDetailList) {
        this.accountDetailList = accountDetailList;
        return this;
    }
    public java.util.List<AccountDetail> getAccountDetailList() {
        return this.accountDetailList;
    }

}
