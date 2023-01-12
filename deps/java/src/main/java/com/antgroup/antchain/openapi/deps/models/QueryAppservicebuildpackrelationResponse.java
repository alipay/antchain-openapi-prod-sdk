// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryAppservicebuildpackrelationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // app_service_buildpack_relations
    @NameInMap("app_service_buildpack_relations")
    public java.util.List<AppServiceBuildpackRelation> appServiceBuildpackRelations;

    // current_page
    @NameInMap("current_page")
    public Long currentPage;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // total_count
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryAppservicebuildpackrelationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppservicebuildpackrelationResponse self = new QueryAppservicebuildpackrelationResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppservicebuildpackrelationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAppservicebuildpackrelationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAppservicebuildpackrelationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAppservicebuildpackrelationResponse setAppServiceBuildpackRelations(java.util.List<AppServiceBuildpackRelation> appServiceBuildpackRelations) {
        this.appServiceBuildpackRelations = appServiceBuildpackRelations;
        return this;
    }
    public java.util.List<AppServiceBuildpackRelation> getAppServiceBuildpackRelations() {
        return this.appServiceBuildpackRelations;
    }

    public QueryAppservicebuildpackrelationResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryAppservicebuildpackrelationResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAppservicebuildpackrelationResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
