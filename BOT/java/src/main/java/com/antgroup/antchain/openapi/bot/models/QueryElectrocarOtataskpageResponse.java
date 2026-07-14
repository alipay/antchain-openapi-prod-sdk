// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarOtataskpageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否请求成功
    @NameInMap("success")
    public Boolean success;

    // 响应编码
    @NameInMap("code")
    public String code;

    // 响应消息
    @NameInMap("message")
    public String message;

    // 当前页码
    @NameInMap("page_index")
    public Long pageIndex;

    // 单页数量
    @NameInMap("page_size")
    public Long pageSize;

    // 记录总数
    @NameInMap("total_size")
    public Long totalSize;

    // 页总数
    @NameInMap("total_pages")
    public Long totalPages;

    // 分页数据
    @NameInMap("page_data")
    public java.util.List<IotxOTATaskResponse> pageData;

    public static QueryElectrocarOtataskpageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarOtataskpageResponse self = new QueryElectrocarOtataskpageResponse();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarOtataskpageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryElectrocarOtataskpageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryElectrocarOtataskpageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryElectrocarOtataskpageResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryElectrocarOtataskpageResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryElectrocarOtataskpageResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryElectrocarOtataskpageResponse setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryElectrocarOtataskpageResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryElectrocarOtataskpageResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryElectrocarOtataskpageResponse setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public QueryElectrocarOtataskpageResponse setPageData(java.util.List<IotxOTATaskResponse> pageData) {
        this.pageData = pageData;
        return this;
    }
    public java.util.List<IotxOTATaskResponse> getPageData() {
        return this.pageData;
    }

}
