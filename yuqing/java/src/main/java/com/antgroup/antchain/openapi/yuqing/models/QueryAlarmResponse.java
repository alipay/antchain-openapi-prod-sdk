// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class QueryAlarmResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 预警消息
    @NameInMap("pages")
    public java.util.List<Alarm> pages;

    // 总条数
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmResponse self = new QueryAlarmResponse();
        return TeaModel.build(map, self);
    }

    public QueryAlarmResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAlarmResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAlarmResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAlarmResponse setPages(java.util.List<Alarm> pages) {
        this.pages = pages;
        return this;
    }
    public java.util.List<Alarm> getPages() {
        return this.pages;
    }

    public QueryAlarmResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
