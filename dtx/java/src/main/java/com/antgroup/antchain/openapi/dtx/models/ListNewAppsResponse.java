// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class ListNewAppsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // .
    @NameInMap("current_page")
    public Long currentPage;

    // app
    @NameInMap("data")
    public java.util.List<AppInfoVO> data;

    // 10
    @NameInMap("page_size")
    public Long pageSize;

    // 10
    @NameInMap("total")
    public Long total;

    public static ListNewAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNewAppsResponse self = new ListNewAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListNewAppsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListNewAppsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListNewAppsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListNewAppsResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListNewAppsResponse setData(java.util.List<AppInfoVO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AppInfoVO> getData() {
        return this.data;
    }

    public ListNewAppsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListNewAppsResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
