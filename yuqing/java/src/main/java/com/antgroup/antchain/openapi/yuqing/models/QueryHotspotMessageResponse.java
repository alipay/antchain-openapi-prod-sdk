// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class QueryHotspotMessageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 热搜数据
    @NameInMap("pages")
    public java.util.List<HotspotMessage> pages;

    // 总条数
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryHotspotMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHotspotMessageResponse self = new QueryHotspotMessageResponse();
        return TeaModel.build(map, self);
    }

    public QueryHotspotMessageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryHotspotMessageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHotspotMessageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryHotspotMessageResponse setPages(java.util.List<HotspotMessage> pages) {
        this.pages = pages;
        return this;
    }
    public java.util.List<HotspotMessage> getPages() {
        return this.pages;
    }

    public QueryHotspotMessageResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
