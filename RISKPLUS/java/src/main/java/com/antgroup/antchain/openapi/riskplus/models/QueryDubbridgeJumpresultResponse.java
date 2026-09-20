// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeJumpresultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 跳端申请唯一流水号
    @NameInMap("jump_no")
    public String jumpNo;

    // 借款确认页URL
    @NameInMap("page_url")
    public String pageUrl;

    // 借款确认页客户确认信息
    @NameInMap("cust_check_info")
    public CustCheckInfo custCheckInfo;

    public static QueryDubbridgeJumpresultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeJumpresultResponse self = new QueryDubbridgeJumpresultResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeJumpresultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeJumpresultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeJumpresultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeJumpresultResponse setJumpNo(String jumpNo) {
        this.jumpNo = jumpNo;
        return this;
    }
    public String getJumpNo() {
        return this.jumpNo;
    }

    public QueryDubbridgeJumpresultResponse setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
        return this;
    }
    public String getPageUrl() {
        return this.pageUrl;
    }

    public QueryDubbridgeJumpresultResponse setCustCheckInfo(CustCheckInfo custCheckInfo) {
        this.custCheckInfo = custCheckInfo;
        return this;
    }
    public CustCheckInfo getCustCheckInfo() {
        return this.custCheckInfo;
    }

}
