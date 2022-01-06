// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListSgRouterrulegroupappsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应用名及应用名下的规则数列表
    @NameInMap("app_names")
    public java.util.List<AppNameCountModel> appNames;

    // 起始索引
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

    public static ListSgRouterrulegroupappsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSgRouterrulegroupappsResponse self = new ListSgRouterrulegroupappsResponse();
        return TeaModel.build(map, self);
    }

    public ListSgRouterrulegroupappsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSgRouterrulegroupappsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSgRouterrulegroupappsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSgRouterrulegroupappsResponse setAppNames(java.util.List<AppNameCountModel> appNames) {
        this.appNames = appNames;
        return this;
    }
    public java.util.List<AppNameCountModel> getAppNames() {
        return this.appNames;
    }

    public ListSgRouterrulegroupappsResponse setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public ListSgRouterrulegroupappsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSgRouterrulegroupappsResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public ListSgRouterrulegroupappsResponse setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

}
