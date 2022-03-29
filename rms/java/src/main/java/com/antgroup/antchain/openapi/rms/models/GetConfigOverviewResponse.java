// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetConfigOverviewResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总览页配置统计信息
    @NameInMap("data")
    public ConfigOverviewDto data;

    public static GetConfigOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigOverviewResponse self = new GetConfigOverviewResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigOverviewResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetConfigOverviewResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetConfigOverviewResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetConfigOverviewResponse setData(ConfigOverviewDto data) {
        this.data = data;
        return this;
    }
    public ConfigOverviewDto getData() {
        return this.data;
    }

}
