// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryAlarmwebhookResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // webhook列表
    @NameInMap("web_hooks")
    public java.util.List<AlarmWebHook> webHooks;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    // 总记录数
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryAlarmwebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmwebhookResponse self = new QueryAlarmwebhookResponse();
        return TeaModel.build(map, self);
    }

    public QueryAlarmwebhookResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAlarmwebhookResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAlarmwebhookResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAlarmwebhookResponse setWebHooks(java.util.List<AlarmWebHook> webHooks) {
        this.webHooks = webHooks;
        return this;
    }
    public java.util.List<AlarmWebHook> getWebHooks() {
        return this.webHooks;
    }

    public QueryAlarmwebhookResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryAlarmwebhookResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAlarmwebhookResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
