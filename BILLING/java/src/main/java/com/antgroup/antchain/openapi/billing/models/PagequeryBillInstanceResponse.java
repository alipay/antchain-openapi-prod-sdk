// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class PagequeryBillInstanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分页结果
    @NameInMap("pagination_result")
    public PaginationResult paginationResult;

    public static PagequeryBillInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryBillInstanceResponse self = new PagequeryBillInstanceResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryBillInstanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryBillInstanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryBillInstanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryBillInstanceResponse setPaginationResult(PaginationResult paginationResult) {
        this.paginationResult = paginationResult;
        return this;
    }
    public PaginationResult getPaginationResult() {
        return this.paginationResult;
    }

}
