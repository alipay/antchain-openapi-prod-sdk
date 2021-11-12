// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class PagequerySolutionOpsplanResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 发布单列表
    @NameInMap("ops_plans")
    public java.util.List<OpsPlan> opsPlans;

    // 总数
    @NameInMap("total_count")
    public Long totalCount;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    public static PagequerySolutionOpsplanResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequerySolutionOpsplanResponse self = new PagequerySolutionOpsplanResponse();
        return TeaModel.build(map, self);
    }

    public PagequerySolutionOpsplanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequerySolutionOpsplanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequerySolutionOpsplanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequerySolutionOpsplanResponse setOpsPlans(java.util.List<OpsPlan> opsPlans) {
        this.opsPlans = opsPlans;
        return this;
    }
    public java.util.List<OpsPlan> getOpsPlans() {
        return this.opsPlans;
    }

    public PagequerySolutionOpsplanResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public PagequerySolutionOpsplanResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequerySolutionOpsplanResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

}
