// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDidNotificationVceventResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // vc事件列表
    @NameInMap("events")
    public java.util.List<VCEvent> events;

    // 是否有更多事件待同步
    @NameInMap("has_more")
    public Boolean hasMore;

    // 下次拉取事件的起始偏移量
    @NameInMap("next_offset")
    public Long nextOffset;

    public static QueryDidNotificationVceventResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDidNotificationVceventResponse self = new QueryDidNotificationVceventResponse();
        return TeaModel.build(map, self);
    }

    public QueryDidNotificationVceventResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDidNotificationVceventResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDidNotificationVceventResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDidNotificationVceventResponse setEvents(java.util.List<VCEvent> events) {
        this.events = events;
        return this;
    }
    public java.util.List<VCEvent> getEvents() {
        return this.events;
    }

    public QueryDidNotificationVceventResponse setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public QueryDidNotificationVceventResponse setNextOffset(Long nextOffset) {
        this.nextOffset = nextOffset;
        return this;
    }
    public Long getNextOffset() {
        return this.nextOffset;
    }

}
