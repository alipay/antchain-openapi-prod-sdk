// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListSgFaultinjectappsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应用名数组
    @NameInMap("app_names")
    public java.util.List<FaultInjectRuleAppNameModel> appNames;

    // 开始索引
    @NameInMap("start_index")
    public Long startIndex;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 总条数
    @NameInMap("total_size")
    public Long totalSize;

    // 当前页
    @NameInMap("current_page")
    public String currentPage;

    public static ListSgFaultinjectappsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSgFaultinjectappsResponse self = new ListSgFaultinjectappsResponse();
        return TeaModel.build(map, self);
    }

    public ListSgFaultinjectappsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSgFaultinjectappsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSgFaultinjectappsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSgFaultinjectappsResponse setAppNames(java.util.List<FaultInjectRuleAppNameModel> appNames) {
        this.appNames = appNames;
        return this;
    }
    public java.util.List<FaultInjectRuleAppNameModel> getAppNames() {
        return this.appNames;
    }

    public ListSgFaultinjectappsResponse setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public ListSgFaultinjectappsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSgFaultinjectappsResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public ListSgFaultinjectappsResponse setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

}
