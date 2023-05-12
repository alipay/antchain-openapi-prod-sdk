// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class ListTransactionDebugsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 联调记录分页数据
    @NameInMap("data")
    public java.util.List<DebugRecord> data;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 接口返回码
    @NameInMap("success")
    public Boolean success;

    // 总数
    @NameInMap("total")
    public Long total;

    public static ListTransactionDebugsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransactionDebugsResponse self = new ListTransactionDebugsResponse();
        return TeaModel.build(map, self);
    }

    public ListTransactionDebugsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListTransactionDebugsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListTransactionDebugsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListTransactionDebugsResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListTransactionDebugsResponse setData(java.util.List<DebugRecord> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DebugRecord> getData() {
        return this.data;
    }

    public ListTransactionDebugsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTransactionDebugsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTransactionDebugsResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
