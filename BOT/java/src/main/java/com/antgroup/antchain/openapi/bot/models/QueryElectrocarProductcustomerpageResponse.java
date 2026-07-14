// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarProductcustomerpageResponse extends TeaModel {
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

    // 分页页码
    @NameInMap("page_index")
    public Long pageIndex;

    // 每页展示大小
    @NameInMap("page_size")
    public Long pageSize;

    // 总页数
    @NameInMap("total_pages")
    public Long totalPages;

    // 总数量
    @NameInMap("total_size")
    public Long totalSize;

    // 分页数据
    @NameInMap("page_data")
    public java.util.List<IotxProductResponse> pageData;

    public static QueryElectrocarProductcustomerpageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarProductcustomerpageResponse self = new QueryElectrocarProductcustomerpageResponse();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarProductcustomerpageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryElectrocarProductcustomerpageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryElectrocarProductcustomerpageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryElectrocarProductcustomerpageResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryElectrocarProductcustomerpageResponse setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryElectrocarProductcustomerpageResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryElectrocarProductcustomerpageResponse setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public QueryElectrocarProductcustomerpageResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryElectrocarProductcustomerpageResponse setPageData(java.util.List<IotxProductResponse> pageData) {
        this.pageData = pageData;
        return this;
    }
    public java.util.List<IotxProductResponse> getPageData() {
        return this.pageData;
    }

}
