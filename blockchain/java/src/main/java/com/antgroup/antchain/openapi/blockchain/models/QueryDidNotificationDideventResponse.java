// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDidNotificationDideventResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 相关事件列表
    @NameInMap("events")
    public java.util.List<DidEvent> events;

    // 是否还有待同步事件
    @NameInMap("has_more")
    public Boolean hasMore;

    // 下次事件拉取开始的offset
    @NameInMap("next_offset")
    public Long nextOffset;

    public static QueryDidNotificationDideventResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDidNotificationDideventResponse self = new QueryDidNotificationDideventResponse();
        return TeaModel.build(map, self);
    }

    public QueryDidNotificationDideventResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDidNotificationDideventResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDidNotificationDideventResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDidNotificationDideventResponse setEvents(java.util.List<DidEvent> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DidEvent> getEvents() {
        return this.events;
    }

    public QueryDidNotificationDideventResponse setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public QueryDidNotificationDideventResponse setNextOffset(Long nextOffset) {
        this.nextOffset = nextOffset;
        return this;
    }
    public Long getNextOffset() {
        return this.nextOffset;
    }

}
