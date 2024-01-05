// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CountAuthTaskCrowdResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 人群预估数量
    @NameInMap("crowd_count")
    public Long crowdCount;

    // 人群导出时间
    @NameInMap("biz_date")
    public String bizDate;

    public static CountAuthTaskCrowdResponse build(java.util.Map<String, ?> map) throws Exception {
        CountAuthTaskCrowdResponse self = new CountAuthTaskCrowdResponse();
        return TeaModel.build(map, self);
    }

    public CountAuthTaskCrowdResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CountAuthTaskCrowdResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountAuthTaskCrowdResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CountAuthTaskCrowdResponse setCrowdCount(Long crowdCount) {
        this.crowdCount = crowdCount;
        return this;
    }
    public Long getCrowdCount() {
        return this.crowdCount;
    }

    public CountAuthTaskCrowdResponse setBizDate(String bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public String getBizDate() {
        return this.bizDate;
    }

}
