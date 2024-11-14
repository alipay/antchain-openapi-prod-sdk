// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class QueryUniversalsaasDigitalhumanAvatarActionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 动作序列列表
    @NameInMap("data")
    public java.util.List<AvatarAction> data;

    // 状态结果
    @NameInMap("status")
    public Boolean status;

    public static QueryUniversalsaasDigitalhumanAvatarActionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUniversalsaasDigitalhumanAvatarActionResponse self = new QueryUniversalsaasDigitalhumanAvatarActionResponse();
        return TeaModel.build(map, self);
    }

    public QueryUniversalsaasDigitalhumanAvatarActionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUniversalsaasDigitalhumanAvatarActionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUniversalsaasDigitalhumanAvatarActionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUniversalsaasDigitalhumanAvatarActionResponse setData(java.util.List<AvatarAction> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AvatarAction> getData() {
        return this.data;
    }

    public QueryUniversalsaasDigitalhumanAvatarActionResponse setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
