// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 符合条件的技术栈列表
    @NameInMap("buildpacks")
    public java.util.List<BuildpackDetail> buildpacks;

    // 当前页码
    @NameInMap("current_page")
    @Validation(required = true)
    public Long currentPage;

    // 每页的大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 总数量
    @NameInMap("total_count")
    @Validation(required = true)
    public Long totalCount;

    public static QueryBuildpackResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackResponse self = new QueryBuildpackResponse();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBuildpackResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBuildpackResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBuildpackResponse setBuildpacks(java.util.List<BuildpackDetail> buildpacks) {
        this.buildpacks = buildpacks;
        return this;
    }
    public java.util.List<BuildpackDetail> getBuildpacks() {
        return this.buildpacks;
    }

    public QueryBuildpackResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryBuildpackResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryBuildpackResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
