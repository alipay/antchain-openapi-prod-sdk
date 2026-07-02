// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerPlatformorderleadResponse extends TeaModel {
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
    @NameInMap("total_count")
    public Long totalCount;

    // 平台订单用户线索信息
    @NameInMap("data")
    public java.util.List<PlatformOrderLeadResultInfo> data;

    public static PagequeryInnerPlatformorderleadResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerPlatformorderleadResponse self = new PagequeryInnerPlatformorderleadResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerPlatformorderleadResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryInnerPlatformorderleadResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryInnerPlatformorderleadResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryInnerPlatformorderleadResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public PagequeryInnerPlatformorderleadResponse setData(java.util.List<PlatformOrderLeadResultInfo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PlatformOrderLeadResultInfo> getData() {
        return this.data;
    }

}
