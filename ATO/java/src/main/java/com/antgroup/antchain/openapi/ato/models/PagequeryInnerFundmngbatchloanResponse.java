// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerFundmngbatchloanResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总数量
    @NameInMap("total")
    public Long total;

    // 批量放款结果数据
    @NameInMap("data")
    public java.util.List<BatchLoanResultData> data;

    public static PagequeryInnerFundmngbatchloanResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerFundmngbatchloanResponse self = new PagequeryInnerFundmngbatchloanResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerFundmngbatchloanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryInnerFundmngbatchloanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryInnerFundmngbatchloanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryInnerFundmngbatchloanResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PagequeryInnerFundmngbatchloanResponse setData(java.util.List<BatchLoanResultData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BatchLoanResultData> getData() {
        return this.data;
    }

}
