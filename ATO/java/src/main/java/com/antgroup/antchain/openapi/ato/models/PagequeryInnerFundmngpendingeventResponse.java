// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerFundmngpendingeventResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总数量
    @NameInMap("total")
    public Long total;

    // 事件信息
    @NameInMap("pending_event_info")
    public String pendingEventInfo;

    public static PagequeryInnerFundmngpendingeventResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerFundmngpendingeventResponse self = new PagequeryInnerFundmngpendingeventResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerFundmngpendingeventResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryInnerFundmngpendingeventResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryInnerFundmngpendingeventResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryInnerFundmngpendingeventResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PagequeryInnerFundmngpendingeventResponse setPendingEventInfo(String pendingEventInfo) {
        this.pendingEventInfo = pendingEventInfo;
        return this;
    }
    public String getPendingEventInfo() {
        return this.pendingEventInfo;
    }

}
