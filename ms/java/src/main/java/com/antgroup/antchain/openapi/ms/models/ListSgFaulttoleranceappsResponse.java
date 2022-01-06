// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListSgFaulttoleranceappsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 故障隔离app与规则数量
    @NameInMap("app_models")
    public java.util.List<FaultToleranceRuleAppModel> appModels;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 页面条数
    @NameInMap("page_size")
    public Long pageSize;

    // 开始行
    @NameInMap("start_index")
    public Long startIndex;

    // 总条数
    @NameInMap("total_size")
    public Long totalSize;

    public static ListSgFaulttoleranceappsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSgFaulttoleranceappsResponse self = new ListSgFaulttoleranceappsResponse();
        return TeaModel.build(map, self);
    }

    public ListSgFaulttoleranceappsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSgFaulttoleranceappsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSgFaulttoleranceappsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSgFaulttoleranceappsResponse setAppModels(java.util.List<FaultToleranceRuleAppModel> appModels) {
        this.appModels = appModels;
        return this;
    }
    public java.util.List<FaultToleranceRuleAppModel> getAppModels() {
        return this.appModels;
    }

    public ListSgFaulttoleranceappsResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListSgFaulttoleranceappsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSgFaulttoleranceappsResponse setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public ListSgFaulttoleranceappsResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
