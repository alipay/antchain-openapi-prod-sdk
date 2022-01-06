// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListSgAuthrulegroupappsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 鉴权规则组列表模型
    @NameInMap("auth_rule_groups")
    public java.util.List<AuthRuleGroupListModelVO> authRuleGroups;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 起始页
    @NameInMap("start_index")
    public Long startIndex;

    // 总大小
    @NameInMap("total_size")
    public Long totalSize;

    public static ListSgAuthrulegroupappsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSgAuthrulegroupappsResponse self = new ListSgAuthrulegroupappsResponse();
        return TeaModel.build(map, self);
    }

    public ListSgAuthrulegroupappsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSgAuthrulegroupappsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSgAuthrulegroupappsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSgAuthrulegroupappsResponse setAuthRuleGroups(java.util.List<AuthRuleGroupListModelVO> authRuleGroups) {
        this.authRuleGroups = authRuleGroups;
        return this;
    }
    public java.util.List<AuthRuleGroupListModelVO> getAuthRuleGroups() {
        return this.authRuleGroups;
    }

    public ListSgAuthrulegroupappsResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListSgAuthrulegroupappsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSgAuthrulegroupappsResponse setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public ListSgAuthrulegroupappsResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
