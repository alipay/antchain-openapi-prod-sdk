// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ListAntcloudOfferInstanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页实例列表（含规格明细
    @NameInMap("instances")
    public java.util.List<Instance> instances;

    // 下一页游标。空字符串 表示无更多数据
    @NameInMap("next_cursor")
    public String nextCursor;

    // 是否有下一页（便于客户端控制循环）
    @NameInMap("has_more")
    public Boolean hasMore;

    public static ListAntcloudOfferInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAntcloudOfferInstanceResponse self = new ListAntcloudOfferInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ListAntcloudOfferInstanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAntcloudOfferInstanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAntcloudOfferInstanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAntcloudOfferInstanceResponse setInstances(java.util.List<Instance> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<Instance> getInstances() {
        return this.instances;
    }

    public ListAntcloudOfferInstanceResponse setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    public String getNextCursor() {
        return this.nextCursor;
    }

    public ListAntcloudOfferInstanceResponse setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

}
