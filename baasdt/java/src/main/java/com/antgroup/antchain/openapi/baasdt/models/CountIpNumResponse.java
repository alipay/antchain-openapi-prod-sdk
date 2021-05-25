// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CountIpNumResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 各个渠道的统计
    @NameInMap("counter_detail")
    public java.util.List<ChannelCounter> counterDetail;

    // 总计值
    @NameInMap("all_count")
    public Long allCount;

    public static CountIpNumResponse build(java.util.Map<String, ?> map) throws Exception {
        CountIpNumResponse self = new CountIpNumResponse();
        return TeaModel.build(map, self);
    }

    public CountIpNumResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CountIpNumResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountIpNumResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CountIpNumResponse setCounterDetail(java.util.List<ChannelCounter> counterDetail) {
        this.counterDetail = counterDetail;
        return this;
    }
    public java.util.List<ChannelCounter> getCounterDetail() {
        return this.counterDetail;
    }

    public CountIpNumResponse setAllCount(Long allCount) {
        this.allCount = allCount;
        return this;
    }
    public Long getAllCount() {
        return this.allCount;
    }

}
