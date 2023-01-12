// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryApptechstackrelationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // app_techstack_relations
    @NameInMap("app_techstack_relations")
    public java.util.List<AppTechstackRelation> appTechstackRelations;

    // current_page
    @NameInMap("current_page")
    public Long currentPage;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // total_count
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryApptechstackrelationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApptechstackrelationResponse self = new QueryApptechstackrelationResponse();
        return TeaModel.build(map, self);
    }

    public QueryApptechstackrelationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApptechstackrelationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApptechstackrelationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApptechstackrelationResponse setAppTechstackRelations(java.util.List<AppTechstackRelation> appTechstackRelations) {
        this.appTechstackRelations = appTechstackRelations;
        return this;
    }
    public java.util.List<AppTechstackRelation> getAppTechstackRelations() {
        return this.appTechstackRelations;
    }

    public QueryApptechstackrelationResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryApptechstackrelationResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryApptechstackrelationResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
