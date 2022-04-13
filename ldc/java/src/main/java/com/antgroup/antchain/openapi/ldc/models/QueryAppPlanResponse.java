// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryAppPlanResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页码，从1开始，默认为1
    @NameInMap("current_page")
    public Long currentPage;

    // 分页大小，默认为10
    @NameInMap("page_size")
    public Long pageSize;

    // 发布单列表
    @NameInMap("plan_list")
    public java.util.List<PlanSimpleView> planList;

    // 发布单数
    @NameInMap("total_size")
    public Long totalSize;

    public static QueryAppPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppPlanResponse self = new QueryAppPlanResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppPlanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAppPlanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAppPlanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAppPlanResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryAppPlanResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAppPlanResponse setPlanList(java.util.List<PlanSimpleView> planList) {
        this.planList = planList;
        return this;
    }
    public java.util.List<PlanSimpleView> getPlanList() {
        return this.planList;
    }

    public QueryAppPlanResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
