// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class ListTransactionCorrectionsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 1
    @NameInMap("current_page")
    public Long currentPage;

    // a
    @NameInMap("data")
    public java.util.List<Correction> data;

    // 1
    @NameInMap("page_size")
    public Long pageSize;

    // true
    @NameInMap("success")
    public Boolean success;

    // 总数
    @NameInMap("total")
    public Long total;

    public static ListTransactionCorrectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransactionCorrectionsResponse self = new ListTransactionCorrectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListTransactionCorrectionsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListTransactionCorrectionsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListTransactionCorrectionsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListTransactionCorrectionsResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListTransactionCorrectionsResponse setData(java.util.List<Correction> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Correction> getData() {
        return this.data;
    }

    public ListTransactionCorrectionsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTransactionCorrectionsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTransactionCorrectionsResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
