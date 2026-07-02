// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerFundmngfinanceorderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总数
    @NameInMap("total_count")
    public Long totalCount;

    // 查询结果
    @NameInMap("items")
    public String items;

    // 资方放款申请失败数量
    @NameInMap("loan_apply_fail_count")
    public Long loanApplyFailCount;

    public static PagequeryInnerFundmngfinanceorderResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerFundmngfinanceorderResponse self = new PagequeryInnerFundmngfinanceorderResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerFundmngfinanceorderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryInnerFundmngfinanceorderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryInnerFundmngfinanceorderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryInnerFundmngfinanceorderResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public PagequeryInnerFundmngfinanceorderResponse setItems(String items) {
        this.items = items;
        return this;
    }
    public String getItems() {
        return this.items;
    }

    public PagequeryInnerFundmngfinanceorderResponse setLoanApplyFailCount(Long loanApplyFailCount) {
        this.loanApplyFailCount = loanApplyFailCount;
        return this;
    }
    public Long getLoanApplyFailCount() {
        return this.loanApplyFailCount;
    }

}
