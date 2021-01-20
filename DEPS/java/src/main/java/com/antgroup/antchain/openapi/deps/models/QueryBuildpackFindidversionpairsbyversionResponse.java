// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackFindidversionpairsbyversionResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // buildpack_composite_v_os
    @NameInMap("buildpack_composite_v_os")
    public java.util.List<BuildpackCompositeVO> buildpackCompositeVOs;

    // current_page
    @NameInMap("current_page")
    public Long currentPage;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // total_count
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryBuildpackFindidversionpairsbyversionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackFindidversionpairsbyversionResponse self = new QueryBuildpackFindidversionpairsbyversionResponse();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackFindidversionpairsbyversionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBuildpackFindidversionpairsbyversionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBuildpackFindidversionpairsbyversionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBuildpackFindidversionpairsbyversionResponse setBuildpackCompositeVOs(java.util.List<BuildpackCompositeVO> buildpackCompositeVOs) {
        this.buildpackCompositeVOs = buildpackCompositeVOs;
        return this;
    }
    public java.util.List<BuildpackCompositeVO> getBuildpackCompositeVOs() {
        return this.buildpackCompositeVOs;
    }

    public QueryBuildpackFindidversionpairsbyversionResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryBuildpackFindidversionpairsbyversionResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryBuildpackFindidversionpairsbyversionResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
