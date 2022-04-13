// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryBuildpackNativetechstackversionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总个数
    @NameInMap("total_count")
    public Long totalCount;

    // 云原生技术栈版本列表
    @NameInMap("list")
    public java.util.List<NativeTechStackVersion> list;

    // 当前页码
    @NameInMap("current_page")
    public Long currentPage;

    // 一页包含个数
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryBuildpackNativetechstackversionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackNativetechstackversionResponse self = new QueryBuildpackNativetechstackversionResponse();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackNativetechstackversionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBuildpackNativetechstackversionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBuildpackNativetechstackversionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBuildpackNativetechstackversionResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryBuildpackNativetechstackversionResponse setList(java.util.List<NativeTechStackVersion> list) {
        this.list = list;
        return this;
    }
    public java.util.List<NativeTechStackVersion> getList() {
        return this.list;
    }

    public QueryBuildpackNativetechstackversionResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryBuildpackNativetechstackversionResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
