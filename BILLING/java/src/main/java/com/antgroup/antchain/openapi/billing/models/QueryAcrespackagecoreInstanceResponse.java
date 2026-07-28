// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class QueryAcrespackagecoreInstanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总页数
    @NameInMap("total_count")
    public Long totalCount;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 状态
    @NameInMap("success")
    public Boolean success;

    // 结果
    @NameInMap("data")
    public java.util.List<ResourcePackageLogVO> data;

    public static QueryAcrespackagecoreInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAcrespackagecoreInstanceResponse self = new QueryAcrespackagecoreInstanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryAcrespackagecoreInstanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAcrespackagecoreInstanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAcrespackagecoreInstanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAcrespackagecoreInstanceResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryAcrespackagecoreInstanceResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryAcrespackagecoreInstanceResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAcrespackagecoreInstanceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAcrespackagecoreInstanceResponse setData(java.util.List<ResourcePackageLogVO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ResourcePackageLogVO> getData() {
        return this.data;
    }

}
