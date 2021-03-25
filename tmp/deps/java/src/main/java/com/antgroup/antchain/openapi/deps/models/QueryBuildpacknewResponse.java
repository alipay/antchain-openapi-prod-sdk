// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpacknewResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // buildpacks
    @NameInMap("buildpacks")
    public java.util.List<BuildpackDetail> buildpacks;

    // currentPage
    @NameInMap("current_page")
    public Long currentPage;

    // pageSize
    @NameInMap("page_size")
    public Long pageSize;

    // totalCount
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryBuildpacknewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpacknewResponse self = new QueryBuildpacknewResponse();
        return TeaModel.build(map, self);
    }

    public QueryBuildpacknewResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBuildpacknewResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBuildpacknewResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBuildpacknewResponse setBuildpacks(java.util.List<BuildpackDetail> buildpacks) {
        this.buildpacks = buildpacks;
        return this;
    }
    public java.util.List<BuildpackDetail> getBuildpacks() {
        return this.buildpacks;
    }

    public QueryBuildpacknewResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryBuildpacknewResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryBuildpacknewResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
