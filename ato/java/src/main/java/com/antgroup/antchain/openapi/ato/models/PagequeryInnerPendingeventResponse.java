// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerPendingeventResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总量
    @NameInMap("total")
    public Long total;

    // 待办列表信息
    @NameInMap("pending_event_info_list")
    public java.util.List<PendingEventInfo> pendingEventInfoList;

    public static PagequeryInnerPendingeventResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerPendingeventResponse self = new PagequeryInnerPendingeventResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerPendingeventResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryInnerPendingeventResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryInnerPendingeventResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryInnerPendingeventResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PagequeryInnerPendingeventResponse setPendingEventInfoList(java.util.List<PendingEventInfo> pendingEventInfoList) {
        this.pendingEventInfoList = pendingEventInfoList;
        return this;
    }
    public java.util.List<PendingEventInfo> getPendingEventInfoList() {
        return this.pendingEventInfoList;
    }

}
