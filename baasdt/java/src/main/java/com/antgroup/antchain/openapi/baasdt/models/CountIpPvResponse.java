// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CountIpPvResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总计
    @NameInMap("all_count")
    public Long allCount;

    // 渠道统计值
    @NameInMap("counter_details")
    public java.util.List<ChannelCounter> counterDetails;

    public static CountIpPvResponse build(java.util.Map<String, ?> map) throws Exception {
        CountIpPvResponse self = new CountIpPvResponse();
        return TeaModel.build(map, self);
    }

    public CountIpPvResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CountIpPvResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountIpPvResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CountIpPvResponse setAllCount(Long allCount) {
        this.allCount = allCount;
        return this;
    }
    public Long getAllCount() {
        return this.allCount;
    }

    public CountIpPvResponse setCounterDetails(java.util.List<ChannelCounter> counterDetails) {
        this.counterDetails = counterDetails;
        return this;
    }
    public java.util.List<ChannelCounter> getCounterDetails() {
        return this.counterDetails;
    }

}
