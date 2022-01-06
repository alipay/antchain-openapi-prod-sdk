// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QuerySgDowngradegroupsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 降级规则组列表
    @NameInMap("downgrade_rule_groups")
    public java.util.List<DowngradeRuleGroupVo> downgradeRuleGroups;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 总条数
    @NameInMap("total_size")
    public Long totalSize;

    public static QuerySgDowngradegroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySgDowngradegroupsResponse self = new QuerySgDowngradegroupsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySgDowngradegroupsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySgDowngradegroupsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySgDowngradegroupsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySgDowngradegroupsResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QuerySgDowngradegroupsResponse setDowngradeRuleGroups(java.util.List<DowngradeRuleGroupVo> downgradeRuleGroups) {
        this.downgradeRuleGroups = downgradeRuleGroups;
        return this;
    }
    public java.util.List<DowngradeRuleGroupVo> getDowngradeRuleGroups() {
        return this.downgradeRuleGroups;
    }

    public QuerySgDowngradegroupsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QuerySgDowngradegroupsResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
